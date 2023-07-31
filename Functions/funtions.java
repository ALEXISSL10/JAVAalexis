
import java.util.Scanner;

public class funtions
{
    public static void main( String[] args ){
        Scanner console = new Scanner( System.in );
        for (int i = 0; i < 10; i++) {
        System.out.println( "Enter your name:  " );
        String name = console.next();
        System.out.println( "Enter your lastname:  " );
        String lastname = console.next();
        printNameCharacters( name );
        printNameLength( name );
        printFullName(name, lastname);
        console.close();
    }
    }
    private static void printNameLength( String name ) {
   
    System.out.println( "La longitud del nombre es: "+ name.length());
    }
        //TODO implement this code
    

    private static void printNameCharacters( String name ) {
    System.out.println( "Los caracteres del nombre es: ");
    for (int i = 0; i < name.length(); i++){
    	System.out.println(name.charAt(i));
    }
    }
    private static void printFullName(String name, String lastname) {
        System.out.println("El nombre completo es: " + name + " " + lastname);
    	
        //TODO implement this code
    
}
}

