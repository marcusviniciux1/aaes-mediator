package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AlunoTest {

    @Test
    void deveSeInscrever() {
        Aluno aluno = new Aluno();
        assertEquals("A Coordenação de Eventos respondeu à sua inscrição.\n" +
                        ">>A inscrição foi recebida com sucesso: Quero me inscrever no evento.",
                aluno.seInscricaoEvento("Quero me inscrever no evento."));
    }

    @Test
    void deveCancelarInscricao() {
        Aluno aluno = new Aluno();
        assertEquals("A Coordenação de Eventos respondeu ao cancelamento.\n" +
                        ">>A inscrição foi cancelada conforme solicitado: Quero cancelar a inscrição.",
                aluno.cancelarInscricaoEvento("Quero cancelar a inscrição."));
    }

    @Test
    void deveDarFeedbackPalestrante() {
        Aluno aluno = new Aluno();
        assertEquals("A Coordenação de Eventos respondeu ao feedback.\n" +
                        ">>O feedback sobre o palestrante foi registrado: Excelente palestrante!",
                aluno.darFeedbackPalestrante("Excelente palestrante!"));
    }

}