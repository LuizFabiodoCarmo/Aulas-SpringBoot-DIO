package dio.springboot;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class SistemaMensagem implements CommandLineRunner {
//Senão encontrar a propriedade do tipo "name", retorna "Noreply-DIO" como padrão.
//	Para obter as anotações em "application.properties" usamos a anotação @Value
	@Value("${name:NoReply-DIO}")
	private String nome;
	@Value("${email}")
	private String email;
	@Value("${telefones}")
	private List<Long> telefones = new ArrayList<>(Arrays.asList(new Long[] { 11956781254L }));

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Mensagem enviada por: " + nome	
		        + "\nE-mail:" + email 
		        + "\nCom telefones para contato: " + telefones);
		System.out.println("Seu cadastro foi aprovado");
	}
}
