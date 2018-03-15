package aula;

public class PessoaFisica extends Pessoa {
	private String rg;
	private String cpf;
	
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public static void main(String args[]) {
		PessoaFisica pessoa = new PessoaFisica();
		pessoa.setNome("Lucas Freitas de Abreu");
		pessoa.setEndereco("Rua Morpheus");
		pessoa.setBairro("Olimpo");
		pessoa.setRg("32.542.782-2");
		pessoa.setCpf("827.348.219-48");
		
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getEndereco());
		System.out.println(pessoa.getBairro());
		System.out.println(pessoa.getRg());
		System.out.println(pessoa.getCpf());
	}
}
