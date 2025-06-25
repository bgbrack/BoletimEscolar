package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class AlunoTest {


    @Test
    public void alunoHasStringConstructor() {

        Assertions.assertDoesNotThrow(
                () -> {
                    Aluno aluno = new Aluno("Nome");
                }
        );
    }
    @Test
    public void alunoHasTwoArgConstructor() {
        Assertions.assertDoesNotThrow(
                () -> {
                    Aluno aluno = new Aluno("Nome",
                            new ArrayList<>());
                }
        );
    }

    @ParameterizedTest
    @MethodSource(value = "validNotasMethodSource")
    public void alunoAddNota_addsNotaToList(Float nota) {

        List<Float> notas = new ArrayList<>();
        notas.add(1f);
        Aluno aluno = new Aluno("Nome", notas);
        aluno.addNota(nota);
        Assertions.assertEquals(nota, aluno.getNotas().get(1));
    }




    public static Stream<Arguments> validNotasMethodSource() {
        return Stream.of(
                Arguments.of(8f),
                Arguments.of(10f),
                Arguments.of(5.2f)
        );
    }
}
