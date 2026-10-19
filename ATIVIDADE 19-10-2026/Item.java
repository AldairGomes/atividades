class item{
    String nome;
    double preco;
    int quantidade;
    



void adicionar_item(String nome, double preco, int quantidade) { 

    this.nome=nome;
    this.preco=preco;
    this.quantidade=quantidade;

}

void visualizar_estoque(String nome, double preco, int quantidade) {
    System.out.print("Produto: " + this.nome);
    System.out.print("Preço: " + this.preco);
    System.out.print("Quantidade: " + this.quantidade);


}

}

class Menu{
    
}