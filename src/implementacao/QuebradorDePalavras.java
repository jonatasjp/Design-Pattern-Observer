package implementacao;

import java.util.HashMap;
import java.util.Map;

public class QuebradorDePalavras {

	private Map<String, ContadorPalavras> contadores = new HashMap<>();
	
	public void quebrar(String frase) {
		String[] palavras = frase.split(" ");
		for (String palavra : palavras) {
			for (ContadorPalavras contador : contadores.values()) {
				contador.contar(palavra);
			}
		}
	}
	
	public int getContagem(String keyContador) {
		return this.contadores.get(keyContador).getContagem();
	}

	public void adicionarContador(String nome, ContadorPalavras contador) {
		contadores.put(nome, contador);
	}

}
