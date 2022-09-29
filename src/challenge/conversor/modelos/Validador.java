package challenge.conversor.modelos;

public class Validador {
	
	public boolean verifica(String operacao) {
		
		return operacao.matches("[=-]?\\d*(\\.\\d+)?"); // verificando se o resultado da operação é um valor numérico
	}
	
	public double transformaEmDouble(String operacao) {
		return Double.parseDouble(operacao);
	}
}
