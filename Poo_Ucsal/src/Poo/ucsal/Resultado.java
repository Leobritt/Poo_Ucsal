package Poo.ucsal;

public class Resultado {
	public static void main(String[] args) {
		Impressao imp = new Impressao();
		BaseDados base = new BaseDados();

		imp.imprimir(base.equipeA());
		System.out.println();
		
		imp.imprimir(base.equipeB());
		System.out.println();

		imp.imprimir(base.curso());
		

	}
}
