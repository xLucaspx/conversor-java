package challenge.conversor.modelos;

import javax.swing.JOptionPane;

public class Repetidor {

	public boolean tentaRepetir() {
		int resposta;
		Object[] options = { "Sim", "Não" };

		resposta = JOptionPane.showOptionDialog(null, "Deseja continuar?", "Conversor", JOptionPane.DEFAULT_OPTION,
				JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
		
		if (resposta != 0) {
			JOptionPane.showMessageDialog(null, "Programa finalizado!", "Conversor", JOptionPane.INFORMATION_MESSAGE);
			return false;
		}
		return true;
	}
}