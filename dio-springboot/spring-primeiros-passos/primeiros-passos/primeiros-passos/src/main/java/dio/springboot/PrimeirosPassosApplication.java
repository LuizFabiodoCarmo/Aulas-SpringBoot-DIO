package dio.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class PrimeirosPassosApplication {

	public static void main(String[] args) {
		SpringApplication.run(PrimeirosPassosApplication.class, args);
		
//		Não mais estaremos utilizando new em nossos objetos, será aspecto de configurações de Beans e comandos de inicialização da aplicação
//		Método sendo aplicado em Myapp.
//		Calculadora calculadora = new Calculadora();		
//		 System.out.println("o resultado é : " + calculadora.somar(2, 7));
		
	}

}
