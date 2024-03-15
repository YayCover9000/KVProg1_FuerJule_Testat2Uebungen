package BinaerArrayII;

public class BinaerArrayII {
	/*Geben Sie in dieser Methode die Zeilen des als Parameter übergebenen Arrays auf der Konsole aus, 
	 * die eine gerade Anzahl von Nullen enthalten. Geben Sie für diese auch die Nummer der Zeile im Array mit aus.
Zeile X: [WertederZeileX]
Zeile Y: [WertederZeileY]
Zeile Z: [WertederZeileZ]
*/
	public static void ausgeben(int matrix[][]) {
		int zeros = 0;
//		int ones = 0;
		if(matrix != null) {
			for(int i = 0; i < matrix.length; i++) {
				
				for(int j = 0; j < matrix[i].length; j++) {
					if(matrix[i][j] == 0) {
						zeros += 1;
					}
				}
				if(zeros % 2 == 0) {
					System.out.print("Zeile " + i + ": ");
					for(int p = 0; p < matrix.length; p++) {
						System.out.print(matrix[i][p] + " ");
					}
					System.out.println();
					
				}
				
				zeros = 0;
//				ones = 0;
			}
			
		}
	}
}
