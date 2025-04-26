import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculadoraGUI {
    public CalculadoraGUI() {
        Calculadora calculadora = new Calculadora();

        // Criação do frame (janela)
        JFrame frame = new JFrame("Exemplo de Aplicação com Botões");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);
        frame.setLayout(new FlowLayout()); // Define o layout como FlowLayout

        // Campos de texto
        JTextField campo1 = new JTextField(5);
        JTextField campo2 = new JTextField(5);

        // Criação de botões
        JButton buttonSomar = new JButton("Somar");
        JButton buttonDividir = new JButton("Dividir");
        
        JLabel labelResultado = new JLabel("Resultado: ");

        // Adicionando eventos para os botões
        buttonSomar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                int num1 = Integer.parseInt(campo1.getText());
                int num2 = Integer.parseInt(campo2.getText());
                int result = calculadora.somar(num1, num2);
                labelResultado.setText("Resultado: " + result);
            }
        });

        buttonDividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num1 = Integer.parseInt(campo1.getText());
                    int num2 = Integer.parseInt(campo2.getText());
                    int result = calculadora.dividir(num1, num2);
                    labelResultado.setText("Resultado: " + result);
                } catch(ArithmeticException ex) {
                    labelResultado.setText("Divisão por zero");
                }
            }
        });

      

        // Adicionando os botões ao frame
        frame.add(new JLabel("Numero 1:"));
        frame.add(campo1);
        frame.add(new JLabel("Numero 2:"));
        frame.add(campo2);
        frame.add(buttonSomar);
        frame.add(buttonDividir);
        frame.add(labelResultado);

        // Torna o frame visível
        frame.setVisible(true);
    }
}
