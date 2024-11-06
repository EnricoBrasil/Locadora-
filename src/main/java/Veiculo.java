public class Veiculo {
    String placa;
    String descricao;
    String modelo;
    String valorDiaria;

    void getInfoVeiculo(){
        System.out.println("Modelo: " +this.modelo);
        System.out.println("Descricao: " +this.descricao);
        System.out.println("Placa: " +this.placa);
        System.out.println("Valor diaria: " +this.valorDiaria);
    };

    public String getPlaca(){
        return placa;
    }

    public String getValorDiaria(){
        return valorDiaria;
    }
}