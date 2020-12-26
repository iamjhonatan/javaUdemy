@FunctionalInterface // Uma INTERFACE FUNCIONAL possui apenas um método abstrato

public interface Calculo {
    // public abstract estão implícitas
    // funções lambdas só são possíveis a partir de Interfaces Funcionais

    double executar(double a, double b);

    default String legal(){ // um método default não inviabiliza uma interface de ser funcional
        return "Legal";
    }

    static String muitoLegal(){ // um método estático também não inviabiliza uma interface de ser funcional
        return "Muito legal";
    }
}
