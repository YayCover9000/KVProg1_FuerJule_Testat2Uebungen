package SortierenGanzeZahlen;
import java.util.Arrays;
public class SortierenGanzeZahlen {
//	Aufgabe 	     	
//	Sortieren Sie die ganzen Zahlen, wobei Sie den Sortieralgorithmus der Klasse Arrays
//	 einsetzen können oder einen eigenen Sortieralgorithmus schreiben (letzteres ist schwieriger!).
 	public static void sortieren(int zahlen[]) {
 		if(zahlen != null) {
 			Arrays.sort(zahlen);
 			ausgeben(zahlen);
 			
 			// Eigener Sortieralgorithmus
 			int[] array2 = new int[zahlen.length];
 			for(int i = 0; i < array2.length; i++) {
 				array2[i] = zahlen[i];
 			}
 			
 			for (int j = 0; j < array2.length-1; j++) {
 			    for (int i = 0; i < array2.length-1; i++) {
 			        int x = array2[i];
 			        int y = array2[i+1];
 			        
 			        if (x > y) {
 			            int z = x;
 			            x = y;
 			            y = z;
 			           array2[i] = x;
 			          array2[i+1] = y;
 			        }
 			    }
 			}
 		
 			System.out.println("*_*_*_*_*_*_*");
 			ausgeben(array2);
 		}
 		
 	}
 	
// 	Aufgabe 	     	
// 	Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife die sortierten ganzen Zahlen wieder auf der Konsole aus.

 	public static void ausgeben(int zahlen[]) {
		if(zahlen != null) {
		 	for(int e:zahlen) {
		 		System.out.println(e);
		 	}
		 }
 	}
	

		

}
