package Zimmertemperatur;
import java.util.Scanner;
public class Zimmertemperatur {
//	Die Methode liest Zimmertemperaturen mit ganzzahligen, realistischen Werten ein (d.h. zwischen 15 und 30 Grad, Randwerte einschließlich ).
//	Die Werte werden solange eingegeben bis -1  eingegeben wird oder das Array voll ist.
	public static void einlesenTemperatur(int temperaturen[]) {
		Scanner sc = new Scanner(System.in);
		int zwischen = 0;
		if(temperaturen != null) {
			
			for(int i = 0; i<temperaturen.length;i++) {
				zwischen = sc.nextInt();
				if(zwischen != -1 && i != temperaturen.length) {
					if(zwischen >= 15 && zwischen <= 30) {
						temperaturen[i] = zwischen;
					} else {
						i -= 1;
					}
				}else {
					i = temperaturen.length;
					sc.close();
				}
			}
//			System.out.println("*_*");
			ausgeben(temperaturen);
			
		}
		
	}
//   	Aufgabe 	     	
//   	Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife die
//	Zimmertemperaturen wieder auf der Konsole aus, wobei nur die eingelesenen Werte ausgegeben werden sollen.
//   	    		
//   	Ausgabe-
//   	format 		
//   	Temperatur: X Grad
//   	Temperatur: Y Grad
//   	Temperatur: Z Grad
    public static void ausgeben(int temperaturen[]) {
    	
   		if(temperaturen != null) {
   			for(int e: temperaturen) {
	   			if(e != 0) {
	   				System.out.println("Temperatur: " + e + " Grad");
	   			}
   			}
   		}
   	}

}
