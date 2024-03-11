package SortierenGanzeZahlen;
import java.util.Scanner;

public class SortierenGanzeZahlenTesttreiber {
//   	1. Initialisieren Sie ein Array für n ganze Zahlen, wobei Sie n einlesen.
//
//2. Befüllen Sie das Array mit zufälligen Zahlen im Wertebereich von 0 bis 2147483647 (ausschließlich).
//Nutzen Sie dafür den Zufallszahlengenerator der Klasse Math
//.
//
//3. Rufen Sie die folgenden Methoden der Klasse  SortierenGanzeZahlen  auf.
	
	public static void main(String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[n]; 
		for(int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random()*2147483647);
		}
		sc.close();
		if(array != null) {
			SortierenGanzeZahlen.sortieren(array);
		}
	}
	

}
