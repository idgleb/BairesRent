import javax.swing.*;

public class Departamento {
    private String direccion;
    private int area;
    private int anoDeConstruccion;
    private int distanciaDelCentro;
    private boolean alquilado;

    public static int precioMetro = 1000;

    public Departamento(String direccion, int area, int anoDeConstruccion, int distanciaDelCentro) {
        this.direccion = direccion;
        this.area = area;
        this.anoDeConstruccion = anoDeConstruccion;
        this.distanciaDelCentro = distanciaDelCentro;
        this.alquilado = false;
    }

    public static Departamento crearDepartamento() {

        String direccion;
        do {
            direccion = JOptionPane.showInputDialog(null, "direccion? ");
            if (direccion == null) direccion = "";
        } while (direccion.equals(""));

        String area;
        do {
            area = JOptionPane.showInputDialog(null, "area? ");
            if (area == null) area = "";
        } while (!isNum(area));

        String anoDeConstruccion;
        do {
            anoDeConstruccion = JOptionPane.showInputDialog(null, "anoDeConstruccion? ");
            if (anoDeConstruccion == null) anoDeConstruccion = "";
        } while (!isNum(anoDeConstruccion));

        String distanciaDelCentro;
        do {
            distanciaDelCentro = JOptionPane.showInputDialog(null, "distanciaDelCentro? ");
            if (distanciaDelCentro == null) distanciaDelCentro = "";
        } while (!isNum(distanciaDelCentro));

        Departamento departamento = new Departamento(direccion, Integer.parseInt(area), Integer.parseInt(anoDeConstruccion), Integer.parseInt(distanciaDelCentro));
        return departamento;

    }

    public static boolean isNum(String str) {
        if (str.isEmpty()) {
            return false;
        } else {
            for (int i = 0; i < str.length(); i++) {
                if (str.charAt(i) < '0' || str.charAt(i) > '9') return false;
            }
            int mes = Integer.parseInt(str);
            if (mes < 1 || mes > 1000000000) {
                return false;
            }
        }
        return true;
    }

    public double getPrecioParaAlquilar(){
        double factorCorreccion = 1;
        if (distanciaDelCentro > 100){
            factorCorreccion -= 0.2;
        }
        if (anoDeConstruccion > 100){
            factorCorreccion -= 0.2;
        }
        return precioMetro * area * factorCorreccion;
    }

    public String getDireccion() {
        return direccion;
    }
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    public int getArea() {
        return area;
    }
    public void setArea(int area) {
        this.area = area;
    }
    public int getAnoDeConstruccion() {
        return anoDeConstruccion;
    }
    public void setAnoDeConstruccion(int anoDeConstruccion) {
        this.anoDeConstruccion = anoDeConstruccion;
    }
    public int getDistanciaDelCentro() {
        return distanciaDelCentro;
    }
    public void setDistanciaDelCentro(int distanciaDelCentro) {
        this.distanciaDelCentro = distanciaDelCentro;
    }
    public boolean isAlquilado() {
        return alquilado;
    }
    public void setAlquilado(boolean alquilado) {
        this.alquilado = alquilado;
    }


}



