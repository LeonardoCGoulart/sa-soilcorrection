package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestaCorrecaoCalcioMagnesio {

     @Test
    public void testaParticipacaoCtcSoloMagnesio() {
        double somaPotassioCalcioMagnesio = new CorrecaoCalcioMagnesio().somaPotassioCalcioMagnesio(0.15, 5.76, 1.63);
        assertEquals(12.645461598138091, new CorrecaoCalcioMagnesio().ParticipacaoCtcSoloMagnesio(1.63,somaPotassioCalcioMagnesio,5.35));
    }   
    
     @Test
    public void testaParticipacaoCtcSoloCalcio() {
        double somaPotassioCalcioMagnesio = new CorrecaoCalcioMagnesio().somaPotassioCalcioMagnesio(0.15, 5.76, 1.63);
        assertEquals(44.68580294802172, new CorrecaoCalcioMagnesio().ParticipacaoCtcSoloCalcio(5.76,somaPotassioCalcioMagnesio,5.35));
    }
    
    @Test
    public void testaCorrecaoMagnesio() {
        double somaPotassioCalcioMagnesio = new CorrecaoCalcioMagnesio().somaPotassioCalcioMagnesio(0.15, 5.76, 1.63);
        assertEquals(13.886733902249807, new CorrecaoCalcioMagnesio().CalculaCorrecaoMagnesio(1.79,somaPotassioCalcioMagnesio,5.35));
    }
    @Test
    public void testaQuantidadeAplicarTonHa() { 
        assertEquals(1.8428571428571427, new CorrecaoCalcioMagnesio().getQuandidadeAplicarTonHa(1.29, 70.00)); // 1.85 arredondado
    }
    

    
}
