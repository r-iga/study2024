package study.q5;

public class Program {
	public static void main(String[] args) {
		String s = "A man, a plan, a canal, Panama";
		boolean r = q(s);
		System.out.println(" " + r);
	}

	static boolean q(String t) {
		String u = t.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		int a = 0, b = u.length() - 1;
		while (a < b) {
			if (u.charAt(a) != u.charAt(b)) {
				return false;
			}
			a++;
			b--;
		}
		return true;
	}

}
