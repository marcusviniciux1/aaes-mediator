package org.example;

public class Evento {

    private static Evento instancia = new Evento();

    private Evento() {
    }

    public static Evento getInstancia() {
        return instancia;
    }

    public String receberInscricaoAluno(String mensagem) {
        return "A Coordenação de Eventos respondeu à sua inscrição.\n" +
                ">>" + Coordenacao.getInstancia().processarInscricaoAluno(mensagem);
    }

    public String receberCancelamentoAluno(String mensagem) {
        return "A Coordenação de Eventos respondeu ao cancelamento.\n" +
                ">>" + Coordenacao.getInstancia().processarCancelamentoAluno(mensagem);
    }

    public String receberFeedbackPalestrante(String mensagem) {
        return "A Coordenação de Eventos respondeu ao feedback.\n" +
                ">>" + Coordenacao.getInstancia().processarFeedbackPalestrante(mensagem);
    }
}