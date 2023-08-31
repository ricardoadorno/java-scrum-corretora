import java.util.List;

public class Administrador {
    private List<Proprietario> proprietarios;
    private List<Plataforma> plataformas;
    private Integer redimentos = 0;

    public void cadastrarProprietario(String nome, String cpf, String telefone) {
        proprietarios.add(new Proprietario(nome, cpf, telefone));
    }

    public String listarProprietarios() {
        String lista = "";
        for (Proprietario proprietario : proprietarios) {
            lista += "Nome: " + proprietario.getNome() + "\n";
            lista += "CPF: " + proprietario.getCpf() + "\n";
            lista += "Telefone: " + proprietario.getTelefone() + "\n";
        }
        return lista;
    }

    public void banirProprietario(String cpf) {
        for (Proprietario proprietario : proprietarios) {
            if (proprietario.getCpf().equals(cpf)) {
                proprietarios.remove(proprietario);
            }
        }
    }

    public void cadastrarPlataforma(String nome, String cnpj, Integer taxaDeServico) {
        plataformas.add(new Plataforma(nome, cnpj, taxaDeServico));
    }

    public String listarPlataformas() {
        String lista = "";
        for (Plataforma plataforma : plataformas) {
            lista += "Nome: " + plataforma.getNome() + "\n";
            lista += "CNPJ: " + plataforma.getCnpj() + "\n";
            lista += "Taxa de Serviço: " + plataforma.getTaxaDeServico() + "\n";
        }
        return lista;
    }

}
