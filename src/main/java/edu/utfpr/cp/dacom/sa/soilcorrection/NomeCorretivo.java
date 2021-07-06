package edu.utfpr.cp.dacom.sa.soilcorrection;

public class NomeCorretivo {
    private final String nome[] = {"NULL", "CALCARIO DOLOMITICO", "CALCARIO CALCITICO", "CALCARIO DE CONCHA", "GESSO AGRICOLA", "HIDROXIDO DE CALCIO", "CALCARIO MAGNESIANO"};
    
    public String getNomeCorretivo(int pos){ // capta o nome pelo ID
        return(nome[pos]);
    }
    
}
