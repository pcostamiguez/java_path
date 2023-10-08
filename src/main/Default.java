package main;

import java.util.Locale;
import java.util.Scanner;

public class Default {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Informe a quantidade de alturas a inserir:");
			int vectLenght = sc.nextInt();
			double[] vect = new double[vectLenght];
			double auxSum = 0;

			for (int i = 0; i < vectLenght; i++) {
				System.out.println("Informe a altura da pessoa " + (i+1) + ": ");
				vect[i] = sc.nextDouble();
				auxSum += vect[i];
			}
			
			System.out.println("A média das " + vectLenght + " alturas é: " + auxSum / vectLenght);
			
		} catch (Exception e) {
			System.out.println("Houve o seguinte erro: " + e.getMessage());
		} finally {
			sc.close();
		}
	}

}
