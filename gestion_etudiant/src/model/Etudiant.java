package model;

/**
 * @author ameur The Class Etudiant.
 */
public class Etudiant {

	/** The nom. */
	private String nom;

	/** The age. */
	private int age;

	/** The moyenne. */
	private double moyenne;

	/** The adresse. */
	private String adresse;

	/**
	 * Instantiates a new etudiant.
	 */
	public Etudiant() {

	}

	/**
	 * Instantiates a new etudiant.
	 *
	 * @param nom     the nom
	 * @param age     the age
	 * @param moyenne the moyenne
	 * @param adresse the adresse
	 */
	public Etudiant(String nom, int age, double moyenne, String adresse) {
		this.nom = nom;
		this.age = age;
		this.moyenne = moyenne;
		this.adresse = adresse;
	}

	/**
	 * Info : une methode qui affiche les information de l'etudiant.
	 */
	public void info() {
		System.out.println(
				"Etudiant [nom=" + nom + ", age=" + age + ", moyenne=" + moyenne + ", adresse=" + adresse + "]");
	}

	/**
	 * Gets the nom.
	 *
	 * @return the nom
	 */
	public String getNom() {
		return nom;
	}

	/**
	 * Sets the nom :  le nom avec une condition la longeur de la chaine 
	 * doit etre entre 8 et 30 .
	 *
	 * @param nom the new nom
	 */
	public void setNom(String nom) {
		if (nom.length() >= 8 && nom.length() <= 30) {
			this.nom = nom;
		} else {
			System.err.println("ERROR : le nom n'est pas compris entre 8 et 30 caractères");
		}
	}

	/**
	 * Gets the age : set age .
	 *
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * Sets the age :l'age doit etre entre 18 et 28 .
	 *
	 * @param age the new age
	 */
	public void setAge(int age) {
		if (age >= 18 && age <= 28) {
			this.age = age;
		} else {
			System.err.println("ERROR : l'age n'est pas compris entre 18 et 28 caractères");
		}
	}

	/**
	 * Gets the moyenne.
	 *
	 * @return the moyenne
	 */
	public double getMoyenne() {
		return moyenne;
	}

	/**
	 * Sets the moyenne : la moyenne doit etre entre 0.00 et 20.00
	 *
	 * @param moyenne the new moyenne
	 */
	public void setMoyenne(double moyenne) {
		if (moyenne >= 0.00 && moyenne <= 20.00) {
			this.moyenne = moyenne;
		} else {
			System.err.println("ERROR : la moyene n'est pas compris entre 0.00 et 20.00 caractères");
		}

	}

	/**
	 * Gets the adresse.
	 *
	 * @return the adresse
	 */
	public String getAdresse() {
		return adresse;
	}

	/**
	 * Sets the adresse.
	 *
	 * @param adresse the new adresse
	 */
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}

}
