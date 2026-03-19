package modelos;

public class Venda extends OperacaoFinanceira {
    protected String tipo = getTipo();

    public Venda(String produto, int quantidade, double valorUnitario) {
        super(produto, quantidade, valorUnitario);
    }

    @Override
    public String getTipo() {
        return "VENDA";
    }

}
