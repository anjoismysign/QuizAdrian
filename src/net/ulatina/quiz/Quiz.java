package net.ulatina.quiz;

import net.ulatina.quiz.entidades.Cliente;
import net.ulatina.quiz.librerias.Generico;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Quiz {
    public static void main(String[] args) {
        //Adrian Osorio Gutierrez
        //Luis Benavides-Naranjo

        int totalComprado = 0;
        double totalPagado = 0;
        double promedioDeCalzado = 0;
        double promedioPrecioCalzado = 0;

        List<Cliente> clientes = new ArrayList<>();
        boolean continuar = true;
        while (continuar){
            Cliente cliente = Cliente.build();
            cliente.rellenarCalzado();
            totalComprado = totalComprado + cliente.getCalzado().size();
            totalPagado = totalPagado + cliente.totalPagado();
            promedioDeCalzado = promedioDeCalzado + cliente.promedioCalzado();
            promedioPrecioCalzado = promedioPrecioCalzado + cliente.promedioPrecioCalzado();
            clientes.add(cliente);
            continuar = Generico.booleano("¿Desea ingresar otro cliente?");
        }
        for (Cliente cliente : clientes){
            cliente.mostrar();
        }
        JOptionPane.showMessageDialog(null,
                "Calzados comprados: "+totalComprado + "\n"+
                        "Precio total pagado: "+totalPagado + "\n"+
                        "Promedio del calzado: "+promedioDeCalzado + "\n"+
                        "Promedio del precio del calzado: "+promedioPrecioCalzado);

    }
}