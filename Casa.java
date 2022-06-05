package formulario;

import java.io.Serializable;

public class Casa implements Serializable{
	
	private String endereco;
	
	private int numero;
	
	
	public Casa() {
		
	}

	public Casa(String endereco, int numero) {

		this.endereco = endereco;
		this.numero = numero;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}
	
}
