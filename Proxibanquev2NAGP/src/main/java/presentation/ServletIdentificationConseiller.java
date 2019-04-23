package presentation;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Conseiller;

/**
 * Servlet implementation class ServletIdentificationConseiller
 */
@WebServlet("/ServletIdentificationConseiller")
public class ServletIdentificationConseiller extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ServletIdentificationConseiller() {
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
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("name");
		String pwd = request.getParameter("password");

		Conseiller co = new Conseiller(login, pwd);
		RequestDispatcher requestDispatcher;
		// request.setAttribute("conseiller", co); Inutile car affiche info connexion
		// conseiller non necessaire
		if (("julie".equalsIgnoreCase(login)) && ("ouioui".equalsIgnoreCase(pwd))) {
			requestDispatcher = request.getRequestDispatcher("/WEB-INF/ListeClient.jsp");
		} else {
			requestDispatcher = request.getRequestDispatcher("IdentificationEchec.html");
		}
		requestDispatcher.forward(request, response);
		


	}

}
