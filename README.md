# JAVA

## *JAVA COM FRAMEWORK SPRING BOOT COM API POSTMAN**

###  *SPRING.IO*  


SITE SPRING.IO esse site serve para baixar o arquivo.zip para o framework java

VAMOS CONFIGURAR:
####  *DEPENDENCIAS* 
- **Spring Web** [Web]
    - Constrói aplicações web, incluindo aplicações RESTful usando Spring MVC. Utiliza o Apache Tomcat como contêiner embutido padrão.

- **H2 DataBase** [SQL]
    - Fornece um banco de dados rápido em memória que suporta acesso JDBC API e R2DBC, com um tamanho pequeno (2 MB). Suporta modos incorporado e servidor, além de um console baseado em navegador.

- **MySQL Driver** [SQL]
    - Driver JDBC do MySQL. Para o Java fazer conexão com o banco de dados

- **Spring Boot DevTools** [DEVELOPER TOOLS]
    - Fornece reinicializações rápidas da aplicação, LiveReload e configurações para melhorar a experiência de desenvolvimento.

- **Spring Data JPA** [SQL]

    - Persiste dados em bancos SQL usando a API de Persistência do Java com Spring Data e Hibernate.


![img](img/Captura%20de%20tela%202026-03-12%20143159.png)

###  *IMPORTAR O FRAMEWORK NO NEATBEANS* 

Vai em "FILE", "IMPORT PROJECT" E "FROM ZIP".
Após abrir um PopUp clique em browse e selecione o arquivo.zip.

Após importar, vai abrir o arquivo.zip na aba esquerda  com o pacote principal que você criou no spring.io e a classe (driver) que starta toda a aplicação, quem estarta o framework é essa propria classe que contem nela . Criada com todas as dependências ja no arquivo (pom.xml) la no (/Projects Files)


### *CLASSE DRIVER* 
***
Classe onde inicia todo meu spring boot, onde vai iniciar tudo.

* *package br.eti.mts.garage;*

Pacote criado no **SPRING.IO** em **PROJECT Metadata/package** **NAME**: mbr.eti.mts

* *import org.springframework.boot.SpringApplication;*

Aqui ele importa da biblioteca **SpringBoot** E **inica o servidor embutido TOMCAT**
 
 * *import org.springframework.boot.autoconfigure.SpringBootApplication;*        

Esse **@SpringBootApplication**(Configura automaticamente a aplicação), **traz três anotações junto**:

 * *@Configuration*(Diz que a Classe contem configurações do spring)

 * *@EnableAutoConfiuration*(Configura coisas como: Banco de dados, Servidor Web, JPA(JAVA PERSISTENCE API) etc...)
 * *@ComponenteScan*(Faz o Spring procurar automaticamente classes como: *@Controller*, *@Service*, *@Repository*, *@Component*)


```java
package br.eti.mts.garage; 
//Pacote criado no SPRING.IO em PROJECT Metadata/package name: mbr.eti.mts

import org.springframework.boot.SpringApplication;
//Importando da biblioteca springboot/ inica o servidor embutido TOMCAT

import org.springframework.boot.autoconfigure.SpringBootApplication;        
/** 
*#import org.springframework.boot.autoconfigure.SpringBootApplication;        
*Esse @SpringBootApplication(Configura automaticamente a aplicação)traz 3 anotações junto
*1 @Configuration(Diz que a Classe contem configurações do spring)
*2 @EnableAutoConfiuration(Configura coisas como: Banco de dados, Servidor Web, JPA(JAVA PERSISTENCE API) etc...)
*3 @ComponenteScan(Faz o Spring procurar automaticamente classes como: @Controller, @Service, @Repository, @Component)
**/

@SpringBootApplication
public class GarageApplication {

	public static void main(String[] args) {
		SpringApplication.run(GarageApplication.class, args);

	}

}
```

### *CLASSE ENTITIES*
***
#### Código completo




