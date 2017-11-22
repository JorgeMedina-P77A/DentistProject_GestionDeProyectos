/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

/**
 *
 * @author danie
 */
public class Pagos {
    private int idPago;
    private int idProducto;
    private int idPaciente;
    private String descripcion;
    private int cantidad;
    private double pago;
    private double debe;

    public Pagos(int idPago,int idProducto, int idPaciente, String descripcion, int cantidad, double pago, double debe) {
        this.idPago=idPago;
        this.idProducto = idProducto;
        this.idPaciente = idPaciente;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.pago = pago;
        this.debe = debe;
    }

    public int getIdPago() {
        return idPago;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdPaciente() {
        return idPaciente;
    }

    public void setIdPaciente(int idPaciente) {
        this.idPaciente = idPaciente;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getPago() {
        return pago;
    }

    public void setPago(double pago) {
        this.pago = pago;
    }

    public double getDebe() {
        return debe;
    }

    public void setDebe(double debe) {
        this.debe = debe;
    }

}
