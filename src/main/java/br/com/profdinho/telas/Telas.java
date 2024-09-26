package br.com.profdinho.telas;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author dinho
 */
public class Telas {

    public static void main(String[] args) {
        // Cria a janela
        JFrame frame = new JFrame("Exemplo de Interação");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Cria o rótulo e o botão
        JLabel label = new JLabel("Aguardando interação...");
        JButton button = new JButton("Clique aqui");
        
        // Define o layout
        frame.setLayout(null);
        
        // Define as posições dos componentes
        label.setBounds(50, 30, 200, 30);
        button.setBounds(50, 80, 150, 50);
        
        // Adiciona uma ação ao botão
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                label.setText("Botão clicado!");
            }
        });
        
        // Adiciona os componentes à janela
        frame.add(label);
        frame.add(button);
        
        // Torna a janela visível
        frame.setVisible(true);
    }
}
