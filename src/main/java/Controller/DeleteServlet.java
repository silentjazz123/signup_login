package Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.studentDao;
import dto.student;

@WebServlet("/delete")
public class DeleteServlet extends HttpServlet
{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		super.service(req, resp);
		
		int id=Integer.parseInt(req.getParameter("id"));
		studentDao dao=new studentDao();
		dao.delete();
	}

}
