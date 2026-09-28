//é necessario para receber dados que o usuario digita no teclado
import java.util.Scanner;


//define uma classe publica, todo codigo em Java deve estar dentro de uma classe
public class veiculo{
    String nome; //variavel do tipo texto
    String marca;//variavel do tipo texto
    int ano;//variavel do tipo numeros inteiros
    double velocidade_atual;//variavel do tipo numeros decimais
    
    public static void main(String[] args){
        Scanner ler = new Scanner(System.in);

        veiculo carro1 =  new veiculo();
        System.out.println("---Cadastro 1° carro---");

        System.out.println("Digite o nome do 1° carro: ");
        carro1.nome = ler.nextLine();

        System.out.println("Digite o nome do 1° carro: ");
        carro1.marca = ler.nextLine();

        System.out.println("Digite o nome do 1° carro: ");
        carro1.ano = ler.nextInt();

        System.out.println("Digite o nome do 1° carro: ");
        carro1.velocidade_atual = ler.nextDouble();

        System.out.println();

        veiculo carro2 =  new veiculo();
        System.out.println("---Cadastro 2° carro---");

        System.out.println("Digite o nome do 2° carro: ");
        carro2.nome = ler.nextLine();

        System.out.println("Digite o nome do 2° carro: ");
        carro2.marca = ler.nextLine();

        System.out.println("Digite o nome do 2° carro: ");
        carro2.ano = ler.nextInt();

        System.out.println("Digite o nome do 2° carro: ");
        carro2.velocidade_atual = ler.nextDouble();

        System.out.println("\n----------")
        System.out. println





    }        
};
