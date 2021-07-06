
package edu.utfpr.cp.dacom.sa.soilcorrection;


public class CorrecaoCalcio implements CalculoCalcioMagnesio {
    
    @Override
    public double somaPotassioCalcioMagnesio(double potassio, double calcio, double magnesio){
        return(potassio+calcio+magnesio);
    }
    
    // Responsável pelo campo "Participação atual na CTC do solo" da planilha (calcio).
    @Override
    public double ParticipacaoCtcSolo(double calcio, double somaPotassioCalcioMagnesio, double HAL) {
       return (calcio/(somaPotassioCalcioMagnesio+HAL)*100);
    }
    
    // Responsável pelo campo "Após as correções" da planilha (calcio).
    @Override
    public double CalculaCorrecao(double calcioIdeal, double somaPotassioCalcioMagnesio, double HAL) {
        // ainda não esta pronto
        return 0.0;
    }
    
    // Responsável pelo campo "Ideal" da planilha (calcio).
    public String getCalcioIdeal(int texturaSolo) {
       switch(texturaSolo){
            case 1 -> { // argiloso
                return "45 a 55";
            }
            case 2 -> { // textura_media
                return "35 a 40";
            }
        }
        return null;
    }
    
}
