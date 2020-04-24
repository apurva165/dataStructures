package DandQ;

public class ConvertStringToAnother {
    public static void main(String[] args) {
        String str1 = "abcde";
        String str2 = "abcde";

        System.out.println(findMinOperation(str1, str2, 0, 0));
    }

    public static int findMinOperation(String str1, String str2, int i1, int i2) {
        if (i1 == str1.length() - 1) {
            return str2.length() - i2;
        }
        if (i2 == str2.length() - 1) {
            return str1.length() - i1;
        }
        if (str1.charAt(i1) == str2.charAt(i2)) {
            findMinOperation(str1, str2, i1 + 1, i2 + 1);
        }

        int case1 = 1 + findMinOperation(str1, str2, i1 + 1, i2); // insertion
        int case2 = 1 + findMinOperation(str1, str2, i1, i2 + 1); // delete
        int case3 = 1 + findMinOperation(str1, str2, i1 + 1, i2 + 1); // replace
        return Math.min(case1 , Math.min(case2, case3));
    }
}
