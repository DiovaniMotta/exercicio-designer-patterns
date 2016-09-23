package br.com.furb.model;

import br.com.furb.factorymethod.Jogo;
import br.com.furb.factorymethod.JogoFactory;

public class MainApp {

	public Jogo jogo; 
	
	public MainApp() {
		super();
		jogo = new JogoFactory();
	}

	public static void main(String[] args) {	
		Jogo jogo  = new MainApp().jogo;
		jogo.jogador("Diovani Bernardi da Motta","Cavaleiro",100.0,Categoria.A);
		jogo.jogador("Wullian","Soldado",80.0,Categoria.B);
		jogo.batalhar();
	}

}
