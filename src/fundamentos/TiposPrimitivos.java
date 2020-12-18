package fundamentos;

public class TiposPrimitivos {
    /*

    * 1byte = 8bits (0 ou 1)

    byte = -128 até +127
    short = aprox. 32.767
    int = aprox. 2 bilhões
    long > int

    float = 4bytes
    double = 8bytes

    char = caractere (uma letra)/ delimitado por aspas simples ''
    boolean = false/true

     */

    public static void main(String[] args) {
        // informações do funcionário
        // tipos numéricos inteiros

        byte anosDeEmpresa = 23;
        short numeroDeVoos = 542;
        int id = 56789;
        long pontosAcumulados = 3_134_845_223L; //literal long

        // tipos numéricos reais
        float salario = 11_445.44F; //literal float
        double vendasAcumuladas = 2_991_797_103.01;

        // tipo booleano
        boolean estaDeFerias = false; //true

        // tipo caractere
        char status = 'A'; //ativo

        // Dias de empresa
        System.out.println(anosDeEmpresa * 365);

        // Número de viagens
        System.out.println(numeroDeVoos / 2);

        // Pontos por real
        System.out.println(pontosAcumulados / vendasAcumuladas);

        System.out.println(id + ": ganha -> " + salario);
        System.out.println("Férias? " + estaDeFerias);
        System.out.println("Status: " + status);


    }
}
