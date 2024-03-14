package Klausur;
import java.util.Scanner;
public class KlausurTesttreiber {
/*1. Initialisieren Sie zwei Arrays für n ganze Zahlen (wobei Sie n einlesen)

2. Befüllen Sie die Arrays zufällig mit Zahlen zwischen...
- 0 und 10 (Array1)
- 0 und 100 (Array2)
Nutzen Sie hierfür den Zufallszahlengenerator der Klasse Math.

3. Rufen Sie die folgende Methode der Klasse Klausur auf. */
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc. nextInt();
		int [] array1 = new int[n];
		int [] array2 = new int[n];
		
		for(int i = 0; i<array1.length; i++) {
			array1[i] = (int) (Math.random() * 11);
			array2[i] = (int) (Math.random() * 101);
		}
		Klausur.ausgeben(array1, array2);
	}
}
