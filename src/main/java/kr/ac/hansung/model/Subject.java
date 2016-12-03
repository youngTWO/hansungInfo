package kr.ac.hansung.model;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.Range;

public class Subject {

	private int year;
	private int semester;
	@NotEmpty(message="필수 항목")
	private String code;
	@NotEmpty(message="필수 항목")
	private String name;
	private String kind;
	@NotNull
	@Range(min=1, max=3, message="1학점 이상 3학점 이하")
	private int point;
	
	
	public Subject() {
	}

	public Subject(int year, int semester, int point) {
		super();
		this.year = year;
		this.semester = semester;
		this.point = point;
	}

	public Subject(int year, int semester, String code, String name, String kind, int point) {
		this.year = year;
		this.semester = semester;
		this.code = code;
		this.name = name;
		this.kind = kind;
		this.point = point;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getSemester() {
		return semester;
	}

	public void setSemester(int semester) {
		this.semester = semester;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Subject [year=" + year + ", semester=" + semester + ", code=" + code + ", name=" + name + ", kind="
				+ kind + ", point=" + point + "]";
	}
	
	
}
