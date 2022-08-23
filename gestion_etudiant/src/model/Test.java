package model;

import java.util.Scanner;


/**
 * @author ameur
 * The Class Test.
 */
public class Test {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		
		Etudiant etudiant = new Etudiant();
		Etudiant etudiantWithInfo = new Etudiant("drira",29,12.10,"route soukra km 4");
		etudiant.info();
		etudiantWithInfo.info();
		/*
		 * Q-7 : 
		 * l'objet avec le constructeur sans paramètre est initialisé par les valeurs par défaut des types.
		 * l'objet avec le constructeur paramétré est initialisé par les valeurs données lors de la déclaration (passer en parametres).
		 * */
		
		Scanner scanner = new Scanner(System.in);
	    System.out.println("Enter le nom de l'étudiant qui doit être compris entre 8 et 30 caractères \n");
	    String nom = scanner.nextLine();  
	    System.out.println("Enter l'âge de l'étudiant qui doit être entre 18 et 28 \n");
	    String age = scanner.nextLine();
	    System.out.println("Enter la moyenne de l'etudiant qui doit etre entre 0.00 et 20.00 \n");
	    String moyenne = scanner.nextLine();
	    System.out.println("Enter l'adresse de l'etudiant \n");
	    String adresse = scanner.nextLine();
	    scanner.close();
	   
	    etudiant.setNom(nom);
	    etudiant.setAge(Integer.parseInt(age));
	    etudiant.setMoyenne(Double.parseDouble(moyenne));
	    etudiant.setAdresse(adresse);
	    System.out.println("------------------- Étudiant après la saisie de ces informations ------------------- \n");
	   
	    etudiant.info();
		
	}

}
