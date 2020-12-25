package heranca;

public class Heroi extends Jogador{

    public Heroi(int x, int y){
        super(x, y);
    }

    public boolean atacar(Jogador oponente){ // sobreescrevendo com o método do pai (super)
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        boolean ataque3 = super.atacar(oponente);
        return ataque1 || ataque2 || ataque3;
    }
}
