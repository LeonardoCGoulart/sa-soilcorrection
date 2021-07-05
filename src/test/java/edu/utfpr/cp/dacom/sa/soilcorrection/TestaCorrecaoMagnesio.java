package edu.utfpr.cp.dacom.sa.soilcorrection;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TestaCorrecaoMagnesio {

    @Test
    public void testaCorrecaoMagnesio() {
        double somaPotassioCalcioMagnesio = new CorrecaoMagnesio().somaPotassioCalcioMagnesio(0.15, 5.76, 1.63);
        assertEquals(13.886733902249807, new CorrecaoMagnesio().CalculaCorrecao(1.79,somaPotassioCalcioMagnesio,5.35));
    }
    


}
