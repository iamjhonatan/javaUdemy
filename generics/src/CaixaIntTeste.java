public class CaixaIntTeste {

    public static void main(String[] args) {

        // O tipo não foi passado na classe mãe, foi definido na instanciação do objeto
        CaixaInt caixaA = new CaixaInt();
        caixaA.guardar(123);

        Integer coisaA = caixaA.abrir();
        System.out.println(coisaA);
    }
}
