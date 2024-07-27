import java.util.Scanner;

public class CondicionalesTerc {
	public static void main(String args[]) {
	   
	       
		Scanner entrada = new Scanner(System.in);
	        System.out.print("Ingresa tu edad: ");
	        int edad = entrada.nextInt();

	       
	        if (edad < 13) {
	            System.out.println("Eres un niño.");
	        } else {
	            if (edad >= 13 && edad <= 17) {
	                System.out.println("Eres un adolescente.");
	            } else {
	                if (edad >= 18 && edad <= 35) {
	                    System.out.println("Eres un adulto joven.");
	                } else {
	                    System.out.println("Eres un adulto.");
	                }
	            }
	        }

	        
	        entrada.close();

	}
}
