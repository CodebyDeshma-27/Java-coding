import java.util.*;
public class rev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
        int reversed = 0;
        int original = number;
        
        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        
        System.out.println("Original number: " + original);
        System.out.println("Reversed number: " + reversed);
        
        sc.close();
    }
}