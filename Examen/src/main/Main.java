package main;

import Conectar.Internet;
import models.Dispositivo;
import models.Laptop;
import models.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Laptop laptop1 = new Laptop("Asus", "ROG 15", 12000, 16);
        Smartphone cel1 = new Smartphone("iPhone", "17 pro max", 20000, 3);

        System.out.println("Info lap: " + laptop1.getMarca() + " " + laptop1.getModelo() + " tiene un costo de: " + laptop1.getPrecio());
        laptop1.especificacion();

        System.out.println("Info lap: " + cel1.getMarca() + " " + cel1.getModelo() + " tiene un costo de: " + cel1.getPrecio());
        cel1.especificacion();

        List<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(laptop1);
        listaDispositivos.add(cel1);

        for (Dispositivo dispositivo : listaDispositivos){
            dispositivo.encender();
        }

        List<Internet> conInternet = new ArrayList<>();
        conInternet.add(laptop1);

        //se intento
        for (Internet tipoDispositvo : conInternet){
            tipoDispositvo.conectarInternet();
        }
    }

}
