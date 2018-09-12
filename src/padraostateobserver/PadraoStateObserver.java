package padraostateobserver;

public class PadraoStateObserver {

    public static void main(String[] args) {
        Processo processo1 = new Processo();
        Processo processo2 = new Processo();
        
        Escalonador escalonador1 = new Escalonador(processo1);
        Escalonador escalonador2 = new Escalonador(processo1);
        Escalonador escalonador3 = new Escalonador(processo2);
        
        processo1.setNome("Processo 1");
        processo2.setNome("Processo 2");
        
        escalonador1.setId("Memoria");
        escalonador2.setId("IO");
        escalonador3.setId("Disco");
        
        processo1.executar();
        
        processo2.executar();
        processo2.aprontar();
    }
    
}
