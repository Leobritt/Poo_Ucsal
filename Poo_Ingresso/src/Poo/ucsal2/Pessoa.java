package Poo.ucsal2;

public class Pessoa {
	private String nome;
	private int idade;
	private String categoria;

	public void status() {
		System.out.println("EVENTO: Congresso de Geologia " + "\nNome: " + sobrenome(nome) + ", " + primeiroNome(nome)
				+ "\nIdade: " + this.getIdade() + "\nCategoria: " + this.getCategoria());
		System.out.println("_______________________________");
	}

	public static String primeiroNome(String nome) {
		String partes[];
		partes = nome.split(" ");

		return partes[0];
	}

	public Pessoa(String nome, int idade, String categoria) {
		this.nome = nome;
		this.idade = idade;
		this.categoria = categoria;
	}

	public static String sobrenome(String nome) {
		String partes[];
		partes = nome.split(" ");

		return partes[1];
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {

		this.categoria = categoria;
	}
}
