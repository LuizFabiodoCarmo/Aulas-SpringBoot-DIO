package dio.springboot;

import org.springframework.context.annotation.Bean;
import com.google.gson.Gson;

//Classe cria para não ter a necessidade de ficar criando vários Bean na classe principal.
//Todas as classes externas ficam desponiveis nesta classe.
//Usa-se Bean quando não se tem acesso ao código fonte.

public class Beans {
	@Bean
	public Gson gson() {
		return new Gson();
	}

	
}
