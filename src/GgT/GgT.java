package GgT;
import java.util.Scanner;
public class GgT {
	/*1. Lesen Sie n für eine Anzahl von Arrayelementen ein.

2. Initialisieren Sie ein Array für n ganze, zufällige Zahlen im Wertebereich von 0 bis 100 (ausschließlich).
Nutzen Sie hierfür den Zufallszahlengenerator der Klasse Math.

3. Rufen Sie für jedes auf einander folgende Paar des Arrays (1. Element und 2. Element, 2. Element und 3. Element,
 3. Element und 4. Element usw.) die Methode zum Berechnen des größten gemeinsamen Teilers auf.

4. Geben Sie jeweils das Paar und den größten gemeinsamen Teiler dabei aus. */
	
	public static void main(String [] args) {
		Scanner sc =  new Scanner(System.in);
		int n = sc.nextInt();
		
		int test;
		if(n >= 0) {
			int ergebnis;
			int [] array = new int[n];
			
			for(int i = 0; i < array.length; i++) {
				array[i] = (int) (Math.random()*99);
//				test = sc.nextInt();
//				array[i] = test;
			}
			for(int i = 0; i < array.length-1; i++) {
				ergebnis = berechneGgt(array[i],array[i+1]);
				System.out.println("Der ggt fuer " + array[i] + " und " + array[i+1] + " lautet: " + ergebnis);
			}
		}
	}
	
	/*Aufgabe 	     	
Berechnung des größten gemeinsamen Teilers von 2 Zahlen rekursiv oder iterativ.
(vgl. Algorithmus in den Folien der Vorlesung).
    		
Ausgabe-
format 		

Der ggt fuer X und Y lautet: Z

Der ggt fuer X und Y lautet: Z

Der ggt fuer X und Y lautet: Z*/
	
	public static int berechneGgt(int zahl1, int zahl2) {
		int a;
		int b;
		int r = 1;
		if(zahl1 > 0 && zahl2 > 0) {
			if(zahl1 > zahl2) {
				a = zahl1;
				b = zahl2;
			}else {
				a = zahl2;
				b = zahl1;
			}
			while(r != 0) {
				r = a%b;
				a = b;
				b = r;
			}
			return a;
		}else if(zahl1 > zahl2) {
			return zahl1;
		}else {
			return zahl2;
		}
		
	}
		
}
