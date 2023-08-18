package br.com.formant.cursojava.atividades.semana01.atividade04.classes;

public class Motorista extends Funcionario {

    private String cnh;
    private String placaCarro;

    public void imprime(){
        System.out.println("Nome do funcionário: " + super.getNome());
        System.out.println("Cargo: " + super.getCargo());
        System.out.println("Placa do carro: " + this.placaCarro);
    }

    public String getCnh() {
        return cnh;
    }

    public void setCnh(String cnh) {
        this.cnh = cnh;
    }

    public String getPlacaCarro() {
        return placaCarro;
    }

    public void setPlacaCarro(String placaCarro) {
        this.placaCarro = placaCarro;
    }
}
