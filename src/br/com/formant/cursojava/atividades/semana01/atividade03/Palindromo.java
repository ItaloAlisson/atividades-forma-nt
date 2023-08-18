package br.com.formant.cursojava.atividades.semana01.atividade03;

import javax.swing.*;

public class Palindromo {

    public static void main(String[] args) {
        String frase = JOptionPane.showInputDialog("Digite a frase que deseja verificar se é um palindromo ");
        //Reverte a String frase.
        StringBuilder frasereverso = new StringBuilder(frase).reverse();
        //Verifica se a  variavel frasereverso equivale a frase,ignorando letras maiusculas e espaços;
        boolean ehPalindromo= frase.replaceAll(" ", "")
                .equalsIgnoreCase(
                        frasereverso.toString().replaceAll(" ","")
                ) ? Boolean.TRUE : Boolean.FALSE;
        JOptionPane.showMessageDialog(null,"É palindromo: " + ehPalindromo);
    }
}
