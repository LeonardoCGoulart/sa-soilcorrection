package edu.utfpr.cp.dacom.sa.soilcorrection.fontes;

import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.NomeNutrienteAdicional;
import edu.utfpr.cp.dacom.sa.soilcorrection.nutrientes.NutrienteAdicional;
import lombok.Getter;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import java.util.Set;
@RequiredArgsConstructor
@Getter @NonNull
public enum FonteCalcioMagnesio implements IFonteNutriente {

    CALCARIO_DOLOMITICO(30.4, Set.of()),
    CALCARIO_CALCITICO(56.0, Set.of()),
    CALCARIO_CONCHA(54.0, Set.of()),
    GESSO_AGRICOLA(29.0, Set.of(
            NutrienteAdicional.builder()
                .nome(NomeNutrienteAdicional.ENXOFRE)
                .teorNutriente(0.15).build())),
    HIDROXIDO_CALCIO(75.7, Set.of()),
    CALCARIO_MAGNESIANO(35.0, Set.of());

    private final double teorFonte;
    private final Set<NutrienteAdicional> nutrientesAdicionais;

}
