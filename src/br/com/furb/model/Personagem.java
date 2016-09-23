package br.com.furb.model;

import br.com.furb.behaviour.AttackBehaviour;
import br.com.furb.behaviour.DefenseBehaviour;

public abstract class Personagem {

	protected String nome;
	protected Double quantidadePontos;
	protected Double peso;
	protected Categoria categoria;
	protected Double forca;
	protected AttackBehaviour attack;
	protected DefenseBehaviour defense;
	

	public Personagem(AttackBehaviour eventoAtaque, DefenseBehaviour eventoDefesa) {
		super();
		this.attack = eventoAtaque;
		this.defense = eventoDefesa;
	}


	public Personagem(String nome, Double quantidadePontos, Double peso,
			Categoria categoria, Double forca) {
		super();
		this.nome = nome;
		this.quantidadePontos = quantidadePontos;
		this.peso = peso;
		this.categoria = categoria;
		this.forca = forca;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getQuantidadePontos() {
		return quantidadePontos;
	}

	public void setQuantidadePontos(Double quantidadePontos) {
		this.quantidadePontos = quantidadePontos;
	}

	public Double getPeso() {
		return peso;
	}

	public void setPeso(Double peso) {
		this.peso = peso;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	public Double getForca() {
		return forca;
	}

	public void setForca(Double forca){
		this.forca = forca;
	}
	
	public void atacar(){
		quantidadePontos += attack.attack(forca);
	}
	
	public void defender(){
		quantidadePontos -= defense.defense(forca);
	}

	public AttackBehaviour getAttack(){
		return attack;
	}
	
	public DefenseBehaviour getDefense(){
		return defense;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((categoria == null) ? 0 : categoria.hashCode());
		result = prime * result + ((forca == null) ? 0 : forca.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result + ((peso == null) ? 0 : peso.hashCode());
		result = prime
				* result
				+ ((quantidadePontos == null) ? 0 : quantidadePontos.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personagem other = (Personagem) obj;
		if (categoria == null) {
			if (other.categoria != null)
				return false;
		} else if (!categoria.equals(other.categoria))
			return false;
		if (forca == null) {
			if (other.forca != null)
				return false;
		} else if (!forca.equals(other.forca))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (peso == null) {
			if (other.peso != null)
				return false;
		} else if (!peso.equals(other.peso))
			return false;
		if (quantidadePontos == null) {
			if (other.quantidadePontos != null)
				return false;
		} else if (!quantidadePontos.equals(other.quantidadePontos))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Personagem [nome=" + nome + ", quantidadePontos="
				+ quantidadePontos + ", peso=" + peso + ", categoria="
				+ categoria + ", forca=" + forca + "]";
	}
}
