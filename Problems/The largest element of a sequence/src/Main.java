import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int max = n ;
        while (n != 0) {
            if (max < n) {
                max = n;
            }

            n = scanner.nextInt();
        }

        System.out.println(max);

    }
}