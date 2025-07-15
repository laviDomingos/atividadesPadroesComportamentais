package strategy;

public class Main {
    public static void main(String[] args) {
        Plano planoBasico = new PlanoBasico();
        Plano planoPremium = new PlanoPremium();
        
        Assinatura assinatura = new Assinatura(planoBasico);
        assinatura.mostrarPreco(); // Exibe o preço do plano básico
        
        assinatura.setPlano(planoPremium);
        assinatura.mostrarPreco(); // Exibe o preço do plano premium
    }
}
