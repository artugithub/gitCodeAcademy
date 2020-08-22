package lt.codeacademy.studies.javabasica.secondweek.operators;

import java.util.Scanner;

public class Uzduotis1 {

	public static void main(String[] args) {
		String sakinys = ivesti();
		int indeksas1 = 0;
		int indeksas2 = sakinys.indexOf(" "); // pakeisti

		String z1 = sakinys.substring(indeksas1, indeksas2);

		System.out.println("Pirmas sakinio žodis: " + z1 + ".");
	}

	private static String ivesti() {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Iveskite sakini is keliu zodziu");
		return sc.nextLine();
	}

}
