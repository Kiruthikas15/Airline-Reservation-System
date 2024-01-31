
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Flight Results - India Airlines</title>
    <style>
        /* Your existing CSS styles... */
        /* Existing CSS styles... */
        /* Add your CSS styles here */
        body {
            font-family: Arial, sans-serif;
            /* Other styling as needed */
        }
        .header, .footer {
            background-color: #f2f2f2;
            padding: 20px;
            text-align: center;
        }
        .main {
            width: 80%;
            margin: 0 auto;
            padding: 20px;
        }
        .flight-option {
            width: 85%;
            margin: 10px auto;
            padding: 10px;
            border-radius: 5px;
            position: relative;
            background-color: #e0e0e0;
        }
        .book-btn {
            padding: 5px 10px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 5px;
            cursor: pointer;
        }
        .book-btn:hover {
            background-color: #0056b3;
            transition: background-color 0.3s ease;
        }
        /* Additional styling as needed */
    </style>
</head>
<body>
    <header class="header">
        <h1>India Airlines</h1>
    </header>
    <main class="main">
        <div id="results">
            <h2>Flight Results</h2>
            <p>Flights from ${departure} to ${destination}</p>
            <% if (request.getAttribute("flightID") != null) { %>
                <div class="flight-option">
                    <h3>Flight ID: ${flightID}</h3>
                    <p>Time: ${time}</p>
                    <p>Fare: ${fare}</p>
                    
                    <form action="javascript:bookNow('${flightID}', '${departure}', '${destination}', '${fare}')">
                        <button class="book-btn" type="submit">Book Now</button>
                    </form>
                </div>
            <% } else { %>
                <p>No flights found for the selected route.</p>
            <% } %>
        </div>
    </main>
    <footer class="footer">
        <p>© 2024 India Airlines. All rights reserved.</p>
    </footer>

    <script>
        function bookNow(flightid, departure, destination, fare) {
            var url = "userdetails.html?flightid=" + encodeURIComponent(flightid) +
                      "&departure=" + encodeURIComponent(departure) +
                      "&destination=" + encodeURIComponent(destination) +
                      "&fare=" + encodeURIComponent(fare);
            window.location.href = url;
        }
    </script>
</body>
</html>
