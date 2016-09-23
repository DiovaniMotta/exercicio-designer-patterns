package br.com.furb.behaviour;

public class AttackPersonagemC implements AttackBehaviour {

	@Override
	public Double attack(Double force) {
		return force * 0.50;
	}
}
