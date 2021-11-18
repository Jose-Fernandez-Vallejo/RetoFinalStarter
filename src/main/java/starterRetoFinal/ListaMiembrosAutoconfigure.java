package starterRetoFinal;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
@ConditionalOnClass(ListaMiembros.class)
@EnableConfigurationProperties(ListaMiembrosProperties.class)
public class ListaMiembrosAutoconfigure {
	
	private final ListaMiembrosProperties properties;

	public ListaMiembrosAutoconfigure(ListaMiembrosProperties properties) {
		this.properties= properties;
	}
	
	@Bean
	public ListaMiembros listaMiembros() {
		return ListaMiembros.getInstance(properties.getmaxMiembros());
	}

}
