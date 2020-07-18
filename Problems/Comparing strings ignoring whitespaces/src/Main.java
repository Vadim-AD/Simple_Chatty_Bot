import java.util.*;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String oneStr = scanner.nextLine();
        String  twoStr= scanner.nextLine();
        oneStr = oneStr.replaceAll(" ", "");
        twoStr = twoStr.replaceAll(" ", "");
        System.out.println(oneStr.equals(twoStr));
        // put your code here
    }
}