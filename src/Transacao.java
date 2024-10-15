import java.time.LocalDateTime;

public class Transacao {
    private String tipo; // "DEPÓSITO", "SAQUE", "TRANSFERÊNCIA"
    private double valor;
    private LocalDateTime dataHora;
    private double saldoApósTransacao;

    public Transacao(String tipo, double valor, double saldoApósTransacao) {
        this.tipo = tipo;
        this.valor = valor;
        this.dataHora = LocalDateTime.now();
        this.saldoApósTransacao = saldoApósTransacao;
    }

    public String getTipo() {
        return tipo;
    }

    public double getValor() {
        return valor;
    }

    public LocalDateTime getDataHora() {
        return dataHora;
    }

    public double getSaldoApósTransacao() {
        return saldoApósTransacao;
    }

    @Override
    public String toString() {
        return String.format("%s: %.2f (Saldo: %.2f) em %s", tipo, valor, saldoApósTransacao, dataHora);
    }
}
