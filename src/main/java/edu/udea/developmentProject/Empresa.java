package edu.udea.developmentProject;

public class Empresa {

    private String nombreEmpresa;
    private String direcciónEmpresa;
    private int teléfonoEmpresa;
    private int nitEmpresa;

    public Empresa(String nombreEmpresa, String direcciónEmpresa, int teléfonoEmpresa, int nitEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
        this.direcciónEmpresa = direcciónEmpresa;
        this.teléfonoEmpresa = teléfonoEmpresa;
        this.nitEmpresa = nitEmpresa;
    }

    public String getNombreEmpresa() {
        return nombreEmpresa;
    }

    public void setNombreEmpresa(String nombreEmpresa) {
        this.nombreEmpresa = nombreEmpresa;
    }

    public String getDirecciónEmpresa() {
        return direcciónEmpresa;
    }

    public void setDirecciónEmpresa(String direcciónEmpresa) {
        this.direcciónEmpresa = direcciónEmpresa;
    }

    public int getTeléfonoEmpresa() {
        return teléfonoEmpresa;
    }

    public void setTeléfonoEmpresa(int teléfonoEmpresa) {
        this.teléfonoEmpresa = teléfonoEmpresa;
    }

    public int getNitEmpresa() {
        return nitEmpresa;
    }

    public void setNitEmpresa(int nitEmpresa) {
        this.nitEmpresa = nitEmpresa;
    }


    public static void main(String[] args) {

        Empresa datosModificados = new Empresa("Coffee Lab Software", "Estatal 35N", 20, 2022);

        System.out.println(datosModificados.getNombreEmpresa());
        System.out.println(datosModificados.getNitEmpresa());

        datosModificados.setNombreEmpresa("Laberintos Lab");
        System.out.println(datosModificados.getNombreEmpresa());

        datosModificados.setNitEmpresa(2025);
        System.out.println(datosModificados.getNitEmpresa());


        // Método que permite modificar aspectos de información de la class Empresa


    }
}