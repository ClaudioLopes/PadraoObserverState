package padraostateobserver;

import java.util.Observable;

public class Processo extends Observable {
    private ProcessoEstado processo;
    private String nome;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Processo() {
        processo = new ProcessoEstadoEsparando();
    }

    public ProcessoEstado getProcesso() {
        return processo;
    }

    public void setProcesso(ProcessoEstado processo) {
        this.processo = processo;
        setChanged();
        notifyObservers();
    }
    
    public void executar(){
        processo.executando(this);
    }
    
    public void esperar(){
        processo.esperando(this);
    }
    
    public void aprontar(){
        processo.pronto(this);
    }
}
