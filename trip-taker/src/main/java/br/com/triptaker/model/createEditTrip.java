package br.com.triptaker.model;

import java.util.Date;

public class createEditTrip {

    private String local;
    private int qtdPessoas;

    private String guiaResponsavel;

    private double valorUnitario;

    private String dataInicio;

    private String dataFinal;

    private String descricao;


    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }


    public int getQtdPessoas() {
        return qtdPessoas;
    }

    public void setQtdPessoas(int qtdPessoas) {
        this.qtdPessoas = qtdPessoas;
    }

    public String getGuiaResponsavel() {
        return guiaResponsavel;
    }

    public void setGuiaResponsavel(String guiaResponsavel) {
        this.guiaResponsavel = guiaResponsavel;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public String getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(String dataInicio) {
        this.dataInicio = dataInicio;
    }

    public String getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(String dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
