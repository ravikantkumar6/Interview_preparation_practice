package com.activityselection;

public class Activity {
	
	private String activityName;
	private int startTime;
	private int finishTime;
	
	public Activity(String activityName,int startTime,int finishTime) {
		this.activityName = activityName;
		this.startTime = startTime;
		this.finishTime = finishTime;
	}
	public String getActivityName() {
		return activityName;
	}
	public void setActivityName(String activityName) {
		this.activityName = activityName;
	}
	public int getStartTime() {
		return startTime;
	}
	public void setStartTime(int startTime) {
		this.startTime = startTime;
	}
	public int getFinishTime() {
		return finishTime;
	}
	public void setFinishTime(int finishTime) {
		this.finishTime = finishTime;
	}
	@Override
	public String toString() {
		return "Activity :" + activityName + ", start time = " + startTime + ", finish time = " + finishTime;
	}
	
	

}
