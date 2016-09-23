package br.com.furb.factorymethod;

import br.com.furb.behaviour.AttackPersonagemA;
import br.com.furb.behaviour.AttackPersonagemB;
import br.com.furb.behaviour.AttackPersonagemC;
import br.com.furb.behaviour.DefensePersonagemA;
import br.com.furb.behaviour.DefensePersonagemB;
import br.com.furb.behaviour.DefensePersonagemC;
import br.com.furb.behaviour.ScoreAttack;
import br.com.furb.behaviour.ScoreDefese;
import br.com.furb.model.Categoria;
import br.com.furb.model.Jogador;
import br.com.furb.model.Personagem;
import br.com.furb.model.PersonagemCategoriaA;
import br.com.furb.model.PersonagemCategoriaB;
import br.com.furb.model.PersonagemCategoriaC;

public class JogoFactory extends Jogo {


	@Override
	public Personagem create(Categoria categoria) {
		if(categoria == Categoria.A)
			return new PersonagemCategoriaA(new AttackPersonagemA(),new DefensePersonagemA());
		else if(categoria == Categoria.B)
			return new PersonagemCategoriaB(new AttackPersonagemB(),new DefensePersonagemB());
		return new PersonagemCategoriaC(new AttackPersonagemC(),new DefensePersonagemC());
	}

	@Override
	public Jogador create(String nome) {
		Jogador jogador = new Jogador(new ScoreAttack(),new ScoreDefese());
		jogador.setNome(nome);
		return jogador;
	}
	
}
