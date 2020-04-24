package DandQ;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
        String string = "sadfnsdloiewasdf";

        lpsSubString(string, 0, string.length() - 1);

    }

    public static int lpsSubString(String str, int startInd, int endInd) {

        int c1 = 0;
        if (str.charAt(startInd) == str.charAt(endInd)) {
            c1 = 1 + lpsSubString(str, startInd + 1, endInd - 1);
        }
        int c2 = lpsSubString(str, startInd + 1, endInd);
        int c3 = lpsSubString(str, startInd, endInd - 1);
        return Math.max(c1, Math.max(c2, c3));
    }

}

