package exercicios;
import java.util.*;
public class EXs {
	public static void main(String[] args) {
		//EX18
		
		int resultado;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Digite o valor de x: ");
		int x = scan1.nextInt();
		System.out.println("Digite o valor de y: ");
		int y = scan1.nextInt();
		resultado = x - (-y);
		System.out.println("O resultado da soma é: " +resultado);
		
		//EX19
		
		switch (x) {
		case 0:
			System.out.println("O valor de x é menor que 10");
		break;
		case 1:
			System.out.println("O valor de x é menor que 10");
		break;
		case 2:
			System.out.println("O valor de x é menor que 10");
		break;
		case 3:
			System.out.println("O valor de x é menor que 10");
		break;
		case 4:
			System.out.println("O valor de x é menor que 10");
		break;
		case 5:
			System.out.println("O valor de x é menor que 10");
		break;
		case 6:
			System.out.println("O valor de x é menor que 10");
		break;
		case 7:
			System.out.println("O valor de x é menor que 10");
		break;
		case 8:
			System.out.println("O valor de x é menor que 10");
		break;
		case 9:
			System.out.println("O valor de x é menor que 10");
		break;
		case 10:
			System.out.println("O valor de x é igual a 10");
		break;
		default:
			System.out.println("O valor de x é maior que 10");
		break;
		}
		
		//EX20
		
		int num, soma = 0;
		System.out.println("Digite 0 quando quiser ver o resultado da soma\n");
		do {
			System.out.println("Digite um número: ");
			num = scan1.nextInt();
			soma = soma + num;
		} while (num != 0 );
		System.out.println("A soma dos valores é = <" +soma+ ">");
	}
}
