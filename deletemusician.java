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
 * Servlet implementation class deletemusician
 */
@WebServlet("/deletemusician")
public class deletemusician extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public deletemusician() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Integer id = Integer.valueOf( request.getParameter( "id" ) );
		 Connection c = null;
		   try
		     {
				String url = "jdbc:postgresql://cs1.calstatela.edu:5432/cs4222s24";
	            String username = "cs4222s24";
	            String password = "MGy#9bnj";
	            String sql1 = "delete from album where m_ssn=(select ssn from musician where id=?)";
	            String sql2 = "delete from instrument where m_ssn=(select ssn from musician where id=?)";
	            String sql3 = "delete from place where m_ssn=(select ssn from musician where id=?)";
	            String sql4 = "delete from songs where m_ssn=(select ssn from musician where id=?)";
		         String sql = "delete from musician where id=?";

		         System.out.println("Class.forName");
	        	 Class.forName( "org.postgresql.Driver").newInstance();
					
				
					System.out.println("Creating Connection");
					// Connect to the database
					c = DriverManager.getConnection(url, username, password);
					PreparedStatement pstmt1 = c.prepareStatement( sql1 );
			         pstmt1.setInt(1, id);
			         pstmt1.executeUpdate();
			         PreparedStatement pstmt2 = c.prepareStatement( sql2 );
			         pstmt2.setInt(1, id);
			         pstmt2.executeUpdate();
			         PreparedStatement pstmt3 = c.prepareStatement( sql3 );
			         pstmt3.setInt(1, id);
			         pstmt3.executeUpdate();
			         PreparedStatement pstmt4 = c.prepareStatement( sql4 );
			         pstmt4.setInt(1, id);
			         
			         
		         PreparedStatement pstmt = c.prepareStatement( sql );
		         pstmt.setInt(1, id);
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
		   response.sendRedirect( "musicain" );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
