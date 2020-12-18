package fundamentos;

public class Aritmeticos {
    public static void main(String[] args) {

        //DESAFIO
        /*
        int a = 3 * 4 - 10;
        int b = (int) Math.pow(a, 3);
        System.out.println(b);
        */

        int a = 2;
        int b = 3;
        int c = 5;
        int d = 6;
        int e = 7;
        int f = 10;
        int g = 1;

        // Primeira expressão
        int numA = d * (b + a);
        int superiorA = (int) Math.pow(numA, 2);
        int denA = b * a;
        int resultado1 = superiorA / denA;

        // Segunda expressão
        int numB = (g - c) * (a - e);
        int denB = numB / a;
        int resultado2 = (int) Math.pow(denB, 2);


        int primResult = resultado1 - resultado2;
        int segResult = (int) Math.pow(primResult, 3);

        int inferior = (int) Math.pow(f, 3); // a operação MATH retorna double, o INT é para converter o resultado com CAST.

        int resultado = segResult / inferior;

        System.out.println(resultado);



    }
}
