package challenge.conversor.modelos;

import java.math.BigDecimal;
import java.math.RoundingMode;

import challenge.conversor.enums.Moeda;
import challenge.conversor.interfaces.MoedaConversivel;

public abstract class ConversorDeMoeda implements MoedaConversivel {

	@Override
	public BigDecimal converterParaMoeda(Moeda moeda, BigDecimal valorEmReais) {
		return valorEmReais.divide(moeda.getFATOR_CONVERSAO(), 2, RoundingMode.HALF_UP);
	}

	@Override
	public BigDecimal converterParaReal(Moeda moeda, BigDecimal valorNaMoeda) {
		return valorNaMoeda.multiply(moeda.getFATOR_CONVERSAO()).setScale(2, RoundingMode.HALF_UP);
	}
}
