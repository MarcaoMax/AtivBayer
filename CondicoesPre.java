package formulario;

import java.io.Serializable;

public class CondicoesPre implements Serializable{
	
	private boolean hipertensao;
	
	private boolean cardiaco;
	
	private boolean asma;
	
	private boolean cancer;
	
	private boolean anemia;
	
	
	public CondicoesPre() {
		
	}

	public CondicoesPre(boolean hipertensao, boolean cardiaco, boolean asma, boolean cancer, boolean anemia) {
		this.hipertensao = hipertensao;
		this.cardiaco = cardiaco;
		this.asma = asma;
		this.cancer = cancer;
		this.anemia = anemia;
	}

	public boolean isHipertensao() {
		return hipertensao;
	}

	public void setHipertensao(boolean hipertensao) {
		this.hipertensao = hipertensao;
	}

	public boolean isCardiaco() {
		return cardiaco;
	}

	public void setCardiaco(boolean cardiaco) {
		this.cardiaco = cardiaco;
	}

	public boolean isAsma() {
		return asma;
	}

	public void setAsma(boolean asma) {
		this.asma = asma;
	}

	public boolean isCancer() {
		return cancer;
	}

	public void setCancer(boolean cancer) {
		this.cancer = cancer;
	}

	public boolean isAnemia() {
		return anemia;
	}

	public void setAnemia(boolean anemia) {
		this.anemia = anemia;
	}
	
}
