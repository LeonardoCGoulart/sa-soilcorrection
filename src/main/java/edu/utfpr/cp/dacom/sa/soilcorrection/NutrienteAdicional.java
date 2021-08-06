package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.*;

@Builder
@Data
public class NutrienteAdicional {
    private final NomeNutrienteAdicional nome;
    private final double teorNutriente;
    private double correcaoAdicional;
}
