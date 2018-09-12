/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraostateobserver;

/**
 *
 * @author claudio
 */
public class ProcessoEstadoExecutando implements ProcessoEstado{

    public ProcessoEstadoExecutando() {
    
    }    
    
    public String getStado() {
        return ("Executando");
    }

    public void executando(Processo p) {
        System.out.println("Processo em execução");
    }

    public void pronto(Processo p) {
        p.setProcesso(new ProcessoEstadoPronto());
    }

    public void esperando(Processo p) {
        p.setProcesso(new ProcessoEstadoEsparando());
    }
    
}
