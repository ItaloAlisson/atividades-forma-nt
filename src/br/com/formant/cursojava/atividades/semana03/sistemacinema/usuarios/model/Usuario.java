package br.com.formant.cursojava.atividades.semana03.sistemacinema.usuarios.model;

import java.util.Arrays;
import java.util.List;

public class Usuario {
    private String nome;
    private TipoUsuario tipoUsuario;
    private int idade;
    private String username;
    private String password;

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", tipoUsuario=" + tipoUsuario +
                ", idade=" + idade +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    public Usuario(String nome, TipoUsuario tipoUsuario, int idade, String username, String password) {
        this.nome = nome;
        this.tipoUsuario = tipoUsuario;
        this.idade = idade;
        this.username = username;
        this.password = password;
    }

    public static String criptografarSenha(String senha) {
        List<String> alfabeto = Arrays.asList("A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z");
        senha.replaceAll(" ", "").toUpperCase();
        String senhaCriptografada = " ";
        for (int posicao = 1; posicao <= senha.length(); posicao++) {
            String retorno = senha.substring(posicao - 1, posicao);
            for (String letra : alfabeto) {
                if (letra.equals(retorno)) {
                    int index = (alfabeto.indexOf(letra) + 120) % alfabeto.size();
                    senhaCriptografada += alfabeto.get(index);
                    break;
                }
            }
        }
        return senhaCriptografada;
    }

    public TipoUsuario getTipoUsuario() {
        return tipoUsuario;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
