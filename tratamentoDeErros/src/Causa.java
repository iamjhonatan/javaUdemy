public class Causa {

    public static void main(String[] args) {
        // A exceção que foi gerada não é exatamente a causadora
        // Uma exceção pode ser a causadora de outra

        try {
            metodoA(null);
        } catch (IllegalArgumentException e){
            if(e.getCause() != null) {
                System.out.println(e.getCause().getMessage());
            }
        }
    }

    static void metodoA(Aluno aluno){
        try{
            metodoB(aluno);
        }catch(Exception causa){
            throw new IllegalArgumentException(causa);
        }
    }

    static void metodoB(Aluno aluno){
        if (aluno == null){
            throw new NullPointerException("Aluno está NULO!");
        }

        System.out.println(aluno.nome);
    }
}
