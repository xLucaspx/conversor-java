package challenge.conversor.modelos;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class ConversorDeTemperatura {

	public BigDecimal converteCelsiusParaFahrenheit(double valor) {
		return BigDecimal.valueOf(valor * 1.8 + 32).setScale(2, RoundingMode.HALF_UP);
	}

	public BigDecimal converteCelsiusParaKelvin(double valor) {
		return BigDecimal.valueOf(valor + 273.15).setScale(2, RoundingMode.HALF_UP);
	}

	public BigDecimal converteFahrenheitParaCelsius(double valor) {
		return BigDecimal.valueOf((valor - 32) / 1.8).setScale(2, RoundingMode.HALF_UP);
	}

	public BigDecimal converteFahrenheitParaKelvin(double valor) {
		return BigDecimal.valueOf((valor - 32) / 1.8 + 273.15).setScale(2, RoundingMode.HALF_UP);
	}

	public BigDecimal converteKelvinParaCelsius(double valor) {
		return BigDecimal.valueOf(valor - 273.15).setScale(2, RoundingMode.HALF_UP);
	}
	
	public BigDecimal converteKelvinParaFahrenheit(double valor) {
		return BigDecimal.valueOf((valor - 273.15) * 1.8 + 32).setScale(2, RoundingMode.HALF_UP);
	}
}
