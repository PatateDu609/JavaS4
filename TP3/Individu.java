package TP3;

public class Individu {
	private String nom;
	private String prenom;
	private Individu conjoint;

	public Individu(String prenom, String nom, Individu individu) {
		this.nom = nom;
		this.prenom = prenom;
		conjoint = individu;
	}

	public Individu() {
		this("", "", null);
	}

	public void marier(Individu conjoint) {
		this.conjoint = conjoint;
		this.conjoint.conjoint = this;
	}

	public void afficheInfo() {
		String result = prenom + " " + nom + " est ";

		if (conjoint == null)
			result = result + "célibataire";
		else {
			result = result + " marié/e";
			result = result + " à " + conjoint.prenom + " " + conjoint.nom;
		}
		System.out.println(result + ".");
	}
}
