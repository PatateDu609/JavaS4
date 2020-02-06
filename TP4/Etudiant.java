package TP4;

public class Etudiant {
	private String _nom;
	private double _moyenne;
	private String _avis;
	private Notation[] _notes;

	public Etudiant(String nom, Notation[] notes) {
		_nom = nom;
		_notes = notes;
		_moyenne = 0;
		_avis = "";
	}

	public void calculerMoyenne() {
		double coefs = 0;

		for (Notation note : _notes) {
			_moyenne += note.getNote() * note.getCoef();
			coefs += note.getCoef();
		}
		_moyenne /= coefs;
	}

	public void avis() {
		if (_moyenne > 10)
			_avis = "Admis";
		else
			_avis = "Non admis";
	}

	public String toString() {
		String result = "Nom : " + _nom + "\n"
				+ "Moyenne : " + _moyenne + "\n"
				+ "Avis : " + _avis + "\n"
				+ "Notes :\n";
		for (Notation note : _notes)
			result = result.concat(note + "\n");
		return result;
	}
}
