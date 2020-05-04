package com.abhishek.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import com.abhishek.models.Circle;


public class TestJdbc {
	
	
	private DataSource datasource;

	private JdbcTemplate jdbcTemplate;
	
	public Circle getMyCircle(int circleId) {
	   Circle circle = null;
	   Connection conn = null;
	   PreparedStatement  stmt = null;
	   try{

	      conn = datasource.getConnection();
	
	      //STEP 4: Execute a query
	      String sql = "select * from  rautlibrary.circle where circleId= ?";
	      System.out.println("Preparing  statement...");
	      stmt = conn.prepareStatement(sql);
	      
	      stmt.setInt(1, circleId);
	      ResultSet rs = stmt.executeQuery();
	
	      //STEP 5: Extract data from result set
	      while(rs.next()){
	         //Retrieve by column name
	    	 circle = new Circle();
	    	 circle.setCircleId(circleId);
	    	 
	         int first = rs.getInt("circleId");
	         String last = rs.getString("name");
	         circle.setName(last);
	
	         System.out.print(", First: " + first);
	         System.out.println(", Last: " + last);
	      }
	      //STEP 6: Clean-up environment
	      rs.close();
	      stmt.close();
	      conn.close();
	   }catch(SQLException se){
	      //Handle errors for JDBC
	      se.printStackTrace();
	   }catch(Exception e){
	      //Handle errors for Class.forName
	      e.printStackTrace();
	   }finally{
	      //finally block used to close resources
	      try{
	         if(stmt!=null)
	            stmt.close();
	      }catch(SQLException se2){
	      }// nothing we can do
	      try{
	         if(conn!=null)
	            conn.close();
	      }catch(SQLException se){
	         se.printStackTrace();
	      }//end finally try
	   }//end try
	   	System.out.println("Goodbye!");
	   	return circle;
	}

	public int getCircleTotalCount() {
		String sql = "Select count(*) from  rautlibrary.circle";
		return jdbcTemplate.queryForObject(sql,Integer.class);
	}
	
	
	public String getCircleName(int circleId) {
		String sql = "Select count(*) from  rautlibrary.circle  where circleId= "+circleId;
		return jdbcTemplate.queryForObject(sql,String.class);
	}
	
	/**
	 * @return the datasource
	 */
	public DataSource getDatasource() {
		return datasource;
	}

	/**
	 * @param datasource the datasource to set
	 */
	@Autowired
	public void setDatasource(DataSource datasource) {
		jdbcTemplate = new JdbcTemplate(datasource);
	}
	
}
