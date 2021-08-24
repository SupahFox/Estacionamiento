/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estacionamiento;

/**
 *
 * @author usuLab
 */
public class Piso1 {
    private boolean control;
    private boolean estacionado;
    private int piso;
    private boolean entrada;
    private boolean salida;

 public Piso1(){
        this.control = false;
        this.estacionado = false;
        this.piso = 0;
        this.entrada = false;
        this.salida = false;
    }
 
 public Piso1(int piso){
        this.piso = piso;
 }
 
 public Piso1(boolean control, boolean estacionado, int piso, boolean entrada, boolean salida){
        this.control = control;
        this.estacionado = estacionado;
        this.piso = piso;
        this.entrada = entrada;
        this.salida = salida;
 }
 
    public boolean getControl() {
        return control;
    }
    public void setControl(boolean control) {
        this.control = control;
    }
    
    public boolean getEstacionado() {
        return estacionado;
    }
    public void setEstacionado(boolean estacionado) {
        this.estacionado = estacionado;
    }
    
    public int getPiso() {
        return piso;
    }
    public void setPiso(int piso) {
        this.piso = piso;
    }
    
    public boolean getEntrada() {
        return entrada;
    }
    public void setEntrada(boolean entrada) {
        this.entrada = entrada;
    }
    
    public boolean getSalida() {
        return salida;
    }
    public void setSalida(boolean salida) {
        this.salida = salida;
    }
}
