package strategy;

public class PlanoBasico implements Plano {
    @Override
    public double calcularPreco() {
        return 10.00; // Preço do plano básico
    }
}
