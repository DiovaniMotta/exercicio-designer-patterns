package br.com.furb.behaviour;


public class DefensePersonagemA implements DefenseBehaviour {

	@Override
	public Double defense(Double defense) {
		return defense * 0.80;
	}
}
