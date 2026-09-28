import java.util.Scanner;


public class Aluno {
    String nome;
    int idade;
    double nota;

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        Aluno aluno1 =  new Aluno();
        System.out.println("---Cadastro 1° Aluno---");

        System.out.println("Digite o nome do 1° aluno: ");
        aluno1.nome = ler.nextLine();

        System.out.println("Digite a idade do 1° aluno: ");
        aluno1.idade = ler.nextInt();
        
        System.out.println("Digite a nota do 1° aluno: ");
        aluno1.nota = ler.nextInt();

        ler.nextLine();

        System.out.println();

        Aluno aluno2 = new Aluno();
        System.out.println("---Cadastro 2° Aluno---");

        System.out.println("Digite o nome do 2° aluno: ");
        aluno2.nome = ler.nextLine();

        System.out.println("Digite a idade do 2° aluno: ");
        aluno2.idade = ler.nextInt();
        
        System.out.println("Digite a nota do 2° aluno: ");
        aluno2.nota = ler.nextInt();

        System.out.println("\n=============");
        System.out.println("  Dados dos Alunos: ");
        System.out.println("1° aluno: " + aluno1.nome + " | idade:" + aluno1.idade + "| nota: " + aluno1.nota );
        System.out.println("2° aluno: " + aluno2.nome + " | idade:" + aluno2.idade + "| nota: " + aluno2.nota );

        ler.close();
    }
}

   