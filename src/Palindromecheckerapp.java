import java.util.Scanner;
import java.util.Stack;

interface Strategy {
    boolean check(String str);
}

class StackStrategy implements Strategy {

    public boolean check(String str) {

        Stack<Character> stack = new Stack<>();

        for(char c : str.toCharArray())
            stack.push(c);

        for(char c : str.toCharArray()) {
            if(c != stack.pop())
                return false;
        }

        return true;
    }
}

public class Palindromecheckerapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Strategy s = new StackStrategy();

        if(s.check(str))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}