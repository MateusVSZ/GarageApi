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

    // Atributos básicos (Exigidos pela tela inicial) 
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
