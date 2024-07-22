package study.q2;

public class Program {
	public static void main(String[] args) {
		String s = "Hello World";
		String r = x(s);
		System.out.println("Original: " + s);
		System.out.println("Reversed: " + r);
	}

	static String x(String s) {
		char[] a = s.toCharArray();
		int l = a.length;
		for (int i = 0; i < l / 2; i++) {
			char t = a[i];
			a[i] = a[l - i - 1];
			a[l - i - 1] = t;
		}
		return new String(a);
	}
}
