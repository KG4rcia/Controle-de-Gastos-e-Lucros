package servicos;
import modelos.Transacao;
import java.util.ArrayList;


public class GerenciarFinanceiro {
    private ArrayList<Transacao> gerenciador = new ArrayList<>();

    public void adicionarTransacao(Transacao transacao) {
        gerenciador.add(transacao);
        System.out.println("--- ITEM ADICIONADO A LISTA ---");
    }

    public ArrayList<Transacao> getGerenciador() {
        return gerenciador;
    }

}
