package main;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Matrix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {

			System.out.println("Informe o tamanho da matriz: ");
			int n = sc.nextInt();

			int[][] matrix = new int[n][n];

			String mat = "";

			List<Integer> negatives = new ArrayList<>(), diagonal = new ArrayList<>();

			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					Random rd = new Random();
					int random = rd.nextInt(256) - 128;
					matrix[i][j] = random;

					if (matrix[i][j] < 0) {
						negatives.add(matrix[i][j]);
					}

					if (i == j) {
						diagonal.add(matrix[i][j]);
					}
					mat += matrix[i][j] + " ";
				}
				mat += "\n";
			}

			System.out.println(mat);

			if (returnListFormatted(negatives) != "") {
				System.out.println("Negativos: " + returnListFormatted(negatives));
			}

			if (returnListFormatted(diagonal) != "") {
				System.out.println("Diagonais: " + returnListFormatted(diagonal));
			}

		} catch (Exception e) {
			System.out.println("Aconteceu o seguinte erro: " + e.getMessage());
		} finally {
			sc.close();
		}
	}
	public static String returnListFormatted(List<Integer> list) {
		String result = "";
		if (list.size() > 0) {
			for (int res : list) {
				if (res == list.get(list.size() - 1)) {
					result += res + ". ";
				} else {
					result += res + ", ";
				}
			}
		}
		return result;
	}
}
