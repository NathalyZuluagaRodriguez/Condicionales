import java.util.Scanner;

public class CondicionalesPrimer {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Ingrese su edad: ");
        int edad = entrada.nextInt();
        
        if(edad>=18) {
        	System.out.println("Usted es mayor de edad");
        }else {
        	System.out.println("Usted es menor de edad");
        }
	}
}
