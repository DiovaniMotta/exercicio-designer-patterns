package br.com.furb.behaviour;

import br.com.furb.model.Personagem;

public class ScoreDefese implements Score {

	@Override
	public Personagem pontuacao(Personagem personagem) {
		double pontuacao = personagem.getForca() * 0.05;
		double valor = personagem.getQuantidadePontos();
		valor -= pontuacao;
		personagem.setQuantidadePontos(valor);
		return personagem;
	}

}
