/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.eti.mts.garage.DTO;

import br.eti.mts.garage.entities.Veiculo;

/**
 *
 * @author CompetidorSENAI
 */
public class VeiculosMinDTO {

    private String marca;
    private String modelo;
    private String cor;
    private int ano;
    private long km;
    private String linkImagem;
    private String avarias;
    private String descricaoCompleta;

    public VeiculosMinDTO() {
    }

    public VeiculosMinDTO(Veiculo veiculos) {
        this.marca = veiculos.getMarca();
        this.modelo = veiculos.getModelo();
        this.cor = veiculos.getCor();
        this.ano = veiculos.getAno();
        this.km = veiculos.getKm();
        this.linkImagem = veiculos.getLinkimagem();
        this.avarias = veiculos.getAvarias();
        this.descricaoCompleta = veiculos.getDescricaoCompleta();

    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public long getKm() {
        return km;
    }

    public void setKm(long km) {
        this.km = km;
    }

    public String getLinkImagem() {
        return linkImagem;
    }

    public void setLinkImagem(String linkImagem) {
        this.linkImagem = linkImagem;
    }

    public String getAvarias() {
        return avarias;
    }

    public void setAvarias(String avarias) {
        this.avarias = avarias;
    }

    public String getDescricaoCompleta() {
        return descricaoCompleta;
    }

    public void setDescricaoCompleta(String descricaoCompleta) {
        this.descricaoCompleta = descricaoCompleta;
    }

}
