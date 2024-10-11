
## Bootcamp Santander/DIO 2024 - Backend com Java
### Introdução a Spring Framework com Spring Boot

### Contexto  
As aulas aqui neste repositório foram ministras por:  
  [Gleyson Sampaio, ](https://www.linkedin.com/in/glysns/)
  na plataforma digital da [DIO](https://www.dio.me/en).
   Estas aulas são parte do Bootcamp Santander 2024 - Backend com Java.
  
- Todos os exercícios Java foram desenvolvidos no IDE Eclipse. 

### SpringBoot - primeiros passos
- Criar um projeto com initializr
- Importando o projeto maven no spring boot
- Conhecendo a estrutura spring boot 
- Bean e CommandLinerRunner  
 [Ver exercícios](https://github.com/LuizFabiodoCarmo/Aulas-SpringBoot-DIO/tree/main/dio-springboot/spring-primeiros-passos/primeiros-passos/primeiros-passos/src/main/java/dio/springboot)


### Beans vs Components
- Quando usar @Bean
- Quando usar @Cmponent
- Implementar a IoC e DI
- Nesta aula usamos o framework da google Gson  
 [Ver exercícios](https://github.com/LuizFabiodoCarmo/Aulas-SpringBoot-DIO/tree/main/dio-springboot/spring-ioc-di-beans-autowired/spring-beans-componets/src/main/java/dio/springboot)

### Scopes - Singleton ou Prototype
- Conceito de Scope
- Configurando objeto Singleton
- Configurando objetos Prototype  
 [Ver exercícios](https://github.com/LuizFabiodoCarmo/Aulas-SpringBoot-DIO/tree/main/dio-springboot/spring-scopes-singleton-prototype/spring-scopes-singleton-prototype/src/main/java/dio/springboot)

### Properties Value
- O poderoso application.properties
- @Value
- Default value  
 [Ver exercícios](https://github.com/LuizFabiodoCarmo/Aulas-SpringBoot-DIO/tree/main/dio-springboot/spring-properties-value/spring-properties-value/src/main/java/dio/springboot)

### Configuration Properties
- O poderoso application properties
- @ConfigurationProperties(prefix)   
[Ver exercícios](https://github.com/LuizFabiodoCarmo/Aulas-SpringBoot-DIO/tree/main/dio-springboot/spring-configuration-properties/spring-configuration-properties/src/main/java/dio/springboot)

### Conceito de ORM e JPA.
- ORM(Mapiamento Objecto-Relacional) realiza a obtenção de dados do banco de dados relacional 
- Java Persistence API especificação baseada em interfaces que atravez de um framework realiza a interação com o banco de dados . 
- Mapeamentos(Conhecendo os aspectos das anotações de mapeamento do JPA Identificação, para isso nossa classe deve ter os atributos de: 
      Definição, Relacionamento, Herança, Persistência).             
- EntityManager -Capaz de realizar todas as operações CRUD, inlcuindo seleções dos registros do banco de dados.  
[Ver exercícios](https://github.com/LuizFabiodoCarmo/Aulas-SpringBoot-DIO/tree/main/dio-springboot/aula-spring-data-jpa/aula-spring-data-jpa/src/main/java)

### Spring Data JPA - Framework que melhora a produtividade dos mapeamentos e anotações da interface.

- Interação com o banco de dados através de herança de interface e declaração de métodos com anotações.
- Interfaces mais usadas: CrudRepository, JPARepository, PagingAndSortingRepository.
- Anotações mais usadas: @Query e @Param.
- Nessa aula, ao gerar o Maven pelo spring, foi adicionado alguns starters/dependências:  Spring Data JPA, MySQL JDBC driver.  
[Ver exercícios](https://github.com/LuizFabiodoCarmo/Aulas-SpringBoot-DIO/tree/main/dio-springboot/aula-spring-data-jpa/aula-spring-data-jpa/src/main/java)

### Conexão com Banco de dados SQL (MySQL)
- Conectando o projeto SpringBoot com o banco de dados MySQL
- Em um projeto SpringBoot toda a parte de configuração fica centralizada no arquivo "application.properties", inclusive configurações de 
   banco.  
[Ver exercícios](https://github.com/LuizFabiodoCarmo/Aulas-SpringBoot-DIO/tree/main/dio-springboot/aula-spring-data-jpa-mysql/aula-spring-data-jpa/src/main/java)


### JPA Repository
 
- O projeto Spring Data Jpa facilita a implementção do padão Repository atraves de AOP(Aspect Oriented Programming).
- Utilizando-se apenas uma interface, o Spring irá gerar dinamicamente a implementação dos métodos de acesso a dados. Estender a interface JPA Repository é opcional, mas a vantagem é que ela já vem com varios metodos genéricos de CRUD definidos.
- Relação baseada em Interfaces e não mais em Classes concretas, com isso para definir uma consulta precisar ser de forma manual atraves da anotação @Query. O método utiliza a mesma instrução SQL de consulta pelo campo name comparando com o operados LIKE do SQL.

#### Principais métodos que já são disponibilizados pelo Framework:
- save: Insere e atualiza os dados de uma entidade.
- findById: Retorna o objeto localizado pelo seu ID.
- existsById: Verifica a existência de um objeto pelo ID .informado, retornando o boolean.
- findAll: Retorna uma coleção contendo todos os registors da tabela no banco de dados.
- delete: Deleta um registro da respectiva tablea mapeada do banco de dados.
- count: retorna a quantidade de registro de uma tablea mapeada do banco de dados.

<h3 align="center">(Modelo do portifólio proposto)</h3>
<div align="center">
    <img height="350" title="modelo curso" src="https://github.com/user-attachments/assets/a961fe94-c281-4dea-8ea5-2ec959a9ecc8"/>      
</div>
  

