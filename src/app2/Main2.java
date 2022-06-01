package app2;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Main2 {

	public static void main(String[] args) {

//		System.out.println("Hello world2");
//		
//		Scanner scanner = new Scanner(System.in);
//				
//			System.out.println("Ecrivez un nombre svp");
//		try  {
//			
//			int nombre = scanner.nextInt();	
//			System.out.println(nombre);
//		}catch(InputMismatchException e) {
//			System.out.println("Veuillez entrer un nombre svp!");
//		}
//		
//		scanner.close();

		System.out.println("-------------------------------------------");
		
// Ecrire un code Java qui permet d’afficher les nombres pairs compris entre 0
// et 10. (value % 2 == 0)
//		for (int index = 0; index < 11; index++) {
//			if (index % 2 == 0) {
//				System.out.println(index);
//			}
//		}

// Ecrire un programme java qui demande à l’utilisateur de saisir 
// un nombre entier et de lui afficher que le nombre est pair ou 
// impair selon la valeur tapée		

//		Scanner scanUser = new Scanner(System.in);
//
//		System.out.println("Ecrivez un nombre entier");
//
//		try {
//
//			int number = scanUser.nextInt();
//
//			System.out.println(number);
//
//			if (number % 2 == 0) {
//				System.out.println("le nombre entré est pair");
//			} else {
//				System.out.println("le nombre entré est impair");
//			}
//		} catch (Exception e) {
//			System.out.println("Vous devez entrer un nombre entier");
//
//		}
//		scanUser.close();
//		
//Demandez trois nombres de l'utilisateur et affichez le plus grand nombre.

//		Scanner scanUserNumber1 = new Scanner(System.in);
//
//		System.out.println("Votre premier nombre");
//
//		try {
//			int number1 = scanUserNumber1.nextInt();
//
//			Scanner scanUserNumber2 = new Scanner(System.in);
//
//			System.out.println("Votre deuxième nombre");
//
//			int number2 = scanUserNumber2.nextInt();
//
//			Scanner scanUserNumber3 = new Scanner(System.in);
//
//			System.out.println("Votre troisième nombre");
//
//			int number3 = scanUserNumber3.nextInt();
//
//			if (number1 > number2 && number1 > number3) {
//				System.out.println(number1 + " " + "est le plus grand nombre");
//				scanUserNumber1.close();
//			} else if (number2 > number1 && number2 > number3) {
//				System.out.println(number2 + " " + "est le plus grand nombre");
//				scanUserNumber2.close();
//			} else
//				System.out.println(number3 + " " + "est le plus grand nombre");
//			scanUserNumber3.close();
//		} catch (Exception e) {
//			System.out.println("Valeur incorrecte");
//		}

//Écrire un programme Java pour convertir des minutes en un certain nombre d'années et de jours
		// le nombre de minutes dans une année = 60 minutes * 24 heures * 365 jours
//		double minutesInYear = 60 * 24 * 365;
//		Scanner input = new Scanner(System.in);
//		System.out.print("Input the number of minutes: ");
//		double min = input.nextDouble();
//		long years = (long) (min / minutesInYear);
//		int days = (int) (min / 60 / 24) % 365;
//		System.out.println((int) min + " minutes is approximately " + years + " years and " + days + " days");
//		input.close();
		
	
		// Ecrire un programme pour que pour un cours du dollar donné (et qui ne change
		// pas pendant l’exécution du programme),
		// on puisse convertir en euro.
		// Prévoyez un moyen d’arrêter l’exécution du programme.
//		double euros, dollar;
//		double cours;
//		String choix;
//		Scanner in = new Scanner(System.in);
//		try {
//			do {
//				System.out.println("Cours du dollar(valeur de 1 dollar)?");
//				cours = in.nextDouble();
//				System.out.println("Somme en dollar ?");
//				dollar = in.nextDouble();
//				euros = dollar * cours;
//				System.out.println("La somme en euros:" + euros);
//				System.out.println("Voulez-vous quitter" + "(tapez q pour quitter)");
//				choix = in.next();
//			} while (choix == "q");
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
	}
}
