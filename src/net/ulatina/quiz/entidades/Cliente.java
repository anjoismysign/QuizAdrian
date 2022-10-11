package net.ulatina.quiz.entidades;

import net.ulatina.quiz.librerias.Generico;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Cliente{
    private String nombre, apellido;
    private List<Calzado> calzado;

    public static Cliente build(){
        String nombre = Generico.cadenaDeTexto("Ingrese el nombre del cliente");
        String apellido = Generico.cadenaDeTexto("Ingrese el apellido del cliente");
        return new Cliente(nombre, apellido);
    }

    public Cliente(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.calzado = new ArrayList<>();
    }

    public Cliente(){}

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

    public List<Calzado> getCalzado() {
        return calzado;
    }

    public void setCalzado(List<Calzado> calzado) {
        this.calzado = calzado;
    }

    public String nombreCompleto(){
        return getNombre() + " " + getApellido();
    }

    public String comprimirCalzado(){
        StringBuilder sb = new StringBuilder();
        for (Calzado calzado : getCalzado()){
            sb.append(calzado.comprimir() + ", ");
        }
        sb.delete(sb.length() - 3, sb.length() - 1);
        return sb.toString();

    }

    public String info(){
        return nombreCompleto() + " " + comprimirCalzado();
    }

    public void mostrar(){
        JOptionPane.showMessageDialog(null, info());
    }

    public double totalPagado(){
        double total = 0;
        for (Calzado calzado : this.calzado){
            total = total + calzado.getPrecio();
        }
        return total;
    }

    public double promedioCalzado(){
        double promedio = 0;
        for (Calzado calzado : this.calzado){
            promedio = promedio + calzado.getTalla();
        }
        promedio = promedio / this.calzado.size();
        return promedio;
    }

    public double promedioPrecioCalzado(){
        double promedio = 0;
        for (Calzado calzado : this.calzado){
            promedio = promedio + calzado.getPrecio();
        }
        promedio = promedio / this.calzado.size();
        return promedio;
    }

    public void rellenarCalzado(){
        boolean continuar = true;
        while (continuar){
            Calzado calzado = Calzado.build();
            this.calzado.add(calzado);
            continuar = Generico.booleano("¿Desea ingresar otro calzado?");
        }
    }
}
