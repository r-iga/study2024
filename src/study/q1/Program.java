package study.q1;

public class Program {
	public static void main(String[] args) {
		for (int i = 1; i <= 100; i++) 
		{
			if (a(i)) { System.out.println(i); }
		}
	}

	static boolean a(int x)
	{
		return x > 1 && b(x);
	}

	static boolean b(int y) {
		for (int j = 2; j <= Math.sqrt(y); j++) 
		{
			if (c(y, j)) {
				return false;
			}
		}
		return true;
	}

	static boolean c(int m, int n) {
		return m % n == 0;
	}
}
