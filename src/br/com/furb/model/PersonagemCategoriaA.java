package br.com.furb.model;

import br.com.furb.behaviour.AttackBehaviour;
import br.com.furb.behaviour.DefenseBehaviour;

public class PersonagemCategoriaA extends Personagem {

	public PersonagemCategoriaA(AttackBehaviour eventoAtaque,
			DefenseBehaviour eventoDefesa) {
		super(eventoAtaque, eventoDefesa);
		categoria = Categoria.A;
	}
}
