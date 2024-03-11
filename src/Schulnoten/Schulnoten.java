package Schulnoten;
import java.util.Scanner;
public class Schulnoten {
	/*
	 * 1. Initialisieren Sie ein Array mit den Bedeutungen der Schulnoten in
	 * folgender Reihenfolge:
	 * 
	 * sehr gut gut befriedigend ausreichend ungenügend mangelhaft
	 * 
	 * 
	 * 2. Lesen Sie eine Zahl ein, die zwischen 1 und 6 (einschließlich) liegt.
	 * 
	 * 3. Rufen Sie die folgenden Methoden auf.
	 */

	public static void main (String args []) {
		Scanner sc = new Scanner(System.in);
//		StringBuilder sb = new StringBuilder();
		final String[] notenArray = {"sehr gut", "gut", "befriedigend", "ausreichend", "ungenuegend", "mangelhaft"};
		
		int note = sc.nextInt();
//		sb.append(note);
//		String sNote = sb.toString();
//		System.out.println(sNote);
		
		if(notenArray != null) {
			ausgeben(notenArray);
			if(note != 0 && note < 7) {
				ausgeben(notenArray,note);
			}
			
		}
		ausgeben(null);
		sc.close();
		
	}
	
	/*	Aufgabe 	     	
	Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife alle Schulnoten auf der Konsole aus.
	    		
	Ausgabe-
	format 		


	sehr gut
	gut
	...

	    		
	Hinweis 		Bitte schreiben Sie Umlaute als ue, ae, und oe.*/
	
	public static void ausgeben(String schulnoten[]) {
		if(schulnoten != null) {
			for(String e:schulnoten) {
				System.out.println(e);
		}
		
		}
		
	}
	/*Aufgabe 	     	
	Die Methode hat das Array und eine ganze Zahl als Parameter. Die Zahl wird als Schulnote interpretiert (1 steht für sehr gut, 2 für gut, … 6 für mangelhaft). Die Methode gibt die entsprechende Schulnote des Arrays auf der Konsole aus.
	    		
	Hinweis 		Bitte beachten Sie die vorgegebene Reihenfolge der Parameter beim Programmieren.
	    		
	Hinweis 		Bitte schreiben Sie Umlaute als ue, ae und oe.*/
	
	public static void ausgeben(String schulnoten[], int zahl) {
		
//		switch(zahl) {
//		case 1 -> System.out.println(schulnoten[0]);
//		case 2 -> System.out.println(schulnoten[1]);
//		case 3 -> System.out.println(schulnoten[2]);
//		case 4 -> System.out.println(schulnoten[3]);
//		case 5 -> System.out.println(schulnoten[4]);
//		case 6 -> System.out.println(schulnoten[5]);
//		}
		
		// Muss altmodisches Switch verwenden weil VPL das neue nicht kennt
		if (schulnoten != null && zahl != 0) {
			switch(zahl) {
			case 1:
				System.out.println(schulnoten[0]);
			case 2:
				System.out.println(schulnoten[1]);
			case 3:
				System.out.println(schulnoten[2]);
			case 4:
				System.out.println(schulnoten[3]);
			case 5:
				System.out.println(schulnoten[4]);
			case 6:
				System.out.println(schulnoten[5]);
			}
		}
		
	}
	
	
		

	
	
	
}