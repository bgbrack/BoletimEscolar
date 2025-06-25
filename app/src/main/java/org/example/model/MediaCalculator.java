package org.example.model;

import java.util.List;

public class MediaCalculator {
    public Float calcular(List<Float> lista) {
        Float sum = 0f;
        for (Float n : lista) {
            sum += n;
        }
        return sum / lista.size();
    }
    public Float calcular(Float ...lista) {
        Float sum = 0f;
        for (Float n : lista) {
            sum += n;
        }
        return sum / lista.length;
    }
}
