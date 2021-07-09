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
public class CorrecaoCalcioMagnesio  {
    

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
    public double ParticipacaoCtcSoloMagnesio(double magnesio, double somaPotassioCalcioMagnesio, double HAL) {
       return (magnesio/(somaPotassioCalcioMagnesio+HAL)*100);
    }
    
    // Responsável pelo campo "Após as correções" da planilha (magnésio).
    public double CalculaCorrecaoMagnesio(double magnesioIdeal, double somaPotassioCalcioMagnesio, double HAL) {
       return (magnesioIdeal/(somaPotassioCalcioMagnesio+HAL)*100);
    }
    
     // Responsável pelo campo "Participação atual na CTC do solo" da planilha (calcio).

    public double ParticipacaoCtcSoloCalcio(double calcio, double somaPotassioCalcioMagnesio, double HAL) {
       return (calcio/(somaPotassioCalcioMagnesio+HAL)*100);
    }
    
    // Responsável pelo campo "Após as correções" da planilha (calcio).

    public double CalculaCorrecaoCalcio(double calcioIdeal, double somaPotassioCalcioMagnesio, double HAL) {
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
    
    //responsavel pelo campo "quantidade a aplicar" 
    public double getQuandidadeAplicarTonHa(double qtdCorretivo, double prnt){
        if(prnt <= 0)
            return 0;
        
        if(qtdCorretivo <= 0)
            return 0;
        
        return(qtdCorretivo*100/prnt);
    }
    
    //responsavel pelo campo "custo R$/ha"   
    public double getCustoEmRsPorHa(double custo, double qtdAplicar){
        if(custo <= 0)
            return 0;
        
        if(qtdAplicar <= 0)
            return 0;
        
        return(custo*qtdAplicar/1000);
    }
}
