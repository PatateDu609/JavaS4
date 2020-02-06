package TP4;

public class TriNombres {
	private int[] array = {35, 6, 2, 66, 100, 36, 11, 1, 6, 14};

	public TriNombres() {

	}

	public void setArray(int[] a) {
		array = a;
	}

	public void sort() {
		int len = array.length;
		int temp;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < len - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}
	}

	public void afficher() {
		for (int nb : array) {
			System.out.println(nb);
		}
	}
}
