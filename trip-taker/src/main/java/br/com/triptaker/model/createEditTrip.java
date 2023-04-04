package br.com.triptaker.model;

import java.util.Date;

public class createEditTrip {

    private String local;
    private int qtdPessoas;

    private String guiaResponsavel;

    private double valorUnitario;

    private Date dataInicio;

    private Date dataFinal;

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

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFinal() {
        return dataFinal;
    }

    public void setDataFinal(Date dataFinal) {
        this.dataFinal = dataFinal;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
