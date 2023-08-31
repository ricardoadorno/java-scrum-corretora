public class Plataforma {
    private String nome;
    private String cnpj;
    private Integer taxaDeServico;

    public Plataforma(String nome, String cnpj, Integer taxaDeServico) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.taxaDeServico = taxaDeServico;
    }

    public String getNome() {
        return nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public Integer getTaxaDeServico() {
        return taxaDeServico;
    }

}
