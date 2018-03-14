package figuras;

import java.util.Scanner;
import figuras.Circulo;
import figuras.Quadrado;
import figuras.Retangulo;

public class CalculArea {

	public static void main(String[] args) {
		
		Scanner scan0 = new Scanner(System.in);
		System.out.println( "Deseja calcular a �rea de qual figura?\n(Digite o n�mero correspondente a figura desejada)" );
		System.out.println( "\n0 - C�rculo\n1 - Quadrado\n2 - Ret�ngulo\nSua escolha: " );
		int escolha = scan0.nextInt();
		
		if (escolha == 0) {
			Circulo c1 = new Circulo();
			System.out.println( "Digite o valor do raio do c�rculo" );
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
			System.out.println( "Digite o valor do primeiro lado do ret�ngulo " );
			r1.lador1 = scan0.nextDouble();
			System.out.println( "Digite o valor do segundo lado do ret�ngulo " );
			r1.lador2 = scan0.nextDouble();
			r1.CalcularAreaR();
		}
		
		else
			System.out.println( "ERRO\nO n�mero escolhido n�o corresponde a nenhuma das op��es" );
	}

}
