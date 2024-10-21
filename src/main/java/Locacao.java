class Locacao {
    private Veiculo veiculo;
    private Cliente cliente;

    public Locacao(Veiculo veiculo, Cliente cliente){
        this.cliente = cliente;
        this.veiculo = veiculo;
    }

    public void exibirInformacoes(){
        System.out.println("Locação");
        System.out.println("Cliente: " +cliente.getNome() + "\nPlaca do veiculo: " +veiculo.getPlaca() +"\nValor da diaria: " +veiculo.getValorDia());
    }
}