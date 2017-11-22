/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pojos;

import java.sql.Date;
import java.sql.Time;

public class Citas {

    private int idCita;
    private String NombrePaciente;
    private String descripcion;
    private Date fecha;
    private Time hora;
    private String tratamiento;
    private String tipo;
    private double costoTotal;
    private double cantidadPagada;

    public Citas(int idCita, String NombrePaciente, String descripcion, Date fecha, Time hora, String tratamiento, String tipo, double costoTotal, double cantidadPagada) {
        this.idCita = idCita;
        this.NombrePaciente = NombrePaciente;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.hora = hora;
        this.tratamiento = tratamiento;
        this.tipo = tipo;
        this.costoTotal = costoTotal;
        this.cantidadPagada = cantidadPagada;
    }
    

 

    public String getNombrePaciente() {
        return NombrePaciente;
    }

    public void setNombrePaciente(String NombrePaciente) {
        this.NombrePaciente = NombrePaciente;
    }

    public int getIdCita() {
        return idCita;
    }

    public void setIdCita(int idCita) {
        this.idCita = idCita;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Time getHora() {
        return hora;
    }

    public void setHora(Time hora) {
        this.hora = hora;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public double getCantidadPagada() {
        return cantidadPagada;
    }

    public void setCantidadPagada(double cantidadPagada) {
        this.cantidadPagada = cantidadPagada;
    }
    

}
