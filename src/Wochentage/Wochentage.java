package Wochentage;
import java.util.Scanner;
public class Wochentage {
//	 1. Initialisieren Sie ein Array mit den Wochentagen in folgender Reihenfolge:
//
//    Montag
//    Dienstag
//    Mittwoch
//    Donnerstag
//    Freitag
//    Samstag
//    Sonntag
//
//2. Lesen Sie eine Zahl ein, die zwischen 1 und 7 (einschließlich) liegt.  
//
//3.  Rufen Sie die folgenden Methoden auf.
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int zahl = sc.nextInt();
		final String [] wochentageA = {"Montag","Dienstag","Mittwoch","Donnerstag","Freitag","Samstag","Sonntag"};
		if(wochentageA != null) {
			ausgeben(wochentageA);
			if(zahl != 0) {
				ausgeben(wochentageA,zahl);
			}
		}
	}

//Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife alle Wochentage auf der Konsole aus.
//    		
//Ausgabe-
//format 		
//
//
//Montag
//Dienstag
	public static void ausgeben(String wochentage[]) {
		if (wochentage != null) {
			for(String e:wochentage) {
				System.out.println(e);
			}
		}
	}
	     	
//	Die Methode hat die Wochentage und eine ganze Zahl als  Parameter.  Die Zahl wird als Wochentag interpretiert (1 steht für Montag, 2 für Dienstag, … 7 für Sonntag). Die Methode gibt den entsprechenden Wochentag des Arrays auf der Konsole aus.
//	  Bitte beachten Sie die vorgegebene Reihenfolge der Parameter beim Programmieren.

	public static void ausgeben(String wochentage[], int zahl) {
		if (wochentage != null && zahl != 0) {
			switch(zahl) {
			case 1:
				System.out.println(wochentage[0]);
				break;
			case 2:
				System.out.println(wochentage[1]);
				break;
			case 3:
				System.out.println(wochentage[2]);
				break;
			case 4:
				System.out.println(wochentage[3]);
				break;
			case 5:
				System.out.println(wochentage[4]);
				break;
			case 6:
				System.out.println(wochentage[5]);
				break;
			case 7:
				System.out.println(wochentage[6]);
				break;
				default:
					System.out.println("Wochentage sind alle");
			}
		}
	}
}
