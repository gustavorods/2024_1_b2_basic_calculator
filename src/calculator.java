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

    }
}
