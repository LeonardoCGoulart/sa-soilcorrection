
package edu.utfpr.cp.dacom.sa.soilcorrection;


public class CorrecaoCalcio {
    
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
