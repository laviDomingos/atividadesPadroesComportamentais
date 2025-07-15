package strategy;

public class PlanoPremium implements Plano {
    @Override
    public double calcularPreco() {
        double precoBase = 25.00; // Preço base do plano premium
        double desconto = 0.1; // Taxa extra para o plano premium
        return precoBase * (1 - desconto); // Preço total do plano premium
    }
}
