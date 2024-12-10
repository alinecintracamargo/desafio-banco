import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contas;

    public Banco(String nome) {
        this.nome = nome;
        this.contas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Conta> getContas() {
        return contas;
    }

    public void abrirConta(Conta conta) {
        contas.add(conta);
        System.out.println("Conta aberta: " + conta.getnumero());
    }

    public void fecharConta(Conta conta) {
        contas.remove(conta);
        System.out.println("Conta fechada: " + conta.getnumero());
    }

    public void listarContas() {
        System.out.println("=== Lista de Contas ===");
        for (Conta conta : contas) {
            conta.imprimirinfosComuns();
        }
    }

}