```java
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.mts.garage.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 *
 * @author Mateus
 */
//CLASSE MODELO DE DADOS
/**
 * @Entity é uma notação para dizer que minha classe vai passar a ser mapeada e
 * vira uma tabela no banco de dados.
 *
 *
 */
@Entity
@Table(name = "veiculo")
public class Veiculo {

    /**
     * @GeneratedValue(strategy = GenerationType.IDENTITY) Cria o id automatico
     * então nao preciso fazer maual tipo "id = 1". Entao se eu crio private
     * Long id; cafe e leite ele pela ordem ja puxa o id automatico entao seria
     * cafe id = 1 e leite id = 2. E embaixo dele vem a variavel id do tipo long
     * private.
     */

    @Id //identificador unico de cada registro no banco, toda @Entity precisa ter obrigatoriamente ter um @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    // Atributos básicos conforme pedido para API
    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private int km;
    private String avarias;

    //@Column serve para nome composto, mapeia o atributo da classe e muda o nome...entre outras
    @Column(name = "LINKIMAGEM")
    private String linkImagem;

    @Column(name = "DESCRICAOCOMPLETA")
    private String descricaoCompleta;

    /**
     * Getters and Setter: Getters: pega o valor daquele atributo e retorna pra
     * mim e retorna eles Setters: altera o valor do atributo
     *
     * EXEMPLO: Porque usar private? para o atributo não ser alterado por
     * qualquer programador ou por simplesmente fazer burrada la na frente. com
     * o public em vez de private aconte que eu consigo mudar o atributo sem
     * estar na classe principal, por exemplo this.nome = "4"; to falando que
     * aquele id em qualquer outro lugar que isso é um valor definido ja usando
     * o private eu passo por um método antes que é o setter, onde á um calculo
     * que o nome não pode ser igual ao um numero, e daria como invalido. Já sem
     * isso, pode passar e dar problema, e dar erro que não é erro do usuário
     * por exemplo.
     *
     *
     */
    /**
     * porque os getters e setters estão publicos? porque se fosse privado não
     * ia ter como retornar esses valores apenas quem esta dentro da classe, os
     * atributos estão privados para serem alterados, mas se eu privo os getters
     * e setters ele automaticamente tbm ficam privados e assim são lacrados sem
     * utilização.
     *
     * @return
     */
    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public Integer getAno() {
        return ano;
    }

    public Integer getKm() {
        return km;
    }

    public String getLinkimagem() {
        return linkImagem;
    }

    public String getLinkImagem() {
        return linkImagem;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public String getAvarias() {
        return avarias;
    }

}
```



###  *Anotações "@" do JPA(Java Persistence API)* 
***

 Classe Modelo de dados, sua classe principal. Onde você vai fazer sua tabela do banco de dados, onde você vai LITERALMENTE moldar. Usando @Entity, @Table, @Id, @GeneratedValue(strategy = GenerationType.IDENTITY), @Column.

 *@Entity*: Anotação que marca aquela classe como sua classe de modelo de dados, marcada como entidade persistente, entidade persistente é um objeto do programa que pode ser armazenado permanentemente em um banco de dados

 *@Table*(name = "veiculo"): Anotação para dar nome a tabela do seu banco de dados no caso que eu usei nessa API foi "veiculo".

 *@Id*: Identificador unico de cada registro no banco, toda @Entity precisa ter obrigatoriamente ter um @Id

*@GeneratedValue*(strategy = GenerationType.IDENTITY)
   private long id;Cria o id automatico
     então nao preciso fazer maual tipo "id = 1". Entao se eu crio private
      Long id; cafe e leite ele pela ordem ja puxa o id automatico entao seria
      cafe id = 1 e leite id = 2. E embaixo dele vem a variavel id do tipo long
      private.


*@Column*: Nomeia uma coluna usada quando a variavel está com nome composto
      exemplo = descricaoCompleta la na tabela do banco de dados o sql entede que aquele nome da coluna usa snakecase que fica descricao_Completa. Então usamos o @Column (name = "descricaocompleta") e a variavel em baixo.
      private String descricaocompleta;


      

### *Getters and Setters*
***
O que são? 

*Getters*: 
pega o valor daquele atributo e retorna pra mim. 

*Setters*: Altera o valor do atributo

EXEMPLO:

 *public long getId() return id;*

Quer dizer que vai deixar aquela linha pública. GetId em verde apenas especifica que ele vai pegar o Id, mas o negócio só acontece no return id; aí ele retorna o valor daquela variável.

