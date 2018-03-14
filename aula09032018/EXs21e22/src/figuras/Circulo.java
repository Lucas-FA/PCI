package figuras;

import static java.lang.Math.PI;

public class Circulo {
	double raio, areac;
	double CalcularAreaC () {
		areac = PI * raio * raio;
		System.out.println(areac);
		return areac;
	}
}
