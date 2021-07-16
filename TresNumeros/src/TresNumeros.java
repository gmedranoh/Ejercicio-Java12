import java.util.Scanner;

public class TresNumeros {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leer = new Scanner(System.in);
		
		System.out.println("Ingresa el primer numero");
		int num1 = leer.nextInt();
		System.out.println("Ingresa el segundo numero");
		int num2 = leer.nextInt();
		System.out.println("Ingresa el tercer numero");
		int num3 = leer.nextInt();
		
		if( num1 > num2) {
			if(num1>num3) {
				System.out.println("El numero mayor es uno " + num1);
			}else {
				System.out.println("El numero mayor es tres " + num3);
				System.out.println("");
			}
		} else if(num2 > num1) {
			if(num2>num3) {
				System.out.println("El numero mayor es dos " + num2);
			}else {
				System.out.println("El numero mayor es tres " + num3);
			}
		} else if(num3 > num1) {
			if(num3>num2) {
				System.out.println("El numero mayor es tres " + num3);
			}else {
				System.out.println("El numero mayor es dos " + num2);
			}
		}
		
		//para ordenar 
		/*
		if(num1 > num2) {
			if(num2 > num3) {
				System.out.println("de menor a mayor" + num3+ " " + num2 + " " + num1);
				System.out.println("de mayor a menor" + num1+ " " + num2 + " " + num3);
			}
		}else if (num1 > num3) {
			if(num1 > num2) {
				
			}
		}
		*/
		
		
	}

}
