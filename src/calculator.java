import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame {
    // Objetos
    JTextField campoNum1, campoNum2;
    JButton somar, subtrair, multiplicar, dividir, habilitar, desabilitar, ocultar, exibir, sair, limpar;
    JLabel rotuloNum1, rotuloNum2, operacao, funcao, rotuloResultado, resultado, credito;

    public calculator() {
        // Formatação básica
        super("Calculadora básica");
        Container tela = getContentPane();
        setLayout(null);
        setSize(600, 400);
        setResizable(false);


        // Criando o texto dos JLabel
        rotuloNum1 = new JLabel("Número 1: ");
        rotuloNum2 = new JLabel("Número 2: ");
        operacao = new JLabel("Operações");
        funcao = new JLabel("Funções");
        rotuloResultado = new JLabel("Resultado: ");
        resultado = new JLabel(" ");
        rotuloResultado.setForeground(Color.red);
        credito = new JLabel("Desenvolvido por: Gustavo Rodrigues - 2° ADS / AMS / Tarde");

        // Criando os butões
        somar = new JButton("+");
        subtrair = new JButton("-");
        multiplicar = new JButton("*");
        dividir = new JButton("/");
        habilitar = new JButton("Habilitar");
        desabilitar = new JButton("Desabilidar");
        ocultar = new JButton("Ocultar");
        exibir = new JButton("Exibir");
        sair = new JButton("Sair");
        limpar = new JButton("Limpar");

        // Criando os campos dos TextFiled
        campoNum1 = new JTextField(5);
        campoNum2 = new JTextField(5);


        // Posicionando os objetos
        rotuloNum1.setBounds(40, 35, 100, 20);
        rotuloNum2.setBounds(250, 35, 80, 20);
        campoNum1.setBounds(120, 35, 80, 20);
        campoNum2.setBounds(330,35,80,20);
        rotuloResultado.setBounds(430, 35, 120,20);
        resultado.setBounds(500, 35, 120,20);

        operacao.setBounds(40, 100, 100,20);
        somar.setBounds(40, 130, 80,20);
        subtrair.setBounds(120, 130, 80,20);
        multiplicar.setBounds(200,130,80,20);
        dividir.setBounds(280,130,80,20);

        funcao.setBounds(40, 170, 100,20);
        habilitar.setBounds(40,200,100,20);
        desabilitar.setBounds(120,200,120,20);
        exibir.setBounds(220,200,100,20);
        ocultar.setBounds(300,200,100,20);
        limpar.setBounds(380,200,100,20);
        sair.setBounds(460,200,100,20);

        credito.setBounds(70, 300,450,80);


        // Função de somar
        somar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rotuloResultado.getForeground().equals(Color.gray)) {
                    rotuloResultado.setBounds(40, 60, 400,20);
                    rotuloResultado.setText("não vai aparecer o resultado, pois o resultado está desabilitado.");
                }
                else {
                    float num1 = Float.parseFloat(campoNum1.getText());
                    float num2 = Float.parseFloat(campoNum2.getText());

                    float soma = num1 + num2;
                    resultado.setText(String.valueOf(soma));
                }
            }
        });

        // Função de subtrair
        subtrair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rotuloResultado.getForeground().equals(Color.gray)) {
                    rotuloResultado.setBounds(40, 60, 400,20);
                    rotuloResultado.setText("não vai aparecer o resultado, pois o resultado está desabilitado.");
                }
                else {
                    float num1 = Float.parseFloat(campoNum1.getText());
                    float num2 = Float.parseFloat(campoNum2.getText());

                    float sub = num1 - num2;
                    resultado.setText(String.valueOf(sub));
                }
            }
        });

        // Função de multiplicação
        multiplicar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rotuloResultado.getForeground().equals(Color.gray)) {
                    rotuloResultado.setBounds(40, 60, 400,20);
                    rotuloResultado.setText("não vai aparecer o resultado, pois o resultado está desabilitado.");
                }
                else {
                    float num1 = Float.parseFloat(campoNum1.getText());
                    float num2 = Float.parseFloat(campoNum2.getText());

                    float mult = num1 * num2;
                    resultado.setText(String.valueOf(mult));
                }
            }
        });

        // Função de divisão
        dividir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if(rotuloResultado.getForeground().equals(Color.gray)) {
                    rotuloResultado.setBounds(40, 60, 400,20);
                    rotuloResultado.setText("não vai aparecer o resultado, pois o resultado está desabilitado.");
                }
                else {
                    float num1 = Float.parseFloat(campoNum1.getText());
                    float num2 = Float.parseFloat(campoNum2.getText());

                    float div = num1 / num2;
                    resultado.setText(String.valueOf(div));
                }
            }
        });

        // Função de limpar os campos
        limpar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                campoNum1.setText("");
                campoNum2.setText("");
                resultado.setText("");
            }
        });

        // Função de desabitar a Jlabel do resultado
        desabilitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rotuloResultado.setForeground(Color.gray);
                resultado.setText("");
            }
        });

        // Função de habilitar a Jlabel do resultado
        habilitar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rotuloResultado.setBounds(430, 35, 120,20);
                rotuloResultado.setText("Resultado: ");
                rotuloResultado.setForeground(Color.RED);
                resultado.setText("");
            }
        });

        // Função de ocultar a Jlabel do resultado
        ocultar.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rotuloResultado.setVisible(false);
                resultado.setVisible(false);
            }
        });

        // Função de exibir a Jlabel do resultado
        exibir.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                rotuloResultado.setVisible(true);
                resultado.setVisible(true);
            }
        });

        // Função de sair
        sair.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });


        // Atalhos com teclas (alt + letra)
        sair.setMnemonic(KeyEvent.VK_S);
        habilitar.setMnemonic(KeyEvent.VK_H);
        desabilitar.setMnemonic(KeyEvent.VK_D);


        // Adicionando os objetos
        tela.add(campoNum1);
        tela.add(campoNum2);
        tela.add(somar);
        tela.add(subtrair);
        tela.add(multiplicar);
        tela.add(dividir);
        tela.add(habilitar);
        tela.add(desabilitar);
        tela.add(ocultar);
        tela.add(exibir);
        tela.add(sair);
        tela.add(limpar);
        tela.add(rotuloNum1);
        tela.add(rotuloNum2);
        tela.add(operacao);
        tela.add(funcao);
        tela.add(rotuloResultado);
        tela.add(resultado);
        tela.add(credito);

        setVisible(true);
    }

    public static void main(String[] args) {
        calculator app = new calculator();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
