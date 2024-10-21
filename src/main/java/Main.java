import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Locacao> locacoes = new ArrayList<>();

        Veiculo veiculo1 = new Veiculo("Kwid","abc123","Carro semiNovo","R$500,00");
        Cliente cliente1 = new Cliente("Enrico Brasil",23,"41988022","rua clarival do prado valadares","71993483883");
        Locacao locacao1 = new Locacao(veiculo1,cliente1);

        Veiculo veiculo2 = new Veiculo("hb20","qwe890","Carro usado","R$800,00");
        Cliente cliente2 = new Cliente("Jose carlos",23,"41988022","rua clarival do prado valadares","723423423433");
        Locacao locacao2 = new Locacao(veiculo2,cliente2);

        locacoes.add(locacao1);
        locacoes.add(locacao2);

        for (Locacao locacao : locacoes){
            locacao.exibirInformacoes();
            System.out.println("uma locação adicionada");
        };
    };
};
