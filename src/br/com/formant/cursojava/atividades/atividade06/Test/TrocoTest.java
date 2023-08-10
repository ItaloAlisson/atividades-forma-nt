package br.com.formant.cursojava.atividades.atividade06.Test;

import br.com.formant.cursojava.atividades.atividade06.Troco;

import java.util.Scanner;

public class TrocoTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Troco troco= new Troco();
        System.out.println("Digite o custo do produto:");
        double custo= scan.nextDouble();
        System.out.println("Digite o total pago:");
        double pagamento= scan.nextDouble();
        troco.menorTroco(custo,pagamento);

    }
}
