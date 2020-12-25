package heranca.teste;

import heranca.desafio.Pajero;
import heranca.desafio.Porsche;

public class CarroTeste {

    public static void main(String[] args) {
        Porsche por1 = new Porsche(200);
        Pajero paj1 = new Pajero();

        por1.acelerar();
        por1.acelerar();
        por1.acelerar();
        //por1.ligarTurbo();

        paj1.acelerar();
        paj1.acelerar();
        paj1.acelerar();

        System.out.println("Velocidade atual do Porsche é de " + por1.velAtual + "km/h.");
        System.out.println("Velocidade atual da Pajero é de " + paj1.velAtual + "km/h.");

        por1.frear();
        por1.frear();
        por1.frear();
        paj1.frear();
        paj1.frear();
        paj1.frear();
        paj1.frear();

        System.out.println("Velocidade atual do Porsche é de " + por1.velAtual + "km/h.");
        System.out.println("Velocidade atual do Pajero é de " + paj1.velAtual + "km/h.");

    }
}
