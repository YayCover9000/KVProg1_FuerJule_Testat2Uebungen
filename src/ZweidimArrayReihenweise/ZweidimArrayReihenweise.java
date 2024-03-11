package ZweidimArrayReihenweise;

public class ZweidimArrayReihenweise {
//	1. Deklarieren Sie ein 2-dim Array und reservieren Sie Speicher für 10 x 10 ganze Zahlen.
//
//	2. Rufen Sie zuerst die Methode zum Initialisieren und dann zum Ausgeben auf.
	public static void main(String [] args) {
		int[][] array1 = new int[10][10];
		if(array1!=null) {
			ini(array1);
		}
	}
	
//  Initialisieren Sie ein 2-dim Array, so dass die Zahlen 0 – 9 in der ersten Reihe, die Zahlen 10 – 19 in der zweiten Reihe, … und die Zahlen 90 – 99 in der zehnten Reihe stehen.

	public static void ini(int zahlen[][]) {
		int lauf = 0;
		if(zahlen != null) {
			for(int i = 0; i<zahlen.length;i++) {
				for(int j = 0; j<zahlen[i].length; j++) {
					zahlen[i][j] = lauf;
					lauf += 1;
				}
			}
		}
		ausgeben(zahlen);
	}

//Geben Sie in dieser Methode mit Hilfe von for-Schleifen das initialisierte Array reiehnweise auf der Konsole aus.
//Die Elemente einer Reihe sollen jeweils durch einen Tabulatorsprung (Escape-Sequenz für Tabulatorsprung einsetzen) getrennt sein.
	public static void ausgeben(int zahlen[][]) {
		if(zahlen != null) {
			for(int[] e:zahlen) {
				for(int k:e) {
					System.out.print(k+"\t");
				}
				System.out.println();
			}
		}
	}


}
