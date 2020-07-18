import java.util.*;
class Main {
    public static void main(String[] args) {
        // put your code here
Scanner scanner = new Scanner (System.in);
 int number = scanner.nextInt();
        int max = 0;
        int yep;
        int i = 0;
while (max < number) {
    yep = scanner.nextInt();
    max++;
    if (i < yep && yep % 4 == 0) {
        i = yep;
    }
}
   System.out.println(i);
      }
  
	
}
