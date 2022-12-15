package Personagens;

import java.util.concurrent.ThreadLocalRandom;

public class Thor {
	
	private String name = "Thor";
	private int vida = 100;
	private int dano = 50;
	private int defesa = 35;
	
	public Thor() {
	}

	public Thor(String name, int vida, int dano, int defesa) {
		this.name = name;
		this.vida = vida;
		this.dano = dano;
		this.defesa = defesa;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public int getDano() {
		return dano;
	}

	public void setDano(int dano) {
		this.dano = dano;
	}

	public int getDefesa() {
		return defesa;
	}

	public void setDefesa(int defesa) {
		this.defesa = defesa;
	}
	
	public int ataque(){
		int min_val = 0;
        int max_val = 50;
     // instanciando gerador de numeros aleatorios dentro de um intervalo.
        ThreadLocalRandom tlr = ThreadLocalRandom.current();
        int randomNum = tlr.nextInt(min_val, max_val + 1);
        System.out.println("Dano causado: "+randomNum);
        return randomNum;
	}

}
