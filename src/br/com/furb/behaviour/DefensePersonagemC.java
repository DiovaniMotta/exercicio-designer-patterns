package br.com.furb.behaviour;


public class DefensePersonagemC implements DefenseBehaviour {

	@Override
	public Double defense(Double defense) {
		return defense * 0.50;
	}

	

}
