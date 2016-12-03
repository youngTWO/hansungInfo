package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import kr.ac.hansung.model.Subject;

@Component("SubjectDAO")
public class SubjectDAO {

	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate(dataSource);
	}

	public int getRowCount() {
		String sqlStatement = "Select count(*) from class";

		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}

	public List<Subject> getSemesterList() {
		String sqlStatement = "Select year, semester, SUM(point) as points from class Group by year, semester";

		return jdbcTemplateObject.query(sqlStatement, new RowMapper<Subject>() {

			@Override
			public Subject mapRow(ResultSet rs, int rowNumber) throws SQLException {

				Subject sub = new Subject();

				sub.setYear(rs.getInt("year"));
				sub.setSemester(rs.getInt("semester"));
				sub.setPoint(rs.getInt("points"));

				return sub;
			}
		});
	}

	public List<Subject> getSubjectsBySemester(int year, int semester) {
		String sqlStatement = "select * from class where year=? and semester=?";

		return jdbcTemplateObject.query(sqlStatement, new Object[]{year, semester}, new SubjectMapper());
	}
	
	public List<Subject> getPoints(){
		String sqlStatement = "Select kinds, SUM(point) as points from class Group by kinds";
		
		return jdbcTemplateObject.query(sqlStatement, new RowMapper<Subject>() {

			@Override
			public Subject mapRow(ResultSet rs, int rowNumber) throws SQLException {

				Subject sub = new Subject();
				
				sub.setKind(rs.getString("kinds"));
				sub.setPoint(rs.getInt("points"));
				
				return sub;
			}
		});
	}
	
	public int getTotalPoints(){
		String sqlStatement = "select sum(point) as total from class";
		
		return jdbcTemplateObject.queryForObject(sqlStatement, Integer.class);
	}
	
	public boolean insert(Subject subject) {

		int year = subject.getYear();
		int semester = subject.getSemester();
		String code = subject.getCode();
		String name = subject.getName();
		String kind = subject.getKind();
		int point = subject.getPoint();

		String sqlStatement = "insert into class (year, semester, code, name, kinds, point) values (?,?,?,?,?,?)";

		return jdbcTemplateObject.update(sqlStatement, new Object[] { year, semester, code, name, kind, point }) == 1;
	}

	
}
