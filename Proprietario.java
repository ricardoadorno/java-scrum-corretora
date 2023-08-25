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

    //

    public void addImovel(Imovel imovel) {
        imoveis.add(imovel);
    }

    public void getDadosDeImoveis() {
        for (Imovel imovel : imoveis) {
            System.out.println("Endereço: " + imovel.getEndereco());
            System.out.println("Quartos: " + imovel.getQuartos());
            System.out.println("Preço por Diária: " + imovel.getPrecosPorDiaria());
            System.out.println("Datas Disponíveis: " + imovel.getDatasDisponiveis());
        }
    }

    public void toggleContrato() {
        if (contrato.equals("Contrato por Mensalidade")) {
            contrato = "Contrato por Diária";
        } else {
            contrato = "Contrato por Mensalidade";
        }
    }

    public void createBoleto() {
        if (contrato.equals("Contrato por Mensalidade")) {
            System.out.println("Valor do Boleto: " + rendimentoLiquido * 0.02);

        } else {
            System.out.println("Valor do Boleto: " + rendimentoLiquido * 0.01);
        }
    }

    public void getRendimentos() {
        Double rendimentos = 0.0;
        for (Imovel imovel : imoveis) {
            System.out.println("Proprietário: " + nome);
            System.out.println("Rendimento Líquido Total: " + imovel.calculateRendimentoLiquido());
            System.out.println("Rendimento Bruto Total: " + imovel.calculateRedimentoBruto());
            rendimentos += imovel.calculateRendimentoLiquido();
        }
        System.out.println("Rendimento Total: " + rendimentos);
    }
}
