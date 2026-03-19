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
            // Essa classe é responsável por abrir o arquivo
            FileWriter fileWriter = new FileWriter("dados.json");
            // Essa classe é responsável por
            Gson gson = new GsonBuilder().setPrettyPrinting().create(); // Assim o JSON fica com quebras de linha e identação, é mais fácil de ler
//           Gson gson = new Gson();
            gson.toJson(gerenciador, fileWriter);

            fileWriter.close();
        } catch (IOException e) {
            System.out.println("Ocorreu um erro ao salvar em json: " + e.getMessage());
        }
    }

}
