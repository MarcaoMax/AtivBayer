package formulario;

import java.io.Serializable;

public class Condicao implements Serializable{
	
	private int dengue;
	
	private int malaria;
	
	private int zika;
	
	
	public Condicao() {
		
	}

	public Condicao(int dengue, int malaria, int zika) {
		super();
		this.dengue = dengue;
		this.malaria = malaria;
		this.zika = zika;
	}

	public int getDengue() {
		return dengue;
	}

	public void setDengue(int dengue) {
		this.dengue = dengue;
	}

	public int getMalaria() {
		return malaria;
	}

	public void setMalaria(int malaria) {
		this.malaria = malaria;
	}

	public int getZika() {
		return zika;
	}

	public void setZika(int zika) {
		this.zika = zika;
	}	
	
}
