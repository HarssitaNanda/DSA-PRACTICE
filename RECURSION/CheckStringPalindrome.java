public class CheckStringPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";

        boolean ans = reverse(s, 0, s.length() - 1);

        if (ans)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }

    static boolean reverse(String s, int left, int right) {
        if (left >= right)
            return true;

        if (!Character.isLetterOrDigit(s.charAt(left)))
            return reverse(s, left + 1, right);

        if (!Character.isLetterOrDigit(s.charAt(right)))
            return reverse(s, left, right - 1);

        if (Character.toLowerCase(s.charAt(left)) !=
            Character.toLowerCase(s.charAt(right))) {
            return false;
        }

        return reverse(s, left + 1, right - 1);
    }
}
