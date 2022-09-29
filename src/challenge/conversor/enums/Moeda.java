package challenge.conversor.enums;

import java.math.BigDecimal;

public enum Moeda {
	
	// cotações em 28/09/2022
	DOLAR(BigDecimal.valueOf(5.35)),
	EURO(BigDecimal.valueOf(5.13)),
	LIBRA_ESTERLINA(BigDecimal.valueOf(5.72)),
	PESO_ARGENTINO(BigDecimal.valueOf(0.036)),
	PESO_CHILENO(BigDecimal.valueOf(0.0055));
	
	private BigDecimal FATOR_CONVERSAO;
	
	Moeda(BigDecimal FATOR_CONVERSAO) {
		this.FATOR_CONVERSAO = FATOR_CONVERSAO;
	}
	
	public BigDecimal getFATOR_CONVERSAO() {
		return FATOR_CONVERSAO;
	}
}
