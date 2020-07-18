//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String name = in.next();
        int year = in.nextInt();
        String ed = in.next();
        int ex = in.nextInt();
        String kit = in.next();
        System.out.println("The form for " + name + " is completed. " +
                "We will contact you if we need a chef that cooks "
                + kit + " dishes. \n" );
        // put your code here
    }
}