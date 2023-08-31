import java.util.Date;

public class Imovel {
    private String endereco;
    private Integer quartos;
    private Integer precosPorDiaria;
    private Date datasDisponiveis;
    private Boolean ehPraia;

    public Imovel(String endereco, Integer quartos, Integer precosPorDiaria) {
        this.endereco = endereco;
        this.quartos = quartos;
        this.precosPorDiaria = precosPorDiaria;
        this.ehPraia = ehPraia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public int getQuartos() {
        return quartos;
    }

    public void setQuartos(int quartos) {
        this.quartos = quartos;
    }

    public Integer getPrecosPorDiaria() {
        return precosPorDiaria;
    }

    public void setPrecosPorDiaria(Integer precosPorDiaria) {
        this.precosPorDiaria = precosPorDiaria;
    }

    public boolean getEhPraia() {
        return getEhpraia;
    }

}
