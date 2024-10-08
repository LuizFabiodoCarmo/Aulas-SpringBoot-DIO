package dio.springboot;

import java.util.List;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Configuration - usado ao invés de @Componet por que está associado ao application.properties


@ConfigurationProperties(prefix = "remetente")
//Todos os atributos do Bean de configuração estão pertinentes do prefixo "remetente"
//@ConfigurationProperties - ter um Bean de configuração que traz os valores do application.properties
public class Rementente {
	private String nome;
	private String email;
	private List<Long> telefones;
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public List<Long> getTelefones() {
		return telefones;
	}
	
	public void setTelefones(List<Long> telefones) {
		this.telefones = telefones;
	}
	
}
