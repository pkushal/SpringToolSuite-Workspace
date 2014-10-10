public class Division {
	public static void main(String[] args) {
		Division d = new Division();
		System.out.println(Long.MAX_VALUE);
		System.out.println(Long.MIN_VALUE);
		System.out.println(d.divide(-999511578, -2147483648));
		System.out.println(-2147483648 >> 31);

	}

	public int divide(int dividend, int divisor) {
		long a = Math.abs((long) dividend);
		long b = Math.abs((long) divisor);
		System.out.println(a);
		System.out.println(b);
		int i = 0;
		int ans = 0;
		while (a >= b) {
			i++;
			b = b << 1;
			System.out.println("b: " + b + " and i: " + i);
		}
		while (i >= 0) {
			System.out.println("                          hu la la        I: "
					+ i + " and B is: " + b);
			if (a >= b) {
				a -= b;
				System.out.println("Answer before: " + ans);
				ans += (1 << i);
				System.out.println("Answer after: " + ans);
			}
			b = b >> 1;
			i--;
		}
		return ((dividend >> 31) == (divisor >> 31) ? ans : -ans);
	}
}
