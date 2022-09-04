package com.teste.primeiroexemplo.model;

import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Produto {
    
    //#region Atributos
    private Integer id;

    private String nome;

    private Integer quantidadeEstoque;

    private Double valorDeCusto;

    private Double valorDeVenda;

    private Float percentualDeLucro;
    
    private String observacao;

    private Date dataDeCadastro;
    //#endregion Atributos

    //#region getters a setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    public void setQuantidadeEstoque(Integer quantidadeEstoque) {
        this.quantidadeEstoque = quantidadeEstoque;
    }

    public Double getValorDeCusto() {
        return valorDeCusto;
    }

    public void setValorDeCusto(Double valorDeCusto) {
        this.valorDeCusto = valorDeCusto;
    }

    public Double getValorDeVenda() {
        return valorDeVenda;
    }

    public void setValorDeVenda(Double valorDeVenda) {
        this.valorDeVenda = valorDeVenda;
    }

    public Float getpercentualDeLucro() {
        return percentualDeLucro;
    }

    public void setpercentualDeLucro(Float percentualDeLucro) {
        percentualDeLucro = percentualDeLucro;
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        this.observacao = observacao;
    }

    public String getdataDeCadastro() {
        return new SimpleDateFormat("dd/MM/yyy").format(Calendar.getInstance().getTime());
    }

    public void setdataDeCadastro(Date dataDeCadastro) {
        this.dataDeCadastro = dataDeCadastro;
    }
 
    //#endregion
}
