package br.com.formant.cursojava.atividades.semana02.atividade01.service;
import static br.com.formant.cursojava.atividades.semana02.atividade01.FatorialUtils.geraFatorial;
import java.util.Scanner;

public class FatorialService {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Digite o número desejado para obter o fatorial");
        int fatorial = scan.nextInt();
        System.out.println(fatorial + "! = " + geraFatorial(fatorial));
    }
}
