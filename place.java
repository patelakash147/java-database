package pro;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class place
 */
@WebServlet("/place")
public class place extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public place() {
        super();
        // TODO Auto-generated constructor stub
    }
    public void init( ServletConfig config ) throws ServletException
    {
        super.init( config );

        try
        {
            Class.forName( "org.postgresql.Driver" );
        }
        catch( ClassNotFoundException e )
        {
            throw new ServletException( e );
        }
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		List<beans4> entries4 = new ArrayList<beans4>();
		  Connection c = null;
	        try
	        {
	            String url = "jdbc:postgresql://cs1.calstatela.edu:5432/cs4222s24";
	            String username = "cs4222s24";
	            String password = "MGy#9bnj";

	            c = DriverManager.getConnection( url, username, password );
	            Statement stmt = c.createStatement();
	            ResultSet rs = stmt.executeQuery( "select * from place" );
	           // ResultSet ps=stmt.executeQuery("SELECT COALESCE(sum(CASE WHEN value THEN 1 ELSE 0 END),0) FROM sqlentry");
	            while( rs.next() )
	            {
	                beans4 entry4 = new beans4(  rs.getInt("place_id"),rs.getString( "address" ), rs.getString( "phone_number" ), rs.getString( "M_ssn" ));
	                entries4.add( entry4);
	            }
	        }
	        catch( SQLException e )
	        { 
	            throw new ServletException( e );
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
	        request.setAttribute( "entries4", entries4 );
		
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
