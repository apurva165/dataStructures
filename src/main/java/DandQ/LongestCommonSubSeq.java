package DandQ;

public class LongestCommonSubSeq {
    public static void main(String[] args) {
      int a =  findLCSLengthAux("aaaaa", "aaaaa", 0, 0);
        System.out.println(a);
    }

    public static int findLCSLengthAux(String s1, String s2, int s1c, int s2c) {
        if (s1c == s1.length() || s2c == s2.length()) {
            return 0;
        }
        int c3 = 0;
        if (s1.charAt(s1c) == s2.charAt(s2c)) {
            c3 = 1 + findLCSLengthAux(s1, s2, s1c + 1, s2c + 1);
        }

        int c1 = findLCSLengthAux(s1, s2, s1c + 1, s2c);
        int c2 = findLCSLengthAux(s1, s2, s1c, s2c + 1);

        return Math.max(c1, Math.max(c2, c3));
    }
}
