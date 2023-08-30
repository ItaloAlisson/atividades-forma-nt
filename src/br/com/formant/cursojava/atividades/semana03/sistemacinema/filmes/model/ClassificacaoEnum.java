package br.com.formant.cursojava.atividades.semana03.sistemacinema.filmes.model;

public enum ClassificacaoEnum {
    LIVRE(0), CLASSIFICACAO_10(10), CLASSIFICACAO_12(12), CLASSIFICACAO_16(16), CLASSIFICACAO_18(18);

    int idade;

    ClassificacaoEnum(int idade) {
        this.idade = idade;
    }

    public static ClassificacaoEnum ClassificacaoPorNumero(int idade) {
        for (ClassificacaoEnum classificacao : values()) {
            if (classificacao.getIdade() == idade) {
                return classificacao;
            }
        }
        return null;
    }


    public int getIdade() {
        return idade;
    }
}
