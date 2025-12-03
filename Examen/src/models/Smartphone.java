package models;

public class Smartphone extends Dispositivo{

    private final int camaras;

    public Smartphone(String marca, String modelo, int precio, int camaras){
        super(marca, modelo, precio);

        this.camaras = camaras;
    }

    public void especificacion(){
        System.out.println("Especificaciones: " + "tiene "+ this.camaras + " camaras.\n");
    }
}