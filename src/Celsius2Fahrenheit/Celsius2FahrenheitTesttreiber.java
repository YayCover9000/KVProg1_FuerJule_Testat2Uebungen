package Celsius2Fahrenheit;

import java.util.Scanner;
public class Celsius2FahrenheitTesttreiber {
/*1. Lesen Sie n für die Anzahl der Celsius-Werte ein.

2. Initialisieren Sie ein Array mit n zufälligen Celsius-Werten größer 0 und kleiner 100 Grad.
Nutzen Sie hierbei den Zufallszahlengenerator der Klasse Math.

3. Rufen Sie die folgenden Methoden der Klasse Celsius2Fahrenheit auf. */
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] cArray = new int[n];
		double[] fahrenheit = new double [cArray.length];
		
		for(int i = 0; i < cArray.length;i++) {
			cArray[i] = (int) (Math.random()*100);
			if(cArray[i] < 1 || cArray[i] > 99) {
				i -= 1;
			}
		}

		Celsius2Fahrenheit.berechneCelsius2Fahrenheit(cArray, fahrenheit);
		Celsius2Fahrenheit.ausgeben(fahrenheit);
	}
}
