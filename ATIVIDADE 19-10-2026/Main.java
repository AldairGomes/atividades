import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        item produto = new item();
        

        System.out.println("Qual o nome do item?: ");
        produto.nome = scanner.nextLine();

        System.out.println("Qual o valor do item?: ");
        produto.preco = scanner.nextDouble();
        
        System.out.println("Qual a quantidade a ser adicionada?: ");
        produto.quantidade = scanner.nextInt();

       

        produto.adicionar_item(produto.nome, produto.preco, produto.quantidade);

        System.out.println("item adicionado com Sucesso! ");


    }
}
