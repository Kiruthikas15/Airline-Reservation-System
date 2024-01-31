<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Payment Confirmation</title>
    <style>
        body {
        background-image:url('https://cdn.pixabay.com/photo/2018/01/05/02/40/background-3062009_960_720.jpg')
            font-family: Arial, sans-serif;
            background-color: #f0f0f0;
            text-align: center;
            padding: 20px;
        }
        .confirmation-container {
            background-color: #ffffff;
            border-radius: 8px;
            box-shadow: 0 4px 8px rgba(0, 0, 0, 0.2);
            padding: 20px;
            display: inline-block;
            margin: auto;
        }
        h1 {
            color: #007bff;
        }
        p {
            color: #333333;
            font-size: 16px;
            margin: 10px 0;
        }
        button {
            padding: 10px 20px;
            background-color: #007bff;
            color: white;
            border: none;
            border-radius: 4px;
            cursor: pointer;
            font-size: 16px;
            margin-top: 20px;
        }
        button:hover {
            background-color: #0056b3;
        }
    </style>
</head>
<body>
    <div class="confirmation-container">
        <h1>Payment Confirmation</h1>
        <p>Thank you for your payment,A Happy Journey</p>
       <!--   <p><strong>Flight ID:</strong> ${flightID}</p>
        <p><strong>Departure:</strong> ${departure}</p>
        <p><strong>Destination:</strong> ${destination}</p>
        <p><strong>Fare:</strong> ${fare}</p>
        <p><strong>Class:</strong> ${selectedClass}</p>-->
        <button type="button" onclick="exit()">Back to Home</button>
    </div>
    <script type="text/javascript">
        function exit() {
            window.location.href = "Content.html";
        }
    </script>
</body>
</html>
