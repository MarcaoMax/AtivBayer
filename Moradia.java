package formulario;

import java.io.Serializable;

public class Moradia implements Serializable{
	
	private int cep;
	
	private int renda;
	
	private int pessoas;
	
	private String regiao;
	
	
	public Moradia() {
		
	}

	public Moradia(int cep, int renda, int pessoas, String regiao) {
		this.cep = cep;
		this.renda = renda;
		this.pessoas = pessoas;
		this.regiao = regiao;
	}

	public int getCep() {
		return cep;
	}

	public void setCep(int cep) {
		this.cep = cep;
	}

	public int getRenda() {
		return renda;
	}

	public void setRenda(int renda) {
		this.renda = renda;
	}

	public int getPessoas() {
		return pessoas;
	}

	public void setPessoas(int pessoas) {
		this.pessoas = pessoas;
	}

	public String getRegiao() {
		return regiao;
	}

	public void setRegiao(String regiao) {
		this.regiao = regiao;
	}	

}
