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
 * Servlet implementation class addsong
 */
@WebServlet("/addsong")
public class addsong extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addsong() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher( "/WEB-INF/addsong.jsp" ).forward(
	            request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id= Integer.parseInt(request.getParameter("id"));
	     String title = request.getParameter("id1");
	     String author = request.getParameter("id2");
	     int songs_albumidentifier = Integer.parseInt(request.getParameter("id3"));
	     
	     
	     Connection c = null;
	        try
	        {
	        	String url = "jdbc:postgresql://cs1.calstatela.edu:5432/cs4222s24";
	            String username = "cs4222s24";
	            String password = "MGy#9bnj";

	            String sql = "insert into songs (song_id,title,author,songs_albumidentifier) values (?,?,?,?)";

	        	System.out.println("Class.forName");
	        	 Class.forName( "org.postgresql.Driver").newInstance();
				
				//Driver driver = new org.gjt.mm.mysql.Driver();
			
				System.out.println("Creating Connection");
				// Connect to the database
				c = DriverManager.getConnection(url, username, password);
	            PreparedStatement pstmt = c.prepareStatement( sql );
	            pstmt.setInt(1, id);
	            pstmt.setString(2, title);
	            pstmt.setString(3, author);
	            pstmt.setInt(4, songs_albumidentifier);
	           
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
	      response.sendRedirect("song");
	}

}
