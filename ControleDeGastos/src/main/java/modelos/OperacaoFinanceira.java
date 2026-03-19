package modelos;

public abstract class OperacaoFinanceira implements Transacao {
    protected String produto;
    protected int quantidade;
    protected double valorUnitario;

    public OperacaoFinanceira(String produto, int quantidade, double valorUnitario) {
        this.produto = produto;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
    }



    @Override
    public double calcularTotal() {
        return quantidade * valorUnitario;
    }

    // Getters
    public String getProduto() {
        return produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }
}