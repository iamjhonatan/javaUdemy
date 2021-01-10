package swing;

import javax.swing.*;
import java.awt.*;

public class Observador {

    public static void main(String[] args) {

        // Configurações da janela
        JFrame janela = new JFrame("Observador");
        janela.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        janela.setSize(600, 200);
        janela.setLayout(new FlowLayout());
        janela.setLocationRelativeTo(null); // Centralizar na tela do computador.

        // Configurações do botão
        JButton botao = new JButton("Clicar!");
        janela.add(botao);

        botao.addActionListener(e -> {
            System.out.println("Evento ocorreu!");
        });

        janela.setVisible(true);
    }
}
