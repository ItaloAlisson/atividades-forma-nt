package br.com.formant.cursojava.atividades.semana02.atividade04.interfaces;

public interface Usuario {
    double getValorDesconto(double valorProduto);
    String getTipoUsuario();
    String getValorFreteDesconto(double valorValorFrete, double valorProduto);
}
