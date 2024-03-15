package GPSEmpfang;

public class GPSEmpfangTesttreiber {
 /*Aufrufen der oben aufgeführten Methoden (mithilfe der main-Methode).
Geben Sie in den Parameterlisten ein Array mit Testwerten an.*/
	public static void main(String [] arg) {
		 int[] testwerte = new int[50];
		 int[] array = new int[] {130,120,80,81,-1,125};

	        for (int i = 0; i < testwerte.length; i++) {
	            testwerte[i] = (int) (Math.random() * 21) + 110; // Zufällige Zahl zwischen 80 und 100 Millisekunden
	        }
	        testwerte[15] = -1;
		GPSEmpfang.einlesenLaufzeiten(testwerte);
//	    GPSEmpfang.einlesenLaufzeiten(array);
		GPSEmpfang.ausgeben(testwerte);
	}
}
