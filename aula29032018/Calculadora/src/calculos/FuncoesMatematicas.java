package calculos;

public class FuncoesMatematicas {
	
	public double raizQuadrada(double num0) {
    	double resultado = java.lang.Math.sqrt(num0);
    	return resultado;
    }
	
	public double divisao(double num0, double num1) {
    	double resultado = num0 / num1;
    	return resultado;
    }
	
	public double divisaoPorcentagem(double num0, double num1) {
    	double resultado = num0 / ((num0 * num1) / 100);
    	return resultado;
    }
	
	public double multiplicacaoPorcentagem(double num0, double num1) {
    	double resultado = num0 * ((num0 * num1) / 100);
    	return resultado;
    }
	
	public double subtracaoPorcentagem(double num0, double num1) {
    	double resultado = num0 - ((num0 * num1) / 100);
    	return resultado;
    }
	
	public double adicaoPorcentagem(double num0, double num1) {
    	double resultado = num0 + ((num0 * num1) / 100);
    	return resultado;
    }
	
	public double multiplicacao(double num0, double num1) {
    	double resultado = num0 * num1;
    	return resultado;
    }
	
	public double reciproco(double num0) {
    	double resultado = 1 / num0;
    	return resultado;
    }
	
    public double subtracao(double num0, double num1) {
    	double resultado = num0 - num1;
    	return resultado;
    }
    
    public double adicao(double num0, double num1) {
    	double resultado = num0 + num1;
    	return resultado;
    }
}