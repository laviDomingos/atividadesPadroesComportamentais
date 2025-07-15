package strategy;

public class PlanoFactory {
      public static Plano criarPlano(PlanoTipo tipo) {
        switch (tipo) {
            case BASICO:
                return new PlanoBasico();
            case PADRAO:
                return new PlanoPadrao();
            case PREMIUM:
                return new PlanoPremium();
            default:
                throw new IllegalArgumentException("Tipo de plano inválido");
        }
    }
}
