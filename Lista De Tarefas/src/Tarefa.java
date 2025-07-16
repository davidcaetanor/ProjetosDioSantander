import java.util.Objects;

public class Tarefa {
    private String tituloTarefa;
    private String descricao;
    private boolean concluida;

    public Tarefa(String tituloTarefa, String descricao) {
        this.tituloTarefa = tituloTarefa;
        this.descricao = descricao;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Tarefa tarefa = (Tarefa) o;
        return Objects.equals(tituloTarefa, tarefa.tituloTarefa) && Objects.equals(descricao, tarefa.descricao);
    }

    @Override
    public int hashCode() {
        return Objects.hash(tituloTarefa, descricao);
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public String getTituloTarefa() {
        return tituloTarefa;
    }

    public void setTituloTarefa(String tituloTarefa) {
        this.tituloTarefa = tituloTarefa;
    }

    @Override
    public String toString() {
        return "Titulo da Tarefa: " + tituloTarefa + "\nDescricao da Tarefa: " + descricao + "\nConcluida: " + concluida + "\n";
    }

}
