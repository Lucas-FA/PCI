package exercicios;
import java.util.*;
public class EXs {
	public static void main(String[] args) {
		//EX11
		
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		int num = sc1.nextInt();
		if (num<15) {
		System.out.println("O n�mero � menor que 15");
		}
		else
			if (num>100) {
				System.out.println("O n�mero � maior que 100");
			}
			else 
				System.out.println("O n�mero n�o � menor que 15 e nem maior que 100");
		
		//EX12
		
		Scanner sc2 = new Scanner(System.in);
		System.out.println("Digite um n�mero: ");
		float num1 = sc2.nextFloat();
		if (num1>1.99 && num1<5.99) {
			System.out.println("O n�mero est� entre 1.99 e 5.99");
			}
			else
				System.out.println("O n�mero n�o est� entre 1.99 e 5.99");
		
		//EX13
		
		if (num == num1) {
			System.out.println("Os valores das vari�veis acima s�o iguais");
		}
			else
				System.out.println("Os valores das vari�veis acima n�o s�o iguais");
		
		//EX14
		
		int num2 = 14;
		double num4 = 3.5, num3;
		num3 = (double) num2 * num4;
		System.out.println("\nO valor da multiplica��o � igual a: " +num3);
		
		//EX15
		
		ArrayList Nomes = new ArrayList();
		Scanner s1 = new Scanner(System.in);
		System.out.println("Digite o primeiro nome: ");
		String nome1 = s1.nextLine();
		Scanner s2 = new Scanner(System.in);
		System.out.println("Digite o segundo nome: ");
		String nome2 = s2.nextLine();
		    if(nome1.equals("") || nome2.equals("")){ 
		    	System.out.println("ERRO");
		    }
		Nomes.add(nome1);
		Nomes.add(nome2);
		Collections.sort(Nomes);
		System.out.println(Nomes);
		
		//EX16 e EX17
		
		double area;
		Scanner scan1 = new Scanner(System.in);
		System.out.println("Digite o tamanho do lado a: ");
		double ladoa = scan1.nextDouble();
		Scanner scan2 = new Scanner(System.in);
		System.out.println("Digite o tamanho do lado b: ");
		double ladob = scan2.nextDouble();
		area = ladoa * ladob;
		System.out.println("Lado a = <" +ladoa+ ">\nLado b = <" +ladob+ ">");
		System.out.println("A �rea � = <" +area+ ">");
		if (ladoa == ladob) {
			System.out.println("A figura � um quadrado");
		}
		else
			System.out.println("A figura � um ret�ngulo");
	}
}
