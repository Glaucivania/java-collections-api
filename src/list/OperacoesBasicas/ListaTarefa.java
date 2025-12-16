package list.OperacoesBasicas;
import java.util.List;
import list.OperacoesBasicas.Tarefa;
import java.util.ArrayList;




public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    //métodos
    public void adicionarTarefa(String descricao) {
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa lista = new ListaTarefa();
        System.out.println("O número total de tarefas é: " + lista.obterNumeroTotalTarefas());

        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 1");
        lista.adicionarTarefa("Tarefa 2");
        System.out.println("O número total de tarefas é: " + lista.obterNumeroTotalTarefas());

        lista.removerTarefa("Tarefa 1");
        System.out.println("O número total de tarefas é: " + lista.obterNumeroTotalTarefas());

        lista.obterDescricoesTarefas();

    }

}
















