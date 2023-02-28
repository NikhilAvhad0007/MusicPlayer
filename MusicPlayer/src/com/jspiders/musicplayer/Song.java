package com.jspiders.musicplayer;

public class Song {
	   
	int id;
	String songName;
	String singerName;
	String moviname;
	String composer;
	String lyrist;
	double duration;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	 public String getSongName() {
		return songName;
	}
	 
	public void setSongName(String songName) {
		this.songName = songName;
	}
	
	 public String getSingerName() {
		return singerName;
	}
	 
	public void setSingerName(String singerName) {
		this.singerName = singerName;
	}
	
	public String getMoviname() {
		return moviname;
	}
	
	 public void setMoviname(String moviname) {
		this.moviname = moviname;
	}
	 
	 public String getComposer() {
		return composer;
	}
	 
	 public void setComposer(String composer) {
		this.composer = composer;
	}
	 
	 public double getDuration() {
		return duration;
	}
	 
	  public void setDuration(double duration) {
		this.duration = duration;
	}
	  
	  public String getLyrist() {
		return lyrist;
	}
	  
	  public void setLyrist(String lyrist) {
		this.lyrist = lyrist;
	}

}

