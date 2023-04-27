package br.com.triptaker.model;

public class Trip {
    private String id;
    private String local;

    private int qtdPessoas;

    private String guiaResponsavel;

    private double valorUnitario;

    private String dataInicio;

    private String dataFinal;

    private String descricao;






    public Trip(String local, int qtdPessoas, String guiaResponsavel, double valorUnitario, String dataInicio, String dataFinal, String descricao) {

        this.local = local;
        this.qtdPessoas = qtdPessoas;
        this.guiaResponsavel = guiaResponsavel;
        this.valorUnitario = valorUnitario;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.descricao = descricao;
    }

    public Trip(String id, String local, int qtdPessoas, String guiaResponsavel, double valorUnitario, String dataInicio, String dataFinal, String descricao) {
        this.id = id;
        this.local = local;
        this.qtdPessoas = qtdPessoas;
        this.guiaResponsavel = guiaResponsavel;
        this.valorUnitario = valorUnitario;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.descricao = descricao;
    }




    public String getLocal() {
        return local;
    }



    public int getQtdPessoas() {
        return qtdPessoas;
    }



    public String getGuiaResponsavel() {
        return guiaResponsavel;
    }



    public double getValorUnitario() {
        return valorUnitario;
    }



    public String getDataInicio() {
        return dataInicio;
    }



    public String getDataFinal() {
        return dataFinal;
    }



    public String getDescricao() {
        return descricao;
    }


    public String getId() {
        return id;
    }


}
