package com.example.lista_compras;

public class Produto {

    private String nomeProduto;
    private String nomeMarca;
    private int qtd;

    public Produto(String nomeProduto, String nomeMarca, int qtd){
        this.nomeProduto = nomeProduto;
        this.nomeMarca = nomeMarca;
        this.qtd = qtd;
    }

    public String getNomeMarca() {
        return nomeMarca;
    }

    public void setNomeMarca(String nomeMarca) {
        this.nomeMarca = nomeMarca;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    @Override
    public String toString() {
        return nomeProduto + " - " + nomeMarca + " - "  + qtd;
    }
}
