package entidades;

public class Produto {
    private int id;
    private String nome;
    private Double preco;

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public Double getPreco() {
        return preco;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String toString() {
        return "Produto:info [id = " + id + ", nome = " + nome + ", preco R$ = " + preco + "]";
    }
}
