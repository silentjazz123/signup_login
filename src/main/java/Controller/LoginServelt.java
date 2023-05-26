package Controller;
import java.io.IOException;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.studentDao;
import dto.student;

	@WebServlet("/login")

	public class LoginServelt extends HttpServlet
	{
	  @Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	    String email=req.getParameter("email");
//	    long mobile=Long.parseLong(email);
	    String password=req.getParameter("password");
	    
	    
	    studentDao dao=new studentDao();
	    student student;
	    
	    
	    try{
	    	  long mobile1=Long.parseLong(email);
	    	  student=dao.fetch(mobile1);
	    }
	    catch(NumberFormatException e)
	    {
	    	 student=dao.fetch(email);
	    }
	    if(student==null)
	    {
	    	resp.getWriter().print("<h1>Inavild email/mobile<h1>");
	    }
	    else{
	    	if(student.getPassword().equals(password)){
	    	resp.getWriter().print("<h!>Login sucessfull<h1>");
	    	req.setAttribute("student", student);
	    	
//	    	resp.getWriter().print("<table border='1'"
//	    			+ ""
//	    			+ ">"
//	    			+"<tr>"
//	    			+"<th>Id</th>"
//	    			+"<th>Name</th>"
//	    			+"<th>Email</th>"
//	    			+"<th>mobile</th>"
//	    			+"<th>Password</th>"
//	    			+"</tr>"
//	    			+"<tr>"
//	    			+"<th>"+student.getId()+"</th>"
//	    			+"<th>"+student.getName()+"</th>"
//	    			+"<th>"+student.getEmail()+"</th>"
//	    			+"<th>"+student.getPhone()+"</th>"
//	    			+"<th>"+student.getPassword()+"</th>"
//	    			+"</tr>"+"</table>");
//	    	resp.getWriter().print("</div><br><br>");
//	    	resp.getWriter().print("<table border='1'>");
	    	}else{
	    		resp.getWriter().print("<h1>Invalid Password</h1>");
	    	}
	    			 	
	    }
	   
	}
	}