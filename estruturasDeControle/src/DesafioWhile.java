import java.util.Scanner;

public class DesafioWhile {

    public static void main(String[] args) {
        // Calcular as médias de uma turma
        // Só acrescentar na variável TOTAL se a nota for válida
        // Incrementar NOTA VÁLIDA quando for o caso
        // -1: sai do programa

        Scanner s = new Scanner(System.in);

        double nota = 0;
        double total = 0;
        int notaValida = 0;

        while (nota != -1){
            System.out.print("Digite uma nota válida para cálculo da média (ou -1 para sair): ");
            nota = s.nextDouble();
            if (nota <= 10 && nota >= 0){
                notaValida++;
                total += nota;
            } else if (nota != -1){
                System.out.println("Nota inválida!");
            }
        }
        double media = total / notaValida;
        System.out.println("A média das notas é " + media + ".");

        s.close();
    }
}
