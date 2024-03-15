package GPSEmpfang;
import java.util.Scanner;
public class GPSEmpfang {
	/*Die Methode liest Laufzeiten für eine GPS-Messung mit realistischen Werten ein (d.h. zwischen 80 und 130 Millisekunden, einschließlich Randwerte).
Die Werte werden solange eingegeben bis -1 eingegeben wird, oder das Array voll ist.*/
	
	public static void einlesenLaufzeiten(int laufzeiten[]) {
		Scanner sc = new Scanner(System.in);
		int zwischen = 0;
		int q = 0;
		if(laufzeiten != null) {
			do {
				zwischen = sc.nextInt();
				if(zwischen >= 80 && zwischen <= 130) {
					laufzeiten[q] = zwischen;
					q += 1;
				}
			}
			while(zwischen != -1 && q < laufzeiten.length);
			
		}
			
	
//		ausgeben(laufzeiten);
	}
	/*public static void ausgeben(int laufzeiten[])
    		     	
Geben Sie in dieser Methode mit Hilfe einer for-Schleife 
die Laufzeiten wieder auf der Konsole aus, 
wobei nur die eingelesenen Werte ausgegeben werden sollen.
Laufzeit: X ms
Laufzeit: Y ms
Laufzeit: Z ms*/
	
	public static void ausgeben(int laufzeiten[]) {
		if( laufzeiten != null) {
			for(int e : laufzeiten) {
				System.out.println("Laufzeit: " + e + " ms");
			}
		}
	}
}
