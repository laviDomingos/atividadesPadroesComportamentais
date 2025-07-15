package strategy;

public class PlanoPadrao implements Plano {
    @Override
    public double calcularPreco() {
        double base = 10.00;
        double taxaExtra = 5.0; // Preço base do plano padrão
        return base + taxaExtra; // Preço do plano padrão
    }
}
