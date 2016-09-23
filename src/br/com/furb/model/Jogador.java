package br.com.furb.model;

import br.com.furb.behaviour.Score;

public class Jogador {

	private String nome;
	private Personagem personagem;
	private Score attack;
	private Score defense;
	
	public Jogador(Score attack,Score defense) {
		super();
		this.attack = attack;
		this.defense = defense;
	}

	public Jogador(String nome, Personagem personagem) {
		super();
		this.nome = nome;
		this.personagem = personagem;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Personagem getPersonagem() {
		return personagem;
	}

	public void setPersonagem(Personagem personagem) {
		this.personagem = personagem;
	}
	
	public void attack(){
		personagem = attack.pontuacao(personagem);
	}
	
	public void defense(){
		personagem = defense.pontuacao(personagem);
	}
	
	public Double getAttack(){
		return personagem.getAttack().attack(personagem.getForca());
	}
	
	public Double getDefense(){
		return personagem.getDefense().defense(personagem.getForca());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		result = prime * result
				+ ((personagem == null) ? 0 : personagem.hashCode());
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
		Jogador other = (Jogador) obj;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (personagem == null) {
			if (other.personagem != null)
				return false;
		} else if (!personagem.equals(other.personagem))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Jogador :" + nome + ". Pontuação: " + personagem.getQuantidadePontos();
	}
}
