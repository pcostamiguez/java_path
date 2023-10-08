package main;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {

	public static void main(String[] args) {
		try {
			List<String> list = new ArrayList<>();
			list.add("Maria");
			list.add("José");
			list.add("Rosana");
			list.add(2, "Tereza");
			
			List<String> result = list.stream().filter(x -> x.endsWith("a")).collect(Collectors.toList());

//			System.out.println(list.size());

//			list.remove(1);
			list.removeIf(x -> x.endsWith("eza"));

			for (String item : list) {
				System.out.println(item);
			}
			
			System.out.println("-------------------");
			
			for (String item : result) {
				System.out.println(item);
			}
			
			System.out.println("-------------------");

			String name = "José";
			if (list.indexOf(name) != -1) {
				System.out.println("O nome " + name + " encontra-se na lista e está na posição " + (list.indexOf(name) + 1));
			} else {
				throw new IllegalAccessException("Nome não encontrado!");
			}

		} catch (Exception e) {
			System.out.println("Erro: " + e.getMessage());
		}
	}
}
