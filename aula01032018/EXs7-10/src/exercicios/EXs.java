package exercicios;

public class EXs {
	public static void main(String[] args) {
        //EX7
		double pi = 3.1415, raio = 12, area;
		area=pi*Math.pow(raio, 2);
		System.out.println ("A área é igual a: " + area);
		//EX8
		int resto = 99%4;
		System.out.println ("O resto da divisão é igual a: " + resto);
		//EX9
		double num = 4, div;
		div = num*0.5;
		System.out.println (num + " dividido por 2 é igual a: " + div);
		//EX10
		int num1 = 2, i, num2 = 0;
		for (i=0;i<8; i++) {
			num2 = num2 + num1;
		}
		System.out.println (num1 + " vezes 8 é igual a: " + num2);
		//Desafio2
		int num3 = 10;
		System.out.println ("O terceiro bit mais significativo é: " + ((num3 & 4) >> 3));
		System.out.println ("O terceiro bit mais significativo é: " + (num3 >> 3));
	}
}
