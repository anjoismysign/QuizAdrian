package net.ulatina.quiz.entidades;

import net.ulatina.quiz.librerias.Generico;

import javax.swing.*;

public class Calzado {
    private String marca;
    private double talla;
    private double precio;

    public Calzado(String marca, double talla, double precio) {
        this.marca = marca;
        this.talla = talla;
        this.precio = precio;
    }

    public Calzado(){}

    public static Calzado build(){
        String marca = JOptionPane.showInputDialog("Ingrese marca");
        double talla = Generico.decimal("Ingrese talla");
        double precio = Generico.decimal("Ingrese precio");
        boolean casual = Generico.booleano("¿Es casual? De no ser así se considerará calzado deportivo.");
        if (casual){
            int tipo = 0;
            tipo = Generico.entero("Ingrese tipo de calzado."+"\n"+
                    "(1) Juvenil"+"\n"+
                    "(2) Escolar"+"\n"+
                    "(3) Formal");
            TipoCasual tipoCasual;
            switch (tipo){
                case 1->{
                    tipoCasual = TipoCasual.JUVENIL;
                }
                case 2->{
                    tipoCasual = TipoCasual.ESCOLAR;
                }
                case 3->{
                    tipoCasual = TipoCasual.FORMAL;
                }
                default -> {
                    return build();
                }
            }
            return new Casual(marca,talla,precio,tipoCasual);
        } else {
            int tipo = 0;
            tipo = Generico.entero("Ingrese tipo de calzado."+"\n"+
                    "(1) Futbol"+"\n"+
                    "(2) Voleibol"+"\n"+
                    "(3) Basquetbol"+"\n"+
                    "(4) Atletismo");
            TipoDeportivo tipoDeportivo;
            switch (tipo){
                case 1->{
                    tipoDeportivo = TipoDeportivo.FUTBOL;
                }
                case 2->{
                    tipoDeportivo = TipoDeportivo.VOLEIBOL;
                }
                case 3->{
                    tipoDeportivo = TipoDeportivo.BASQUETBOL;
                }
                case 4->{
                    tipoDeportivo = TipoDeportivo.ATLETISMO;
                }
                default -> {
                    return build();
                }
            }
            return new Deportivo(marca,talla,precio,tipoDeportivo);
        }
    }

    public String comprimir(){
        return getMarca() + " "+ getTalla() + " " + getPrecio();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getTalla() {
        return talla;
    }

    public void setTalla(double talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double hacerDescuento(double porcentaje){
        porcentaje = porcentaje / 100;
        return precio * porcentaje;
    }

    public String info(){
        return "Marca: " + marca + " Talla: " + talla + " Precio: " + precio;
    }
}
