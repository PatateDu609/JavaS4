package TP3;

public class Triangle {
	private Point a;
	private Point b;
	private Point c;

	public Triangle(Point a1, Point b1, Point c1) {
		a = a1;
		b = b1;
		c = c1;
	}

	public void afficher() {
		System.out.println("a : ");
		a.afficher();
		System.out.println("b : ");
		b.afficher();
		System.out.println("c : " + c);
		c.afficher();
	}

	public String toString() {
		return "a : " + a + "\nb : " + b + "\nc : " + c;
	}

	public boolean is_isocele() {
		double ab2 = Math.pow(a.getX() - b.getX(), 2) + Math.pow(a.getY() - b.getY(), 2);
		double ac2 = Math.pow(a.getX() - c.getX(), 2) + Math.pow(a.getY() - c.getY(), 2);
		double bc2 = Math.pow(b.getX() - c.getX(), 2) + Math.pow(b.getY() - c.getY(), 2);

		if (ab2 == ac2)
			return true;
		else if (ab2 == bc2)
			return true;
		else return ac2 == bc2;
	}
}
