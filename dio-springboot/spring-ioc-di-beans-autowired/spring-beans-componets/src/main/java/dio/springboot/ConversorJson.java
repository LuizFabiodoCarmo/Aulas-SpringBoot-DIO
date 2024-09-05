package dio.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;

//Quando se Usa @Component vs @Bean
//@Component - Componetes que serão escaneados na minha aplicação, quando se tem acesso ao código fonte.
//Quando nominado de componente é possível injetado através da injeção de dependências em qualquer ecossistema de um container do spring

@Component
public class ConversorJson {
	@Autowired
    private Gson gson = new Gson();
    public ViaCepResponse converter(String json ){
        ViaCepResponse response = gson.fromJson(json,ViaCepResponse.class);
        return response;
    }
}
