

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
@WebServlet("/userdetailsServlet")
/**
 * Servlet implementation class userdetailsServlet
 */
public class userdetailsServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public userdetailsServlet() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.getWriter().append("Served at: ").append(request.getContextPath());
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String aadhar = request.getParameter("aadhar");
        String email = request.getParameter("email");
        String phone = request.getParameter("phone");
        String flightid = request.getParameter("flightid");
        String fare = request.getParameter("fare");
        String departure = request.getParameter("departure");
        String destination = request.getParameter("destination");
        
        
        System.out.println("Flight ID: " + flightid);
        System.out.println("Departure: " + departure);
        System.out.println("Destination: " + destination);
        System.out.println("Fare: " + fare);
        System.out.println("Name: " + name);
        System.out.println("Aadhaar Number: " + aadhar);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        
        
        
        

        UserDetails obj = new UserDetails(name, aadhar, email, phone, flightid, fare, departure, destination);
        obj.user();

        RequestDispatcher requ = request.getRequestDispatcher("paynow.html");
        requ.forward(request, response);
    }
}
