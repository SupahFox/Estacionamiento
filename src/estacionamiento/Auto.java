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
public class Auto{
    private String marca;
    private String modelo;
    private String color;
    private int matricula;
    private String fecha;
    
    Chofer chofer = new Chofer();
    
 public Auto(){
        this.marca = "";
        this.modelo = "";
        this.color = "";
        this.matricula = 0;
        this.fecha = "";
    }
 
    public Auto(String modelo){
        this.modelo = modelo;
    }
    
    public Auto(String marca, String modelo, String color, int matricula, String fecha){
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
        this.matricula = matricula;
        this.fecha = fecha;
    }
    
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public String getFecha() {
        return fecha;
    }
    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
public String mostrarAuto() {
        System.out.println("Datos ingresados: \n" +
                           "Marca: " + getMarca() + "\n" +
                           "Modelo: " + getModelo() + "\n" +
                           "Color: " + getColor() + "\n" +
                           "Matricula: " + getMatricula() + "\n" +
                           "Fecha de entrada: " + getFecha());
        return null;
    }
}
