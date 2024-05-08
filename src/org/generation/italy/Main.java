package org.generation.italy;


import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		final int DIMENSIONE_RUBRICA=5;		//questo valore è costante (non verrà più cambiato)
		
		
		String[] nomi=new String[DIMENSIONE_RUBRICA];		//nomi della rubrica
		String[] numeri=new String[DIMENSIONE_RUBRICA];		//numeri telefonici
		int i;
		boolean trovato;
		String daCercare, risposta;
		Scanner sc=new Scanner(System.in);
		
		//inserimento rubrica
		for (i=0;i<nomi.length;i++) {
			System.out.print("Inserisci il nome in posizione " + i+ ": ");
			nomi[i]=sc.nextLine();
			
			System.out.print("Inserisci il numero di " + nomi[i]+ ": ");
			numeri[i]=sc.nextLine();
		}
		
		do {
			System.out.print("Quale nome/numero vuoi cercare? ");
			daCercare=sc.nextLine();
			trovato=false;
			for (i=0;i<nomi.length;i++)
				if (nomi[i].equalsIgnoreCase(daCercare) || numeri[i].equals(daCercare)) {
					trovato=true;
					System.out.println("Nome: " + nomi[i] + "   Numero: " + numeri[i]);
				}
			if (!trovato)		//trovato==false
				System.out.println("Nome/numero non trovato!");
			System.out.print("Vuoi cercare un altro nome (s/n)? ");
			risposta=sc.nextLine();
		} while (risposta.equalsIgnoreCase("s"));

		

	}

}
