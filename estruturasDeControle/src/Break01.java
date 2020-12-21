public class Break01 {

    public static void main(String[] args) {
        // no momento que o 'break' for chamado, ele sai do fluxo natural para o próximo bloco

        for (int i = 0; i < 10; i++){
            if (i == 5){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Fim!");
    }
}
