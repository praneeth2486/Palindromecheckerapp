import java.util.Scanner;

public class Palindromecheckerapp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        char[] arr = sc.nextLine().toCharArray();

        int l = 0;
        int r = arr.length - 1;
        boolean flag = true;

        while(l < r) {
            if(arr[l] != arr[r]) {
                flag = false;
                break;
            }
            l++;
            r--;
        }

        if(flag)
            System.out.println("Palindrome");
        else
            System.out.println("Not Palindrome");

        sc.close();
    }
}