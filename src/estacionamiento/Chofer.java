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
    public class Chofer {
    private String nombre;
    private String apellido;
    private int cedula;
    private char sexo;
    
    public Chofer(){
        this.nombre = "";
        this.apellido = "";
        this.cedula = 0;
        this.sexo = 'a';
    }

    public Chofer(String nombre){
        this.nombre = nombre;
    }

    public Chofer(String nombre, String apellido, int cedula, char sexo){
        this.nombre = nombre;
        this.apellido = apellido;
        this.cedula = cedula;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public int getCedula() {
        return cedula;
    }
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }
    
    public char getSexo() {
        return sexo;
    }
    public void setSexo(char sexo) {
        this.sexo = sexo;
    }
    
    public String mostrarChofer() {
        System.out.println("Datos ingresados: \n" +
                           "Nombre: " + getNombre() + "\n" +
                           "Apellido: " + getApellido() + "\n" +
                           "Sexo: " + getSexo() + "\n" +
                           "C.I: " + getCedula());
        return null;
    }
}
