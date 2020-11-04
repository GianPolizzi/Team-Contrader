package prova1;

import java.util.Scanner;


public class Main {
	
	private static String urlOrig;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Inserire URL da accorciare: ");
		urlOrig = sc.nextLine();
		
		AccorciaStringa as = new AccorciaStringa(urlOrig);
		System.out.println("URL Originale: "+urlOrig);
		as.convertiURL(urlOrig);

	}

}
