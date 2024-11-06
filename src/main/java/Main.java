public class Main {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        Veiculo v = new Veiculo();
        Locacao l = new Locacao();

        c.nome = "enrico";
        c.endereco = "Rua clarival do prado";
        c.cnh = "888888";
        c.telefone = "719922223";
        c.idade = 21;

        v.valorDiaria = "R$500,00";
        v.modelo = "Ford Ka";
        v.placa = "asd1233";
        v.descricao = "Carro velho";

        l.cliente = c;
        l.veiculo = v;

        l.id = 1;
        l.data = "05/11/2024";
        l.diasLocados = "5 dias";

        c.getInfoCliente();
        v.getInfoVeiculo();
        l.getInfoLocacao();

    }
}

