import java.util.ArrayList;
import java.util.List;

public class Proprietario {
    private String nome;
    private String cpf;
    private String telefone;
    private List<Imovel> imoveis;
    private String contrato;
    private Double rendimentoLiquido;

    public Proprietario(String nome, String cpf, String telefone) {
        this.nome = nome;
        this.cpf = cpf;
        this.telefone = telefone;
        this.imoveis = new ArrayList<>();
        this.contrato = "Contrato por Mensalidade";
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public List<Imovel> getImoveis() {
        return imoveis;
    }

    public void cadastrarImovel(String endereco, Integer quartos, Integer precosPorDiaria) {
        imoveis.add(new Imovel(endereco, quartos, precosPorDiaria));
    }

    public void getDadosDeImoveis() {
        for (Imovel imovel : imoveis) {
            System.out.println("Endereço: " + imovel.getEndereco());
            System.out.println("Quartos: " + imovel.getQuartos());
            System.out.println("Preço por Diária: " + imovel.getPrecosPorDiaria());
        }
    }

    public void mudarDeContrato() {
        if (contrato.equals("Contrato por Mensalidade")) {
            contrato = "Contrato por Diária";
        } else {
            contrato = "Contrato por Mensalidade";
        }
    }

    public void editarImovel(String endereco, Integer quartos, Integer precosPorDiaria) {
        for (Imovel imovel : imoveis) {
            if (imovel.getEndereco().equals(endereco)) {
                imovel.setEndereco(endereco);
                imovel.setQuartos(quartos);
                imovel.setPrecosPorDiaria(precosPorDiaria);
            }
        }
    }

    public void excluirConta() {
        nome = null;
        cpf = null;
        telefone = null;
        imoveis = null;
        contrato = null;
    }

}
