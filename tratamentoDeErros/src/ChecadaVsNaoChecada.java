public class ChecadaVsNaoChecada {

    public static void main(String[] args) {
        // Exceção checada e exceção não-checada

        try{
            geraErro1();
        } catch (RuntimeException e){
            System.out.println(e.getMessage());
        }

        try {
            geraErro2();
        } catch (Throwable e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim (=");
    }

    // Exceção NÃO checada ou NÃO verificada
    static void geraErro1(){
        throw new RuntimeException("Ocorru um erro bem legal! #01");
    }

    // Exceção checada ou verificada
    static void geraErro2() throws Exception{ // exceção verificada eu preciso declarar que nesse método eu lanço uma exceção
            throw new Exception("ocorreu um erro bem legal! #02");
    }
}

