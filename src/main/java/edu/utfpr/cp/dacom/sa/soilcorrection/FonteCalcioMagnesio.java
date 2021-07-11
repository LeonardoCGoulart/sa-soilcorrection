package edu.utfpr.cp.dacom.sa.soilcorrection;
import java.util.Set;

public enum FonteCalcioMagnesio implements IFonteNutriente {
    CALCARIO_DOLOMITICO(0.304,Set.of()),
    CALCARIO_CALCITIVO(0.560,Set.of()),
    CALCARIO_CONCHA(0.540,Set.of()),
    GESSO_AGRICOLA(0.290,Set.of()),
    HIDROXIDO_CALCIO(0.757,Set.of()),
    CALCARIO_MAGNESIANO(0.350,Set.of());
    
    private final double teorFonte;
    private final Set<NutrienteAdicional> nutrientesAdicionais;
    
    //Construtor
    FonteCalcioMagnesio(
            double teorFonte,
            final  Set<NutrienteAdicional> nutrientesAdicionais){
            this.teorFonte = teorFonte;
            this.nutrientesAdicionais = nutrientesAdicionais;
    }
    
    @Override
    public double getTeorFonte(){
        return this.teorFonte;
    }
    
     @Override
     public Set<NutrienteAdicional> getNutrientesAdicionais(){
         return this.nutrientesAdicionais;
     }
     
     
    
    
    
    
    
}
