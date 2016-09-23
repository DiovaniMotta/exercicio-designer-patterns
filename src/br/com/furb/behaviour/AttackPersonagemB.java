package br.com.furb.behaviour;


public class AttackPersonagemB implements AttackBehaviour {

	@Override
	public Double attack(Double force) {
		return force * 0.70;
	}
}
