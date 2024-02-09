package br.com.welc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.welc.dao.ProdutoDao;
import br.com.welc.domain.Produto;

public class Main {
    private ProdutoDao produtoDao = new ProdutoDao();

    public static void main(String[] args) {
        Main main = new Main();
        main.cadastrarProdutos();
    }

    public void cadastrarProdutos() {
        Scanner scanner = new Scanner(System.in);
        List<Produto> listaProdutos = new ArrayList<>();

        // Quantidade de produtos a cadastrar
        System.out.print("Quantidade de produtos a cadastrar: ");
        int quantidadeProdutos = scanner.nextInt();
        scanner.nextLine();


        for (int i = 0; i < quantidadeProdutos; i++) {
            Produto prod = new Produto();

            // Solicitar dados do usuário ou definir valores fixos (como no seu exemplo)
            System.out.print("Código do produto: ");
            prod.setCodigo(scanner.nextLine());

            System.out.print("Nome do produto: ");
            prod.setNome(scanner.nextLine());

            System.out.print("Descrição do produto: ");
            prod.setDescricao(scanner.nextLine());

            System.out.print("Data de fabricação do produto Formato(DD/MM/YYYY): ");
            prod.setDataFabricacao(scanner.nextLine());

            // Adicionar o produto à lista
            listaProdutos.add(prod);
        }

        // Loop for para cadastrar os produtos na lista
        for (Produto produto : listaProdutos) {
            produto = produtoDao.cadastrar(produto);
        }

        scanner.close();
    }
}
