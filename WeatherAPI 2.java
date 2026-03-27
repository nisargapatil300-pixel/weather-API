import java.io.*;
import java.net.*;

public class WeatherAPI {
    public static void main(String[] args) {
        try {
            String city = "Bangalore";

            String apiURL = "https://wttr.in/" + city + "?format=j1";
            URL url = new URL(apiURL);

            HttpURLConnection conn = (HttpURLConnection) url.openConnection();
            conn.setRequestMethod("GET");

            BufferedReader reader = new BufferedReader(
                    new InputStreamReader(conn.getInputStream())
            );

            StringBuilder response = new StringBuilder();
            String line;

            while ((line = reader.readLine()) != null) {
                response.append(line);
            }
            reader.close();

            String data = response.toString();

            // safer extraction
            String temp = getValue(data, "\"temp_C\":\"");
            String humidity = getValue(data, "\"humidity\":\"");
            String condition = getValue(data, "\"value\":\"");

            System.out.println("----- WEATHER REPORT -----");
            System.out.println("City        : " + city);
            System.out.println("Temperature : " + temp + " °C");
            System.out.println("Humidity    : " + humidity + "%");
            System.out.println("Condition   : " + condition);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    // helper method
    public static String getValue(String data, String key) {
        int start = data.indexOf(key);
        if (start == -1) return "Not found";
        start += key.length();
        int end = data.indexOf("\"", start);
        return data.substring(start, end);
    }
}