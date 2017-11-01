package implementacao;

public class ContadorMaiusculas implements ContadorPalavras{

	private int qtd;
	
	@Override
	public void contar(String palavra) {
		if(Character.isUpperCase(palavra.charAt(0))) {
			this.qtd++;
		}
	}
	
	@Override
	public int getContagem() {
		return this.qtd;
	}

}
