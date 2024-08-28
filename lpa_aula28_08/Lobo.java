package lpa_aula28_08;

public class Lobo implements Animal {
	@Override
	public void dormir() {
		System.out.println("Dormindo");
	}
	@Override
	public void caminhar() {
		System.out.println("Caminhando");
	}
	@Override
	public void correr() {
		System.out.println("Correr");
	}
	@Override
	public void emitirSom() {
		System.out.println("Uivando");
	}

}
