package padraostateobserver;

public class ProcessoEstadoPronto implements ProcessoEstado{

    public ProcessoEstadoPronto() {
    
    }
    
    public String getStado() {
        return "Pronto";
    }

    public void executando(Processo p) {

    }

    public void pronto(Processo p) {
        System.out.println("Processo está pronto");
    }

    public void esperando(Processo p) {

    }
    
}
