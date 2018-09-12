package padraostateobserver;

public interface ProcessoEstado {
    public String getStado();
    public void executando(Processo p);
    public void pronto(Processo p);
    public void esperando(Processo p);
}
