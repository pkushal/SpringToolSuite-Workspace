public class Encoder {
	String[] data = { "h1", " ", "h2", "h3", "h4", "h5", "h6", "h7" };
	int[][] val;

	public static void main(String[] args) {
		Encoder e = new Encoder();
		e.generateSequence(3);
		e.display(3);

	}

	public void generateSequence(int n) {
		val = new int[n][n * (n - 1)];
		for (int i = 0; i < n; i++) {
			int from = (n * (n - 1) - (i + 1) * (n - 1));
			int to = (n * (n - 1) - (i + 1) * (n - 1)) + (n - 1);
			for (int j = from; j < to; j++) {
				int value = (j % (n - 1)) + 2;
				val[i][j] = value;
			}
		}
	}

	public void display(int n) {
		for (int j = 0; j < (n - 1) * n; j++) {
			for (int i = 0; i < n; i++) {
				System.out.print(data[val[i][j]] + "         ");
			}
			System.out.println("\n");
		}
	}
}
