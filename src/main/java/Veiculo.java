class Veiculo {
    private String placa;
    String modelo;
    String descricao;
    private String valor_diaria;

    public Veiculo(String modelo, String placa, String descricao, String valor_diaria){
        this.placa = placa;
        this.modelo = modelo;
        this.descricao = descricao;
        this.valor_diaria = valor_diaria;
    }

    public String getPlaca() {
        return placa;
    }
    public String getValorDia() {
        return valor_diaria;
    }
}