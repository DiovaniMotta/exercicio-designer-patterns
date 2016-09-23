package br.com.furb.factorymethod;

import java.util.ArrayList;
import java.util.List;

import br.com.furb.model.Categoria;
import br.com.furb.model.Jogador;
import br.com.furb.model.Personagem;

public abstract class Jogo {

	protected List<Jogador> jogadores;

	public Jogo() {
		jogadores = new ArrayList<Jogador>();
	}

	public abstract Personagem create(Categoria categoria);

	public abstract Jogador create(String nome);

	private Personagem personagem(Categoria categoria, String nome, Double forca) {
		Personagem personagem = create(categoria);
		personagem.setNome(nome);
		personagem.setForca(forca);
		personagem.setPeso(0.0);
		personagem.setQuantidadePontos(0.0);
		return personagem;

	}

	public void jogador(String nome, String personagem, Double forca,
			Categoria categoria) {
		Jogador jogador = create(nome);
		Personagem p = personagem(categoria, personagem, forca);
		jogador.setPersonagem(p);
		jogadores.add(jogador);
	}

	public void batalhar() {
		if (jogadores.size() == 0) {
			System.out.println("Não existem jogadores para uma batalha...");
			return;
		}
		if (jogadores.size() == 1) {
			System.out.println("Existe apenas um jogador....");
			return;
		}
		for (int x = 0; x < jogadores.size(); x++) {
			Jogador p1 = jogadores.get(x);
			Jogador p2 = null;
			if ((x + 1) < jogadores.size()) {
				p2 = jogadores.get((x + 1));
				if (p2 == null)
					return;
				System.out.println(p1.toString());
				System.out.println(p2.toString());
				if (p1.getAttack() > p2.getAttack()) {
					if (p1.getAttack() > p2.getDefense()) {
						p1.attack();
						p2.defense();
					} else{
						p2.attack();
						p1.defense();
					}
				} else {
					if (p2.getAttack() > p1.getDefense()) {
						p2.attack();
						p1.defense();
					} else{
						p1.attack();
						p2.defense();
					}
				}
				System.out.println(p1.toString());
				System.out.println(p2.toString());
			}
		}
	}
}
