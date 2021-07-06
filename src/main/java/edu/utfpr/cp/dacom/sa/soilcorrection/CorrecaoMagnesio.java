/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.utfpr.cp.dacom.sa.soilcorrection;

/**
 *
 * @author joeda
 */
public class CorrecaoMagnesio implements CalculoCalcioMagnesio {
    
    @Override
    public double somaPotassioCalcioMagnesio(double potassio, double calcio, double magnesio){
        return(potassio+calcio+magnesio);
    }
    
    // Responsável pelo campo "Ideal" da planilha (magnésio).
    public String getMagnesioIdeal(int texturaSolo) {
       switch(texturaSolo){
            case 1 -> { // argiloso
                return "10 a 15";
            }
            case 2 -> { // textura_media
                return "8 a 12";
            }
        }
        return null;
    }
    
   // Responsável pelo campo "Participação atual na CTC do solo" da planilha (magnesio).
    @Override
    public double ParticipacaoCtcSolo(double magnesio, double somaPotassioCalcioMagnesio, double HAL) {
       return (magnesio/(somaPotassioCalcioMagnesio+HAL)*100);
    }
    
    // Responsável pelo campo "Após as correções" da planilha (magnésio).
    @Override
    public double CalculaCorrecao(double magnesioIdeal, double somaPotassioCalcioMagnesio, double HAL) {
       return (magnesioIdeal/(somaPotassioCalcioMagnesio+HAL)*100);
    }
    
}
