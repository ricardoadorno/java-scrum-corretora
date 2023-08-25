import java.util.HashMap;
import java.util.Map;

public class Imovel {
    private String endereco;
    private int quartos;
    private Map<String, Double> precosPorDiaria;
    private Map<String, Boolean> datasDisponiveis;

    public Imovel(String endereco, int quartos) {
        this.endereco = endereco;
        this.quartos = quartos;
        this.precosPorDiaria = new HashMap<>();
        this.datasDisponiveis = new HashMap<>();
    }

    public void registrarDetalhes(String endereco, int quartos) {
        this.endereco = endereco;
        this.quartos = quartos;
    }

    public void definirDisponibilidade(String data, double preco) {
        datasDisponiveis.put(data, true);
        precosPorDiaria.put(data, preco);
    }

    public void bloquearDataAlugada(String data) {
        datasDisponiveis.put(data, false);
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

    public Map<String, Double> getPrecosPorDiaria() {
        return precosPorDiaria;
    }

    public void setPrecosPorDiaria(Map<String, Double> precosPorDiaria) {
        this.precosPorDiaria = precosPorDiaria;
    }

    public Map<String, Boolean> getDatasDisponiveis() {
        return datasDisponiveis;
    }

    public void setDatasDisponiveis(Map<String, Boolean> datasDisponiveis) {
        this.datasDisponiveis = datasDisponiveis;
    }

    public Double calculateRendimentoLiquido() {
        Double rendimentoLiquido = 0.0;
        for (Map.Entry<String, Double> entry : precosPorDiaria.entrySet()) {
            if (entry.getValue() != null) {
                rendimentoLiquido += entry.getValue();
            }
        }
        return rendimentoLiquido;
    }

    public Double calculateRedimentoBruto() {
        Double rendimentoBruto = 0.0;
        for (Map.Entry<String, Double> entry : precosPorDiaria.entrySet()) {
            if (entry.getValue() != null) {
                rendimentoBruto += entry.getValue();
            }
        }
        return rendimentoBruto;
    }
}
