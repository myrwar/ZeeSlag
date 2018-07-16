package Random;

import java.util.Random;
import java.util.Scanner;
import java.text.DecimalFormat;

 public class Dobbelsteen {
	public static void main (String[] args) {
		DecimalFormat df = new DecimalFormat("#.#");
		//Dit is om het percentage van elk getal te laten zien dat wordt gesimuleerd
		Scanner sc = new Scanner(System.in);
		System.out.println("Hoe vaak wil je de dobbelsteen werpen?");
		int rolls = sc.nextInt();
		int [] counts = new int [rolls];
		//Dit maakt een gebruikersingave aan van een x aantal worpen
		sc.close();
		for(int i=0; i < counts.length; i++) { //zorgt voor de waardetoevoeging aan worpen
			counts[i] = Dobbelsteen();
		}
		int[] results = counters(counts);
		System.out.println("Roll\t\tCount\t\tFrequency");
		//Dit is om de tabel te creeren
		for(int i = 0; i< results.length;i++){
			System.out.println((i+2)+"\t\t" + (results[i]) + "\t\t"+df.format(100.0*(results[i])/counts.length)+ "%");}
		}
	
		private static int Dobbelsteen() {


			return 0;
		       }
		
	
	public static int[] counters(int[] arr) {
		int c2=0;
		int c3=0;
		int c4=0;
		int c5=0;
		int c6=0;
		int c7=0;
		int c8=0;
		int c9=0;
		int c10=0;
		int c11=0;
		int c12=0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i]==2)
				c2++;
			else if(arr[i]==3)
				c3++;
			else if(arr[i]==4)
				c4++;
			else if(arr[i]==5)
				c5++;
			else if(arr[i]==6)
				c6++;
			else if(arr[i]==7)
				c7++;
			else if(arr[i]==8)
				c8++;
			else if(arr[i]==9)
				c9++;
			else if(arr[i]==10)
				c10++;
			else if(arr[i]==11)
				c11++;
			else if(arr[i]==12)
				c12++;
		}
		int[] Dobbelsteen = new int[] {c2, c3, c4, c5, c6, c7, c8, c9, c10, c11, c12}
		;
		return Dobbelsteen;
	}
 }
	
		