package org.example.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.List;
import java.util.stream.Stream;

public class MediaCalculatorTest {
    @ParameterizedTest
    @MethodSource(value = "getFloatList")
    public void calcular_whenGivenListOfFloat_returnsCorrectResult(List<Float> list) {
        Float sum = 0f;
        for(Float number : list) {
            sum += number;
        }
        Assertions.assertEquals(sum/list.size(), new MediaCalculator().calcular(list));

    }

    private static Stream<Arguments> getFloatList() {
        return Stream.of(
                Arguments.of(List.of(8f,1f,2f)),
                Arguments.of(List.of(1f)),
                Arguments.of(List.of(2f,2f,2f)),
                Arguments.of(List.of(0f))
        );
    }
}
