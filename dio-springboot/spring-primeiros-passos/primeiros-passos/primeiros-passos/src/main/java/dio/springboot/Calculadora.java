package dio.springboot;

import org.springframework.stereotype.Component;

// Usa-se o Component, quando uma classe tem a possibidade ou finalidade ser
	// provida através do conceito de injeção de dependências
@Component	
public class Calculadora {	
	
	public int somar(int numero1, int numero2) {
		return numero1 + numero2;
	}
}
