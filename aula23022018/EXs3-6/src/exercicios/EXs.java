package exercicios;

public class EXs {
  public static void main (String[] args) {
	//EX3
	String frase = "Curso de Java";
	System.out.println (frase);
	//EX4
	String frase2 = " - Exemplo String";
	String fraseCompleta = frase + frase2;
	System.out.println (fraseCompleta);
	//EX5
	System.out.println ("Número de caracteres: " + fraseCompleta.length() );
	//EX6
	System.out.println (fraseCompleta.substring(16, 30));
	//Desafio1
	String Frases[] = fraseCompleta.split("-");
	System.out.println (Frases[1]);
  }
}
