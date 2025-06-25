package org.example.model;

import java.util.List;

public class MediaQualifier {


    public String qualificar(Float media) {
        if(media >= 7) {
            return "Aprovado";
        }
        if(media >= 5) {
            return "Recuperação";
        }
        return "Reprovado";
    }


}
