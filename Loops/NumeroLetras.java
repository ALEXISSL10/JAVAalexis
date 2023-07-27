import java.util.Scanner;

public class NumeroLetras {
    public static void main(String[] args) {
    	//TODO implement While loop to get print result
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa un nombre: ");
        String nombre = scanner.nextLine();
        for (int n = 0; n < nombre.length(); n++) {
            System.out.println(nombre.charAt(n));
        }
    }//main
}//NumeroLetras
