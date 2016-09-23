package br.com.furb.model;

import br.com.furb.behaviour.AttackBehaviour;
import br.com.furb.behaviour.DefenseBehaviour;

public class PersonagemCategoriaB extends Personagem{

	public PersonagemCategoriaB(AttackBehaviour eventoAtaque,
			DefenseBehaviour eventoDefesa) {
		super(eventoAtaque, eventoDefesa);
		categoria = Categoria.B;
	}
}
