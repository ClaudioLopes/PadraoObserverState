package padraostateobserver;

public class ProcessoEstadoEsparando implements ProcessoEstado{
    
    public ProcessoEstadoEsparando() {
    
    }
    
    public String getStado() {
        return "Esperando";
    }

    public void executando(Processo p) {
        p.setProcesso(new ProcessoEstadoExecutando());
    }

    public void pronto(Processo p) {

    }

    public void esperando(Processo p) {
        System.out.println("Processo em espera");
    }
    
}
