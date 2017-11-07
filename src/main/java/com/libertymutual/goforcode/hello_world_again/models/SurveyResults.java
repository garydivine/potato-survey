package com.libertymutual.goforcode.hello_world_again.models;

public class SurveyResults {
	
	//only this class can change these values   ENCAPSULATION
	private int russetCount; 
	private int sweetCount;
	private int goldenCount;
	
	public int russetTotal() {
		return russetCount;
	}
	
	public int sweetTotal() {
		return sweetCount;
	}
	
	public int goldenTotal() {
		return goldenCount;
	}
	
	public void registerRussetVote() {
		russetCount += 1;
		//russetCount++;  Same thing, but considered "bad form"
	}

	public void registerSweetVote() {
		sweetCount += 1;
	}
	
	public void registerGoldenVote() {
		goldenCount += 1;
	}
}
