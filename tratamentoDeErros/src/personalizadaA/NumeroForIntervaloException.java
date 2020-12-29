package personalizadaA;

public class NumeroForIntervaloException extends RuntimeException{

    private String nomeDoAtributo;

    public NumeroForIntervaloException(String nomeDoAtributo) {
        this.nomeDoAtributo = nomeDoAtributo;
    }

    public String getMessage(){
        return String.format("O atributo '%s' está fora do intervalo.", nomeDoAtributo);
    }

}
