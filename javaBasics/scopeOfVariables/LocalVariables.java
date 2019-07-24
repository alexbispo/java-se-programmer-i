class LocalVariables {

	public static void main(String[] args) {

	}

	public void m1() {
		int x = 10;

		if (x >= 10) {
			int y = 50;
			System.out.print(y);
		}

		System.out.println(x);

		// System.out.print(y); Variable 'y' out of the scope. Compilation error
	}

	public void m2() {
		for (int i = 0, j = 0; i < 10; i++)
			j++;

		// System.out.println(j); Variable 'j' out of the scope. Compilation error
	}

	public void m3(String s) {
		System.out.print(s);
	}

	public void m4() {
		// System.out.print(s); Variable 's' out of the scope. Compilation error
	}

}
