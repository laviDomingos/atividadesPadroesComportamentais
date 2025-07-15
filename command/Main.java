package command;

public class Main {
    public static void main(String[] args) {
        
        Documento documento = new Documento("Relatório Anual");
        Imprimir imprimir = new Imprimir(documento);
        
        Documento documento2 = new Documento("Plano de Negócios");
        Imprimir imprimir2 = new Imprimir(documento2);
        
        imprimir.executar();
        imprimir2.executar();     
    }
}
