class Cliente{
    private String nome;
    int idade;
    String cnh;
    String endereco;
    String telefone;

    public Cliente(String nome, int idade, String cnh, String endereco, String telefone) {
        this.nome = nome;
        this.telefone = telefone;
        this.idade = idade;
        this.cnh = cnh;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }
}