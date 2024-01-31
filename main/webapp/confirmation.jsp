<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Booking Confirmation - India Airlines</title>
    <style>
        /* Add your CSS styles here */
        .confirmation {
            max-width: 600px;
            margin: 20px auto;
            padding: 20px;
            background-color: #f0f0f0;
            border-radius: 10px;
            text-align: center;
        }
        /* Additional styling as needed */
    </style>
</head>
<body>
    <div class="confirmation">
        <h1>Flight Booking Confirmation</h1>
        <p><strong>Name:</strong> ${name}</p>
        <p><strong>Aadhaar Number:</strong> ${aadhar}</p>
        <p><strong>Email:</strong> ${email}</p>
        <p><strong>Phone:</strong> ${phone}</p>
        <p><strong>Flight ID:</strong> ${flightid}</p>
        <p><strong>Fare:</strong> ${fare}</p>
        <p><strong>Departure:</strong> ${departure}</p>
        <p><strong>Destination:</strong> ${destination}</p>
        <p>Thank you for booking with India Airlines. Your flight details have been confirmed.</p>
    </div>
</body>
</html>
