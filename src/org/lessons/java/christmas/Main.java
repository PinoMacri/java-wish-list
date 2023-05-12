package org.lessons.java.christmas;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		List<String> listaDesideri = new ArrayList<>();
		Scanner desiderio = new Scanner(System.in);
		String desiderios = "";
		do {
			System.out.println("Scrivi un desiderio");
			desiderios = desiderio.nextLine();
			listaDesideri.add(desiderios);
			int conteggio = listaDesideri.size();
			if (desiderios.equals("basta")) {
				listaDesideri.remove("basta");
				conteggio = conteggio - 1;
				System.out.println("In totale hai espresso " + conteggio + " desideri");
			} else System.out.println("Attualmente hai " + conteggio + " desideri");
		} while (!desiderios.equals("basta"));
		for (String element : listaDesideri) {
			System.out.println("-- " + element);
		}

		System.out.println("Lista stampata: " + listaDesideri);
	}
}
