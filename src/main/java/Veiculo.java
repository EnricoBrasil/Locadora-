class Veiculo {
    String placa;
    String descricao;
    String modelo;
    String valorDiaria;

    //Criação do construtor
    Veiculo(String placa, String descricao, String modelo, String valorDiaria){
        this.placa = placa;
        this.descricao = descricao;
        this.modelo = modelo;
        this.valorDiaria = valorDiaria;
    }

    //criação dos metodos
    public String getPlaca(){
        return placa;
    }

}