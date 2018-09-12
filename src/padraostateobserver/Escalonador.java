package padraostateobserver;

import java.util.Observable;
import java.util.Observer;

public class Escalonador implements Observer{
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    
    public Escalonador(Observable processo){
        processo.addObserver(this);
    }
    
    @Override
    public void update(Observable processo, Object arg) {
        if(processo instanceof Processo){
            Processo p = (Processo) processo;
            System.out.println("Atenção " + id + " o " + p.getNome() + " mudou para o estado" + p.getProcesso().getStado() );
        } else {
        }
    }
    
}
