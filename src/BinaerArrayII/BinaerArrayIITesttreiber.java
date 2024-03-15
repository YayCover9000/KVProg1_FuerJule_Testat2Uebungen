package BinaerArrayII;
import java.util.Scanner;
public class BinaerArrayIITesttreiber {
/*1. Initialisieren Sie ein zweidimensionales Array mit n Zeilen und n Spalten, wobei Sie n einlesen, zufällig mit Nullen und Einsen.
Nutzen Sie hierfür den Zufallszahlengenerator der Klasse Math.

2. Rufen Sie die folgende Methode der Klasse  BinaerArrayII  auf.*/
	public static void main(String [] args) {
		BinaerArrayIITesttreiber blobfisch = new BinaerArrayIITesttreiber();
	}
	public BinaerArrayIITesttreiber() {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		int [][] array = new int[n][n];
		for(int i = 0; i < array.length; i++) {
			for(int j = 0; j < array[i].length; j++) {
                array[i][j] = (int) Math.round(Math.random()); // entweder 0 oder 1
//				if(j % 2 == 0) {
//					array[i][j] = 0;
//				} else {
//					array[i][j] = 1;
//				}
			}
		}
		BinaerArrayII.ausgeben(array);
	}
	

}
