package br.com.formant.cursojava.atividades.semana03.sistemacinema.filmes.model;

public enum TipoTecnologia {
    FILME2D(1), FILME3D(2);

    int tecnologia;

    TipoTecnologia(int tecnologia) {
        this.tecnologia = tecnologia;
    }

    public static TipoTecnologia tipoPorNumero(int tecnologia) {
        for (TipoTecnologia tipo : values()) {
            if (tipo.getTecnologia() == tecnologia) {
                return tipo;
            }
        }
        return null;
    }

    public int getTecnologia() {
        return tecnologia;
    }
}
