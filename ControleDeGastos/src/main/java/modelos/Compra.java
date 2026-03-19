package modelos;

public class Compra extends OperacaoFinanceira {
    protected String tipo = getTipo();

    public Compra(String produto, int quantidade, double valorUnitario) {
        super(produto, quantidade, valorUnitario);
    }

    @Override
    public String getTipo() {
        return "COMPRA";
    }

}
