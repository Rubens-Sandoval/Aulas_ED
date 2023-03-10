package lista2;

import java.util.ArrayList;

public class ex12{
	public static void main(String[] args) {
		double temp1 = -16;
		double temp2 = 4;
		double temp3 = -1;
		
		ArrayList<Double> temps = new ArrayList<Double>();
		temps.add(temp1);
		temps.add(temp2);
		temps.add(temp3);
		
		ArrayList<Double> tempsVer = new ArrayList<Double>();
		
		for (double i : temps) {
			if (i < 0) {
				tempsVer.add(i);
			}
		}
		
		for (double i : tempsVer) {
			System.out.println(i + " é negativa.");
		}
	}
}