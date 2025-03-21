import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Produto {
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

    public Produto(String nome, double preco, int quantidade, String categoria) {
        this(nome, preco, quantidade, categoria, "Não possui descrição");
    }

    public Produto(String nome, double preco) {
        this(nome, preco, 0, "Não possui categoria", "Não possui descrição");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
}