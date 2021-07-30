import java.util.Scanner;

public class Example {

    // d is the number of characters in the input alphabet
    public final static int d = 256;

    static void search(String pat, String txt, long q)
    {
        long p = 53;
        long m = q;
        int S = pat.length(), T = txt.length();

        long[] p_pow = new long[T];
        p_pow[0] = 1;

        for (int i = 1; i < T; i++)
            p_pow[i] = (p_pow[i-1] * p) % m;

        long[] h = new long[T + 1];
        for (int i = 0; i < T; i++)
            h[i+1] = (h[i] + (txt.charAt(i) + 1) * p_pow[i]) % m;
        long h_s = 0;
        for (int i = 0; i < S; i++)
            h_s = (h_s + (pat.charAt(i) + 1) * p_pow[i]) % m;

        for (int i = 0; i + S - 1 < T; i++) {
            long cur_h = (h[i+S] + m - h[i]) % m;
            if (cur_h == h_s * p_pow[i] % m)
                System.out.println(i+1);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String pat = sc.nextLine();
        String txt = sc.nextLine();

        long q = 1000000009L; // A prime number
        search(pat, txt, q);
    }
}
