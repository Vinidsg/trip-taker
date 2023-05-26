package br.com.triptaker.model;

public class Trip {
    private Integer id;
    private String local;

    private int qtdPessoas;

    private String guiaResponsavel;

    private double valorUnitario;

    private String dataInicio;

    private String dataFinal;

    private String descricao;

    private String image;

    public Trip(){

    }

    public Trip(String local, int qtdPessoas, String guiaResponsavel, double valorUnitario, String dataInicio, String dataFinal, String descricao, String image) {
        this.local = local;
        this.qtdPessoas = qtdPessoas;
        this.guiaResponsavel = guiaResponsavel;
        this.valorUnitario = valorUnitario;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.descricao = descricao;
        this.image = image;

    }

    public Trip(Integer id, String local, int qtdPessoas, String guiaResponsavel, double valorUnitario, String dataInicio, String dataFinal, String descricao, String image) {
        this.id = id;
        this.local = local;
        this.qtdPessoas = qtdPessoas;
        this.guiaResponsavel = guiaResponsavel;
        this.valorUnitario = valorUnitario;
        this.dataInicio = dataInicio;
        this.dataFinal = dataFinal;
        this.descricao = descricao;
        this.image = image;
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


    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }


}