package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

public class SubjectMapper implements RowMapper<Subject>{

	@Override
	public Subject mapRow(ResultSet rs, int rowNumber) throws SQLException {
		
		Subject sub = new Subject();
		
		sub.setYear(rs.getInt("year"));
		sub.setSemester(rs.getInt("semester"));
		sub.setCode(rs.getString("code"));
		sub.setName(rs.getString("name"));
		sub.setKind(rs.getString("kinds"));
		sub.setPoint(rs.getInt("point"));
		
		return sub;
	}


	
}
