package Poo.ucsal;

public class Aluno {

	private String id;
	private String matricula;
	private String nome;
	private Curso curso;

	public Aluno(String id, String matricula, String nome, Curso curso) {

		this.id = id;
		this.matricula = matricula;
		this.nome = nome;
		this.curso = curso;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Curso getCurso() {
		return curso;
	}

	public void setCurso(Curso curso) {
		this.curso = curso;
	}

	private static String sobrenome(String str) {
		String[] palavra_vetor = str.split(" ");
		// split p separar quando tiver o espaço em branco
		String nome = palavra_vetor[1].toUpperCase() + ",";
		// var para pegar o segundo nome depois colocar e maisculo e botar a virgula
		String[] novoVetor = new String[palavra_vetor.length - 1];
		// novo vetor passando o sobrenome

		for (int i = 0; i < novoVetor.length; i++) {
			if (i == 1) {
				// posicao 1 sobrenome
				novoVetor[i] = palavra_vetor[i + 1];
				// pega o nome dps sobrenome
			} else {
				novoVetor[i] = palavra_vetor[i];
			}
			for (int j = 0; j < novoVetor.length; j++) {
				String primeiraLetra = Character.toString(novoVetor[i].charAt(0)).toUpperCase();
				// criação da var chamadno o metodo Character.toString retorna o objeto String
				// que representa o valor do caractere dado, passando de parametro o vetor
				// percorrido e verificado chamando charAt selecionando o a primeira letra e
				// botando em maisucla
				nome += " " + primeiraLetra.concat(novoVetor[i].substring(0 + 1, novoVetor[i].length()));
				// In Java, String concatenation forms a new String that is the combination of
				// multiple strings here are two ways to concatenate strings in Java:
				//By + (String concatenation) operator
                //By concat() method passando o vetor novoVetor de parametro 
				//The Java String class substring() method returns a part of the string.

			}
		}
		return nome;
	}

	public String toString() {

		return "Aluno [id=" + id + ", matricula=" + matricula + ", nome=" + sobrenome(nome) + ", curso="
				+ curso.getDescricao() + "]";
	}

}
