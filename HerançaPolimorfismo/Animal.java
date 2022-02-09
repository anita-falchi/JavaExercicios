package HerançaPolimorfismo;

public class Animal {

	//atributos
	private String nome;
	private int idade;
	private String som;
	private String correr;
	
	//metodo
	
	public void emiteSom()
	{
		System.out.println("emite som de animal");
	}
	
	//metodo acessor GET, tem retorno, modifica SET
	
	public String getNome()
	{
		return nome;
	}
	
	public void setNome(String nome)
	{
		this.nome = nome;
		
	}
	
	public void setIdade (int idade)
	{
		this.idade = idade;
	}
	
	
}
