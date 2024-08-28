package lpa_aula28_08;

public class Calculando implements Calculo {

	@Override//serve para subescrever
	public double somar() {
		return 1+1;   //como não é void, necessita do return
	}
	@Override
	public double sub() {
		return 1-1;
	}
	@Override
	public double mult() {
		return 1*1;
	}
	@Override
	public int div() {
		return 1/1;
	}
	@Override
	public int expo() {
		return 6*6;
	}

}
