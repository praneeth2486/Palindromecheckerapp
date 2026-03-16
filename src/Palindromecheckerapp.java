import java.util.Scanner;

public class Palindromecheckerapp {

    static boolean check(String s, int l, int r) {
        if (l >= r)
            return true;

        if (s.charAt(l) != s.charAt(r))
            return false;

        return check(s, l + 1, r - 1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        if (check(str, 0, str.length() - 1))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");
    }
}