package figuras;

import java.util.Scanner;
import figuras.Circulo;
import figuras.Quadrado;
import figuras.Retangulo;

public class CalculArea {

	public static void main(String[] args) {
		
		Scanner scan0 = new Scanner(System.in);
		System.out.println( "Deseja calcular a área de qual figura?\n(Digite o número correspondente a figura desejada)" );
		System.out.println( "\n0 - Círculo\n1 - Quadrado\n2 - Retângulo\nSua escolha: " );
		int escolha = scan0.nextInt();
		
		if (escolha == 0) {
			Circulo c1 = new Circulo();
			System.out.println( "Digite o valor do raio do círculo" );
			c1.raio = scan0.nextDouble();
			c1.CalcularAreaC();
		}
		
		else if (escolha == 1) {
			Quadrado q1 = new Quadrado();
			System.out.println( "Digite o valor do lado do quadrado " );
			q1.ladoq1 = scan0.nextDouble();
			q1.CalcularAreaQ();
		}
		
		else if (escolha == 2) {
			Retangulo r1 = new Retangulo();
			System.out.println( "Digite o valor do primeiro lado do retângulo " );
			r1.lador1 = scan0.nextDouble();
			System.out.println( "Digite o valor do segundo lado do retângulo " );
			r1.lador2 = scan0.nextDouble();
			r1.CalcularAreaR();
		}
		
		else
			System.out.println( "ERRO\nO número escolhido não corresponde a nenhuma das opções" );
	}

}
