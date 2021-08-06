package edu.utfpr.cp.dacom.sa.soilcorrection;

import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import java.util.Set;
@RequiredArgsConstructor
@Getter @NonNull
public enum FontePotassio implements IFonteNutriente {
    CLORETO_POTASSIO(0.58, Set.of()),
    SULFATO_POTASSIO(0.52, Set.of(
            NutrienteAdicional.builder()
                    .nome(NomeNutrienteAdicional.ENXOFRE)
                    .teorNutriente(0.17).build())),
    SULFATO_POTASSIO_MAGNESIO(0.22, Set.of(
            NutrienteAdicional.builder()
                    .nome(NomeNutrienteAdicional.ENXOFRE)
                    .teorNutriente(0.22).build(),
            NutrienteAdicional.builder()
                    .nome(NomeNutrienteAdicional.MAGNESIO)
                    .teorNutriente(0.18).build()));

    private final double teorFonte;
    private final Set<NutrienteAdicional> nutrientesAdicionais;
}
