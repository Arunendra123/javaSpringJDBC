package javaSpringjdbc.Entity;

public class User {

	private int id;
	private String firstName;
	private String surName;
	private String DOB;
	private String tile;
	
	public User() {
		super();
		// TODO Auto-generated constructor stub
	}
	public User(int id,String firstName, String surName, String dOB, String tile) {
		super();
		this.id=id;
		this.firstName = firstName;
		this.surName = surName;
		DOB = dOB;
		this.tile = tile;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSurName() {
		return surName;
	}
	public void setSurName(String surName) {
		this.surName = surName;
	}
	public String getDOB() {
		return DOB;
	}
	public void setDOB(String dOB) {
		DOB = dOB;
	}
	public String getTile() {
		return tile;
	}
	public void setTile(String tile) {
		this.tile = tile;
	}
	@Override
	public String toString() {
		return "User [firstName=" + firstName + ", surName=" + surName + ", DOB=" + DOB + ", tile=" + tile + "]";
	}
	
}
