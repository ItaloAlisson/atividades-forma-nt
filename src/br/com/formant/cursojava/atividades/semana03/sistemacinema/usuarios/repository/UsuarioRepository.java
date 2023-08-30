package br.com.formant.cursojava.atividades.semana03.sistemacinema.usuarios.repository;

import static br.com.formant.cursojava.atividades.semana03.sistemacinema.MenuInicial.*;

import br.com.formant.cursojava.atividades.semana03.sistemacinema.usuarios.model.TipoUsuario;
import br.com.formant.cursojava.atividades.semana03.sistemacinema.usuarios.model.Usuario;

import java.util.ArrayList;
import java.util.List;

public class UsuarioRepository {
    public static List<Usuario> listausuarios = new ArrayList<>();

    public static void cadastrarUsuario(String nome, TipoUsuario tipoUsuario, int idade, String username, String senha) {
        Usuario novoUsuario = new Usuario(nome, tipoUsuario, idade, username, senha);
        listausuarios.add(novoUsuario);
        for (Usuario usuario : listausuarios) {
        }
    }

    public static boolean loginUsuario(String nomeUsuario, String senhaUsuario) {
        for (Usuario listas : listausuarios) {

            if (listas.getUsername().equals(nomeUsuario) && listas.getPassword().equals(senhaUsuario)) {
                if (listas.getTipoUsuario().equals(TipoUsuario.FUNCIONARIO)) {
                    menuFuncionario();
                } else if (listas.getTipoUsuario().equals(TipoUsuario.CLIENTE)) {
                    menuCliente();
                }
                return true;
            }

        }
        return false;
    }
}