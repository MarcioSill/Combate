package appication;

import java.util.Locale;
import java.util.Scanner;

import entities.Champion;

public class Combate {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite os dados do primeiro campeão:");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Vida inicial: ");
		int vidaInicial = sc.nextInt();
		System.out.print("Ataque: ");
		int ataque = sc.nextInt();
		System.out.print("Armadura: ");
		int armadura = sc.nextInt();
		
		Champion A = new Champion(nome, vidaInicial, ataque, armadura);
		
		sc.nextLine();
		System.out.println("Digite os dados do segundo campeão:");
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Vida inicial: ");
		vidaInicial = sc.nextInt();
		System.out.print("Ataque: ");
		ataque = sc.nextInt();
		System.out.print("Armadura: ");
		armadura = sc.nextInt();;
		 
		 Champion B = new Champion(nome, vidaInicial, ataque, armadura);
		 
		 
		 System.out.print("Quantos turnos você deseja executar? ");
		 int N = sc.nextInt();
		 
		  Champion champion =  new Champion();
		 int a = 1;

		 		 
		 while(a <= N) {
			
			System.out.println("Resultado do turno " + a + ":");
			champion.takeDamage(B);	
			champion.takeDamage(A);	
			
			System.out.println(champion.status(A));
			System.out.println(champion.status(B));			
			a++;
			}		
		
		sc.close();

	}

}
