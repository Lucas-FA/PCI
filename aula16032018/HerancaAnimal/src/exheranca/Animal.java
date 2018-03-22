package exheranca;

public class Animal {

	private String nome;
	protected String classe;
	
	public String getNome() {
		return nome;
	}
	
	public void imprime() {
		System.out.println(this.getNome());
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void falar() {
		
	}
	
}
