package com.abhishek.db;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

import com.abhishek.models.Circle;

public class SimpleJdbcDAOImpl extends JdbcDaoSupport  {

	public String getCircleName(int circleId) {
		String sql = "Select name from  rautlibrary.circle  where circleId= ?";
		return  getJdbcTemplate().queryForObject(sql,new Object[] {circleId} ,String.class);
	}
	
	public Circle getCircle(int circleId) {
		String sql = "Select * from  rautlibrary.circle  where circleId= ?";
		return getJdbcTemplate().queryForObject(sql,new Object[] {circleId} ,new CircleMapper());
	}
	
	private static final class CircleMapper implements RowMapper<Circle> {
		
		@Override
		public Circle mapRow(ResultSet rs, int rowNum) throws SQLException {
			
			Circle c = new Circle();
			c.setCircleId(rs.getInt("circleId"));
			
			c.setName(rs.getString("name"));
		
			return c;
		}
	}
}
