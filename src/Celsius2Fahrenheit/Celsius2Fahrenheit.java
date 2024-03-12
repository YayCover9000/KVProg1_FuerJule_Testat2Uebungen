package Celsius2Fahrenheit;

public class Celsius2Fahrenheit {
	/*
   		
Aufgabe 	     	
Berechnung der Fahrenheit-Werte aus den zufälligen Celsius-Werten mit Nachkommastellen, wobei:
1 Fahrenheit = 1,8 * Celsius + 32
    		
Hinweis 		Bitte beachten Sie die vorgegebene Reihenfolge der Parameter beim Programmieren.*/
public static void berechneCelsius2Fahrenheit(int celsius[], double fahrenheit[]) {
	if(celsius != null) {
		fahrenheit = new double [celsius.length];
		for(int i = 0; i < celsius.length; i++) {
			fahrenheit[i] = 1.8 * celsius[i] + 32;
			fahrenheit[i] = Math.round(fahrenheit[i]*100)/100.0;
	//		System.out.println(fahrenheit[i] + "=" + celsius[i]);
			}
		ausgeben(fahrenheit);
	}
}

public static void ausgeben(double fahrenheit[]) {
	if(fahrenheit != null) {
		for(double e: fahrenheit) {
			System.out.println("Fahrenheit: " + e);
		}
	}
}



}