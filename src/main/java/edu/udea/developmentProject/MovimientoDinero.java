package edu.udea.developmentProject;

public class MovimientoDinero {

    private float montoMovimiento;
    private float montoDébito;
    private float montoCrédito;
    private String conceptoMovimiento;
    private String usuarioMovimiento;


    public MovimientoDinero(float montoMovimiento, float montoDébito, float montoCrédito, String conceptoMovimiento, String usuarioMovimiento) {
        this.montoMovimiento = montoMovimiento;
        this.montoDébito = montoDébito;
        this.montoCrédito = montoCrédito;
        this.conceptoMovimiento = conceptoMovimiento;
        this.usuarioMovimiento = usuarioMovimiento;
    }

    public float getMontoMovimiento() {
        return montoMovimiento;
    }

    public void setMontoMovimiento(float montoMovimiento) {
        this.montoMovimiento = montoMovimiento;
    }

    public float getMontoDébito() {
        return montoDébito;
    }

    public void setMontoDébito(float montoDébito) {
        this.montoDébito = montoDébito;
    }

    public float getMontoCrédito() {
        return montoCrédito;
    }

    public void setMontoCrédito(float montoCrédito) {
        this.montoCrédito = montoCrédito;
    }

    public String getConceptoMovimiento() {
        return conceptoMovimiento;
    }

    public void setConceptoMovimiento(String conceptoMovimiento) {
        this.conceptoMovimiento = conceptoMovimiento;
    }

    public String getUsuarioMovimiento() {
        return usuarioMovimiento;
    }

    public void setUsuarioMovimiento(String usuarioMovimiento) {
        this.usuarioMovimiento = usuarioMovimiento;
    }

    public static void main(String[] args) {

        MovimientoDinero itemsModificados = new MovimientoDinero(60000.25f, 0, 60000.25f, "Compra cliente 0001", "Empleado contratado");

        System.out.println(itemsModificados.getMontoCrédito());
        System.out.println(itemsModificados.getConceptoMovimiento());

        itemsModificados.setMontoCrédito(90000.25f);
        System.out.println(itemsModificados.getMontoCrédito());

        itemsModificados.setConceptoMovimiento("Ajuste valor compra cliente 0001");
        System.out.println(itemsModificados.getConceptoMovimiento());
    }

    // Pendiente construir lógica contable que permite conocer el estado enconómico actual de la empresa.
    // Pendiente construir ArrayList que permita almacenar los distintos movimientos de dinero y las operaciones internas.
}



