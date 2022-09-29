package challenge.conversor.interfaces;

import java.math.BigDecimal;

import challenge.conversor.enums.Moeda;

public interface MoedaConversivel {
	
	BigDecimal converterParaMoeda(Moeda moeda, BigDecimal valorEmReais);
	
	BigDecimal converterParaReal(Moeda moeda, BigDecimal valorNaMoeda);
}
