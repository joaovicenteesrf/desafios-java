package Desafio1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Desafio1 {
    public static void main(String[] args) {


        Produto produto1 = new Produto("Produto1", 110, 2);
        Produto produto2 = new Produto("Produto2", 10, 1);
        Produto produto3 = new Produto("Produto3", 50, 3);
        Produto produto4 = new Produto("Produto4", 200, 1);
        Produto produto5 = new Produto("Produto5", 100, 2);
        Produto produto6 = new Produto("Produto6", 500, 4);

        List<Produto> listaDeProdutos = new ArrayList<>();

        listaDeProdutos.add(produto1);
        listaDeProdutos.add(produto2);
        listaDeProdutos.add(produto3);
        listaDeProdutos.add(produto4);
        listaDeProdutos.add(produto5);
        listaDeProdutos.add(produto6);


        List<Produto> produtosFiltrados = listaDeProdutos.stream().filter(
                b -> {
                    return b.getPreco() >= 100;
                }
        ).collect(Collectors.toList());

        System.out.println("\n------------- Lista de produtos após o filtro -----------------------");

        System.out.println(produtosFiltrados.toString());

        List<String> nomesProdutos = produtosFiltrados.stream()
                .map(b -> b.getNome().toUpperCase())
                .collect(Collectors.toList());

        System.out.println("\n------------ Lista de String com somente nomes dos produtos -------------------");
        System.out.println(nomesProdutos);


        String nomesConcatenados = String.join(", ", nomesProdutos);

        String nomesConcatenadosComStream = nomesProdutos
                .stream()
                .collect(Collectors.joining(", "));

        System.out.println("\n------------------- String única com nomes concatenados ---------------------");
        System.out.println(nomesConcatenados);

        // ###############################################################################

        System.out.println("\nRealizando todas as soluções de uma vez:");

        String tudoDeUmaVez = listaDeProdutos.stream()
                .filter(b -> b.getPreco() >= 100)
                .map(Produto::getNome)
                .map(String::toUpperCase)
                .collect(Collectors.joining(", "));

        System.out.println(tudoDeUmaVez);
    }
}
