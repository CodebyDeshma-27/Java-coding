public class Main {
    public static boolean isEven (int n) {
        if ((n & 1) == 0) 
            return true;
         else 
            return false;
        }
public static void main(String[] args) {
    int n = 15;
    if (isEven(n))
        System.out.println(n + " is even");
    else
        System.out.println(n + " is odd");
    }
}