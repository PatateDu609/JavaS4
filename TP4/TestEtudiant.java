package TP4;

public class TestEtudiant {
	public static void main(String[] args) {
		Notation[] notes = new Notation[3];

		notes[0] = new Notation(2, 2);
		notes[1] = new Notation(12, 1);
		notes[2] = new Notation(18, 3);

		Etudiant etudiant = new Etudiant("Hamid", notes);
		etudiant.calculerMoyenne();
		etudiant.avis();
		System.out.println("etudiant :\n" + etudiant);
	}
}
