package Poo.ucsal2;

public class PessoaExec {

	public static void main(String[] args) {

		Pessoa p1 = new Pessoa("Gustavo Castelluccio", 24, "inteiro");
		p1.status();
		
		Pessoa p2 = new Pessoa("Leonardo Britto", 22, "estudante");
		p2.status();
		
		Pessoa p3 = new Pessoa("Simone Castelluccio", 65, "idoso");
		p3.status();
		
		Pessoa p4 = new Pessoa("Breno Duarte", 22, "especial");
		p4.status();
		
		Pessoa p5 = new Pessoa("Denize Viviani", 22, "cortesia");
		p5.status();

	}

}
