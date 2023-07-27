
import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
    	//TODO implement While loop to get print result
    	//Notas
    	//i = inicio de la serie, en 1 y 0
    	//v = variable
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int n = scanner.nextInt();
        int i1 = 0; 
        int i2 = 1;
        System.out.print("Muestra los primeros " + n + " términos de la serie de Fibonacci: ");
        int v = 1;
        do {
            System.out.print(i1 + " + ");
            int sum = i1 + i2;
            i1 = i2;
            i2 = sum;
            v++;
        } while (v <= n);
    }//main
}//Fibonacci

