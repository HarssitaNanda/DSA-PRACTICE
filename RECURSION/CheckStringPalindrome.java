public class CheckStringPalindrome {
    public static void main(String[] args) {
        String s = "madam";

        boolean ans = reverse(0,s);

        if (ans)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    static boolean reverse(int i, String s) {
        // Base Condition: If i exceeds half of the string, all the elements have been compared
        // and the string is a palindrome, return true.
        if (i >= s.length() / 2) return true;

        // If the start and end characters are not equal, it's not a palindrome.
        if (s.charAt(i) != s.charAt(s.length() - i - 1)) return false;

        // If both characters are the same, increment i and check start+1 and end-1.
        return reverse(i + 1, s);
    }
}
