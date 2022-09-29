package challenge.conversor.principal;

import java.math.BigDecimal;

import javax.swing.JOptionPane;
import javax.swing.UIManager;

import challenge.conversor.enums.TipoConversao;
import challenge.conversor.interfaces.InicializadorConversao;
import challenge.conversor.modelos.InicializadorConversaoMoedas;
import challenge.conversor.modelos.Repetidor;
import challenge.conversor.modelos.Validador;

public class Conversor {
	public static void main(String[] args) throws Exception {

		UIManager.put("OptionPane.cancelButtonText", "Cancelar");

		String conversaoDeMoeda = "Converter moeda";
		String conversaoDeTemperatura = "Converter temperatura";

		boolean executa = true;

		Repetidor repetidor = new Repetidor();

		while (executa) {
			String tipoConversao = JOptionPane
					.showInputDialog(null, "Escolha o tipo de conversão", "Conversor", JOptionPane.PLAIN_MESSAGE, null,
							new String[] { conversaoDeMoeda, conversaoDeTemperatura }, "Escolha").toString();

			InicializadorConversao inicializadorConversao = null;
			String operacao = null;

			if (tipoConversao.equals(conversaoDeMoeda)) {
				inicializadorConversao = new InicializadorConversaoMoedas();

				operacao = JOptionPane.showInputDialog(null, "Escolha a operação", "Conversão de moedas",
						JOptionPane.PLAIN_MESSAGE, null,
						new String[] { TipoConversao.REAL_PARA_DOLAR.getDescricao(),
								TipoConversao.REAL_PARA_EURO.getDescricao(),
								TipoConversao.REAL_PARA_LIBRA_ESTERLINA.getDescricao(),
								TipoConversao.REAL_PARA_PESO_ARGENTINO.getDescricao(),
								TipoConversao.REAL_PARA_PESO_CHILENO.getDescricao(),
								TipoConversao.DOLAR_PARA_REAL.getDescricao(),
								TipoConversao.EURO_PARA_REAL.getDescricao(),
								TipoConversao.LIBRA_ESTERLINA_PARA_REAL.getDescricao(),
								TipoConversao.PESO_ARGENTINO_PARA_REAL.getDescricao(),
								TipoConversao.PESO_CHILENO_PARA_REAL.getDescricao() },
						"Escolha").toString();
			}
			String mensagem = "Insira um valor para ser convertido \n(apenas números separados por \".\")";
			String valorInserido = JOptionPane.showInputDialog(null, mensagem, "Conversão de " + operacao,
					JOptionPane.PLAIN_MESSAGE);

			Validador validador = new Validador();

			if (!validador.verifica(valorInserido)) {
				JOptionPane.showMessageDialog(null, "Valor inválido!", "Atenção!", JOptionPane.ERROR_MESSAGE);
			} else {
				double valor = validador.transformaEmDouble(valorInserido);
				BigDecimal valorConvertido = inicializadorConversao.operarConversao(operacao, valor);

				String resultado = ("Conversão de " + operacao + "\n Valor inserido: " + valorInserido + "\n Resultado: "
						+ valorConvertido);

				JOptionPane.showMessageDialog(null, resultado, "Resultado da operação", JOptionPane.PLAIN_MESSAGE);
			}
			executa = repetidor.tentaRepetir();
		}
	}
}
