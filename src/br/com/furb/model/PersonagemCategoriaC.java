package br.com.furb.model;

import br.com.furb.behaviour.AttackBehaviour;
import br.com.furb.behaviour.DefenseBehaviour;

public class PersonagemCategoriaC extends Personagem {

	public PersonagemCategoriaC(AttackBehaviour eventoAtaque,
			DefenseBehaviour eventoDefesa) {
		super(eventoAtaque, eventoDefesa);
		categoria = Categoria.C;
	}
}
