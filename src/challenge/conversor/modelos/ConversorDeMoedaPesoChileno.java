package challenge.conversor.modelos;

import java.math.BigDecimal;

import challenge.conversor.enums.Moeda;

public class ConversorDeMoedaPesoChileno extends ConversorDeMoeda {

	@Override
	public BigDecimal converterParaMoeda(Moeda moeda, BigDecimal valorEmReais) {
		moeda = Moeda.PESO_CHILENO;
		return super.converterParaMoeda(moeda, valorEmReais);
	}

	@Override
	public BigDecimal converterParaReal(Moeda moeda, BigDecimal valorNaMoeda) {
		moeda = Moeda.PESO_CHILENO;
		return super.converterParaReal(moeda, valorNaMoeda);
	}
}
