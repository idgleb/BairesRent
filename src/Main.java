import javax.swing.*;

public class Main {
    public static void main(String[] args) {

        Contrato contrato = Contrato.crearContrato();




    int seleccion = 0;
        do {
            String[] opciones = {"Salir", "Crear contra", "qqq", "qqq", "Reporte"};
            seleccion = JOptionPane.showOptionDialog(
                    null,
                    "Seleccione una opción:",
                    "Ursol",
                    JOptionPane.DEFAULT_OPTION,
                    JOptionPane.INFORMATION_MESSAGE,
                    null,
                    opciones,
                    opciones[0]
            );
            switch (seleccion) {
                case 0:
                    //"Salir"
                    break;

                case 1:
                    //"Registrar Libro"
                    break;

                case 2:
                    //"Prestar"
                    break;

                case 3:
                    //"Devolver"
                    break;

                case 4:
                    //"Reporte"
                    break;

                default:
                    break;
            }
        } while (seleccion != 0);


    }
}