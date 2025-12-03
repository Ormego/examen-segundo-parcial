package models;

public class Dispositivo {

    private final String marca;
    private final String modelo;
    private final int precio;

    public Dispositivo (String marca, String modelo, int precio){
        this.marca = marca;
        this.modelo = modelo;
        this.precio = precio;
    }
    public void encender(){
        System.out.println(this.marca + " " + this.modelo + " esta encendido.");
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public int getPrecio(){
        return precio;
    }
    //se intento
    public abstract void conectarInternet();


}
