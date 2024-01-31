import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/PaymentServlet")
public class PaymentServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public PaymentServlet() {
        super();
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Retrieve payment and booking details from the request
        String pin = request.getParameter("pin");
        String password = request.getParameter("password");
        String flightId = request.getParameter("flightid");
        String fare = request.getParameter("fare");
        String departure = request.getParameter("departure");
        String destination = request.getParameter("destination");
        String name = request.getParameter("name");
        String selectedClass = request.getParameter("class"); // Ensure this matches the name in your form

        // Process the payment (placeholder for payment logic)
       boolean paymentSuccess = true; // Assume payment is successful for example purposes

        // Forward to a confirmation page if payment is successful
        if (paymentSuccess) {
            // Set attributes for the confirmation page
            request.setAttribute("flightID", flightId);
            request.setAttribute("fare", fare);
            request.setAttribute("departure", departure);
            request.setAttribute("destination", destination);
            request.setAttribute("name", name);
            request.setAttribute("selectedClass", selectedClass); // Using 'selectedClass' instead of 'class'
 
            
            
           //paymentclass paychecking = new paymentclass(name, aadhar, email, phone, flightid, fare, departure, destination);
           //paychecking.paycheck();

           // RequestDispatcher requ = request.getRequestDispatcher("paymentconfirmation.jsp");
           // requ.forward(request, response);
            // Forward to the confirmation page
            RequestDispatcher dispatcher = request.getRequestDispatcher("paymentconfirmation.jsp");
            dispatcher.forward(request, response);
        } else {
            // Handle payment failure here (optional)
            // You can forward to an error page or display an error message
        }
    }
}
