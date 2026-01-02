package set.Pesquisa;
import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
    //atributo
    private Set<Contato> contatosSet;

    public AgendaContatos() {
        this.contatosSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        contatosSet.add(new Contato( numero, nome));
    }

    public void exibirContatos() {
        System.out.println(contatosSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
        for (Contato c : contatosSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPorNome.add(c);
            }
        }
        return contatosPorNome;
    }


    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatosSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }

        }
        return contatoAtualizado;

    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Alice", 12345);
        agenda.adicionarContato("Bob", 67890);
        agenda.adicionarContato("Alicia", 54321);

        System.out.println("Contatos na agenda:");
        agenda.exibirContatos();

        System.out.println("Pesquisar contatos que começam com 'Ali':");
        Set<Contato> resultadosPesquisa = agenda.pesquisarPorNome("Ali");
        System.out.println(resultadosPesquisa);

        System.out.println("Atualizar número de Alice:");
        Contato contatoAtualizado = agenda.atualizarNumeroContato("Alice", 11111);
        System.out.println("Contato atualizado: " + contatoAtualizado);

        System.out.println("Contatos na agenda após atualização:");
        agenda.exibirContatos();


    }
}
