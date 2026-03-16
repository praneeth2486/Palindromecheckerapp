import java.util.Scanner;

public class Palindromecheckerapp {

    static boolean check(String str) {

        str = str.replaceAll("\\s+", "").toLowerCase();

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

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine();

        if(check(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}