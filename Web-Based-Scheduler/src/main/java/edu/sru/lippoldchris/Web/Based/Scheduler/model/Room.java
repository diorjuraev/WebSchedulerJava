package edu.sru.lippoldchris.Web.Based.Scheduler.model;

public class Room {
	
	private String roomName;
	
	private float timeStart;
	
	private float timeEnd;

	public String getRoomName() {
		return roomName;
	}

	public void setRoomName(String roomName) {
		this.roomName = roomName;
	}

	public float getTimeStart() {
		return timeStart;
	}

	public void setTimeStart(float timeStart) {
		this.timeStart = timeStart;
	}

	public float getTimeEnd() {
		return timeEnd;
	}

	public void setTimeEnd(float timeEnd) {
		this.timeEnd = timeEnd;
	}
}
