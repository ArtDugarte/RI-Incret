package ri_incret;

import javax.swing.JOptionPane;

public class Principal{

    public static void main(String[] args) {

        Ventana_login login;
        Ventana_inicio inicio = new Ventana_inicio();
        BDConex Conexion = new BDConex();

        while (inicio.volveraLogin() == true) {

            login = new Ventana_login();
            login.setVisible(true);

            while (login.InicioCorrecto() == false) {
                System.out.print("");
            }

            if (login.InicioCorrecto() == true) {

                inicio = new Ventana_inicio();
                inicio.setusuario(login.get_usuario());
                inicio.setadministrador(login.get_administrador());
                inicio.setid_usuario(login.getid_usuario());
                login.AsignarCorrecto(false);
                login.dispose();
                inicio.asignar(false);
                inicio.setVisible(true);

                while (inicio.volveraLogin() == false) {
                    System.out.print("");
                }
                inicio.dispose();
            }
        }
    }
}
