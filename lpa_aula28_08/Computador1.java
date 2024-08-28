package lpa_aula28_08;

public class Computador1 implements Computador{
	@Override
	public void ligar() {
		System.out.println("Ligando");
	}
	@Override
	public void reiniciar() {
		System.out.println("Reiniciando");
	}
	@Override
	public void desligar() {
		System.out.println("Desligando");
	}

	@Override
	public void carregamentoSistema(){
		System.out.println("Carregando");
	}

}
