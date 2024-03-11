package Binaer2Dim;

public class BinaerArrayI {
/*   		
Aufgabe 	     	
Geben Sie in dieser Methode die Zeilen des als Parameter übergebenen Arrays auf der Konsole aus, die mehr Einsen als Nullen enthalten. Geben Sie für diese auch die Nummer der Zeile im Array mit aus.
    		
Ausgabe-
format 		
				
Zeile X: [WertederZeileX]
				
Zeile Y: [WertederZeileY]
					
Zeile Z: [WertederZeileZ]

 */
	public static void ausgeben(int[][] matrix) {
		
//		int[] zeilenEins = new int[matrix.length];
		
		
		if(matrix != null) {
			for(int i = 0; i < matrix.length;i++) {
				int nullen = 0;
				int einsen = 0;
				for(int j = 0; j < matrix[i].length; j++) {
					if(matrix[i][j] == 1) {
						einsen += 1;
					} else if (matrix[i][j] == 0) {
						nullen += 1;
					}
					//System.out.println("HELLO" + array[i][j]);
				}
				if(einsen > nullen) {
//					zeilenEins[i] = i;
					//System.out.println(i);
					
					System.out.print("Zeile " + i + ": ");
					for(int e:matrix[i]) {
						System.out.print(e);
					}
					System.out.println("");
					nullen = 0;
					einsen = 0;
				}
			}
		} else {
			System.out.println("Array ist leer");
		}
		/*
		 * System.out.println("_______"); for(int e:zeilenEins) {
		 * //System.out.println(e); if(zeilenEins[e] != 0) { System.out.println("Zeile "
		 * + e + ": ['Eigentlich Inhalt von J']"); } }
		 */
	}
}
