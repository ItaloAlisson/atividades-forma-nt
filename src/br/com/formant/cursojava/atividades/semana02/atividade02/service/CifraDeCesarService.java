package br.com.formant.cursojava.atividades.semana02.atividade02.service;
import static br.com.formant.cursojava.atividades.semana02.atividade02.CifraDeCesarUtils.*;
import java.util.Scanner;

public class CifraDeCesarService {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite a frase que deseja criptografar ou descriptografar");
       String frase = scan.nextLine();
        System.out.println("Digite um número chave para criptografar ou descriptografar");
        int chave = scan.nextInt();
        System.out.println("se deseja criptografar digite 1");
        System.out.println("se deseja descriptografar digite 2");
        int opcao = scan.nextInt();
        if (opcao == 1){
            criptografar( frase.replaceAll(" ","").toUpperCase(), chave);
        }
        if (opcao == 2){
            descriptografar(frase.replaceAll(" ","").toUpperCase(), chave);

        }



    }
}
