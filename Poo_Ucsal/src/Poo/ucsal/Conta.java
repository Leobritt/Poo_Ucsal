package Poo.ucsal;

import java.util.*;

public class Conta {

	private String nConta;

	private String nameDono;

	private double saldo;

	private boolean status;

	public Conta(String nConta, String nameDono, double saldo) {
		super();
		this.nConta = nConta;
		this.nameDono = nameDono;
		this.saldo = saldo;
	
	}

	public String getnConta() {
		return nConta;
	}

	public void setnConta(String nConta) {
		this.nConta = nConta;
	}

	public String getNameDono() {
		return nameDono;
	}

	public void setNameDono(String nameDono) {
		this.nameDono = nameDono;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	private boolean statusConta(boolean status) {
		if (status == true) {
			System.out.println("Conta aberta");
		} else {
			System.out.println("Conta fechada");
		}
		return status;
	}

	public boolean abrirConta(boolean status) {
		status = true;
		System.out.println("Conta aberta");
		return status;
	}

	public Boolean fecharConta(boolean status) {
		status = false;
		System.out.println("Conta fechada");
		return status;
	}

	protected void consultarSaldo() {
		System.out.println("Seu saldo é: " + this.getSaldo());
	}

	protected double saque(double saque) {
		if (this.getSaldo() > 0.00) {
			this.setSaldo(this.getSaldo() - saque);
			System.out.println("Saldo: "+this.getSaldo());
		} else {
			System.out.println("Impossível sacar sem saldo");
		}
		return saque;
	}

	protected double deposito(double deposito) {
		System.out.println("Informe o valor que deseja depositar");
		this.setSaldo(this.getSaldo() + deposito);
		System.out.println("Seu saldo: "+this.getSaldo());
		return deposito;
	}
}
