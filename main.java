import java.util.Scanner;
public class main {
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = 5;
    System.out.println("Enter a number:");
    int b = scanner.nextInt();
    int sum = add(a, b);
    System.out.println("The sum of " + a + " and " + b + " is: " + sum);
   

    
}



public static int add(int a, int b) {
    return a + b;   


} 
}

