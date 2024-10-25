import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Locacao> locacoes = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        System.out.println("[1] Cadastrar usuario");
        System.out.println("[2] Listar usuarios");
        System.out.println("[3] Remover usuario");
        System.out.println("[4] Sair");
        System.out.println("Digite a opção: ");
        String opcao = scanner.nextLine();

        switch (opcao){
            case "1":
                System.out.println("CADASTRO DE USUARIO");
                System.out.println("digite o nome do usuario:");
                String nome = scanner.nextLine();
                System.out.println("digite a idade:");
                int idade = scanner.nextInt();
                System.out.println("digite a cnh do usuario:");
                String cnh = scanner.nextLine();
                System.out.println("digite o endereco:");
                String endereco = scanner.nextLine();
                System.out.println("digite o telefone:");
                String telefone = scanner.nextLine();
                Cliente c =  new Cliente(nome,idade,cnh,endereco,telefone);

                locacoes.add( );
                break;

            case "2":

                break;

            case "3":
                break;

            case "4":
                break;

            default:
                System.out.println("Opção não reconhecida tente novamente");
        }

//        Veiculo veiculo1 = new Veiculo("Kwid","abc123","Carro semiNovo","R$500,00");
//        Cliente cliente1 = new Cliente("Enrico Brasil",23,"41988022","rua clarival do prado valadares","71993483883");
//        Locacao locacao1 = new Locacao(veiculo1,cliente1);
//
//        Veiculo veiculo2 = new Veiculo("hb20","qwe890","Carro usado","R$800,00");
//        Cliente cliente2 = new Cliente("Jose carlos",23,"41988022","rua clarival do prado valadares","723423423433");
//        Locacao locacao2 = new Locacao(veiculo2,cliente2);

//        locacoes.add(locacao1);
//        locacoes.add(locacao2);
//
//        for (Locacao locacao : locacoes){
//            locacao.exibirInformacoes();
//            System.out.println("uma locação adicionada");
//        };
    };
};
