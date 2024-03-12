package Monate;
import java.util.Scanner;
public class Monate {
	public static void main( String [] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.close();
		String [] monate = {"Januar","Februar","Maerz","April","Mai","Juni","Juli","August","September","Oktober","November","Dezember"};
		ausgeben(monate);
		ausgeben(monate,n);
	}
	public static void ausgeben(String monate[]) {
		if(monate!=null) {
			for(String e:monate) {
				System.out.println(e);
			}
		}
	}
	public static void ausgeben(String monate[], int zahl) {
		if(monate!=null&&zahl!=0&&zahl<13) {
			System.out.println(monate[zahl-1]);
		}
	}
}
