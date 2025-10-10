package arrays;

public class FiboPrime {

    public static void main(String[] args) {
        int a = 10;
        int b = 200;
        fiboPrime(a, b);
    }

    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i*i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void fiboPrime(int start, int end) {
        int n1 = 0, n2 = 1;
        while (n1 <= end) {
            if (n1 >= start && isPrime(n1)) {
                System.out.println(n1);
            }
            int res = n1 + n2;
            n1 = n2;
            n2 = res;
        }
    }
}
