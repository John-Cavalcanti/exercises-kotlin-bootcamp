// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma: 
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.Scanner;

public class ComprasLivraria {
    //private static final DecimalFormat decimalFormat = new DecimalFormat("0.00");
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Instancia 2 objetos do tipo "Livro" com os dados de entrada.
        Livro livro1 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());
        scanner.nextLine(); 
        Livro livro2 = new Livro(scanner.nextLine(), scanner.nextDouble(), scanner.nextInt());

        double valorTotal, precoLivroUm, precoLivroDois;
        int quantidadeTotalLivros;

        precoLivroUm = livro1.preco * livro1.quantidade;
        precoLivroDois = livro2.preco * livro2.quantidade;
        quantidadeTotalLivros = livro1.quantidade + livro2.quantidade;
        valorTotal = precoLivroDois + precoLivroUm;

        System.out.println("Valor total da compra: " + valorTotal);
        System.out.println("Numero de livros comprados: " + quantidadeTotalLivros);
        System.out.println("Obrigado por comprar na nossa livraria!");

        scanner.close();
    }

    static class Livro {
        String nome;
        double preco;
        int quantidade;

        Livro(String nome, double preco, int quantidade) {
            this.nome = nome;
            this.preco = preco;
            this.quantidade = quantidade;
        }
    }
}
