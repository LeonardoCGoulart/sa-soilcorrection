package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestaCorrecaoMagnesio {

     @Test
    public void testaParticipacaoCtcSoloMagnesio() {
        double somaPotassioCalcioMagnesio = new CorrecaoMagnesio().somaPotassioCalcioMagnesio(0.15, 5.76, 1.63);
        assertEquals(12.645461598138091, new CorrecaoMagnesio().ParticipacaoCtcSolo(1.63,somaPotassioCalcioMagnesio,5.35));
    }   
    
    @Test
    public void testaCorrecaoMagnesio() {
        double somaPotassioCalcioMagnesio = new CorrecaoMagnesio().somaPotassioCalcioMagnesio(0.15, 5.76, 1.63);
        assertEquals(13.886733902249807, new CorrecaoMagnesio().CalculaCorrecao(1.79,somaPotassioCalcioMagnesio,5.35));
    }
    


}
