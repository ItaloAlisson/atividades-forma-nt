package br.com.formant.cursojava.atividades.semana02.atividade04.test;

import br.com.formant.cursojava.atividades.semana02.atividade04.classes.UsuarioBase;
import br.com.formant.cursojava.atividades.semana02.atividade04.classes.UsuarioPremium;
import br.com.formant.cursojava.atividades.semana02.atividade04.classes.UsuarioStandart;

public class Menu {

    public static void main(String[] args) {
        int valorProduto = 2000;
        int valorFrete = 80;

        UsuarioBase usuarioBase = new UsuarioBase();
        System.out.println("Usuario Tipo : " + usuarioBase.getTipoUsuario());
        System.out.println("Recebeu " + usuarioBase.getValorDesconto(valorProduto) + "R$ de desconto no produto");
        System.out.println(usuarioBase.getValorFreteDesconto(valorFrete, valorProduto));

        System.out.println("-----------------------------------------------------------------------------");

        UsuarioStandart usuarioStandart = new UsuarioStandart();
        System.out.println("Usuario Tipo : " + usuarioStandart.getTipoUsuario());
        System.out.println("Recebeu " + usuarioStandart.getValorDesconto(valorProduto) + "R$ de desconto no produto");
        System.out.println(usuarioStandart.getValorFreteDesconto(valorFrete, valorProduto));

        System.out.println("-----------------------------------------------------------------------------");

        UsuarioPremium usuarioPremium = new UsuarioPremium();
        System.out.println("Usuario Tipo : " + usuarioPremium.getTipoUsuario());
        System.out.println("Recebeu " + usuarioPremium.getValorDesconto(valorProduto) + "R$ de desconto no produto");
        System.out.println(usuarioPremium.getValorFreteDesconto(valorFrete, valorProduto));
    }


}
