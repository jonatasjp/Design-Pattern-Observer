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

	public Map<String, ContadorPalavras> getContadores() {
		return contadores;
	}

	public void setContadores(Map<String, ContadorPalavras> contadores) {
		this.contadores = contadores;
	}
	
}
