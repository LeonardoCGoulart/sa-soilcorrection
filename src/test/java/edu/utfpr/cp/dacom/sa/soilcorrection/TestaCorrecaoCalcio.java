package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestaCorrecaoCalcio {

    @Test
    public void testaParticipacaoCtcSoloCalcio() {
        double somaPotassioCalcioMagnesio = new CorrecaoCalcio().somaPotassioCalcioMagnesio(0.15, 5.76, 1.63);
        assertEquals(44.68580294802172, new CorrecaoCalcio().ParticipacaoCtcSolo(5.76,somaPotassioCalcioMagnesio,5.35));
    }
    


}
