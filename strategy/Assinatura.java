package strategy;

public class Assinatura {
    private Plano plano;

    public Assinatura(Plano plano) {
        this.plano = plano;
    }

    public void setPlano(Plano plano) {
        this.plano = plano;
    }
    
    public void mostrarPreco() {
        System.out.println("Preço do plano: " + plano.calcularPreco());
    }
}
