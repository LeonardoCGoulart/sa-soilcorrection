package edu.utfpr.cp.dacom.sa.soilcorrection.fontes;

import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.NomeNutrienteAdicional;
import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.NutrienteAdicional;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import java.util.Set;
@RequiredArgsConstructor
@Getter @NonNull
public enum FonteFosforo implements IFonteNutriente {
    SUPERFOSFATO_SIMPLES(0.18, Set.of(
            NutrienteAdicional.builder()
                .nome(NomeNutrienteAdicional.ENXOFRE)
                .teorNutriente(0.1).build(),
            NutrienteAdicional.builder()
                .nome(NomeNutrienteAdicional.CALCIO)
                .teorNutriente(0.28).build())),
    SUPERFOSFATO_TRIPO(0.41, Set.of(
            NutrienteAdicional.builder()
                 .nome(NomeNutrienteAdicional.CALCIO)
                 .teorNutriente(0.2).build())),
    MAP(0.48, Set.of(
            NutrienteAdicional.builder()
                 .nome(NomeNutrienteAdicional.CALCIO)
                 .teorNutriente(0.09).build()));

    private final double teorFonte;
    private final Set<NutrienteAdicional> nutrientesAdicionais;
}
