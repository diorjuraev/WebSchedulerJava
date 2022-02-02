package edu.sru.lippoldchris.Web.Based.Scheduler.model;


public class Class {
	
	private String name;
	
	private String roomNum;
	
	private float time;
	
	private boolean inPerson;
	
	private boolean unassigned;
	
	private String faculty;

	public boolean isUnassigned() {
		return unassigned;
	}

	public void setUnassigned(boolean unassigned) {
		this.unassigned = unassigned;
	}

	public boolean isInPerson() {
		return inPerson;
	}

	public void setInPerson(boolean inPerson) {
		this.inPerson = inPerson;
	}

	public float getTime() {
		return time;
	}

	public void setTime(float time) {
		this.time = time;
	}

	public String getRoomNum() {
		return roomNum;
	}

	public void setRoomNum(String roomNum) {
		this.roomNum = roomNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFaculty() {
		return faculty;
	}

	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
}
