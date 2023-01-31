package Poo.ucsal;

public class Pessoa {
	public static void main(String[] args) {
		
		ContaCorrente cc1 = new ContaCorrente("01","Leo Britto",8778.90);
		
		ContaCorrente cc2 = new ContaCorrente("02","Gabriel Caldas",708.90);
		
		ContaCorrente cc3 = new ContaCorrente("03","Duarte",1078.90);
		
		cc1.abrirConta(true);
		cc1.consultarSaldo();
		cc1.deposito(390);
		
		Conta_Poupanca cp1 = new Conta_Poupanca("01","Gustavo Caster", 1000.0);
		cp1.abrirConta(true);
		cp1.consultarSaldo();
		cp1.rendimento(1000.0);
		
	}
}

