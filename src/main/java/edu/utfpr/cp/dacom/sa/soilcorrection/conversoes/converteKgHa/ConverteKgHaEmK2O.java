package edu.utfpr.cp.dacom.sa.soilcorrection.conversoes.converteKgHa;

import edu.utfpr.cp.dacom.sa.soilcorrection.conversoes.Conversao;
import lombok.NonNull;

public class ConverteKgHaEmK2O implements Conversao<Double, Double> {

    @Override
    public Double converte(@NonNull Double valor) {

        if (valor <= 0)
            throw new IllegalArgumentException();


        return valor * 1.2;
    }
    
}
