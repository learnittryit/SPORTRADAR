package com.example.generic.scoreboard.model;

public class Teams {
	
	private String teamA;
	private String teamB;
	private int scoreA;
	private int scoreB;
	
	
	
	public Teams() 
	{
	
	}
	
	public Teams(String teamA, String teamB, int scoreA, int scoreB) {
		super();
		this.teamA = teamA;
		this.teamB = teamB;
		this.scoreA = scoreA;
		this.scoreB = scoreB;
	}
	public String getTeamA() {
		return teamA;
	}
	public void setTeamA(String teamA) {
		this.teamA = teamA;
	}
	public String getTeamB() {
		return teamB;
	}
	public void setTeamB(String teamB) {
		this.teamB = teamB;
	}
	public int getScoreA() {
		return scoreA;
	}
	public void setScoreA(int scoreA) {
		this.scoreA = scoreA;
	}
	public int getScoreB() {
		return scoreB;
	}
	public void setScoreB(int scoreB) {
		this.scoreB = scoreB;
	}
	
	}
