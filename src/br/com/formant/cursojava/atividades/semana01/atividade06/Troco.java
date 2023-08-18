package br.com.formant.cursojava.atividades.semana01.atividade06;

public class Troco {

    private int nota100 = 0;
    private int nota50 = 0;
    private int nota20 = 0;
    private int nota10 = 0;
    private int nota5 = 0;
    private int nota2 = 0;
    private int moeda1 = 0;
    private int moeda50 = 0;
    private int moeda25 = 0;
    private int moeda10 = 0;
    private int moeda5 = 0;
    private double troco;

    public void menorTroco(double custo, double pagamento) {
        double troco = pagamento - custo;
        if (pagamento <= custo) {
            System.out.println("Não há troco");
            return;
        }
        this.troco = troco;
        System.out.print("Valor do troco: ");
        System.out.printf("%.2f", troco);
        System.out.println();

        calcularTroco();

        System.out.println(nota100 + " Nota(s) de 100");
        System.out.println(nota50 + " Nota(s) de 50");
        System.out.println(nota20 + " Nota(s) de 20");
        System.out.println(nota10 + " Nota(s) de 10");
        System.out.println(nota5 + " Nota(s) de 5");
        System.out.println(nota2 + " Nota(s) de 2");
        System.out.println(moeda1 + " moeda(s) de 1");
        System.out.println(moeda50 + " moeda(s) de 0,50");
        System.out.println(moeda25 + " moeda(s) de 0,25");
        System.out.println(moeda10 + " moeda(s) de 0,10");
        System.out.println(moeda5 + " moeda(s) de 0,05");

    }

    private void calcularTroco() {
        if (this.troco >= 100) {
            calcularNotas100();
        }
        if (this.troco < 100 && this.troco >= 50) {
            calcularNotas50();
        }
        if (this.troco < 50 && this.troco >= 20) {
            calcularNotas20();
        }
        if (this.troco < 20 && this.troco >= 10) {
            calcularNotas10();
        }
        if (this.troco < 10 && this.troco >= 5) {
            calcularNotas5();
        }
        if (this.troco < 5 && this.troco >= 2) {
            calcularNotas2();
        }
        if (this.troco < 2 && this.troco >= 1) {
            calcularMoedas1();
        }
        if (this.troco < 1 && this.troco >= 0.50) {
            calcularMoedas50();
        }
        if (this.troco < 0.50 && this.troco >= 0.25) {
            calcularMoedas25();
        }
        if (this.troco < 0.25 && this.troco >= 0.10) {
            calcularMoedas10();
        }
        if (this.troco < 0.10 && this.troco >= 0.05) {
            calcularMoedas5();
        }
    }

    private void calcularNotas100() {
        while (this.troco >= 100) {
            nota100 += 1;
            this.troco -= 100;
        }
    }

    private void calcularNotas50() {
        while (this.troco < 100 && this.troco >= 50) {
            this.troco -= 50;
            nota50 += 1;
        }
    }

    private void calcularNotas20() {
        while (this.troco < 50 && this.troco >= 20) {
            this.troco -= 20;
            nota20 += 1;
        }
    }

    private void calcularNotas10() {
        while (this.troco < 20 && this.troco >= 10) {
            this.troco -= 10;
            nota10 += 1;
        }
    }

    private void calcularNotas5() {
        while (this.troco < 10 && this.troco >= 5) {
            this.troco -= 5;
            nota5 += 1;
        }
    }

    private void calcularNotas2() {
        while (this.troco < 5 && this.troco >= 2) {
            this.troco -= 2;
            nota2 += 1;
        }
    }

    private void calcularMoedas1() {
        while (this.troco < 2 && this.troco >= 1) {
            this.troco -= 1;
            moeda1 += 1;
        }
    }

    private void calcularMoedas50() {
        while (this.troco < 1 && this.troco >= 0.50) {
            this.troco -= 0.50;
            moeda50 += 1;
        }
    }

    private void calcularMoedas25() {
        while (this.troco < 0.50 && this.troco >= 0.25) {
            this.troco -= 0.25;
            moeda25 += 1;
        }
    }

    private void calcularMoedas10() {
        while (this.troco < 0.25 && this.troco >= 0.10) {
            this.troco -= 0.10;
            moeda10 += 1;
        }
    }

    private void calcularMoedas5() {
        while (this.troco < 0.10 && this.troco >= 0.05) {
            this.troco -= 0.05;
            moeda5 += 1;
        }
    }
}
