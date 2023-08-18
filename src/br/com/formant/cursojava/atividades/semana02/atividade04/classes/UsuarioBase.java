package br.com.formant.cursojava.atividades.semana02.atividade04.classes;

import br.com.formant.cursojava.atividades.semana02.atividade04.interfaces.Usuario;

public class UsuarioBase implements Usuario {

    @Override
    public double getValorDesconto(double valorProduto) {
        if (valorProduto > 300) {
            valorProduto = valorProduto * 0.05;
            return valorProduto;
        }
        valorProduto = 0;
        return valorProduto;
    }

    @Override
    public String getTipoUsuario() {
        String tipoUsuario = "Base";
        return tipoUsuario;
    }

    @Override
    public String getValorFreteDesconto(double valorFrete, double valorProduto) {

        String valorDescontoFrete;
        if (valorProduto > 300) {
            valorDescontoFrete = "5% de desconto no frete, total = " + (valorFrete - (valorFrete * 0.05));
            return valorDescontoFrete;
        }
        valorDescontoFrete = "Não tem desconto no frete";
        return valorDescontoFrete;
    }
}
