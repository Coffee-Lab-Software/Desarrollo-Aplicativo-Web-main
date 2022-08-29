package edu.udea.developmentProject;

public class Empleado {

    private String nombreEmpleado;
    private String correoEmpleado;
    private String empresaPertenece;
    private String rolEmpleado;

    public Empleado(String nombreEmpleado, String correoEmpleado, String empresaPertenece, String rolEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
        this.correoEmpleado = correoEmpleado;
        this.empresaPertenece = empresaPertenece;
        this.rolEmpleado = rolEmpleado;
    }

    public String getNombreEmpleado() {
        return nombreEmpleado;
    }

    public void setNombreEmpleado(String nombreEmpleado) {
        this.nombreEmpleado = nombreEmpleado;
    }

    public String getCorreoEmpleado() {
        return correoEmpleado;
    }

    public void setCorreoEmpleado(String correoEmpleado) {
        this.correoEmpleado = correoEmpleado;
    }

    public String getEmpresaPertenece() {
        return empresaPertenece;
    }

    public void setEmpresaPertenece(String empresaPertenece) {
        this.empresaPertenece = empresaPertenece;
    }

    public String getRolEmpleado() {
        return rolEmpleado;
    }

    public void setRolEmpleado(String rolEmpleado) {
        this.rolEmpleado = rolEmpleado;
    }

    public static void main(String[] args) {

        Empleado infModificada = new Empleado("Empleado de prueba", "Empleadodeprueba@dpa.com", "Coffee Lab Sofware", "Administrador");

        System.out.println(infModificada.getNombreEmpleado());
        System.out.println(infModificada.getRolEmpleado());

        infModificada.setNombreEmpleado("Empleado contratado");
        System.out.println(infModificada.getNombreEmpleado());

        infModificada.setRolEmpleado("Operativo");
        System.out.println(infModificada.getRolEmpleado());


        // Método que permite modificar aspectos de información de la class Empleado
        // Pendiente construir ArrayList que permita almacenar información de los empleados.

    }

}
