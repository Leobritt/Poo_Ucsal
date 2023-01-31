package Poo.ucsal;

public class BaseDados {

	public Aluno[] equipeA() {
		Aluno[] equipeA = new Aluno[3];

		Aluno a1 = new Aluno("1", "213", "Jorge Cluney", curso()[0]);
		equipeA[0] = a1;

		Aluno a2 = new Aluno("2", "321", "Jhon Maverick", curso()[0]);
		equipeA[1] = a2;

		Aluno a3 = new Aluno("3", "341", "Clara Spinosa ", curso()[1]);
		equipeA[2] = a3;

		return equipeA;
	}

	public Aluno[] equipeB() {
		Aluno[] equipeB = new Aluno[4];

		Aluno b1 = new Aluno("4", "420", "Maria Joana", curso()[1]);
		equipeB[0] = b1;

		Aluno b2 = new Aluno("5", "321", "Kayo Jorge", curso()[2]);
		equipeB[1] = b2;

		Aluno b3 = new Aluno("6", "761", "Tobias Nescoll", curso()[1]);
		equipeB[2] = b3;

		Aluno b4 = new Aluno("7", "871", "Jamal Bacherl", curso()[1]);
		equipeB[3] = b4;

		return equipeB;
	}

	public Curso[] curso() {
		Curso[] cursos = new Curso[3];

		Curso curso1 = new Curso("1", "DIR", "Direito");
		cursos[0] = curso1;

		Curso curso2 = new Curso("2", "ES", "Engenharia de Software");
		cursos[1] = curso2;

		Curso curso3 = new Curso("3", "MED", "Medicina");
		cursos[2] = curso3;

		return cursos;
	}
}