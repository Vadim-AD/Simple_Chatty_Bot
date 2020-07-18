import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int year = scanner.nextInt();
        boolean mod400 = year % 400 == 0;
        if (year % 4 == 0 && year % 100 != 0 || mod400) {
            System.out.println("Leap");
        }
        else {
            System.out.println("Regular");
        }
        // put your code here
    }
}