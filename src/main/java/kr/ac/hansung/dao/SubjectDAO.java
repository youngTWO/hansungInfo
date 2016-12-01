package kr.ac.hansung.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component("SubjectDAO")
public class SubjectDAO {
	
	private JdbcTemplate jdbcTemplateObject;
	
	@Autowired
	public void setDataSource(DataSource dataSource){
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}
	
	//ex
	public int getRowCount(){
		String sqlStatement = "Select count(*) from class";
		
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	
}
