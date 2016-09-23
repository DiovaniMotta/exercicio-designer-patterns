package br.com.furb.behaviour;

import br.com.furb.model.Personagem;

public class ScoreAttack implements Score {

	@Override
	public Personagem pontuacao(Personagem personagem) {
		double pontuacao = personagem.getForca() * 0.10;
		pontuacao += personagem.getQuantidadePontos();
		personagem.setQuantidadePontos(pontuacao);
		return personagem;
	}

}
