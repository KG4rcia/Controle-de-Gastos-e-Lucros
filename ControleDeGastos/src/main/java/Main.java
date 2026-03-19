import modelos.*;
import servicos.*;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GerenciarFinanceiro gerenciarFinanceiro = new GerenciarFinanceiro();
        SalvarEmJson salvar = new SalvarEmJson();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            salvar.salvarJson(gerenciarFinanceiro.getGerenciador());
            int escolhaMenu = menu(scanner);

            switch (escolhaMenu) {
                case 1:
                    registrarCompra(scanner, gerenciarFinanceiro);
                    break;
                case 2:
                    registrarVenda(scanner, gerenciarFinanceiro);
                    break;
                case 3:
                    gerarGrafico(gerenciarFinanceiro);
                    break;
                case 4:
                    System.out.println("--- Finalizando...");
                    salvar.salvarJson(gerenciarFinanceiro.getGerenciador());
                    System.out.println("---------------------------");
                    return;
            }

        }


    }

    public static int menu(Scanner scanner) {
        System.out.println("---------------------------");
        System.out.println("BEM VINDO AO CONTROLE DE GASTOS");
        System.out.println("1. Registrar Compra");
        System.out.println("2. Registrar Venda");
        System.out.println("3. Gerar Gráfico");
        System.out.println("4. Encerrar");
        System.out.println();
        System.out.print("-> Sua escolha: ");
        int escolhaMenu = scanner.nextInt();
        scanner.nextLine();

        return escolhaMenu;
    }

    public static void registrarCompra(Scanner scanner, GerenciarFinanceiro gerenciarFinanceiro) {
        System.out.println("---------------------------");
        try {
            System.out.print("Infome o nome do produto: ");
            String nomeProduto = scanner.nextLine();

            System.out.print("\nInfome a quantidade: ");
            int quantidadeProduto = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Infome o valor unitário: ");
            double valorProduto = scanner.nextDouble();
            scanner.nextLine();

            Compra compra = new Compra(nomeProduto, quantidadeProduto,valorProduto);
            gerenciarFinanceiro.adicionarTransacao(compra);
            System.out.println("--- REGISTRO DE COMPRA REALIZADO COM SUCESSO ---");
        } catch (InputMismatchException e) {
            System.out.println("Por favor, preencha os campos corretamente!");
            scanner.nextLine();
            return;
        }
    }

    public static void registrarVenda(Scanner scanner, GerenciarFinanceiro gerenciarFinanceiro) {
        System.out.println("---------------------------");
        try {
            System.out.print("Infome o produto: ");
            String nomeProduto = scanner.nextLine();

            System.out.print("\nInfome a quantidade: ");
            int quantidadeProduto = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Infome o valor unitário: ");
            double valorProduto = scanner.nextDouble();
            scanner.nextLine();

            Venda venda = new Venda(nomeProduto, quantidadeProduto,valorProduto);
            gerenciarFinanceiro.adicionarTransacao(venda);
            System.out.println("--- REGISTRO DE VENDA REALIZADO COM SUCESSO ---");
        } catch (InputMismatchException e) {
            System.out.println("Por favor, preencha os campos corretamente.");
            scanner.nextLine();
            return;
        }
    }

    public static void gerarGrafico(GerenciarFinanceiro gerenciarFinanceiro) {
        if (gerenciarFinanceiro.getGerenciador().isEmpty()) {
            System.out.println("---------------------------");
            System.out.println("--- Não há produto vendido ou comprado.");
            return;
        }

        try {
            ProcessBuilder pb = new ProcessBuilder("python", "grafico.py");
            pb.inheritIO(); // Exibir algum erro do python se quebrar
            Process processo = pb.start();
            processo.waitFor();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

}
