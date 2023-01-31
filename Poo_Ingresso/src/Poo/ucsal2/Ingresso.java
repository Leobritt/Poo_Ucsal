package Poo.ucsal2;

public class Ingresso extends Pessoa {
	private float valor;
	private String tipo;

	public Ingresso(String nome, int idade, String categoria) {
		super(nome, idade, categoria);
		this.valor = 1000f;

	}

	public float discount(float v) {
		if (this.getTipo().equals("inteiro")) {
			this.setValor(this.getValor() - this.getValor() * 1f);
		} else if (this.getTipo().equals("Estudante")) {
			this.setValor(this.getValor() - this.getValor() * 0.5f);
		} else if (this.getTipo().equals("Idoso")) {
			this.setValor(this.getValor() - this.getValor() * 0.4f);
		} else if (this.getTipo().equals("Cortesia")) {
			this.setValor(0f);
		} else if (this.getTipo().equals("Especial")) {
			this.setValor(this.getValor() - this.getValor() * 0.2f);
		} else {
			System.out.println("Tipo não encontrado.");
		}
		return v;
	}

	public float getValor() {
		return valor;
	}

	public void setValor(float valor) {
		this.valor = valor;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

}