```java
    public long getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getCor() {
        return cor;
    }

    public Integer getAno() {
        return ano;
    }

    public Integer getKm() {
        return km;
    }

    public String getLinkimagem() {
        return linkImagem;
    }

    public String getLinkImagem() {
        return linkImagem;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public String getAvarias() {
        return avarias;
    }

}


```
#### *Porque usar PRIVATE*

***
Para o atributo não ser alterado por qualquer programador ou por simplesmente fazer burrada la na frente. com
o public em vez de private aconte que eu consigo mudar o atributo sem
estar na classe principal, por exemplo this.nome = "4"; to falando que
aquele id em qualquer outro lugar que isso é um valor definido ja usando
o private eu passo por um método antes que é o setter, onde á um calculo
que o nome não pode ser igual ao um numero, e daria como invalido. Já sem
isso, pode passar e dar problema, e dar erro que não é erro do usuário
por exemplo. 

Porque os getters e setters estão publicos? porque se fosse privado não ia ter como retornar esses valores apenas quem esta dentro da classe, os atributos estão privados para serem alterados, mas se eu privo os getters e setters ele automaticamente tbm ficam privados e assim lacrados sem utilização.


### CLASSE VEICULOREPOSITORY

***

Pra que serve a classe veiculorepository?

Essa classe serve para pegar do meu banco de dados SQL a minha base de dados. Ela serve como ponte para mandar informação. 

temos as importações de outras classes como o DTO o Entities


***import Java.util.List***

Isso importa uma biblioteca padrão do java, ela é uma interface.

O que é uma interface? Uma interface define métodos  mas NÃO implementa eles.

**EXEMPLO 1:**

```java
interface Pessoa {
    void falar();
}
```
Ela não diz como falar apenas diz que ele existe.
Agora quem implementa?
A classe, ela implementa, ela diz como aquele método vai ser utilizado

**EXEMPLO 2:**

```java

class Homem implements Pessoa {

    public void falar() {
        System.out.println("Olá");
    }

}


```
O metodo falar() recebe um print("Olá");

#### IMPORTAÇÃO **JPA**

* *import org.springframework.data.jpa.repository.JpaRepository;*

Esse código é uma importação da biblioteca do JPA 

Lembra que importamos as dependências la no spring.io, uma delas é o
**Spring Data JPA**  [SQL].
Persiste dados em bancos SQL usando a API de Persistência do Java com Spring Data e Hibernate.

Ele pegou das dependências e executou via arquivo pom.xml


* *public interface VeiculoRepository extends JpaRepository <Veiculo, Long>*

   - O "*public*" é um modificador de acesso eu consigo acessar ele de qualquer classe de projeto.

   - "*interface VeiculoRepository*". Uma **interface** em java define métodos que uma classe vai ter. No caso do Spring quem cria a implementação dessa interface  é o **Framework Spring Data JPA** automaticamente.
   Aqui você está criando uma interface, um repositorio pra trabalhar com a **entidade** chamada *VeiculoRepository* que recebe como parâmetro a classe *Veiculo* do tipo *Long*(*Long* normalmente usada pra classe e objeto). 

    - "*extends*" herda atributos de **outra** classe ou interface, ela serve pra receber tudo que uma classe.

    - "*<Veiculo, Long>*" Pra que serve isso então, porque é pra dizer pro JPA que minha entidade é a classe Veiculo que é a classe marcada com anotação *@Entity*, e que o tipo do meu id é daquela classe, o *@id*. 

    Entao **Springboot**...marca aquela classe como entidade persistente e cria um mapeamento entre a tabela, os atributos e o objeto criado pelo hibernate. entao ele faz um conexao entre a classe.

```java

package br.eti.mts.garage.repositories;

import br.eti.mts.garage.DTO.VeiculosMinDTO;
import br.eti.mts.garage.entities.Veiculo;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author CompetidorSENAI
 */
public interface VeiculoRepository extends JpaRepository <Veiculo , Long> {
    Veiculo findById(long id);
    
     List<Veiculo>findByCorIgnoreCase(String cor);
     List<Veiculo>findByAno(int ano);
}
```
Agora falando sobre o  *Veiculo findById(long id);*
Ele vai retornar objeto da classe Veiculo que é o id do tipo long. ProcurePorId que fica no service.

 

```java
     Veiculo findById(long id);
    
     List<Veiculo>findByCorIgnoreCase(String cor);
     List<Veiculo>findByAno(int ano);
     
```

