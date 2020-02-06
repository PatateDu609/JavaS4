package TP3;

public class Point {
	private double x, y;

	public Point(double c, double d) {
		x = c;
		y = d;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public String toString() {
		return "x = " + x + ", y = " + y;
	}

	public void afficher() {
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}
