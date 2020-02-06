package TP3;

public class Personnel {
	private String nom;
	private String prenom;
	private int anneeNaissance;
	private String adresse;
	private Personnel conjoint;
	private int gender;

	public Personnel(String prenom, String nom, int gender, int anneeNaissance, String adresse) {
		this.nom = nom;
		this.prenom = prenom;
		this.anneeNaissance = anneeNaissance;
		this.adresse = adresse;
		this.conjoint = null;
		this.gender = gender;
	}

	public Personnel() {
		this("", "", 0, 0, "");
	}

	public String afficheInfo() {
		String result = prenom + " " + nom + " est né";

		if (gender == 1)
			result = result + "e";
		result = result + " en " + anneeNaissance + ", ";
		if (gender == 1)
			result = result + "elle ";
		else
			result = result + "il ";
		if (conjoint == null)
			result = result + "célibataire";
		else {
			result = result + " marié";
			if (gender == 1)
				result = result + "e";
		}
		result = result + " et habite " + adresse + ".";
		return result;
	}

	public int age(int annee) {
		return annee - anneeNaissance;
	}
}