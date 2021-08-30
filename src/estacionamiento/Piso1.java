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
    private boolean estacionado;
    private int piso;
    private String entrada;
    private String salida;

 public Piso1(){
        this.estacionado = false;
        this.piso = 0;
        this.entrada = "";
        this.salida = "";
    }
 
 public Piso1(int piso){
        this.piso = piso;
 }
 
 public Piso1(boolean estacionado, int piso, String entrada, String salida){
        this.estacionado = estacionado;
        this.piso = piso;
        this.entrada = entrada;
        this.salida = salida;
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
    
    public String getEntrada() {
        return entrada;
    }
    public void setEntrada(String entrada) {
        this.entrada = entrada;
    }
    
    public String getSalida() {
        return salida;
    }
    public void setSalida(String salida) {
        this.salida = salida;
    }
}
