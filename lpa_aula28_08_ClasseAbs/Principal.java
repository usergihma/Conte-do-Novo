package lpa_aula28_08_ClasseAbs;

public class Principal {

	public static void main(String[] args) {
		Lobo a = new Lobo();
		Leao b = new Leao();
		Tigre c = new Tigre();
		Cachorro d = new Cachorro ();
		Gato e = new Gato ();
		
		System.out.println("----------------Lobo:----------------"); //Chamando o método set() para adicionar os objetos
		a.setNome("Mogli");//inserir
		a.setSexo("Fem");
		a.setRaca("Sla");
		
		a.dormir();
		a.correr();
		a.caminhar();
		a.emitirSom();

		System.out.println(a.getNome());
		System.out.println(a.getSexo());
		System.out.println(a.getRaca());
		
		System.out.println("----------------Leao:----------------"); //Chamando o método set() para adicionar os objetos
		b.setNome("Timão");//inserir
		b.setSexo("Masc");
		b.setRaca("Sla");
		
		b.dormir();
		b.correr();
		b.caminhar();
		b.emitirSom();
		
		System.out.println(b.getNome());
		System.out.println(b.getSexo());
		System.out.println(b.getRaca());
		
		System.out.println("----------------Tigre:----------------"); //Chamando o método set() para adicionar os objetos
		c.setNome("da Jasmin");//inserir
		c.setSexo("Masc");
		c.setRaca("Sla");
		
		c.dormir();
		c.correr();
		c.caminhar();
		c.emitirSom();
		
		System.out.println(c.getNome());
		System.out.println(c.getSexo());
		System.out.println(c.getRaca());
		
		System.out.println("----------------Cachorro:----------------"); //Chamando o método set() para adicionar os objetos
		d.setNome("Serena");//inserir
		d.setSexo("Fem");
		d.setRaca("Sla");
		
		d.dormir();
		d.correr();
		d.caminhar();
		d.emitirSom();
		
		System.out.println(d.getNome());
		System.out.println(d.getSexo());
		System.out.println(d.getRaca());
		
		System.out.println("----------------Gato:----------------"); //Chamando o método set() para adicionar os objetos
		e.setNome("Mia");//inserir
		e.setSexo("Fem");
		e.setRaca("Sla");
		
		e.dormir();
		e.correr();
		e.caminhar();
		e.emitirSom();
		
		System.out.println(e.getNome());
		System.out.println(e.getSexo());
		System.out.println(e.getRaca());
		
		
		
		
	}

}
