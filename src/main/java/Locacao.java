public class Locacao {

    int id;
    Cliente cliente;
    Veiculo veiculo;
    String data;
    String diasLocados;

    void getInfoLocacao(){
        System.out.println("/////CADASTRO REALIZADO COM SUCESSO/////");
        System.out.println("Nome: " + cliente.getNome());
        System.out.println("Placa: " + veiculo.getPlaca());
        System.out.println("Valor da diaria: " + veiculo.getValorDiaria());
        System.out.println("Cadastro feito com sucesso!");
    }

}