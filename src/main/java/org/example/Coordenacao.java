package org.example;

public class Coordenacao implements Setor {

    private static Coordenacao instancia = new Coordenacao();

    private Coordenacao() {
    }

    public static Coordenacao getInstancia() {
        return instancia;
    }

    @Override
    public String processarInscricaoAluno(String mensagem) {
        return "A inscrição foi recebida com sucesso: " + mensagem;
    }

    @Override
    public String processarCancelamentoAluno(String mensagem) {
        return "A inscrição foi cancelada conforme solicitado: " + mensagem;
    }

    @Override
    public String processarFeedbackPalestrante(String mensagem) {
        return "O feedback sobre o palestrante foi registrado: " + mensagem;
    }
}