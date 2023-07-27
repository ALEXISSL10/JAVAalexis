
	import java.util.Scanner;

public class whileLoops {
    public static void main(String[] args) {
    	//TODO implement While loop to get print result

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter any positive integer: ");
        int num = scanner.nextInt();
       
        int n = 1;
        while (n <= 10) {
        	 System.out.println("Multiplication Table of " + num);
            System.out.println(num + " * " + n + " = " + num * n);
            n++;
        }
    }//main
}//whileLoops
