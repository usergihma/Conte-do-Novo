package lpa_aula28_08;

public class PrincipalObj {

	public static void main(String[] args) {
		Computador1 Gamer = new Computador1(); 
		Computador1 Home = new Computador1(); 
		
		System.out.println("Computador Gamer:");
		Gamer.ligar();
		Gamer.desligar();
		Gamer.reiniciar();
		Gamer.carregamentoSistema();
		
		System.out.println("Computador de Casa:");
		Home.ligar();
		Home.desligar();
		Home.reiniciar();
		Home.carregamentoSistema();
	}

}
