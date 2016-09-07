

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class psyServlet
 */
@WebServlet("/psyServlet")
public class psyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public psyServlet() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		Runtime rt = Runtime.getRuntime();
		Process p;
		String[] cmdAry = {"C:/Program Files/nodejs/node", "C:/Program Files/nodejs/android.js"};
		try {
		    p = rt.exec(cmdAry);
		    p.waitFor();
		} catch (Exception e) {
		    e.printStackTrace();
		    response.getWriter().append("exception raised....");
		}
		
		
		
		response.getWriter().append("psyServlet ABCDEFG");
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
