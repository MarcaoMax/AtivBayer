package formulario;

import java.io.Serializable;

public class Pessoa implements Serializable{

	private int cpf;
	
	private String nome;
	
	private String sobrenome;
	
	private int idade;
	
	private String sexo;
	
	private boolean obito;
	
	
	public Pessoa() {
		
	}

	public Pessoa(int cpf, String nome, String sobrenome, int idade, String sexo, boolean obito) {
		this.cpf = cpf;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
		this.sexo = sexo;
		this.obito = obito;
	}

	public int getCpf() {
		return cpf;
	}

	public void setCpf(int cpf) {
		this.cpf = cpf;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public boolean isObito() {
		return obito;
	}

	public void setObito(boolean obito) {
		this.obito = obito;
	}
	
}
