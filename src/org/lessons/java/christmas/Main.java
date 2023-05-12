package org.lessons.java.christmas;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;



public class Main {
	public static void main(String[] args) {
		List<String> listaDesideri = new ArrayList<>();
		Scanner desiderio = new Scanner(System.in);
		String desiderios = "";
		do  {
			System.out.println("Scrivi un desiderio");
			desiderios = desiderio.nextLine();
			listaDesideri.add(desiderios);
			System.out.println("Attualmente hai " + listaDesideri.size() + " desideri");
		} while (!desiderios.equals("basta"));
		System.out.println(listaDesideri);
	}
}
