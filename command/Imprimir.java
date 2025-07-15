package command;

public class Imprimir {
    
    private Documento documento;

    public Imprimir(Documento documento) {
        this.documento = documento;
    }

    public void executar() {
        System.out.println("Imprimindo documento: " + documento.getNome());
    }
}
