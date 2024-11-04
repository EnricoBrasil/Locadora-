import java.util.ArrayList;
import java.util.List;

class Locacao {
    private List<Locacao> lLocacao;

    int id;
    Cliente cliente;
    Veiculo veiculo;
    String data;
    String diasLocados;

    Locacao(int id, Cliente cliente, Veiculo veiculo, String data, String diasLocados){
        this.id = id;
        this.cliente = cliente;
        this.veiculo = veiculo;
        this.data = data;
        this.diasLocados = diasLocados;
        this.lLocacao = new ArrayList<>();
    }


    }

    public Cliente getCliente(){
        return cliente;
    }

    public Veiculo getVeiculo(){
        return veiculo;
    }

}