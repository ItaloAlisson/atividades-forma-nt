package br.com.formant.cursojava.atividades.semana01.atividade05;

public class MatrizIdentidadeUtils {

        public static void geraMatriz (int tamanho){
            int[][] matriz = new int[tamanho][tamanho];
            for (int linhas = 0; linhas < matriz.length; linhas++) {
                for (int colunas = 0; colunas < matriz[linhas].length; colunas++) {
                    matriz[linhas][colunas] = linhas == colunas ? 1 : 0;
                    System.out.print(matriz[linhas][colunas] + " ");
                }
                System.out.println();
            }
        }
    }
