package figuras;

public class Quadrado {
	double ladoq1, areaq;
	double CalcularAreaQ () {
		areaq = ladoq1 * ladoq1;
		System.out.println(areaq);
		return areaq;
	}
}
