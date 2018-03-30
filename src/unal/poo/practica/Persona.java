/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

/**
 *
 * @author Sergio
 */
public class Persona {
    private int pisoLlegada;
    private int pisoInicio;
    
    public Persona(int pisoInicio, int pisoLlegada) {
        this.pisoLlegada = pisoLlegada;
        this.pisoInicio = pisoInicio;
    }

    public int getPisoLlegada() {
        return pisoLlegada;
    }
    public int getPisoInicio(){
        return this.pisoInicio;
    }

    public void setPisoLlegada(int pisoLlegada) {
        this.pisoLlegada = pisoLlegada;
    }
    public void setPisoInicio(int pisoInicio){
        this.pisoInicio = pisoInicio;
    }
}
