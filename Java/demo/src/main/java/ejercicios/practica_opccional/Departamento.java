package ejercicios.practica_opccional;

import java.time.LocalDate;

public class Departamento {
    private int id;
    private String nombre;
    private String ubicacion;
    private int cantidadDeEmpleados;
    private double presupuesto;
    private String jefeDeDepartamento;
    private String telefonoDelDepartamento;
    private String emailDelDepartamento;
    private LocalDate fechaDeCreacion;
    private boolean estado;

    public Departamento(int id, String nombre, String ubicacion, int cantidadDeEmpleados, double presupuesto,
            String jefeDeDepartamento, String telefonoDelDepartamento, String emailDelDepartamento,
            LocalDate fechaDeCreacion, boolean estado) {
        this.id = id;
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.cantidadDeEmpleados = cantidadDeEmpleados;
        this.presupuesto = presupuesto;
        this.jefeDeDepartamento = jefeDeDepartamento;
        this.telefonoDelDepartamento = telefonoDelDepartamento;
        this.emailDelDepartamento = emailDelDepartamento;
        this.fechaDeCreacion = fechaDeCreacion;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public int getCantidadDeEmpleados() {
        return cantidadDeEmpleados;
    }

    public void setCantidadDeEmpleados(int cantidadDeEmpleados) {
        this.cantidadDeEmpleados = cantidadDeEmpleados;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    public void setPresupuesto(double presupuesto) {
        this.presupuesto = presupuesto;
    }

    public String getJefeDeDepartamento() {
        return jefeDeDepartamento;
    }

    public void setJefeDeDepartamento(String jefeDeDepartamento) {
        this.jefeDeDepartamento = jefeDeDepartamento;
    }

    public String getTelefonoDelDepartamento() {
        return telefonoDelDepartamento;
    }

    public void setTelefonoDelDepartamento(String telefonoDelDepartamento) {
        this.telefonoDelDepartamento = telefonoDelDepartamento;
    }

    public String getEmailDelDepartamento() {
        return emailDelDepartamento;
    }

    public void setEmailDelDepartamento(String emailDelDepartamento) {
        this.emailDelDepartamento = emailDelDepartamento;
    }

    public LocalDate getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    public void setFechaDeCreacion(LocalDate fechaDeCreacion) {
        this.fechaDeCreacion = fechaDeCreacion;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

}
