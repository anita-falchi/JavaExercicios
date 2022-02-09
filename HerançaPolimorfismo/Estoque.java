package HerançaPolimorfismo;

public class Estoque {
	
	private String tipo;
	private String modelo;
	private int tamanho;
	
	
	
	
	//constutor
	
public Estoque(String tipo, String modelo, int tamanho) {
	super();
	this.tipo = tipo;
	this.modelo = modelo;
	this.tamanho = tamanho;
	
	

}


public String getTipo() {
	return tipo;
}


public void setTipo(String tipo) {
	this.tipo = tipo;
}


public String getModelo() {
	return modelo;
}


public void setModelo(String modelo) {
	this.modelo = modelo;
}


public int getTamanho() {
	return tamanho;
}


public void setTamanho(int tamanho) {
	this.tamanho = tamanho;
}

public String toString() {
	return "\ntipo: " + this.tipo + "\nmodelo: " + this.modelo + "\ntamanho: " + this.tamanho + "\n";
			
}

}

