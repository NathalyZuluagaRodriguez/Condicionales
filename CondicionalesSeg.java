import java.util.Scanner;

public class CondicionalesSeg {
	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
        String nombre = entrada.nextLine();
        
        System.out.print("Ingrese el promedio de la materia: ");
        double notaPromedio = entrada.nextDouble();
        
        if(notaPromedio<3.0) {
        	System.out.println("Usted perdio la materia");
        } else {
        	System.out.println("Usted ha ganado la materia");
        }
	}
}
