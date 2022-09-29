package challenge.conversor.modelos;

import java.math.BigDecimal;

import challenge.conversor.enums.Moeda;

public class ConversorDeMoedaDolar extends ConversorDeMoeda {

	@Override
	public BigDecimal converterParaMoeda(Moeda moeda, BigDecimal valorEmReais) {
		moeda = Moeda.DOLAR;
		return super.converterParaMoeda(moeda, valorEmReais);
	}

	@Override
	public BigDecimal converterParaReal(Moeda moeda, BigDecimal valorNaMoeda) {
		moeda = Moeda.DOLAR;
		return super.converterParaReal(moeda, valorNaMoeda);
	}
}
