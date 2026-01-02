package set.Ordenacao;
import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;
import java.util.Comparator;


public class CadastroProdutos {
    //atributos
    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtoSet.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastro = new CadastroProdutos();
        cadastro.adicionarProduto(1, "Notebook", 3500.00, 10);
        cadastro.adicionarProduto(2, "Smartphone", 1500.00, 20);
        cadastro.adicionarProduto(3, "Tablet", 800.00, 15);

        System.out.println("Produtos ordenados por nome:");
        for (Produto p : cadastro.exibirProdutosPorNome()) {
            System.out.println(p);
        }

        System.out.println("\nProdutos ordenados por preço:");
        for (Produto p : cadastro.exibirProdutosPorPreco()) {
            System.out.println(p);
        }
    }

}
