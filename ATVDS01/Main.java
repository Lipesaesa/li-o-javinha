import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();
        Scanner Scanner = new Scanner(System.in);
        int op;
        do {
            System.out.println("1 - Criar um Produto");
            System.out.println("2 - Alterar um Produto");
            System.out.println("3 - Excluir um Produto");
            System.out.println("4 - Listar Todos os Produtos");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opcao: ");
            op = Scanner.nextInt();
            Scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.print("Nome do Produto: ");
                    String nome = Scanner.nextLine();
                    System.out.print("Preço : ");
                    double preco = Scanner.nextDouble();
                    System.out.print("Quantidade: ");
                    int quantidade = Scanner.nextInt();
                    Scanner.nextLine();
                    System.out.print("Categoria : ");
                    String categoria = Scanner.nextLine();
                    System.out.print("Descrição: ");
                    String descricao = Scanner.nextLine();  
                    produtos.add(new Produto(nome, preco, quantidade, categoria, descricao));
                    System.out.println("Produto criado");
                    break;
                case 2:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto foi cadastrado.");
                        break;
                    }
                    for (int i = 0; i < produtos.size(); i++) {
                        Produto p = produtos.get(i);
                        System.out.println((i + 1) + " - " + p.getNome() + " | R$" + p.getPreco() + " | Qtd: " + p.getQuantidade() + " | categoriaa " + p.getCategoria() + " | descreição" + p.getDescricao());
                    }
                    System.out.print("Digite o número do produto para alterar: ");
                    int index = Scanner.nextInt() - 1;
                    Scanner.nextLine();
                    if (index < 0 || index >= produtos.size()) {
                        System.out.println("Produto inválido.");
                        break;
                    }
                    Produto produto = produtos.get(index);
                    System.out.print("Novo nome (" + produto.getNome() + "): ");
                    produto.setNome(Scanner.nextLine());
                    System.out.print("Novo preço (" + produto.getPreco() + "): ");
                    produto.setPreco(Scanner.nextDouble());
                    System.out.print("nova quantidade (" + produto.getQuantidade() + "): ");
                    produto.setQuantidade(Scanner.nextInt());
                    Scanner.nextLine();
                    System.out.print("Nova categoria (" + produto.getCategoria() + "): ");
                    produto.setCategoria(Scanner.nextLine());
                    System.out.print("Nova descrição (" + produto.getDescricao() + "): ");
                    produto.setDescricao(Scanner.nextLine());
                    System.out.println("produto atualizado");
                    break;
                case 3:
                    if (produtos.isEmpty()) {
                        System.out.println("nenhum produto cadastrado.");
                        break;
                    }
                    for (int i = 0; i < produtos.size(); i++) {
                        Produto p = produtos.get(i);
                        System.out.println((i + 1) + " - " + p.getNome() + " | R$" + p.getPreco() + " | Qtd: " + p.getQuantidade() + " | " + p.getCategoria() + " | " + p.getDescricao());
                    }
                    System.out.print("Digite o número do produto para excluir: ");
                    int excluir = Scanner.nextInt() - 1;
                    Scanner.nextLine();
                    if (excluir < 0 || excluir >= produtos.size()) {
                        System.out.println("Produto inválido.");
                        break;
                    }
                    produtos.remove(excluir);
                    System.out.println("Produto excluído com sucesso");
                    break;
                case 4:
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                        break;
                    }
                    for (int i = 0; i < produtos.size(); i++) {
                        Produto p = produtos.get(i);
                        System.out.println((i + 1) + " - " + p.getNome() + " | R$" + p.getPreco() + " | Qtd: " + p.getQuantidade() + " | " + p.getCategoria() + " | " + p.getDescricao());
                    }
                    break;
                case 5:
                    System.out.println("Encerrando");
                    break;
                default:
                    System.out.println("Opção inválida");
            }
        } while (op != 5);
    }
}

class Produto {
    private String nome;
    private String descricao;
    private String categoria;
    private int quantidade;
    private double preco;

    public Produto(String nome, double preco, int quantidade, String categoria, String descricao) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
        this.categoria = categoria;
        this.descricao = descricao;
    }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String descricao) { this.descricao = descricao; }
    public String getCategoria() { return categoria; }
    public void setCategoria(String categoria) { this.categoria = categoria; }
    public int getQuantidade() { return quantidade; }
    public void setQuantidade(int quantidade) { this.quantidade = quantidade; }
    public double getPreco() { return preco; }
    public void setPreco(double preco) { this.preco = preco; }
}
