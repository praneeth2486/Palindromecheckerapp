import java.util.Scanner;

class PalindromeChecker {

    boolean check(String str) {

        int l = 0;
        int r = str.length() - 1;

        while(l < r) {
            if(str.charAt(l) != str.charAt(r))
                return false;

            l++;
            r--;
        }

        return true;
    }
}

public class Palindromecheckerapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        PalindromeChecker p = new PalindromeChecker();

        if(p.check(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}