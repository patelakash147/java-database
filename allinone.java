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
 * Servlet implementation class allinone
 */
@WebServlet("/allinone")
public class allinone extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public allinone() {
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
		List<beans> entries = new ArrayList<beans>();
		List<beans1> entries1 = new ArrayList<beans1>();
		List<beans2> entries2 = new ArrayList<beans2>();
		Connection c = null;
        try
        {
            String url = "jdbc:postgresql://cs1.calstatela.edu:5432/cs4222s24";
            String username = "cs4222s24";
            String password = "MGy#9bnj";

            c = DriverManager.getConnection( url, username, password );
            Statement stmt = c.createStatement();
            ResultSet rs = stmt.executeQuery( "select * from musician" );
           // ResultSet ps=stmt.executeQuery("SELECT COALESCE(sum(CASE WHEN value THEN 1 ELSE 0 END),0) FROM sqlentry");
            while( rs.next() )
            {
                beans entry = new beans(  rs.getInt("id"),rs.getString( "ssn" ), rs.getString( "name" ));
                entries.add( entry );
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
        Connection c1 = null;
        try
        {
            String url = "jdbc:postgresql://cs1.calstatela.edu:5432/cs4222s24";
            String username = "cs4222s24";
            String password = "MGy#9bnj";

            c1 = DriverManager.getConnection( url, username, password );
            Statement stmt = c1.createStatement();
            ResultSet rs = stmt.executeQuery( "select * from album" );
           // ResultSet ps=stmt.executeQuery("SELECT COALESCE(sum(CASE WHEN value THEN 1 ELSE 0 END),0) FROM sqlentry");
            while( rs.next() )
            {
                beans2 entry2 = new beans2(  rs.getInt("id"),rs.getInt( "albumidentifier" ), rs.getString( "format" ), rs.getString( "copyrightdate" ), rs.getString( "title" ),rs.getString("m_ssn"));
                entries2.add( entry2 );
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
                if( c1 != null ) c1.close();
            }
            catch( SQLException e )
            {
                throw new ServletException( e );
            }
        }
        Connection c2 = null;
        try
        {
            String url = "jdbc:postgresql://cs1.calstatela.edu:5432/cs4222s24";
            String username = "cs4222s24";
            String password = "MGy#9bnj";

            c2 = DriverManager.getConnection( url, username, password );
            Statement stmt = c2.createStatement();
            ResultSet rs = stmt.executeQuery( "select * from songs" );
           // ResultSet ps=stmt.executeQuery("SELECT COALESCE(sum(CASE WHEN value THEN 1 ELSE 0 END),0) FROM sqlentry");
            while( rs.next() )
            {
                beans1 entry1 = new beans1(  rs.getInt("song_id"),rs.getString( "title" ), rs.getString( "author" ), rs.getInt( "songs_albumidentifier" ));
                entries1.add( entry1 );
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
                if( c2 != null ) c2.close();
            }
            catch( SQLException e )
            {
                throw new ServletException( e );
            }
        }
        List<beans3> entries3 = new ArrayList<beans3>();
		  Connection c3 = null;
	        try
	        {
	            String url = "jdbc:postgresql://cs1.calstatela.edu:5432/cs4222s24";
	            String username = "cs4222s24";
	            String password = "MGy#9bnj";

	            c3 = DriverManager.getConnection( url, username, password );
	            Statement stmt = c3.createStatement();
	            ResultSet rs = stmt.executeQuery( "select * from instrument" );
	           // ResultSet ps=stmt.executeQuery("SELECT COALESCE(sum(CASE WHEN value THEN 1 ELSE 0 END),0) FROM sqlentry");
	            while( rs.next() )
	            {
	                beans3 entry3 = new beans3(  rs.getInt("instrument_id"),rs.getString( "name" ), rs.getString( "i_key" ), rs.getString( "M_ssn" ));
	                entries3.add( entry3 );
	                System.out.println( rs.getInt("instrument_id"));
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
	                if( c3 != null ) c3.close();
	            }
	            catch( SQLException e )
	            {
	                throw new ServletException( e );
	            }
	        }
	        List<beans4> entries4 = new ArrayList<beans4>();
			  Connection c4 = null;
		        try
		        {
		            String url = "jdbc:postgresql://cs1.calstatela.edu:5432/cs4222s24";
		            String username = "cs4222s24";
		            String password = "MGy#9bnj";

		            c4 = DriverManager.getConnection( url, username, password );
		            Statement stmt = c4.createStatement();
		            ResultSet rs = stmt.executeQuery( "select * from place" );
		           // ResultSet ps=stmt.executeQuery("SELECT COALESCE(sum(CASE WHEN value THEN 1 ELSE 0 END),0) FROM sqlentry");
		            while( rs.next() )
		            {
		                beans4 entry4 = new beans4(  rs.getInt("place_id"),rs.getString( "address" ), rs.getString( "phone_number" ), rs.getString( "m_ssn" ));
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
		                if( c4 != null ) c4.close();
		            }
		            catch( SQLException e )
		            {
		                throw new ServletException( e );
		            }
		        }
		        request.setAttribute( "entries4", entries4 );
			
	        request.setAttribute( "entries3", entries3);
		
        request.setAttribute( "entries2", entries2 );
        request.setAttribute( "entries", entries );
        request.setAttribute( "entries1", entries1 );
		
		request.getRequestDispatcher( "/WEB-INF/allinone.jsp" ).forward(
	            request, response );
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
