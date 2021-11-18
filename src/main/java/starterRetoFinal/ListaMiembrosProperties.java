package starterRetoFinal;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties("listamiembros.maxmiembros")
public class ListaMiembrosProperties {

	
private Long maxMiembros = 5L;
	
	public Long getmaxMiembros() {
		return maxMiembros;
	}

	public void setmaxMiembros(Long maxMiembros) {
		this.maxMiembros = maxMiembros;
	}
}
