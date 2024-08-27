package ejercicios.practica_opccional;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Empleado {

    public int Id;
    public String Nombre;
    public String Apellido;
    public int Edad;
    public LocalDateTime Fecha;
    public double Salario;
    public int DepartamentoID;
    public String Email;
    public String Teléfono;
    public boolean Estado;

    public Empleado(int id, String nombre, String apellido, int edad, LocalDateTime fecha, double salario,
            int departamentoID, String email, String teléfono, boolean estado) {
        Id = id;
        Nombre = nombre;
        Apellido = apellido;
        Edad = edad;
        Fecha = fecha;
        Salario = salario;
        DepartamentoID = departamentoID;
        Email = email;
        Teléfono = teléfono;
        Estado = estado;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int edad) {
        Edad = edad;
    }

    public LocalDateTime getFecha() {
        return Fecha;
    }

    public void setFecha(LocalDateTime fecha) {
        Fecha = fecha;
    }

    public double getSalario() {
        return Salario;
    }

    public void setSalario(double salario) {
        Salario = salario;
    }

    public int getDepartamentoID() {
        return DepartamentoID;
    }

    public void setDepartamentoID(int departamentoID) {
        DepartamentoID = departamentoID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getTeléfono() {
        return Teléfono;
    }

    public void setTeléfono(String teléfono) {
        Teléfono = teléfono;
    }

    public boolean isEstado() {
        return Estado;
    }

    public void setEstado(boolean estado) {
        Estado = estado;
    }
}
