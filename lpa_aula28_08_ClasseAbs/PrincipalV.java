package lpa_aula28_08_ClasseAbs;


public class PrincipalV {

	public static void main(String[] args) {
		Onibus busao = new Onibus();
		Carro car = new Carro();
		
		System.out.println("BUSÃO");
		busao.acelerar();
		busao.frear();
		busao.ligar();
		busao.virar();
		System.out.println("CAR");
		car.acelerar();
		car.frear();
		car.ligar();
		car.virar();

	}

}
