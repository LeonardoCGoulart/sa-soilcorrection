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
public class CorrecaoMagnesio {
    
    public double somaPotassioCalcioMagnesio(double potassio, double calcio, double magnesio){
        return(potassio+calcio+magnesio);
    }

    public double CalculaCorrecao(double magnesioIdeal, double somaPotassioCalcioMagnesio, double HAL) {
       return (magnesioIdeal/(somaPotassioCalcioMagnesio+HAL)*100);
    }
    
}
