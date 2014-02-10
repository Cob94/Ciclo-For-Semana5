package proyecto5;

import java.util.Scanner;

public class forclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*for (int i=0;i<5; i++){
			
			Scanner mi_escaner= new Scanner(System.in);
			int x=mi_escaner.nextInt();
			if(x==10)
			{
				System.out.println(" es igual de 10");
			}else {
				System.out.println("No es Igual a 10");
			}
	}*/

		Scanner mi_escaner= new Scanner(System.in);
		for (int i=0;i<4;i++){
			System.out.println("Ingrese una Nota");
			int nota=mi_escaner.nextInt();
			if (nota>=90){
				System.out.println("Excelente");
			}else if(nota>=80){
				System.out.println("Sobre Saliente");
			}else if(nota>=60){
				System.out.println("Aprobado");
			}else{
				System.out.println("Reprobado");
			}
		}
		
}
}