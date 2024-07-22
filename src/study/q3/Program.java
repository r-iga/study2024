package study.q3;

public class Program {
    public static void main(String[] args) {
        int[] nums = {5, 3, 9, 1, 6, 8, 2};
        int a = f1(nums);
        int b = f2(nums);
        System.out.println("Max: " + a);
        System.out.println("Min: " + b);
    }

    static int f1(int[] x) {
        int p = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] > p) {
                p = x[i];
            }
        }
        return p;
    }

    static int f2(int[] x) {
        int q = x[0];
        for (int i = 1; i < x.length; i++) {
            if (x[i] < q) {
                q = x[i];
            }
        }
        return q;
    }
}
