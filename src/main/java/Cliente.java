class Cliente{
    private int idade;
    private String cnh;
    public String nome;
    private String endereco;
    private String telefone;

    //Criação do construtor;

    Cliente(int idade, String cnh, String nome, String endereco, String telefone){
        this.idade = idade;
        this.cnh = cnh;
        this.nome = nome;
        this.endereco = endereco;
        this.telefone = telefone;
    };

    //Criação dos metodos;
    public String getNome(){
        return nome;
    }

};