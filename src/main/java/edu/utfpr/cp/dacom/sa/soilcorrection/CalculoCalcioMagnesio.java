
package edu.utfpr.cp.dacom.sa.soilcorrection;


public interface CalculoCalcioMagnesio {
    
    public double somaPotassioCalcioMagnesio(double potassio, double calcio, double magnesio);
    public double ParticipacaoCtcSolo(double nutriente, double somaPotassioCalcioMagnesio, double HAL);
    public double CalculaCorrecao(double nutrienteIdeal, double somaPotassioCalcioMagnesio, double HAL);
    
}
