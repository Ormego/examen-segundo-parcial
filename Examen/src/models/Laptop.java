package models;

public class Laptop extends Dispositivo{

    private final int memRam;

    public Laptop(String marca, String modelo, int precio, int memRam){
        super(marca, modelo, precio);

        this.memRam = memRam;
    }

    public void especificacion(){
        System.out.println("Especificaciones: " + this.memRam + " GB de ram\n");
    }


}
