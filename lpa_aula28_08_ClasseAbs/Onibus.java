package lpa_aula28_08_ClasseAbs;

public class Onibus extends Veiculos {

	@Override
	public void acelerar() {
		System.out.println("Acelerando");

	}
	@Override
	public void frear() {
		System.out.println("Freiando");
	}
	@Override
	public void virar() {
		System.out.println("Virando");
	}
	@Override
	public void ligar() {
		System.out.println("Ligando");
	}

}
