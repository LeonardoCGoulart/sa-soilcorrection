package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
public class NutrienteAdicional {
    private final NomeNutrienteAdicional nome;
    @Getter @NonNull
    private final double teorNutriente;
    @Getter @Setter
    private double correcaoAdicional;
}
