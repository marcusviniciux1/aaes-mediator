package org.example;

public class Aluno {

    public String seInscricaoEvento(String mensagem) {
        return Evento.getInstancia().receberInscricaoAluno(mensagem);
    }

    public String cancelarInscricaoEvento(String mensagem) {
        return Evento.getInstancia().receberCancelamentoAluno(mensagem);
    }

    public String darFeedbackPalestrante(String mensagem) {
        return Evento.getInstancia().receberFeedbackPalestrante(mensagem);
    }
}