import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class calculator extends JFrame {
    // Objetos
    JTextField campoNum1, campoNum2;
    JButton somar, subtrair, multiplicar, dividir, habilitar, desabilitar, ocultar, exibir, sair, limpar;
    JLabel rotuloNum1, rotuloNum2, operacao, funcao, resultado, credito;

    public calculator() {
        // Formatação básica
        super("Calculadora básica");
        Container tela = getContentPane();
        setLayout(null);
        setSize(600, 500);
        setResizable(false);

        // Criando o texto dos JLabel
        rotuloNum1 = new JLabel("Número 1: ");
        rotuloNum2 = new JLabel("Número 2: ");
        operacao = new JLabel("Operações");
        funcao = new JLabel("Funções");
        resultado = new JLabel("Resulado: ");
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
        campoNum1.setBounds(110, 35, 100, 20);
        campoNum2.setBounds(320,35,100,20);
        resultado.setBounds(440, 35, 100,20);


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
        tela.add(resultado);
        tela.add(credito);

        setVisible(true);
    }

    public static void main(String[] args) {
        calculator app = new calculator();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
