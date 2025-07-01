package company;

public class XperiTest {
    public static void main(String[] args) {

        String input1 = "abcdjikl";
        String input2 = "acdjkml";

        int[][] dp = new int[input1.length() + 1][input2.length() + 1];
        int maxLen = 0;
        int endIndex = 0;

        for (int i = 1; i <= input1.length(); i++) {
            for (int j = 1; j <= input2.length(); j++) {
                if (input1.charAt(i - 1) == input2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;

                    if (dp[i][j] > maxLen) {
                        maxLen = dp[i][j];
                        endIndex = i;
                    }
                }
            }
        }

        String longestCommonSubstring = input1.substring(endIndex - maxLen, endIndex);
        System.out.println("Longest Common Substring: " + longestCommonSubstring);
    }
}
