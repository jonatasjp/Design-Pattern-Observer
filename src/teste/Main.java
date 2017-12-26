package teste;

import implementacao.ContadorMaiusculas;
import implementacao.ContadorPalavras;
import implementacao.ContadorPares;
import implementacao.ContadorSimples;
import implementacao.QuebradorDePalavras;

public class Main {
	
	public static void main(String[] args) {
		
		QuebradorDePalavras quebrador = new QuebradorDePalavras();
		
		ContadorPalavras contadorSimples = new ContadorSimples();
		ContadorPalavras contadorMaiusculas = new ContadorMaiusculas();
		ContadorPalavras contadorPares = new ContadorPares();
		
		quebrador.adicionarContador("SIMPLES", contadorSimples);
		quebrador.adicionarContador("MAISCULAS", contadorMaiusculas);
		quebrador.adicionarContador("PARES", contadorPares);
		
		quebrador.quebrar("Recursão ver recursividade Recursividade se ainda não entendeu ver Recursão");

		System.out.println("Simples: " +quebrador.getContagem("SIMPLES"));
		System.out.println("Maisculas: " +quebrador.getContagem("MAISCULAS"));
		System.out.println("Pares: " +quebrador.getContagem("PARES"));
		
	}
}
