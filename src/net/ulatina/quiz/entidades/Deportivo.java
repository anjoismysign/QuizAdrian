package net.ulatina.quiz.entidades;

public class Deportivo extends Calzado{

    private TipoDeportivo tipo;

    public Deportivo(String marca, double talla, double precio, TipoDeportivo tipo) {
        super(marca, talla, precio);
        this.tipo = tipo;
    }

    public Deportivo(){}

    public TipoDeportivo getTipo() {
        return tipo;
    }

    public void setTipo(TipoDeportivo tipo) {
        this.tipo = tipo;
    }
}
