import java.util.Scanner;
import java.util.stream.IntStream;

public class Palindromecheckerapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        boolean result =
                IntStream.range(0, str.length()/2)
                        .allMatch(i -> str.charAt(i) == str.charAt(str.length()-1-i));

        if(result)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}