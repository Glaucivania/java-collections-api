package list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    //atributo
    private List<Livro> livroList;

    public CatalogoLivros() {
        this.livroList = new ArrayList<>();
    }

    //métodos
    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicio, int anoFim) {
        List<Livro> livrosNoIntervalo = new ArrayList<>();
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicio && l.getAnoPublicacao() <= anoFim) {
                    livrosNoIntervalo.add(l);
                }
            }
        }
        return livrosNoIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogoLivros = new CatalogoLivros();

        catalogoLivros.adicionarLivro("1984", "George Orwell", 1949);
        catalogoLivros.adicionarLivro("To Kill a Mockingbird", "Harper Lee", 1960);
        catalogoLivros.adicionarLivro("Brave New World", "Aldous Huxley", 1932);

        // Testando as pesquisas
        System.out.println("Livros por autor (George Orwell): " + catalogoLivros.pesquisarPorAutor("George Orwell"));
        System.out.println("Livros entre 1930-1950: " + catalogoLivros.pesquisarPorIntervaloAnos(1930, 1950));
        System.out.println("Pesquisar por título (1984): " + catalogoLivros.pesquisarPorTitulo("1984"));
    }
}