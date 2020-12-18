package fundamentos;


public class NotacaoPonto {
    public static void main(String[] args) {

        double a = 2.3;
        String s = "Bom dia X";
        s = s.replace("X", "Senhora");
        s = s.toUpperCase();
        s = s.concat("!!!");


        System.out.println(s);

        String x = "Jho".toUpperCase();
        System.out.println(x);

        String y = "Bom dia X"
                .replace("X", "natan")
                .toUpperCase()
                .concat("!!!");
        System.out.println(y);

        // tipos primitivos não tem o operador '.'

        System.out.println("==================");
        System.out.println("Olá pessoa".charAt(2));

        String t = "Boa tarde";
        System.out.println(t.concat("!!"));
        System.out.println(t + "!!");
        System.out.println(t.startsWith("Boa"));
        System.out.println(t.toLowerCase().startsWith("boa"));
        System.out.println(t.toUpperCase().endsWith("TARDE"));
        System.out.println(t.length());
        System.out.println(t.toLowerCase().equals("boa tarde"));
        System.out.println(t.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        System.out.println("Nome: " + nome +
                "\nSobrenome: " + sobrenome +
                "\nIdade: " + idade +
                "\nSalario: " + salario + "\n\n");

        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.",
                nome, sobrenome, idade, salario);

        String frase = String.format("\nO senhor %s %s tem %d anos e ganha R$ %.2f.",
                nome, sobrenome, idade, salario);
        System.out.println(frase);
    }
}
