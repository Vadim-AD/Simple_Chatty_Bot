import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int k = scan.nextInt();

        int rect = n * m;
        boolean wealth = k <= rect;
        int rem = rect - k;

        if (wealth && (rem % n == 0 || rem % m == 0)) {
            ;
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

        // put your code here
    
}