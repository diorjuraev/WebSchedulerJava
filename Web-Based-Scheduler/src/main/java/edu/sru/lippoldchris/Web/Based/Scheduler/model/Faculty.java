package edu.sru.lippoldchris.Web.Based.Scheduler.model;

public class Faculty {
	
	private static final int MAXCRED = 15;

	private String name;
	
	private String id;
	
	private int creditMax;
	
	private  String color;
	
	Faculty (int creditMax)
	{
		this.creditMax = MAXCRED;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getCreditMax() {
		return creditMax;
	}

	public void setCreditMax(int creditMax) {
		this.creditMax = creditMax;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	
}
