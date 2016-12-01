package kr.ac.hansung.dao;

public class Subject {

	private int year;
	private int semester;
	private String code;
	private String name;
	private String kind;
	private int point;
	
	
	public Subject() {
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
