package com.jspiders.musicplayer;

import java.util.ArrayList;
import java.util.Scanner;

public class SongOperation {
       Scanner sc = new Scanner(System.in);
       ArrayList<Song> list = new ArrayList<Song>();
       
       public void addSong() {
    	   System.out.println("How mny song you want to add ?");
    	   int addCount =sc.nextInt();
       for(int i=0; i<addCount ; i++);{
    	   Song song =new Song();
    	   System.out.println("Enter The Id for Song:");
    	   song.setId(sc.nextInt());
    	   
    	   System.out.println("Enter the Name of Song:");
    	   song.setSongName(sc.next());
    	  
    	   System.out.println("Enter the Singer  Name:");
    	   song.setSingerName(sc.next());
    	   
    	   System.out.println("Enter the Movi Name of the Song:");
    	   song.setMoviname(sc.next());
    	   
    	   System.out.println("Enter the Name of the Composer:");
    	   song.setComposer(sc.next());
    	   
    	   System.out.println("Enter the Lyrist of Song:");
    	   song.setLyrist(sc.next());
    	   
    	   System.out.println("Enter the Duration time of the Song:");
    	   song.setDuration(sc.nextDouble());
    	   
    	   list.add(song);
    	   System.out.println("Added "+song.songName +"Song Sucessfully");
		}
       }
    public void displayAllSong() {
	if(list.isEmpty()) {
		System.out.println("Add song then you eill get SongList...");
		addSong();
	}
	for(Song song : list) {
		System.out.println(song.getSongName());
	}
  }
   
    public void removeSong() {
    if (list.isEmpty()) {
    	System.out.println("Add song then Remove...");
    	addSong();
    }
    System.out.println("Select song to Remove");
    displayAllSong();
    int removeId=sc.nextInt();
    System.out.println(list.get(removeId -1)+"removed Sucessfully...");
    list.remove(removeId -1);
    displayAllSong();
    }
    public void updateSong() {
    if(list.isEmpty()) {
    	System.out.println("Add song then Update...");
    	addSong();
    } System.out.println("Select song to Update");
    displayAllSong();
    int update=sc.nextInt();
    list.remove(update -1);
    Song song1=new Song();
    
    System.out.println("Enter the Id for Song :");
    song1.setId(sc.nextInt());
    
    System.out.println("Enter the Name of  Song :");
    song1.setId(sc.nextInt());
    
    System.out.println("Enter the Singer Song :");
    song1.setId(sc.nextInt());
    
    System.out.println("Enter the Singer Name :");
    song1.setId(sc.nextInt());
    
    System.out.println("Enter the Movi Name of the Song :");
    song1.setId(sc.nextInt());
    
    System.out.println("Enter the Nmae of Composer :");
    song1.setId(sc.nextInt());
    
    System.out.println("Enter the Name of Lyrist :");
    song1.setId(sc.nextInt());
    
    System.out.println("Enter the Duration time of the Song :");
    double duration =sc.nextDouble();
    song1.setDuration(duration);
    
    list.add(update-1,song1);
    System.out.println(list.get(update-1).getSongName()+"Update songdetail Successfully");
    }
    
    public void chooseToPlay() {
    	if (list.isEmpty()) {
			System.out.println("Add song then play ...");
			addSong();
		}
    	System.out.println("Select song then play...");
    	displayAllSong();
    	int play =sc.nextInt();
    	System.out.println("Playing song" + list.get(play -1).getSongName());
    }
    
    public void playAllSong() {
    	if(list.isEmpty());{
    	System.out.println("Add song then play ..");
    	addSong();
        }
        System.out.println("Playing all song..");  
        for(Song song :list) {
        	System.out.println(song.getSongName());
        }
   }
    public void playRandomSong() {
    	if(list.isEmpty());{
    	System.out.println("Add song then play ..");
    	addSong();
        }
        System.out.println("Playing Random song..");  
        double number=Math.random();
        int random=(int)(number * 10)+ 1;
        if(random>list.size());{
        random=0;
        }
        System.out.println("Playing song "+list.get(random).getSongName());
        }

   }
     
    
    
		
		


