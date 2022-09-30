package challenge.conversor.modelos;

import java.math.BigDecimal;

import challenge.conversor.interfaces.InicializadorConversao;

public class InicializadorConversaoTemperatura implements InicializadorConversao {

	private static final String CELSIUS_PARA_FAHRENHEIT = "Celsius para Fahrenheit";
	private static final String CELSIUS_PARA_KELVIN = "Celsius para Kelvin";
	private static final String FAHRENHEIT_PARA_CELSIUS = "Fahrenheit para Celsius";
	private static final String FAHRENHEIT_PARA_KELVIN = "Fahrenheit para Kelvin";
	private static final String KELVIN_PARA_CELSIUS = "Kelvin para Celsius";
	private static final String KELVIN_PARA_FAHRENHEIT = "Kelvin para Fahrenheit";

	private ConversorDeTemperatura conversorDeTemperatura = new ConversorDeTemperatura();

	@Override
	public BigDecimal operarConversao(String operacao, double valorInicial) throws Exception {

		switch (operacao) {
			case CELSIUS_PARA_FAHRENHEIT -> {
				return conversorDeTemperatura.converteCelsiusParaFahrenheit(valorInicial);
			}
			case CELSIUS_PARA_KELVIN -> {
				return conversorDeTemperatura.converteCelsiusParaKelvin(valorInicial);
			}
			case FAHRENHEIT_PARA_CELSIUS -> {
				return conversorDeTemperatura.converteFahrenheitParaCelsius(valorInicial);
			}
			case FAHRENHEIT_PARA_KELVIN -> {
				return conversorDeTemperatura.converteFahrenheitParaKelvin(valorInicial);
			}
			case KELVIN_PARA_CELSIUS -> {
				return conversorDeTemperatura.converteKelvinParaCelsius(valorInicial);
			}
			case KELVIN_PARA_FAHRENHEIT -> {
				return conversorDeTemperatura.converteKelvinParaFahrenheit(valorInicial);
			}
			default -> throw new Exception("Escolha inválida!");
		}
	}
}
