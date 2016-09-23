package br.com.furb.behaviour;


public class DefensePersonagemB implements DefenseBehaviour {

	@Override
	public Double defense(Double defense) {
		return defense * 0.30;
	}

	

}
