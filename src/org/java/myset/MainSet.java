package org.java.myset;
import java.util.Random;
import java.util.HashSet;
import java.util.Set;

public class MainSet {
	public static void main(String[] args) {
		Set<Integer> MySet = new HashSet<>();
		
		do {
			Random r = new Random();
			int result = r.nextInt(2,12);
			MySet.add(result);
		} while (!(MySet.size()==5));
		System.out.println(MySet);
	}
}
