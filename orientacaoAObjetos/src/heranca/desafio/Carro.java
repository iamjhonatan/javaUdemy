package heranca.desafio;

public class Carro {

    public final int VELOCIDADE_MAXIMA;
    public double velAtual = 0;
    private int delta = 5;

    protected Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        if(velAtual + getDelta() > VELOCIDADE_MAXIMA){
            velAtual = VELOCIDADE_MAXIMA;
        } else {
            velAtual += getDelta();
        }
    }

    public void frear(){
        if(velAtual <= 0){
            velAtual = 0;
        } else {
            velAtual -= 5;
        }
    }

    public int getDelta() {
        return delta;
    }

    public void setDelta(int delta) {
        this.delta = delta;
    }

    @Override
    public String toString() {
        return "A velocidade atual é de " + velAtual + "Km/h.";
    }
}
