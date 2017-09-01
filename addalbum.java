package pro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class addalbum
 */
@WebServlet("/addalbum")
public class addalbum extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addalbum() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher( "/WEB-INF/addalbum.jsp" ).forward(
	            request, response );
		
	     
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id= Integer.parseInt(request.getParameter("id"));
	     int  albumidentifier = Integer.parseInt(request.getParameter("id1"));
	     String format = request.getParameter("id2");
	     String copyrightdate = request.getParameter("id3");
	     String title = request.getParameter("id4");
	     String m_ssn = request.getParameter("id5");
	     
	     Connection c = null;
	        try
	        {
	        	String url = "jdbc:postgresql://cs1.calstatela.edu:5432/cs4222s24";
	            String username = "cs4222s24";
	            String password = "MGy#9bnj";

	            String sql = "insert into album (id,albumidentifier,format,copyrightdate,title,m_ssn) values (?,?,?,?,?,?)";

	        	System.out.println("Class.forName");
	        	 Class.forName( "org.postgresql.Driver").newInstance();
				
				//Driver driver = new org.gjt.mm.mysql.Driver();
			
				System.out.println("Creating Connection");
				// Connect to the database
				c = DriverManager.getConnection(url, username, password);
	            PreparedStatement pstmt = c.prepareStatement( sql );
	            pstmt.setInt(1, id);
	            pstmt.setInt(2, albumidentifier);
	            pstmt.setString(3, format);
	            pstmt.setString(4, copyrightdate);
	            pstmt.setString(5, title);
	            pstmt.setString(6, m_ssn);
	            pstmt.executeUpdate();
	           
	        }
	        catch( SQLException e )
	        {
	            throw new ServletException( e );
	        } catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	        finally
	        {
	            try
	            {
	                if( c != null ) c.close();
	            }
	            catch( SQLException e )
	            {
	                throw new ServletException( e );
	            }
	        }
	      response.sendRedirect("album");
	}

}
