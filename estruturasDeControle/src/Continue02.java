public class Continue02 {

    public static void main(String[] args) {
        // continue rotulado
        // laços rotulados, dando nome à eles

        externo: for (int i = 0; i < 3; i++){
            interno: for (int j = 0; j < 3; j++){
                if (i == 1){
                    continue externo;
                }
                System.out.printf("[%d %d]", i, j);
            }
            System.out.println();
        }
        System.out.println("Fim");
    }
}
