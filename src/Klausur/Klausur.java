package Klausur;

public class Klausur {
/*
   		
Aufgabe 	     	
1. Geben Sie in dieser Methode alle Zahlen i auf der Konsole aus für die "bestanden" gilt:
Array1[i] + Array2[i] > 49
2. Geben Sie die Gesamtanzahl der Kandidaten aus, die "bestanden" haben.
    		
Ausgabe-
format 		

Array1: X Array2: Y ist gleich S

Array1: X Array2: Y ist gleich S

                
...

Es haben Z Teilnehmer bestanden.*/
	
	public static void ausgeben(int array1[], int array2[]) {
		if(array1 != null && array2 != null) {
			for(int i = 0; i < array1.length; i++) {
				if((array1[i] + array2[i]) > 49) {
					System.out.println("Array1: " + array1[i] +  " Array2 :" + array2[i] + " ist gleich " + array1[i] + array2[i]);
				}
				
			}
		}
	}
}
