public class Cliente{

    int idade;
    String cnh;
    String nome;
    String endereco;
    String telefone;

    void getInfoCliente(){
        System.out.println("Nome: " +this.nome);
        System.out.println("Idade: " +this.idade);
        System.out.println("CNH: " +this.cnh);
        System.out.println("Endereço: " +this.endereco);
        System.out.println("Telefone: " +this.telefone);
    };

    public String getNome(){
        return nome;
    }

};