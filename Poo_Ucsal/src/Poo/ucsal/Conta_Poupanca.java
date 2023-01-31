package Poo.ucsal;
public class Conta_Poupanca extends Conta {


	public Conta_Poupanca(String nConta, String nameDono, double saldo) {
		super(nConta, nameDono, saldo);
			
	}

	public double rendimento(double saldo) {
		if(this.getSaldo() > 0) {
			this.setSaldo(this.getSaldo()+this.getSaldo()*0.05);
			System.out.println("Seu saldo é: "+this.getSaldo());
		}
		return saldo;
	}
}
