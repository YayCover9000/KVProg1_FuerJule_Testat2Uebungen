package ZweidimArraySpaltenweise;

public class ZweidimArraySpaltenweise {
	/*1. Deklarieren Sie ein 2-dim Array und reservieren Sie Speicher für 10 x 10 ganze Zahlen.

2. Rufen Sie zuerst die Methode zum Initialisieren und dann zum Ausgeben auf.*/
	public static int[][] array = new int[10][10];
	public static void main(String [] args) {
		ini(array);
		ausgeben(array);
	}
	/*Initialisieren Sie ein 2-dim Array, so dass die Zahlen 0 – 9 in der ersten Reihe, die Zahlen 10 – 19 in der zweiten Reihe, … und die Zahlen 90 – 99 in der zehnten Reihe stehen.
*/
	public static void ini(int zahlen[][]) {
		int cnt = 0;
		if(zahlen != null) {
			for (int i = 0; i < zahlen.length; i++) {
				for(int j = 0; j < zahlen[i].length; j++) {
					zahlen[i][j] = cnt;
					cnt +=1;
				}
			}
		}
	}
	/*Geben Sie in dieser Methode mit Hilfe von for-Schleifen das initialisierte Array spaltenweise auf der Konsole aus. Die Elemente einer Spalte sollen jeweils durch einen Tabulatorsprung (Escape-Sequenz für Tabulatorsprung einsetzen) getrennt sein.
*/
	public static void ausgeben(int zahlen[][]) {
		if(zahlen != null) {
			int[][] zwischen = new int[zahlen.length][zahlen.length];
//			for(int[] e:zahlen) {
//				for(int k: e) {
//					System.out.print(k + "\t");
//				}
//				System.out.println();
//			}
//			System.out.println();
			
			// Version array transponieren
			for (int i = 0; i < zahlen.length; i++) {
				for(int j = 0; j < zahlen[i].length; j++) {
					zwischen[j][i] = zahlen[i][j];
				}
			}
			// Jetzt ausgabe von transponiertem Array
			for(int[] e:zwischen) {
				for(int k: e) {
					System.out.print(k + "\t");
				}
				System.out.println();
			}
			
//			for(int i = 0; i < zeile; i++) {
//				for(int j = 0; j < spalte; j++) {
//					System.out.print(zahlen[i][j] + "\t");
//				}
//				System.out.println();
//			}
		} 
		
	}
}
