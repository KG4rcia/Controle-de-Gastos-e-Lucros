package servicos;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import modelos.Transacao;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class SalvarEmJson {
    public void salvarJson(ArrayList<Transacao> gerenciador) {
        try {
            FileWriter fileWriter = new FileWriter("dados.json");
            Gson gson = new GsonBuilder().setPrettyPrinting().create(); // Assim o JSON fica com quebras de linha e identação, é mais fácil de ler
//            Gson gson = new Gson();
            gson.toJson(gerenciador, fileWriter);

            fileWriter.close();
            System.out.println("--- LISTA SALVA EM JSON ---");
        } catch (IOException e) {
            System.out.println("Ocorreu um erro: " + e.getMessage());
        }
    }

}
