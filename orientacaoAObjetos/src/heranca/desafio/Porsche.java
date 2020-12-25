package heranca.desafio;

public class Porsche extends Carro implements Esportivo, Luxo{

    private boolean ligarTurbo = false;
    private boolean ligarAr = false;

    public Porsche(){
        this(200);
    }

    public Porsche(int velocidadeMaxima){
        super(velocidadeMaxima);
        setDelta(15);
    }

    @Override
    public void ligarTurbo() {
        ligarTurbo = true;
    }

    @Override
    public void desligarTurbo() {
        ligarTurbo = false;
    }

    @Override
    public void ligarAr() {
        ligarAr = true;
    }

    @Override
    public void desligarAr() {
        ligarAr = false;
    }

    @Override
    public int getDelta() {
        if(ligarTurbo && !ligarAr){
            return 35;
        } else if(ligarTurbo && ligarAr){
            return 30;
        } else if (!ligarTurbo && !ligarAr){
            return 20;
        } else {
            return 15;
        }
    }

    //public void acelerar() {
        //velAtual += 15;
    //}

}
