package heranca.desafio;

public interface Luxo {
    // Por padrão, todos os métodos dentro de uma Interface são públicos e abstratos (sem corpo)
    // public e abstract estão implícitos

    void ligarAr();
    void desligarAr();

    default int velocidadeDoAr(){ // um método na interface pode ter uma implementação DEFAULT / pode ser considerado como um método opcional
        return 1;                 // sem obrigacao das classes que implementam as interfaces implementarem
    }
}
