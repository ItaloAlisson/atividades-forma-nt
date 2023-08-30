package br.com.formant.cursojava.atividades.semana03.sistemacinema.filmes.model;

public enum GeneroEnum {
    ROMANCE("1"), AVENTURA("2"), COMEDIA("3"), SUSPENSE("4");

    String tipo;

    GeneroEnum(String tipo) {
        this.tipo = tipo;
    }

    public static GeneroEnum GeneroPorNumero(String tipo) {
        for (GeneroEnum tipoGenero : values()) {
            if (tipoGenero.getTipo().equals(tipo)) {
                return tipoGenero;
            }
        }
        return null;
    }

    public String getTipo() {
        return tipo;
    }
}
