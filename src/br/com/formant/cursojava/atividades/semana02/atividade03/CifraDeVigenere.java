package br.com.formant.cursojava.atividades.semana02.atividade03;

import java.util.Scanner;
public class CifraDeVigenere {
    private static Scanner scan;
    private static String mensagem;
    private static String chaveMapeada;

    public static void main(String[] args){
        scan = new Scanner(System.in);
        System.out.print("1. Encriptar\n2. Desencriptar\nEscolha(1,2): ");
        int escolha = scan.nextInt();
        scan.nextLine();

        if(escolha == 1){
            System.out.println("---Encriptação---");
            fraseEChave();
            encriptacao(mensagem, chaveMapeada);
        } else if(escolha == 2){
            System.out.println("---Desencriptação--");
            fraseEChave();
            desencriptacao(mensagem, chaveMapeada);

        } else {
            System.out.println("Número inválido");
        }
    }

    private static void desencriptacao(String mensagem, String chaveMapeada) {
        int[][] tabela = criaTabela();
        String textoDesencriptado = "";

        for (int i = 0; i < mensagem.length(); i++) {
            if(mensagem.charAt(i) == (char)32 && chaveMapeada.charAt(i) == (char)32){
                textoDesencriptado += " ";
            } else {
                textoDesencriptado += (char)(65 + contaChaveParaCifra((int)chaveMapeada.charAt(i), (int)mensagem.charAt(i)));
            }
        }

        System.out.println("Texto desencriptado: " + textoDesencriptado);
    }

    private static int contaChaveParaCifra(int chave, int mensagem) {

        int contador = 0;
        String resultado = "";
        for (int i = 0; i < 26; i++) {
            if(chave+i > 90){
                resultado += (char)(chave+(i-26));

            } else {
                resultado += (char)(chave+i);
            }
        }

        for (int i = 0; i < resultado.length(); i++) {
            if(resultado.charAt(i) == mensagem){
                break;
            } else {
                contador++;
            }
        }
        return contador;
    }

    private static void encriptacao(String mensagem, String chaveMapeada) {
        int[][] tabela = criaTabela();
        String textoEncriptado = "";
        for (int i = 0; i < mensagem.length(); i++) {
            if(mensagem.charAt(i) == (char)32 && chaveMapeada.charAt(i) == (char)32){
                textoEncriptado += " ";
            } else {

                textoEncriptado += (char)tabela[(int)mensagem.charAt(i)-65][(int)chaveMapeada.charAt(i)-65];
            }
        }

        System.out.println("Texto encriptado: " + textoEncriptado);
    }

    private static int[][] criaTabela() {

        int[][] tabelaArr = new int[26][26];
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                int elemento;
                if((i+65)+j > 90){
                    elemento = ((i+65)+j) -26;
                    tabelaArr[i][j] = elemento;
                } else {
                    elemento = (i+65)+j;
                    tabelaArr[i][j] = elemento;
                }
            }
        }


        return tabelaArr;
    }

    private static void fraseEChave() {
        System.out.println("*** A frase só pode conter letras ***");


        System.out.print("Digite a frase: ");
        String frase = scan.nextLine();
        frase = frase.toUpperCase();


        System.out.print("Digite a chave: ");
        String chave = scan.next();
        scan.nextLine();
        chave = chave.toUpperCase();

        String mapeadorChave = "";
        for (int i = 0, j = 0; i < frase.length(); i++) {
            if(frase.charAt(i) == (char)32){

                mapeadorChave += (char)32;

            } else {

                if(j < chave.length()){
                    mapeadorChave += chave.charAt(j);
                    j++;
                } else {
                    j = 0;
                    mapeadorChave += chave.charAt(j);
                    j++;

                }
            }

        }
        mensagem = frase;
        chaveMapeada = mapeadorChave;

    }

}

