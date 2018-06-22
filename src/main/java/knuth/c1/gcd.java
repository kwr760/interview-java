package knuth.c1;

public class gcd {
    public int findGreatestCommonDivisor(int m, int n)
    {
        if (n > m) {
            int t = m;
            m = n;
            n = t;
        }

        int r = m % n;

        if (0 == r) {
            return n;
        }

        return findGreatestCommonDivisor(n, r);
    }
}
