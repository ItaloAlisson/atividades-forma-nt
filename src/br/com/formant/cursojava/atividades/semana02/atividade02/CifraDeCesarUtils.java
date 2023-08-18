package br.com.formant.cursojava.atividades.semana02.atividade02;

import java.util.Arrays;
import java.util.List;

public class CifraDeCesarUtils {

    static List<String> alfabeto = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");

    public static  void criptografar(String frase, int chave) {
        for (int posicao = 1; posicao <= frase.length(); posicao++) {
            String retorno = frase.substring(posicao - 1, posicao);
            for (String letra : alfabeto) {
                if (letra.equals(retorno)) {
                    int index = alfabeto.indexOf(letra) + chave;
                    System.out.print(alfabeto.get(index));
                    break;
                }
            }
        }
    }

    public static void descriptografar(String frase, int chave){
        for (int posicao = 1; posicao <= frase.length(); posicao++) {
            String retorno = frase.substring(posicao - 1, posicao);
            for (String letra : alfabeto) {
                if (letra.equals(retorno)) {
                    int index = alfabeto.indexOf(letra) - chave;
                    System.out.print(alfabeto.get(index));
                    break;
                }
            }
        }
    }

 }
