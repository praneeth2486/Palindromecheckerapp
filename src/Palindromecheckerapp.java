import java.util.Scanner;
import java.util.Stack;

public class Palindromecheckerapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray())
            stack.push(c);

        String rev = "";

        while(!stack.isEmpty())
            rev += stack.pop();

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}