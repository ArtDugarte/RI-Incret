package ri_incret;

import java.awt.Toolkit;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;
import java.awt.Image;

public class Ventana_login extends javax.swing.JFrame {

    public Ventana_login() {
        initComponents();
        setLocationRelativeTo(null);
        setTitle("RI Incret");
        setIconImage(new ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/icono_titulo.png")).getImage());

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent evt) {
                close();
            }
        });
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        usuarioVL = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        contraVL = new javax.swing.JPasswordField();
        jLabel5 = new javax.swing.JLabel();
        iniciar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());
        setPreferredSize(new java.awt.Dimension(1024, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(103, 0, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Usuario");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        usuarioVL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        usuarioVL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usuarioVLActionPerformed(evt);
            }
        });
        jPanel1.add(usuarioVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 260, -1));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Contraseña");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        contraVL.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jPanel1.add(contraVL, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 260, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/Logo_base.png"))); // NOI18N
        jLabel5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 550, -1, -1));

        iniciar.setBackground(new java.awt.Color(255, 255, 255));
        iniciar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        iniciar.setText("Iniciar Sesión");
        iniciar.setToolTipText("");
        iniciar.setBorderPainted(false);
        iniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                iniciarActionPerformed(evt);
            }
        });
        jPanel1.add(iniciar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 340, 220, 50));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 350, 700));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setPreferredSize(new java.awt.Dimension(700, 668));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/1.png"))); // NOI18N
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(-340, 0, 1060, 700));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(342, 0, 720, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void usuarioVLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usuarioVLActionPerformed

    }//GEN-LAST:event_usuarioVLActionPerformed

    private void iniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_iniciarActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == iniciar) {
            if (usuarioVL.getText().equals("") || contraVL.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n       Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                correcto = false;
                usuarioVL.setText("");
                contraVL.setText("");
            } else {

                Modelo usu = new Modelo();
                Operar_Login OP = new Operar_Login();

                usu = null;
                usu = OP.IngresarUsuario(usuarioVL.getText(), contraVL.getText());

                if (usu != null) {
                    correcto = true;
                    id_usuario = 0;
                    usuario = "";
                    administrador = false;
                    usuario = usuarioVL.getText();
                    administrador = usu.isAdministrador();
                    id_usuario = usu.getid_usuario();
                    usuarioVL.setText("");
                    contraVL.setText("");
                } else {
                    correcto = false;
                    usuarioVL.setText("");
                    contraVL.setText("");
                }
            }
        }
    }//GEN-LAST:event_iniciarActionPerformed

    public int getid_usuario() {
        return id_usuario;
    }

    public boolean InicioCorrecto() {
        return correcto;
    }

    public boolean get_administrador() {
        return administrador;
    }

    public String get_usuario() {
        return usuario;
    }

    public void AsignarCorrecto(boolean correcto2) {
        correcto = correcto2;
    }

    private void close() {

        Toolkit.getDefaultToolkit().beep();

        if (JOptionPane.showConfirmDialog(null, "¿Desea salir del sistema?", "SALIDA DEL SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

            System.exit(0);
        }
    }

    static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_login().setVisible(true);
            }
        });
    }

    private boolean correcto = false;
    private String usuario = "";
    private boolean administrador = false;
    private int id_usuario = 0;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField contraVL;
    private javax.swing.JButton iniciar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField usuarioVL;
    // End of variables declaration//GEN-END:variables
}
