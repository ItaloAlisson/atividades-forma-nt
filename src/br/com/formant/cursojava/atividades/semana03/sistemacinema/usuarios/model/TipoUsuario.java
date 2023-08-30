package br.com.formant.cursojava.atividades.semana03.sistemacinema.usuarios.model;

public enum TipoUsuario {
    FUNCIONARIO("1"), CLIENTE("2");

    String tipo;

    TipoUsuario(String tipo) {
        this.tipo = tipo;
    }

    public static TipoUsuario tipoUsuarioPorNumero(String tipo) {
        for (TipoUsuario tipoUsuario : values()) {
            if (tipoUsuario.getTipo().equals(tipo)) {
                return tipoUsuario;
            }
        }
        return null;
    }

    public String getTipo() {
        return tipo;
    }
}
