
import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;



public class FlightServlet1 extends HttpServlet {
    // Existing methods...
	private static final long serialVersionUID = 1L;
    
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FlightServlet1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at hey: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String departure = request.getParameter("departure");
        String destination = request.getParameter("destination");

        Flightclass obj = new Flightclass(departure, destination);
        List<String> flightDetails = obj.getFlightDetails();
        
        if (!flightDetails.isEmpty()) {
            request.setAttribute("flightID", flightDetails.get(0));
            request.setAttribute("time", flightDetails.get(1));
            request.setAttribute("fare", flightDetails.get(2));
            request.setAttribute("departure", departure);
            request.setAttribute("destination", destination);
            
            RequestDispatcher requ = request.getRequestDispatcher("searchflights.jsp"); // Note: changed to .jsp
            requ.forward(request, response);
        } else {
            response.getWriter().println("No flights found for the selected route.");
        }
    }
}
