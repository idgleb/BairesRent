import javax.swing.*;

public class Inquilino {
    private String dni;
    private String nombre;

    public Inquilino(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }

    public static Inquilino crearInquilino() {

        String dni;
        do {
            dni = JOptionPane.showInputDialog(null, "dni? ");
            if (dni == null) dni = "";
        } while (dni.equals(""));

        String nombre;
        do {
            nombre = JOptionPane.showInputDialog(null, "nombre? ");
            if (nombre == null) nombre = "";
        } while (nombre.equals(""));

        Inquilino inquilino = new Inquilino(dni, nombre);

        return inquilino;

    }

    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
