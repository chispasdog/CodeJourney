package ejercicios.practica_opccional;

import java.util.ArrayList;

public class Empresa {
    public String nombre;
    public String RUC;
    public String direccion;
    public String telefono;
    public String email;
    public int anoDeFundacion;
    public ArrayList<Empleado> listaDeEmpleados;
    public static ArrayList<Departamento> listaDeDepartamentos;
    public double ingresosAnuales;
    public double gastosAnuales;

    public Empresa(String nombre, String RUC, String direccion, String telefono, String email, int anoDeFundacion,
            ArrayList<Empleado> listaDeEmpleados, ArrayList<Departamento> listaDeDepartamentos, double ingresosAnuales,
            double gastosAnuales) {
        this.nombre = nombre;
        this.RUC = RUC;
        this.direccion = direccion;
        this.telefono = telefono;
        this.email = email;
        this.anoDeFundacion = anoDeFundacion;
        this.listaDeEmpleados = listaDeEmpleados;
        this.listaDeDepartamentos = listaDeDepartamentos;
        this.ingresosAnuales = ingresosAnuales;
        this.gastosAnuales = gastosAnuales;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRUC() {
        return RUC;
    }

    public void setRUC(String RUC) {
        this.RUC = RUC;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAnoDeFundacion() {
        return anoDeFundacion;
    }

    public void setAnoDeFundacion(int anoDeFundacion) {
        this.anoDeFundacion = anoDeFundacion;
    }

    public ArrayList<Empleado> getListaDeEmpleados() {
        return listaDeEmpleados;
    }

    public void setListaDeEmpleados(ArrayList<Empleado> listaDeEmpleados) {
        this.listaDeEmpleados = listaDeEmpleados;
    }

    public ArrayList<Departamento> getListaDeDepartamentos() {
        return listaDeDepartamentos;
    }

    public void setListaDeDepartamentos(ArrayList<Departamento> listaDeDepartamentos) {
        this.listaDeDepartamentos = listaDeDepartamentos;
    }

    public double getIngresosAnuales() {
        return ingresosAnuales;
    }

    public void setIngresosAnuales(double ingresosAnuales) {
        this.ingresosAnuales = ingresosAnuales;
    }

    public double getGastosAnuales() {
        return gastosAnuales;
    }

    public void setGastosAnuales(double gastosAnuales) {
        this.gastosAnuales = gastosAnuales;
    }

    public void agregarEmpleado(Empleado empleado) {

        listaDeEmpleados.add(empleado);
    }

    public void agregardepartamento(Departamento departamento) {
        listaDeDepartamentos.add(departamento);
    }

    public void listarDepartamentos() {
        for (Departamento departamento : listaDeDepartamentos) {
            System.out.println(departamento);
        }
    }

    public Empleado buscarEmpleadoPorNombre(String nombre) {
        for (Empleado empleado : listaDeEmpleados) {
            if (empleado.getNombre().equalsIgnoreCase(nombre)) {
                return empleado;
            }
        }
        return null;
    }

    public Empleado buscarEmpleadoPorID(int id) {
        for (Empleado empleado : listaDeEmpleados) {
            if (empleado.getId() == id) {
                return empleado;
            }
        }
        return null;
    }

    public void calcularSalarioPromedioPorDepartamento() {
        for (Departamento departamento : listaDeDepartamentos) {
            double sumaSalarios = 0;
            int contadorEmpleados = 0;
            for (Empleado empleado : listaDeEmpleados) {
                if (empleado.getDepartamentoID() == departamento.getId() && empleado.isEstado()) {
                    sumaSalarios += empleado.getSalario();
                    contadorEmpleados++;
                }
            }
            if (contadorEmpleados > 0) {
                double promedio = sumaSalarios / contadorEmpleados;
                System.out.println("Departamento: " + departamento.getNombre() + " - Salario Promedio: " + promedio);
            } else {
                System.out.println("Departamento: " + departamento.getNombre() + " - No tiene empleados activos.");
            }
        }
    }

}
