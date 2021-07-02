package edu.utfpr.cp.dacom.sa.soilcorrection;

public class NomeCorretivo {
    private final String nome[] = {"NULL", "CALCARIO DOLOMITICO", "CALCARIO CALCITICO", "CALCARIO DE CONCHA", "GESSO AGRICOLA", "HIDROXIDO DE CALCIO", "CALCARIO MAGNESIANO"};
    
    public String getNomeCorretivo(int pos){ // capta o nome pelo ID
        return(nome[pos]);
    }
    
    public int getIDByNomeCorretivo(String nutriente){ // capta o ID atraves do nome 
        switch(nutriente){
            case "CALCARIO DOLOMITICO" -> {
                return 1;
            }
            case "CALCARIO CALCITICO" -> {
                return 2;
            }
            case "CALCARIO DE CONCHA" -> {
                return 3;
            }
            case "GESSO AGRICOLA" -> {
                return 4;
            }
            case "HIDROXIDO DE CALCIO" -> {
                return 5;
            }
            case "CALCIO MAGNESIANO" -> {
                return 6;
            }
        }
        return 0;
    }
    
}
