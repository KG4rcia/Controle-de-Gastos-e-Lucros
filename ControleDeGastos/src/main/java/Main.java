import modelos.*;
import servicos.*;

public class Main {
    public static void main(String[] args) {
        Compra compra = new Compra("Computador", 2,2760);
        Venda venda = new Venda("Mesa", 3, 500);

        GerenciarFinanceiro gerenciarFinanceiro = new GerenciarFinanceiro();
        gerenciarFinanceiro.adicionarTransacao(compra);
        gerenciarFinanceiro.adicionarTransacao(venda);
        SalvarEmJson salvar = new SalvarEmJson();
        salvar.salvarJson(gerenciarFinanceiro.getGerenciador());
    }
}
