package PS2KW;

public class PS2KW {
	/*berechnung der kW-Werte aus den zufälligen PS-Werten, wobei:
1PS=0,73549875kW
    		
Hinweis 		Bitte beachten Sie die vorgegebene Reihenfolge der Parameter beim Programmieren.*/
	public static void berechnePS2KW(int ps[], double kw[]) {
		if(ps != null) {
			kw = new double[ps.length];
			for(int i = 0; i < ps.length;i++) {
				kw[i] = (ps[i] * 0.73549875);
			}
			ausgeben(kw);
		}
	}
	/*
Geben Sie in dieser Methode mit Hilfe einer foreach-Schleife die kW-Werte wieder auf der Konsole aus.	
kW: X
kW: Y
kW: Z*/
	public static void ausgeben(double kw[]) {
		if(kw != null) {
			for(double e : kw) {
				System.out.println("kW: " + e);
			}
		}
	}
//	public static void ausgeben(int kw[]) {
//		if(kw != null) {
//			for(int e : kw) {
//				System.out.println("kW: " + e);
//			}
//		}
//	}
}
