# weather-API

*COMPANY NAME* : CODETECH IT SOLUTION

*NAME* : NISARGA PATIL

*INTERN ID* : CTIS7619

*DOMAIN* : JAVA PROGRAMMING

*DURATION* : 4 WEEKS

*MENTOR* : NELLA SANTOSH

**Project Title: WeatherAPIClient – Java REST API Client for Weather Data**

The WeatherAPIClient project is a Java-based application developed to demonstrate the practical implementation of REST API communication, HTTP networking, and data handling in Java. The primary objective of this project is to fetch real-time weather information from a public web API and present it in a structured and user-friendly format through a console-based interface. This project helps in understanding how modern applications interact with external services over the internet and process the received data effectively.

In today’s world, many applications rely on external data sources such as weather updates, news feeds, and social media content. These data sources are typically accessed using RESTful APIs (Application Programming Interfaces). In this project, a public weather API is used to retrieve live weather data for a specified location. The application establishes a connection to the API using Java’s built-in networking classes such as HttpURLConnection and URL. An HTTP GET request is sent to the API endpoint, and the server responds with data in JSON (JavaScript Object Notation) format.

The JSON response received from the API contains various details such as temperature, humidity, and weather conditions. Instead of using external libraries, this project demonstrates a simplified approach by processing the response as a string and extracting the required information using basic string manipulation techniques. This approach ensures that the application remains lightweight and easy to run without additional dependencies, making it suitable for beginners.

The program follows a systematic flow. First, the user specifies a city name (which can also be modified to accept dynamic user input). The application constructs the API URL based on the given city and sends a request to the server. Once the response is received, it is read using BufferedReader and stored in a StringBuilder object. The extracted JSON data is then parsed to retrieve specific fields such as temperature (in degrees Celsius), humidity (percentage), and weather description (e.g., cloudy, sunny, rainy). These values are then displayed neatly on the console.

This project highlights several important concepts in Java programming, including exception handling, input/output operations, and network communication. Proper error handling is implemented to manage issues such as network failures, invalid responses, or incorrect API formats. This ensures that the program does not crash unexpectedly and provides meaningful feedback to the user.

The WeatherAPIClient project is highly useful for students and beginners who want to understand how real-world applications interact with web services. It serves as a foundation for developing more advanced applications such as graphical weather dashboards, mobile apps, or systems that integrate multiple APIs. The project can be further enhanced by adding features like user input, graphical interfaces, or using advanced JSON parsing libraries such as Gson or Jackson for more efficient data handling.

In conclusion, this project successfully demonstrates how Java can be used to build a REST API client that retrieves and processes live data from the internet. It provides a clear understanding of web communication, data parsing, and application design, making it a valuable learning experience and a strong addition to any academic or professional portfolio.

OUTPUT:-<img width="1366" height="720" alt="Image" src="https://github.com/user-attachments/assets/f5f08c1a-d8f1-4053-a114-8e073a663869" />

