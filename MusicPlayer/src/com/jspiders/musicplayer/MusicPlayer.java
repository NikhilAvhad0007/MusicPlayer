package com.jspiders.musicplayer;

import java.util.Scanner;

public class MusicPlayer {
	SongOperation songOperation = new SongOperation();
	Scanner sc = new Scanner(System.in);
	static boolean loop= true;
	
	public static void main(String[] args) {
		MusicPlayer music=new MusicPlayer();
		
		while (loop) {
			  music. musicPlayer();
		}
	}
	public void musicPlayer() {
		System.out.println("Select Option :\n1.Play Song"
				                        + "\n2.Add or Remove"
				                        + "\n3.Update Song "
				                        + "\n4.Exit");
		int choose=sc.nextInt();
		switch (choose) {
		case 1: 
			System.out.println("choose option to play song:\n1.choose to Play\n2.Play all song\n3.Play Random");
			int choose1=sc.nextInt();
			
			switch (choose1) {
			case 1: 
				songOperation.chooseToPlay();
				break;
			case 2:
				songOperation.playAllSong();
				break;
			case 3:
				songOperation.playRandomSong();
				break;
			case 4:
				System.out.println("Wait..Existing....");
				loop=false;
				break;
            default:
            	System.out.println("Invalid choice");
            	break;
            	}
			break;
			
		case 2:
			System.out.println("choose option to Add or Remove songs\n1.Add a Song \n2.Remove a song");
			switch(sc.nextInt()) {
			case 1:
				songOperation.addSong();
			    break;
			case 2:
				songOperation.removeSong();
				break;
			default:
				System.out.println("No song Id Found");
				break;
			}
			break;
			
		case 3:
			songOperation.updateSong();
			break;
			
		case 4:
			System.out.println("Thank You");
			loop=false;
			break;
			
		default :
			System.out.println("Invalid choice");
			break;
		}
	}
}
		
		
	
		
	
		
	


