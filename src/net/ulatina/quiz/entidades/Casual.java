package net.ulatina.quiz.entidades;

public class Casual extends Calzado{

    private TipoCasual tipo;

    public Casual(String marca, double talla, double precio, TipoCasual tipo) {
        super(marca, talla, precio);
        this.tipo = tipo;
    }

    public Casual(){}

    public TipoCasual getTipo() {
        return tipo;
    }

    public void setTipo(TipoCasual tipo) {
        this.tipo = tipo;
    }
}
