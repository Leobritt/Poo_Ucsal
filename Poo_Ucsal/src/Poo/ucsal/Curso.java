package Poo.ucsal;

public class Curso {

	private String id;
	private String sigla;
	private String descricao;

	public Curso(String id, String sigla, String descricao) {

		this.id = id;
		this.sigla = sigla;
		this.descricao = descricao;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getSigla() {
		return sigla;
	}

	public void setSigla(String sigla) {
		this.sigla = sigla;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public String toString() {
		return "Curso [id=" + id + ", sigla=" + sigla + ", descricao=" + descricao + "]";
	}

}
