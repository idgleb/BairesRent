import javax.swing.*;

public class Contrato {

    private Departamento departamento;
    private Inquilino inquilino;
    private int cantidadMes;

    public Contrato(Departamento departamento, Inquilino inquilino, int cantidadMes) {
        this.departamento = departamento;
        this.inquilino = inquilino;
        this.cantidadMes = cantidadMes;
    }

    public static Contrato crearContrato() {
        Departamento departamento = Departamento.crearDepartamento();
        Inquilino inquilino = Inquilino.crearInquilino();

        String cantidadMes;
        do {
            cantidadMes = JOptionPane.showInputDialog(null, "cantidadMes? ");
            if (cantidadMes == null) cantidadMes = "";
        } while (!Departamento.isNum(cantidadMes));

        departamento.setAlquilado(true);

        return new Contrato(departamento, inquilino, Integer.parseInt(cantidadMes));
    }

    public double calcularPrecioTotal() {
        double precioTotal = 0;
        precioTotal = cantidadMes * departamento.getPrecioParaAlquilar();
        return precioTotal;
    }

    public Departamento getDepartamento() {
        return departamento;
    }

    public Inquilino getInquilino() {
        return inquilino;
    }

    public int getCantidadMes() {
        return cantidadMes;
    }


}
