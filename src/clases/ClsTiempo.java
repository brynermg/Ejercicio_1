package clases;

import java.util.Calendar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Bryner
 */
public class ClsTiempo {

    /**
     * @param args the command line arguments
     */
   Calendar calendario = Calendar.getInstance();
   
     String hora;
     String minuto;
     String segundo;

    public ClsTiempo(String hora, String minuto, String segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }
    public ClsTiempo(String hora, String minuto) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = "0";
    }
    public ClsTiempo(String hora ) {
        this.hora = hora;
        this.minuto ="0";
        this.segundo ="0";
    }

    public Calendar getCalendario() {
        return calendario;
    }

    public void setCalendario(Calendar calendario) {
        this.calendario = calendario;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getMinuto() {
        return minuto;
    }

    public void setMinuto(String minuto) {
        this.minuto = minuto;
    }

    public String getSegundo() {
        return segundo;
    }

    public void setSegundo(String segundo) {
        this.segundo = segundo;
    }
    
    
    
    
    
    }
    
    
    
    

