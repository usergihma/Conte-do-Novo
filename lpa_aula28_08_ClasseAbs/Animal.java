package lpa_aula28_08_ClasseAbs;

public abstract class Animal {
	String nome;
	String sexo;
	String raca;
	String dormir;
	String caminhar;
	String correr;
	String emitirSom;
	
	public String getNome() { //com retorno
		return nome;

	}
	public void setNome(String nome) {  //sem retorno
		this.nome = nome;  //Atribui este a String nome
	}
	public String getSexo() { 
		return sexo;

	}
	public void setSexo(String sexo) {  
		this.sexo = sexo; 
	}
	public String getRaca() { 
		return raca;

	}
	public void setRaca(String raca) {  
		this.raca = raca;  

	}
	public abstract void dormir();
	public abstract void caminhar();
	public abstract void correr();
	public abstract void emitirSom();
	

}


