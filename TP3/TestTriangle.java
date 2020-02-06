package TP3;

public class TestTriangle {
	public static void main(String[] args) {
		Point a, b, c;

		a = new Point(0, 0);
		b = new Point(1, 0);
		c = new Point(0, 1);
		Triangle abc = new Triangle(a, b, c);
		System.out.println("triangle abc :\n" + abc);
		System.out.println("\n\n Isocèle ? " + abc.is_isocele());
	}
}
