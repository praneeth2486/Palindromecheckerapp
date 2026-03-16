import java.util.*;

public class Palindromecheckerapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        Queue<Character> queue = new LinkedList<>();

        for(char c : str.toCharArray())
            queue.add(c);

        String rev = "";

        while(!queue.isEmpty())
            rev = queue.remove() + rev;

        if(str.equals(rev))
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}