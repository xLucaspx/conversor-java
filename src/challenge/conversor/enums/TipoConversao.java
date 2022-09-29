package challenge.conversor.enums;

public enum TipoConversao {
	
	REAL_PARA_DOLAR("Real para Dólar"),
	REAL_PARA_EURO("Real para Euro"),
	REAL_PARA_LIBRA_ESTERLINA("Real para Libra Esterlina"),
	REAL_PARA_PESO_ARGENTINO("Real para Peso Argentino"),
	REAL_PARA_PESO_CHILENO("Real para Peso Chileno"),
	DOLAR_PARA_REAL("Dólar para Real"),
	EURO_PARA_REAL("Euro para Real"),
	LIBRA_ESTERLINA_PARA_REAL("Libra Esterlina para Real"),
	PESO_ARGENTINO_PARA_REAL("Peso Argentino para Real"),
	PESO_CHILENO_PARA_REAL("Peso Chileno para Real");
	
	private String descricao;
	
	TipoConversao(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
}
