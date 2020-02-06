package TP4;

public class Notation {
	private double coef, note;

	public Notation(double n, double c) {
		coef = c;
		note = n;
	}

	public double getCoef() {
		return coef;
	}

	public double getNote() {
		return note;
	}

	public String toString() {
		return "note : " + note + ", coef : " + coef;
	}
}
