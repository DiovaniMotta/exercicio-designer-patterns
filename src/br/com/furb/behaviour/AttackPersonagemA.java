package br.com.furb.behaviour;


public class AttackPersonagemA implements AttackBehaviour {
	

	@Override
	public Double attack(Double force) {
		return force * 0.40;
	}
}
