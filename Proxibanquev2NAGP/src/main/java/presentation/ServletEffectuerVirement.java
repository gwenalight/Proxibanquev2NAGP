package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.CompteBancaire;
import model.OperationBancaire;

/**
 * Servlet implementation class ServletEffectuerVirement
 */
@WebServlet("/ServletEffectuerVirement")
public class ServletEffectuerVirement extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletEffectuerVirement() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		String comptebancaire1 = request.getParameter("CB1");
//		String comptebancaire2 = request.getParameter("CB2");
//		String montant = request.getParameter("somme");
//		
		// OperationBancaire ob = new OperationBancaire();//avec un cb1, un cb2 et une
		// somme pb double/string
		
		CompteBancaire cb = new CompteBancaire(comptebancaire1);
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/OperationVirement.jsp");
		
		requestDispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
