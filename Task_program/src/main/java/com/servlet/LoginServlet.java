package com.servlet;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.Base64;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


import model.LoginModel;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.Part;

@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet 
{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		//super.doPost(req, resp);
		
		String usl = "jdbc:mysql://localhost:3306/user";
		String user = "root";
		String pass = "";
		
		resp.setContentType("text/html");
		PrintWriter out = resp.getWriter();
		
		String id = req.getParameter("id");
		int id2 = Integer.parseInt(id);
		String fname = req.getParameter("fname");
		String lname = req.getParameter("lname");
		String email = req.getParameter("email");
		String gender = req.getParameter("gender");
		String hobbies = req.getParameter("hobbies");
		String city = req.getParameter("city");
		String password = req.getParameter("password");
		Part p = req.getPart("image");
		
		
			
			
			
		
		int r = 0;
		Connection con = null;
		
		
		if(p!=null)
		{
			try {
				
				Class.forName("com.mysql.jdbc.Driver");
				con = DriverManager.getConnection(usl, user, pass);
				
				PreparedStatement ps = con.prepareStatement("insert  into info (fname,lname,email,gender,hobbies,city,password) values (?,?,?,?,?,?,?)");
			
				InputStream io = p.getInputStream();
				
				ps.setString(1, fname);
				ps.setString(2, lname);
				ps.setString(3, email);
				ps.setString(3, gender);
				ps.setString(3, hobbies);
				ps.setString(3, city);
				ps.setString(3, password);
				
				ps.setBlob(4,io);
				
				
				
				r = ps.executeUpdate();
				
				if(r>0)
				{
					System.out.println("done");
					//resp.sendRedirect("product.jsp");
				}
				else
				{
					System.out.println("error");
				}
				
				
				
			} catch (Exception e) {
				// TODO: handle exception
				System.out.println(e);
			}
		}
		}
		
		
		
		
//		out.print("<br>");
//		out.println(name);
//		out.print("<br>");
//		out.println(email);
//		out.print("<br>");
//		out.println(pass);
//		out.print("<br>");
//		out.println(repass);
//		
		
		
	}

