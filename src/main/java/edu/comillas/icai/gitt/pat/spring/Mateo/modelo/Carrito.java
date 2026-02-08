package edu.comillas.icai.gitt.pat.spring.Mateo.modelo;

public class Carrito {
    // atributos //
    private int idCarrito;
    private int idArticulo;
    private String descripcion;
    private int unidades;
    private double precioFinal;

    // constructor //
    public Carrito(int idCarrito, int idArticulo, String descripcion, int unidades, double precioFinal) {
        this.idCarrito = idCarrito;
        this.idArticulo = idArticulo;
        this.descripcion = descripcion;
        this.unidades = unidades;
        this.precioFinal = precioFinal;
    }

    // getters y setters //
    public int getIdCarrito() {
        return idCarrito;
    }

    public void setIdCarrito(int idCarrito) {
        this.idCarrito = idCarrito;
    }

    public int getIdArticulo() {
        return idArticulo;
    }

    public void setIdArticulo(int idArticulo) {
        this.idArticulo = idArticulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }
}
