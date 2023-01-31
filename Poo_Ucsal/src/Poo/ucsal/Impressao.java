package Poo.ucsal;

public class Impressao {

	public void imprimir(Aluno[] alunos) {
		for (int i = 0; i < alunos.length; i++) {
			System.out.println(alunos[i].toString());
		}
	}

	public void imprimir(Curso[] cursos) {
		for (int i = 0; i < cursos.length; i++) {
			System.out.println(cursos[i].toString());
		}
	}

}
