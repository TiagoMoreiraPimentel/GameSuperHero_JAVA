package Application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import Personagens.Batman;
import Personagens.Thor;

public class Main {

	public static void main(String[] args) {

		// Variaveis.
		String barra_gui = "________________________________________";
		String nome_game = "GAME Super-Heros";
		String escolhidoName1 = "";
		int escolhido1 = 0;
		int escolhido2 = 0;
		int escolhidoVida1 = 0;
		int escolhidoDano1 = 0;
		int escolhidoDefesa1 = 0;
		String escolhidoName2 = "";
		int escolhidoVida2 = 0;
		int escolhidoDano2 = 0;
		int escolhidoDefesa2 = 0;
		
		
		// Instanciações primarias.
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Thor thor = new Thor();
		Batman batman = new Batman();
		
		// Listas.
		List<String> list_personagens = new ArrayList<>();
		list_personagens.add("1 - " + thor.getName());
		list_personagens.add("2 - " + batman.getName());
		
		// Programa
		System.out.println();
		System.out.println(nome_game);
		System.out.println(barra_gui);
		System.out.println();
		System.out.println("Escolha um personagem: ");
		System.out.println();
		
		for(String list : list_personagens) {
			System.out.println(list);
		}
		
		// escolha do personagem 1.
		System.out.println();
		System.out.print("Digite o numero do primeiro personagem: ");
		int numeroPersonagem1 = sc.nextInt();
		System.out.println();
		
		if(numeroPersonagem1 == 1) {
			System.out.println();
			System.out.println("Voce escolheu o Thor.");
			System.out.println("Atributos: ");
			System.out.println("     Vida: " + thor.getVida());
			System.out.println("     Dano: " + thor.getDano());
			System.out.println("   Defesa: " + thor.getDefesa());
			escolhidoName1 = thor.getName();
			escolhidoVida1 = thor.getVida();
			escolhidoDano1 = thor.getDano();
			escolhidoDefesa1 = thor.getDefesa();
			escolhido1 = thor.ataque();
		}else if(numeroPersonagem1 == 2){
			System.out.println();
			System.out.println("Voce escolheu o Batman.");
			System.out.println("Atributos: ");
			System.out.println("     Vida: " + batman.getVida());
			System.out.println("     Dano: " + batman.getDano());
			System.out.println("   Defesa: " + batman.getDefesa());
			escolhido1 = batman.ataque();
			escolhidoName1 = batman.getName();
			escolhidoVida1 = batman.getVida();
			escolhidoDano1 = batman.getDano();
			escolhidoDefesa1 = batman.getDefesa();
		}
		else {
			System.out.println("Opção invalida!");
		}
		
		// escolha do personagem 2.
		System.out.println();
		System.out.print("Digite o numero do segundo personagem: ");
		int numeroPersonagem2 = sc.nextInt();
		System.out.println();
		
		if(numeroPersonagem2 == 1) {
			System.out.println();
			System.out.println("Voce escolheu o Thor.");	
			System.out.println("Atributos: ");
			System.out.println("     Vida: " + thor.getVida());
			System.out.println("     Dano: " + thor.getDano());
			System.out.println("   Defesa: " + thor.getDefesa());
			escolhido2 = thor.ataque();
			escolhidoName2 = thor.getName();
			escolhidoVida2 = thor.getVida();
			escolhidoDano2 = thor.getDano();
			escolhidoDefesa2 = thor.getDefesa();
		}else if(numeroPersonagem2 == 2){
			System.out.println();
			System.out.println("Voce escolheu o Batman.");
			System.out.println("Atributos: ");
			System.out.println("     Vida: " + batman.getVida());
			System.out.println("     Dano: " + batman.getDano());
			System.out.println("   Defesa: " + batman.getDefesa());
			escolhido2 = batman.ataque();
			escolhidoName2 = batman.getName();
			escolhidoVida2 = batman.getVida();
			escolhidoDano2 = batman.getDano();
			escolhidoDefesa2 = batman.getDefesa();
		}
		else {
			System.out.println("Opção invalida!");
		}
		
		// Começo da batalja.
		System.out.println();
		System.out.println();
		System.out.println("Começou a batalha épica");
		System.out.println(barra_gui);
		System.out.println();
		System.out.println("O " + escolhidoName1 + " realiza o primeiro ataque. ");
		System.out.println();

		System.out.println(escolhidoName1 + " causa " + escolhido1 + " de dano ao " + escolhidoName2);
		System.out.println(escolhidoName2 + " se defendeu com " + escolhido2 + " de defesa ");
		if(escolhido2 < escolhido1) {
			System.out.println(escolhidoName2 + " perdeu a batalha. ");
		}
		else if(escolhido2 == escolhido1) {
			System.out.println(escolhidoName1 + " empatou em batalha contra " + escolhidoName2);
		}
		else if(escolhido2 > escolhido1) {
			System.out.println(escolhidoName1 + " perdeu a batalha para " + escolhidoName2 + " que revidou com um golpe mortal.");
		}
		else {
			System.out.println("Erro!");
		}
		
		
		sc.close();

	}

}
