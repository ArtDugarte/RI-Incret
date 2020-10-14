package ri_incret;

import java.awt.Toolkit;
import java.awt.event.ItemEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class Ventana_inicio extends javax.swing.JFrame {

    public Ventana_inicio() {
        initComponents();

        setLocationRelativeTo(null);

        setTitle("RI Incret");
        setIconImage(new ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/icono_titulo.png")).getImage());
        Desplegable1.setSelectedItem("Préstamo");
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);

        addWindowListener(new WindowAdapter() {

            public void windowClosing(WindowEvent evt) {
                close();
            }
        });

        Linea1.setVisible(true);
        Linea2.setVisible(false);
        Linea3.setVisible(false);
        Linea4.setVisible(false);
        Linea5.setVisible(false);
        Linea6.setVisible(false);
        fechaEP.setText(DameFecha());
        calendario.setMinSelectableDate(new Date());
        TextoIDN.setVisible(false);
        TextoIDM.setVisible(false);
        cargarCBNombres();
        cargarCBMarcas();
        obtenerMatrizEstudiante();
        obtenerMatrizNombreInstru();
        obtenerMatrizMarcaInstru();
        obtenerMatrizInstrumento();
        obtenerMatrizUsuario();
        obtenerMatrizPrestamoActivo();
        obtenerMatrizPrestamoRetardado();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        Desplegable1 = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLayeredPane1 = new javax.swing.JLayeredPane();
        jPanel2 = new javax.swing.JPanel();
        Prestamo = new javax.swing.JButton();
        Registrar = new javax.swing.JButton();
        Modificar = new javax.swing.JButton();
        Borrar = new javax.swing.JButton();
        Listados = new javax.swing.JButton();
        Busqueda = new javax.swing.JButton();
        Linea1 = new javax.swing.JLabel();
        Linea2 = new javax.swing.JLabel();
        Linea3 = new javax.swing.JLabel();
        Linea4 = new javax.swing.JLabel();
        Linea5 = new javax.swing.JLabel();
        Linea6 = new javax.swing.JLabel();
        Base = new javax.swing.JPanel();
        PanelPrestamo = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        serial = new javax.swing.JTextField();
        nombreinstru = new javax.swing.JTextField();
        marcainstru = new javax.swing.JTextField();
        Limpiar = new javax.swing.JButton();
        RegistrarP = new javax.swing.JButton();
        cedula = new javax.swing.JTextField();
        nombreestu = new javax.swing.JTextField();
        apellidoestu = new javax.swing.JTextField();
        fechaEP = new javax.swing.JTextField();
        lupa1 = new javax.swing.JButton();
        lupa2 = new javax.swing.JButton();
        calendario = new com.toedter.calendar.JDateChooser();
        letra_cedulaP = new javax.swing.JComboBox<>();
        PanelDevo = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        D1 = new javax.swing.JLabel();
        D2 = new javax.swing.JLabel();
        D3 = new javax.swing.JLabel();
        D4 = new javax.swing.JLabel();
        D5 = new javax.swing.JLabel();
        D6 = new javax.swing.JLabel();
        marcainstruD = new javax.swing.JTextField();
        nombreinstruD = new javax.swing.JTextField();
        serialD = new javax.swing.JTextField();
        cedulaD = new javax.swing.JTextField();
        nombreD = new javax.swing.JTextField();
        fechadevoD = new javax.swing.JTextField();
        lupaD1 = new javax.swing.JButton();
        apellidoD = new javax.swing.JTextField();
        limpiarD = new javax.swing.JButton();
        registrarD = new javax.swing.JButton();
        letra_cedulaD = new javax.swing.JComboBox<>();
        RegistrarEstu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel37 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        numerotlfE = new javax.swing.JTextField();
        cedulaE = new javax.swing.JTextField();
        nombreE = new javax.swing.JTextField();
        apellidoE = new javax.swing.JTextField();
        DireccionE = new javax.swing.JTextField();
        limpiarE = new javax.swing.JButton();
        registrarE = new javax.swing.JButton();
        letra_cedula = new javax.swing.JComboBox<>();
        num_tlf = new javax.swing.JComboBox<>();
        RegistrarNombreInstru = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        nombreI = new javax.swing.JTextField();
        limpiarNI = new javax.swing.JButton();
        RegistrarNI = new javax.swing.JButton();
        RegistrarMarcaInstru = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        marcaI = new javax.swing.JTextField();
        limpiarMMI = new javax.swing.JButton();
        RegistrarMI = new javax.swing.JButton();
        RegistrarInstru = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        colorRI = new javax.swing.JTextField();
        serialRI = new javax.swing.JTextField();
        limpiarRI = new javax.swing.JButton();
        RegistrarI = new javax.swing.JButton();
        listaRI1 = new javax.swing.JComboBox<>();
        listaRI2 = new javax.swing.JComboBox<>();
        TextoIDM = new javax.swing.JTextField();
        TextoIDN = new javax.swing.JTextField();
        RegistrarUsu = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        nombreRU = new javax.swing.JTextField();
        limpiarRU = new javax.swing.JButton();
        registrarU = new javax.swing.JButton();
        contraseñaRU = new javax.swing.JPasswordField();
        cuadrito = new javax.swing.JCheckBox();
        ModificarEstu = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel53 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        jLabel55 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        numerotlfME = new javax.swing.JTextField();
        cedulaME = new javax.swing.JTextField();
        nombreME = new javax.swing.JTextField();
        apellidoME = new javax.swing.JTextField();
        direccionME = new javax.swing.JTextField();
        lupaME = new javax.swing.JButton();
        limpiarME = new javax.swing.JButton();
        ModificarE = new javax.swing.JButton();
        letra_cedulaME = new javax.swing.JComboBox<>();
        num_tlfME = new javax.swing.JComboBox<>();
        ModificarInstru = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        colorMI = new javax.swing.JTextField();
        serialMI = new javax.swing.JTextField();
        nombreMI = new javax.swing.JTextField();
        marcaMI = new javax.swing.JTextField();
        limpiarMI = new javax.swing.JButton();
        ModificarI = new javax.swing.JButton();
        lupaMI = new javax.swing.JButton();
        ModificarUsu = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        nombreMU = new javax.swing.JTextField();
        nuevacontraMU = new javax.swing.JPasswordField();
        contraseñaMU = new javax.swing.JPasswordField();
        limpiarMU = new javax.swing.JButton();
        ModificarU = new javax.swing.JButton();
        BorrarEstu = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        nombreBE = new javax.swing.JTextField();
        apellidoBE = new javax.swing.JTextField();
        direccionBE = new javax.swing.JTextField();
        numerotlfBE = new javax.swing.JTextField();
        limpiarBE = new javax.swing.JButton();
        BorrarEstudiante = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        cedulaBE = new javax.swing.JTextField();
        letra_cedulaB = new javax.swing.JComboBox<>();
        BorrarNomInsrtu = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        nombreBNI = new javax.swing.JTextField();
        limpiarBNI = new javax.swing.JButton();
        BorrarNomInstru = new javax.swing.JButton();
        BorrarMarcaInstru = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        marcaBMI = new javax.swing.JTextField();
        limpiarBMI = new javax.swing.JButton();
        BorrarMarcaI = new javax.swing.JButton();
        BorrarIntru = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        lupaBI = new javax.swing.JButton();
        limpiarBI = new javax.swing.JButton();
        BorrarInstrumento = new javax.swing.JButton();
        colorBI = new javax.swing.JTextField();
        serialBI = new javax.swing.JTextField();
        nombreBI = new javax.swing.JTextField();
        marcaBI = new javax.swing.JTextField();
        ListadoEstu = new javax.swing.JPanel();
        jLabel18 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaEstudiante = new javax.swing.JTable();
        ListadoNombInstru = new javax.swing.JPanel();
        jLabel19 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaNI = new javax.swing.JTable();
        ListadoMarcaInstru = new javax.swing.JPanel();
        jLabel20 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        TablaMI = new javax.swing.JTable();
        ListadoInstru = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jScrollPane4 = new javax.swing.JScrollPane();
        TablaInstrumento = new javax.swing.JTable();
        ListadoPrestamosAct = new javax.swing.JPanel();
        jLabel22 = new javax.swing.JLabel();
        jScrollPane5 = new javax.swing.JScrollPane();
        TablaPA = new javax.swing.JTable();
        ListaPrestamosRetra = new javax.swing.JPanel();
        jLabel23 = new javax.swing.JLabel();
        jScrollPane6 = new javax.swing.JScrollPane();
        TablaPR = new javax.swing.JTable();
        ListaUsu = new javax.swing.JPanel();
        jLabel24 = new javax.swing.JLabel();
        jScrollPane7 = new javax.swing.JScrollPane();
        TablaU = new javax.swing.JTable();
        BusquedaEstu = new javax.swing.JPanel();
        jLabel25 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        serialBUE = new javax.swing.JTextField();
        numerotlfBUE = new javax.swing.JTextField();
        cedulaBUE = new javax.swing.JTextField();
        nombreBUE = new javax.swing.JTextField();
        apellidoBUE = new javax.swing.JTextField();
        direccionBUE = new javax.swing.JTextField();
        LupaBE = new javax.swing.JButton();
        limpiarBUE = new javax.swing.JButton();
        letra_cedulaBE = new javax.swing.JComboBox<>();
        BusquedaInstru = new javax.swing.JPanel();
        jLabel26 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        cedulaBUI = new javax.swing.JTextField();
        colorBUI = new javax.swing.JTextField();
        serialBUI = new javax.swing.JTextField();
        nombreBUI = new javax.swing.JTextField();
        marcaBUI = new javax.swing.JTextField();
        LupaBI = new javax.swing.JButton();
        limpiarBUI = new javax.swing.JButton();
        BusquedaPresAct = new javax.swing.JPanel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        direccionBPA = new javax.swing.JTextField();
        cedulaBPA = new javax.swing.JTextField();
        nombreEBPA = new javax.swing.JTextField();
        apellidoBPA = new javax.swing.JTextField();
        numerotlfBPA = new javax.swing.JTextField();
        jLabel116 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        nombreIBPA = new javax.swing.JTextField();
        serialBPA = new javax.swing.JTextField();
        marcaBPA = new javax.swing.JTextField();
        colorBPA = new javax.swing.JTextField();
        fechaDBPA = new javax.swing.JTextField();
        jLabel104 = new javax.swing.JLabel();
        usuBPA = new javax.swing.JTextField();
        fechaEBPA = new javax.swing.JTextField();
        limpiarBPA = new javax.swing.JButton();
        LupaBPA = new javax.swing.JButton();
        letra_cedulaBPA = new javax.swing.JComboBox<>();
        Salir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1024, 700));
        setResizable(false);
        setSize(new java.awt.Dimension(1024, 700));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(103, 0, 0));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 700));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Desplegable1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Desplegable1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Préstamo", "Devolución" }));
        Desplegable1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        Desplegable1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                Desplegable1ItemStateChanged(evt);
            }
        });
        jPanel1.add(Desplegable1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, 300, -1));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Seleccione una Operación");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 200, 300, -1));

        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/Logo_base.png"))); // NOI18N
        jLabel17.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 3, true));
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 560, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 320, 700));

        jLayeredPane1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Prestamo.setBackground(new java.awt.Color(0, 0, 0));
        Prestamo.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Prestamo.setForeground(new java.awt.Color(255, 255, 255));
        Prestamo.setText("Préstamo/Devolución");
        Prestamo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrestamoActionPerformed(evt);
            }
        });
        jPanel2.add(Prestamo, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, -1, -1));

        Registrar.setBackground(new java.awt.Color(0, 0, 0));
        Registrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Registrar.setForeground(new java.awt.Color(255, 255, 255));
        Registrar.setText("Registrar");
        Registrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarActionPerformed(evt);
            }
        });
        jPanel2.add(Registrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 10, -1, -1));

        Modificar.setBackground(new java.awt.Color(0, 0, 0));
        Modificar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Modificar.setForeground(new java.awt.Color(255, 255, 255));
        Modificar.setText("Modificar");
        Modificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarActionPerformed(evt);
            }
        });
        jPanel2.add(Modificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 10, -1, -1));

        Borrar.setBackground(new java.awt.Color(0, 0, 0));
        Borrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Borrar.setForeground(new java.awt.Color(255, 255, 255));
        Borrar.setText("Borrar");
        Borrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarActionPerformed(evt);
            }
        });
        jPanel2.add(Borrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 10, -1, -1));

        Listados.setBackground(new java.awt.Color(0, 0, 0));
        Listados.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Listados.setForeground(new java.awt.Color(255, 255, 255));
        Listados.setText("Listados");
        Listados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ListadosActionPerformed(evt);
            }
        });
        jPanel2.add(Listados, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 10, -1, -1));

        Busqueda.setBackground(new java.awt.Color(0, 0, 0));
        Busqueda.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Busqueda.setForeground(new java.awt.Color(255, 255, 255));
        Busqueda.setText("Búsqueda");
        Busqueda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BusquedaActionPerformed(evt);
            }
        });
        jPanel2.add(Busqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 10, -1, -1));

        Linea1.setBackground(new java.awt.Color(153, 0, 0));
        Linea1.setMaximumSize(new java.awt.Dimension(10, 14));
        Linea1.setMinimumSize(new java.awt.Dimension(10, 14));
        Linea1.setOpaque(true);
        Linea1.setPreferredSize(new java.awt.Dimension(10, 10));
        jPanel2.add(Linea1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 40, 90, 5));

        Linea2.setBackground(new java.awt.Color(153, 0, 0));
        Linea2.setMaximumSize(new java.awt.Dimension(10, 14));
        Linea2.setMinimumSize(new java.awt.Dimension(10, 14));
        Linea2.setOpaque(true);
        Linea2.setPreferredSize(new java.awt.Dimension(10, 10));
        jPanel2.add(Linea2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, 50, 5));

        Linea3.setBackground(new java.awt.Color(153, 0, 0));
        Linea3.setMaximumSize(new java.awt.Dimension(10, 14));
        Linea3.setMinimumSize(new java.awt.Dimension(10, 14));
        Linea3.setOpaque(true);
        Linea3.setPreferredSize(new java.awt.Dimension(10, 10));
        jPanel2.add(Linea3, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 40, 50, 5));

        Linea4.setBackground(new java.awt.Color(153, 0, 0));
        Linea4.setMaximumSize(new java.awt.Dimension(10, 14));
        Linea4.setMinimumSize(new java.awt.Dimension(10, 14));
        Linea4.setOpaque(true);
        Linea4.setPreferredSize(new java.awt.Dimension(10, 10));
        jPanel2.add(Linea4, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 40, 30, 5));

        Linea5.setBackground(new java.awt.Color(153, 0, 0));
        Linea5.setMaximumSize(new java.awt.Dimension(10, 14));
        Linea5.setMinimumSize(new java.awt.Dimension(10, 14));
        Linea5.setOpaque(true);
        Linea5.setPreferredSize(new java.awt.Dimension(10, 10));
        jPanel2.add(Linea5, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 40, 60, 5));

        Linea6.setBackground(new java.awt.Color(153, 0, 0));
        Linea6.setMaximumSize(new java.awt.Dimension(10, 14));
        Linea6.setMinimumSize(new java.awt.Dimension(10, 14));
        Linea6.setOpaque(true);
        Linea6.setPreferredSize(new java.awt.Dimension(10, 10));
        jPanel2.add(Linea6, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 40, 50, 5));

        jLayeredPane1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 700, 70));

        Base.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        Base.setOpaque(false);
        Base.setLayout(new java.awt.CardLayout());

        PanelPrestamo.setOpaque(false);
        PanelPrestamo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel3.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel3.setText("Préstamo");
        PanelPrestamo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, 180, -1));

        jLabel28.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel28.setText("Fecha de Devolución");
        PanelPrestamo.add(jLabel28, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, -1, -1));

        jLabel29.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel29.setText("Cédula del Estudiante");
        PanelPrestamo.add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, -1, -1));

        jLabel30.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel30.setText("Nombre");
        PanelPrestamo.add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        jLabel31.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel31.setText("Apellido");
        PanelPrestamo.add(jLabel31, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 260, -1, -1));

        jLabel32.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel32.setText("Fecha de Entrega");
        PanelPrestamo.add(jLabel32, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 330, -1, -1));

        jLabel33.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel33.setText("Serial del Intrumento");
        PanelPrestamo.add(jLabel33, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, -1, -1));

        jLabel34.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel34.setText("Nombre del Intrumento");
        PanelPrestamo.add(jLabel34, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 190, -1, -1));

        jLabel35.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel35.setText("Marca del Intrumento");
        PanelPrestamo.add(jLabel35, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 260, -1, -1));

        serial.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelPrestamo.add(serial, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 250, -1));

        nombreinstru.setEditable(false);
        nombreinstru.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelPrestamo.add(nombreinstru, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 220, 250, -1));

        marcainstru.setEditable(false);
        marcainstru.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelPrestamo.add(marcainstru, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 250, -1));

        Limpiar.setBackground(new java.awt.Color(103, 0, 0));
        Limpiar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Limpiar.setForeground(new java.awt.Color(255, 255, 255));
        Limpiar.setText("Limpiar");
        Limpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LimpiarActionPerformed(evt);
            }
        });
        PanelPrestamo.add(Limpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        RegistrarP.setBackground(new java.awt.Color(103, 0, 0));
        RegistrarP.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegistrarP.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarP.setText("Registar");
        RegistrarP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarPActionPerformed(evt);
            }
        });
        PanelPrestamo.add(RegistrarP, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 500, -1, -1));

        cedula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaKeyTyped(evt);
            }
        });
        PanelPrestamo.add(cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 250, -1));

        nombreestu.setEditable(false);
        nombreestu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelPrestamo.add(nombreestu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 220, 250, -1));

        apellidoestu.setEditable(false);
        apellidoestu.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelPrestamo.add(apellidoestu, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 250, -1));

        fechaEP.setEditable(false);
        fechaEP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelPrestamo.add(fechaEP, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 360, 250, -1));

        lupa1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/icono_1.png"))); // NOI18N
        lupa1.setBorderPainted(false);
        lupa1.setContentAreaFilled(false);
        lupa1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/iconoapa.png"))); // NOI18N
        lupa1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupa1ActionPerformed(evt);
            }
        });
        PanelPrestamo.add(lupa1, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 140, 40, -1));

        lupa2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/icono_1.png"))); // NOI18N
        lupa2.setBorderPainted(false);
        lupa2.setContentAreaFilled(false);
        lupa2.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/iconoapa.png"))); // NOI18N
        lupa2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupa2ActionPerformed(evt);
            }
        });
        PanelPrestamo.add(lupa2, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 140, 40, 40));

        calendario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelPrestamo.add(calendario, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 360, 250, 30));

        letra_cedulaP.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedulaP.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-", "M-" }));
        letra_cedulaP.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaPItemStateChanged(evt);
            }
        });
        PanelPrestamo.add(letra_cedulaP, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 150, 50, 28));

        Base.add(PanelPrestamo, "card2");

        PanelDevo.setOpaque(false);
        PanelDevo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel4.setText("Devolución");
        PanelDevo.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 200, -1));

        jLabel36.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel36.setText("Fecha de Devolución");
        PanelDevo.add(jLabel36, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 380, -1, -1));

        D1.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        D1.setText("Cédula del Estudiante");
        PanelDevo.add(D1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, -1, -1));

        D2.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        D2.setText("Nombre");
        PanelDevo.add(D2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        D3.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        D3.setText("Apellido");
        PanelDevo.add(D3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        D4.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        D4.setText("Serial del Instrumento");
        PanelDevo.add(D4, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, -1, -1));

        D5.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        D5.setText("Nombre del Instrumento");
        PanelDevo.add(D5, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 210, -1, -1));

        D6.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        D6.setText("Marca del Instrumento");
        PanelDevo.add(D6, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 290, -1, -1));

        marcainstruD.setEditable(false);
        marcainstruD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelDevo.add(marcainstruD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 330, 250, -1));

        nombreinstruD.setEditable(false);
        nombreinstruD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelDevo.add(nombreinstruD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 250, -1));

        serialD.setEditable(false);
        serialD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelDevo.add(serialD, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 170, 250, -1));

        cedulaD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedulaD.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaDKeyTyped(evt);
            }
        });
        PanelDevo.add(cedulaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 250, 28));

        nombreD.setEditable(false);
        nombreD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelDevo.add(nombreD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 250, -1));

        fechadevoD.setEditable(false);
        fechadevoD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelDevo.add(fechadevoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 250, -1));

        lupaD1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/icono_1.png"))); // NOI18N
        lupaD1.setBorderPainted(false);
        lupaD1.setContentAreaFilled(false);
        lupaD1.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/iconoapa.png"))); // NOI18N
        lupaD1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaD1ActionPerformed(evt);
            }
        });
        PanelDevo.add(lupaD1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 160, 40, 40));

        apellidoD.setEditable(false);
        apellidoD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        PanelDevo.add(apellidoD, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 330, 250, -1));

        limpiarD.setBackground(new java.awt.Color(103, 0, 0));
        limpiarD.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarD.setForeground(new java.awt.Color(255, 255, 255));
        limpiarD.setText("Limpiar");
        limpiarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarDActionPerformed(evt);
            }
        });
        PanelDevo.add(limpiarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 500, -1, -1));

        registrarD.setBackground(new java.awt.Color(103, 0, 0));
        registrarD.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        registrarD.setForeground(new java.awt.Color(255, 255, 255));
        registrarD.setText("Registar");
        registrarD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarDActionPerformed(evt);
            }
        });
        PanelDevo.add(registrarD, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 500, -1, -1));

        letra_cedulaD.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedulaD.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-", "M-" }));
        letra_cedulaD.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaDItemStateChanged(evt);
            }
        });
        PanelDevo.add(letra_cedulaD, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 50, 28));

        Base.add(PanelDevo, "card3");

        RegistrarEstu.setOpaque(false);
        RegistrarEstu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setText("Estudiante");
        RegistrarEstu.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, 190, -1));

        jLabel37.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel37.setText("Número de Teléfono");
        RegistrarEstu.add(jLabel37, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 390, -1, -1));

        jLabel38.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel38.setText("Cédula del Estudiante");
        RegistrarEstu.add(jLabel38, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 90, -1, -1));

        jLabel39.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel39.setText("Nombre");
        RegistrarEstu.add(jLabel39, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 160, -1, -1));

        jLabel40.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel40.setText("Apellido");
        RegistrarEstu.add(jLabel40, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 240, -1, -1));

        jLabel41.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel41.setText("Dirección");
        RegistrarEstu.add(jLabel41, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 320, -1, -1));

        numerotlfE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        numerotlfE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numerotlfEActionPerformed(evt);
            }
        });
        numerotlfE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numerotlfEKeyTyped(evt);
            }
        });
        RegistrarEstu.add(numerotlfE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 260, -1));

        cedulaE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedulaE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaEKeyTyped(evt);
            }
        });
        RegistrarEstu.add(cedulaE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 130, 260, -1));

        nombreE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RegistrarEstu.add(nombreE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 260, -1));

        apellidoE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RegistrarEstu.add(apellidoE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 280, 260, -1));

        DireccionE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RegistrarEstu.add(DireccionE, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 260, -1));

        limpiarE.setBackground(new java.awt.Color(103, 0, 0));
        limpiarE.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarE.setForeground(new java.awt.Color(255, 255, 255));
        limpiarE.setText("Limpiar");
        limpiarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarEActionPerformed(evt);
            }
        });
        RegistrarEstu.add(limpiarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 490, -1, -1));

        registrarE.setBackground(new java.awt.Color(103, 0, 0));
        registrarE.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        registrarE.setForeground(new java.awt.Color(255, 255, 255));
        registrarE.setText("Registrar");
        registrarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEActionPerformed(evt);
            }
        });
        RegistrarEstu.add(registrarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 490, -1, -1));

        letra_cedula.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedula.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-", "M-" }));
        letra_cedula.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaItemStateChanged(evt);
            }
        });
        RegistrarEstu.add(letra_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 130, 50, 28));

        num_tlf.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num_tlf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0424", "0414", "0412", "0426", "0416", "0251", "0252", "0253" }));
        RegistrarEstu.add(num_tlf, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 430, 70, 28));

        Base.add(RegistrarEstu, "card4");

        RegistrarNombreInstru.setOpaque(false);
        RegistrarNombreInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel6.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel6.setText("Nombre del Instrumento");
        jLabel6.setToolTipText("");
        RegistrarNombreInstru.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, 420, -1));

        jLabel42.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel42.setText("Nombre ");
        RegistrarNombreInstru.add(jLabel42, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, -1, -1));

        nombreI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RegistrarNombreInstru.add(nombreI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 280, -1));

        limpiarNI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarNI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarNI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarNI.setText("Limpiar");
        limpiarNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarNIActionPerformed(evt);
            }
        });
        RegistrarNombreInstru.add(limpiarNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 490, -1, -1));

        RegistrarNI.setBackground(new java.awt.Color(103, 0, 0));
        RegistrarNI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegistrarNI.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarNI.setText("Registrar");
        RegistrarNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarNIActionPerformed(evt);
            }
        });
        RegistrarNombreInstru.add(RegistrarNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));

        Base.add(RegistrarNombreInstru, "card5");

        RegistrarMarcaInstru.setOpaque(false);
        RegistrarMarcaInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel7.setText("Marca del Instrumento");
        RegistrarMarcaInstru.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, 410, -1));

        jLabel43.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel43.setText("Marca");
        RegistrarMarcaInstru.add(jLabel43, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, -1, -1));

        marcaI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        marcaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                marcaIActionPerformed(evt);
            }
        });
        RegistrarMarcaInstru.add(marcaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 250, 280, -1));

        limpiarMMI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarMMI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarMMI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarMMI.setText("Limpiar");
        limpiarMMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarMMIActionPerformed(evt);
            }
        });
        RegistrarMarcaInstru.add(limpiarMMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        RegistrarMI.setBackground(new java.awt.Color(103, 0, 0));
        RegistrarMI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegistrarMI.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarMI.setText("Registrar");
        RegistrarMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarMIActionPerformed(evt);
            }
        });
        RegistrarMarcaInstru.add(RegistrarMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        Base.add(RegistrarMarcaInstru, "card6");

        RegistrarInstru.setOpaque(false);
        RegistrarInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel8.setText("Instrumento");
        RegistrarInstru.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, 210, -1));

        jLabel44.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel44.setText("Color");
        RegistrarInstru.add(jLabel44, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 370, 70, -1));

        jLabel45.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel45.setText("Serial");
        RegistrarInstru.add(jLabel45, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, -1, -1));

        jLabel46.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel46.setText("Nombre");
        RegistrarInstru.add(jLabel46, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        jLabel47.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel47.setText("Marca");
        RegistrarInstru.add(jLabel47, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, -1, 30));

        colorRI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        colorRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorRIActionPerformed(evt);
            }
        });
        colorRI.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                colorRIKeyTyped(evt);
            }
        });
        RegistrarInstru.add(colorRI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 230, -1));

        serialRI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RegistrarInstru.add(serialRI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 230, -1));

        limpiarRI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarRI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarRI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarRI.setText("Limpiar");
        limpiarRI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarRIActionPerformed(evt);
            }
        });
        RegistrarInstru.add(limpiarRI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        RegistrarI.setBackground(new java.awt.Color(103, 0, 0));
        RegistrarI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        RegistrarI.setForeground(new java.awt.Color(255, 255, 255));
        RegistrarI.setText("Registrar");
        RegistrarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RegistrarIActionPerformed(evt);
            }
        });
        RegistrarInstru.add(RegistrarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 490, -1, -1));

        listaRI1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        listaRI1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaRI1ItemStateChanged(evt);
            }
        });
        RegistrarInstru.add(listaRI1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 230, -1));

        listaRI2.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        listaRI2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                listaRI2ItemStateChanged(evt);
            }
        });
        RegistrarInstru.add(listaRI2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 330, 230, -1));

        TextoIDM.setEditable(false);
        RegistrarInstru.add(TextoIDM, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 340, 10, -1));

        TextoIDN.setEditable(false);
        RegistrarInstru.add(TextoIDN, new org.netbeans.lib.awtextra.AbsoluteConstraints(316, 250, 10, 20));

        Base.add(RegistrarInstru, "card7");

        RegistrarUsu.setOpaque(false);
        RegistrarUsu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel9.setText("Usuario");
        RegistrarUsu.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, 150, -1));

        jLabel48.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel48.setText("Administrador");
        RegistrarUsu.add(jLabel48, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, -1, -1));

        jLabel49.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel49.setText("Nombre");
        RegistrarUsu.add(jLabel49, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        jLabel50.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel50.setText("Contraseña");
        RegistrarUsu.add(jLabel50, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 240, -1, -1));

        nombreRU.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RegistrarUsu.add(nombreRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, 240, -1));

        limpiarRU.setBackground(new java.awt.Color(103, 0, 0));
        limpiarRU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarRU.setForeground(new java.awt.Color(255, 255, 255));
        limpiarRU.setText("Limpiar");
        limpiarRU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarRUActionPerformed(evt);
            }
        });
        RegistrarUsu.add(limpiarRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 500, -1, -1));

        registrarU.setBackground(new java.awt.Color(103, 0, 0));
        registrarU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        registrarU.setForeground(new java.awt.Color(255, 255, 255));
        registrarU.setText("Registrar");
        registrarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUActionPerformed(evt);
            }
        });
        RegistrarUsu.add(registrarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));

        contraseñaRU.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        RegistrarUsu.add(contraseñaRU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 240, -1));

        cuadrito.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cuadrito.setContentAreaFilled(false);
        cuadrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/checkbox1-35.png"))); // NOI18N
        cuadrito.setSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/checkbox2.png"))); // NOI18N
        RegistrarUsu.add(cuadrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 40, 40));

        Base.add(RegistrarUsu, "card8");

        ModificarEstu.setOpaque(false);
        ModificarEstu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel10.setText("Estudiante");
        ModificarEstu.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel51.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel51.setText("Número de Teléfono");
        ModificarEstu.add(jLabel51, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, -1, -1));

        jLabel53.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel53.setText("Nombre");
        ModificarEstu.add(jLabel53, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, -1, -1));

        jLabel54.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel54.setText("Apellido");
        ModificarEstu.add(jLabel54, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 220, -1, -1));

        jLabel55.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel55.setText("Dirección");
        ModificarEstu.add(jLabel55, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 310, -1, -1));

        jLabel56.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel56.setText("Ingrese la Cédula del");
        ModificarEstu.add(jLabel56, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, -1));

        jLabel52.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel52.setText("Estudiante a Modificar");
        ModificarEstu.add(jLabel52, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 220, -1, -1));

        numerotlfME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        numerotlfME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                numerotlfMEKeyTyped(evt);
            }
        });
        ModificarEstu.add(numerotlfME, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 440, 240, 30));

        cedulaME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedulaME.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaMEKeyTyped(evt);
            }
        });
        ModificarEstu.add(cedulaME, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 260, 260, -1));

        nombreME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarEstu.add(nombreME, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 170, 240, 30));

        apellidoME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarEstu.add(apellidoME, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 260, 240, 30));

        direccionME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarEstu.add(direccionME, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 350, 240, 30));

        lupaME.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/icono_1.png"))); // NOI18N
        lupaME.setBorderPainted(false);
        lupaME.setContentAreaFilled(false);
        lupaME.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/iconoapa.png"))); // NOI18N
        lupaME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaMEActionPerformed(evt);
            }
        });
        ModificarEstu.add(lupaME, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 250, 40, 40));

        limpiarME.setBackground(new java.awt.Color(103, 0, 0));
        limpiarME.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarME.setForeground(new java.awt.Color(255, 255, 255));
        limpiarME.setText("Limpiar");
        limpiarME.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarMEActionPerformed(evt);
            }
        });
        ModificarEstu.add(limpiarME, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 500, -1, -1));

        ModificarE.setBackground(new java.awt.Color(103, 0, 0));
        ModificarE.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ModificarE.setForeground(new java.awt.Color(255, 255, 255));
        ModificarE.setText("Modificar");
        ModificarE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarEActionPerformed(evt);
            }
        });
        ModificarEstu.add(ModificarE, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, -1));

        letra_cedulaME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedulaME.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-", "M-" }));
        letra_cedulaME.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaMEItemStateChanged(evt);
            }
        });
        ModificarEstu.add(letra_cedulaME, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 50, 28));

        num_tlfME.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        num_tlfME.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "0424", "0414", "0412", "0426", "0416", "0251", "0252", "0253" }));
        ModificarEstu.add(num_tlfME, new org.netbeans.lib.awtextra.AbsoluteConstraints(323, 440, 70, -1));

        Base.add(ModificarEstu, "card9");

        ModificarInstru.setOpaque(false);
        ModificarInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel11.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel11.setText("Instrumento");
        ModificarInstru.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel57.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel57.setText("Ingrese el serial del");
        ModificarInstru.add(jLabel57, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, -1, -1));

        jLabel58.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel58.setText("instrumento a modificar");
        ModificarInstru.add(jLabel58, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 240, -1, -1));

        jLabel59.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel59.setText("Nombre");
        ModificarInstru.add(jLabel59, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 160, -1, -1));

        jLabel60.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel60.setText("Marca");
        ModificarInstru.add(jLabel60, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 240, -1, -1));

        jLabel61.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel61.setText("Color");
        ModificarInstru.add(jLabel61, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 330, -1, -1));

        colorMI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarInstru.add(colorMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 370, 210, -1));

        serialMI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarInstru.add(serialMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 280, -1));

        nombreMI.setEditable(false);
        nombreMI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarInstru.add(nombreMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 200, 210, -1));

        marcaMI.setEditable(false);
        marcaMI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarInstru.add(marcaMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, 210, -1));

        limpiarMI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarMI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarMI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarMI.setText("Limpiar");
        limpiarMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarMIActionPerformed(evt);
            }
        });
        ModificarInstru.add(limpiarMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 500, -1, -1));

        ModificarI.setBackground(new java.awt.Color(103, 0, 0));
        ModificarI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ModificarI.setForeground(new java.awt.Color(255, 255, 255));
        ModificarI.setText("Modificar");
        ModificarI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarIActionPerformed(evt);
            }
        });
        ModificarInstru.add(ModificarI, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 500, -1, -1));

        lupaMI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/icono_1.png"))); // NOI18N
        lupaMI.setBorderPainted(false);
        lupaMI.setContentAreaFilled(false);
        lupaMI.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/iconoapa.png"))); // NOI18N
        lupaMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaMIActionPerformed(evt);
            }
        });
        ModificarInstru.add(lupaMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 40, 40));

        Base.add(ModificarInstru, "card10");

        ModificarUsu.setOpaque(false);
        ModificarUsu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel12.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel12.setText("Usuario");
        ModificarUsu.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel62.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel62.setText("Nombre de Usuario");
        ModificarUsu.add(jLabel62, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 160, -1, -1));

        jLabel63.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel63.setText("Contraseña");
        ModificarUsu.add(jLabel63, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jLabel64.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel64.setText("Nueva Contraseña");
        ModificarUsu.add(jLabel64, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, -1));

        nombreMU.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarUsu.add(nombreMU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 220, -1));

        nuevacontraMU.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarUsu.add(nuevacontraMU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 220, -1));

        contraseñaMU.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        ModificarUsu.add(contraseñaMU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 290, 220, -1));

        limpiarMU.setBackground(new java.awt.Color(103, 0, 0));
        limpiarMU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarMU.setForeground(new java.awt.Color(255, 255, 255));
        limpiarMU.setText("Limpiar");
        limpiarMU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarMUActionPerformed(evt);
            }
        });
        ModificarUsu.add(limpiarMU, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        ModificarU.setBackground(new java.awt.Color(103, 0, 0));
        ModificarU.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        ModificarU.setForeground(new java.awt.Color(255, 255, 255));
        ModificarU.setText("Modificar");
        ModificarU.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModificarUActionPerformed(evt);
            }
        });
        ModificarUsu.add(ModificarU, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 500, -1, -1));

        Base.add(ModificarUsu, "card11");

        BorrarEstu.setOpaque(false);
        BorrarEstu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel13.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel13.setText("Estudiante");
        BorrarEstu.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, -1));

        jLabel65.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel65.setText("Ingrese la Cédula del");
        BorrarEstu.add(jLabel65, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 210, -1, -1));

        jLabel66.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel66.setText("Estudiante a borrar");
        BorrarEstu.add(jLabel66, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 240, -1, -1));

        jLabel67.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel67.setText("Nombre");
        BorrarEstu.add(jLabel67, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 140, -1, -1));

        jLabel68.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel68.setText("Apellido");
        BorrarEstu.add(jLabel68, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 210, -1, -1));

        jLabel69.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel69.setText("Dirección");
        BorrarEstu.add(jLabel69, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 280, -1, -1));

        jLabel70.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel70.setText("Número Telefónico");
        BorrarEstu.add(jLabel70, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 360, -1, -1));

        nombreBE.setEditable(false);
        nombreBE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarEstu.add(nombreBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 180, 220, -1));

        apellidoBE.setEditable(false);
        apellidoBE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarEstu.add(apellidoBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 250, 220, -1));

        direccionBE.setEditable(false);
        direccionBE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarEstu.add(direccionBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 320, 220, -1));

        numerotlfBE.setEditable(false);
        numerotlfBE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarEstu.add(numerotlfBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 400, 220, -1));

        limpiarBE.setBackground(new java.awt.Color(103, 0, 0));
        limpiarBE.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarBE.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBE.setText("Limpiar");
        limpiarBE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBEActionPerformed(evt);
            }
        });
        BorrarEstu.add(limpiarBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        BorrarEstudiante.setBackground(new java.awt.Color(103, 0, 0));
        BorrarEstudiante.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        BorrarEstudiante.setForeground(new java.awt.Color(255, 255, 255));
        BorrarEstudiante.setText("Borrar");
        BorrarEstudiante.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarEstudianteActionPerformed(evt);
            }
        });
        BorrarEstu.add(BorrarEstudiante, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        jButton10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/icono_1.png"))); // NOI18N
        jButton10.setBorderPainted(false);
        jButton10.setContentAreaFilled(false);
        jButton10.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/iconoapa.png"))); // NOI18N
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });
        BorrarEstu.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 270, 40, 40));

        cedulaBE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedulaBE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaBEKeyTyped(evt);
            }
        });
        BorrarEstu.add(cedulaBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 240, -1));

        letra_cedulaB.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedulaB.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-", "M-" }));
        letra_cedulaB.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaBItemStateChanged(evt);
            }
        });
        BorrarEstu.add(letra_cedulaB, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 280, 50, 28));

        Base.add(BorrarEstu, "card12");

        BorrarNomInsrtu.setOpaque(false);
        BorrarNomInsrtu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel14.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel14.setText("Nombre del Instrumento");
        BorrarNomInsrtu.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 20, -1, -1));

        jLabel71.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel71.setText("Nombre");
        BorrarNomInsrtu.add(jLabel71, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 220, -1, -1));

        nombreBNI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarNomInsrtu.add(nombreBNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 250, -1));

        limpiarBNI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarBNI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarBNI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBNI.setText("Limpiar");
        limpiarBNI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBNIActionPerformed(evt);
            }
        });
        BorrarNomInsrtu.add(limpiarBNI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 490, -1, -1));

        BorrarNomInstru.setBackground(new java.awt.Color(103, 0, 0));
        BorrarNomInstru.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        BorrarNomInstru.setForeground(new java.awt.Color(255, 255, 255));
        BorrarNomInstru.setText("Borrar");
        BorrarNomInstru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarNomInstruActionPerformed(evt);
            }
        });
        BorrarNomInsrtu.add(BorrarNomInstru, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 490, -1, -1));

        Base.add(BorrarNomInsrtu, "card13");

        BorrarMarcaInstru.setOpaque(false);
        BorrarMarcaInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel15.setText("Marca del Instrumento");
        BorrarMarcaInstru.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 20, -1, -1));

        jLabel72.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel72.setText("Marca");
        BorrarMarcaInstru.add(jLabel72, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        marcaBMI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarMarcaInstru.add(marcaBMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, 240, -1));

        limpiarBMI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarBMI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarBMI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBMI.setText("Limpiar");
        limpiarBMI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBMIActionPerformed(evt);
            }
        });
        BorrarMarcaInstru.add(limpiarBMI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        BorrarMarcaI.setBackground(new java.awt.Color(103, 0, 0));
        BorrarMarcaI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        BorrarMarcaI.setForeground(new java.awt.Color(255, 255, 255));
        BorrarMarcaI.setText("Borrar");
        BorrarMarcaI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarMarcaIActionPerformed(evt);
            }
        });
        BorrarMarcaInstru.add(BorrarMarcaI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, -1, -1));

        Base.add(BorrarMarcaInstru, "card14");

        BorrarIntru.setOpaque(false);
        BorrarIntru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel16.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel16.setText("Instrumento");
        BorrarIntru.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel73.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel73.setText("Ingrese el serial del");
        BorrarIntru.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        jLabel74.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel74.setText("instrumento a borrar");
        BorrarIntru.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel75.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel75.setText("Nombre");
        BorrarIntru.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 170, -1, -1));

        jLabel76.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel76.setText("Marca");
        BorrarIntru.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 250, -1, -1));

        jLabel77.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel77.setText("Color");
        BorrarIntru.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        lupaBI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        lupaBI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/icono_1.png"))); // NOI18N
        lupaBI.setBorderPainted(false);
        lupaBI.setContentAreaFilled(false);
        lupaBI.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/iconoapa.png"))); // NOI18N
        lupaBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lupaBIActionPerformed(evt);
            }
        });
        BorrarIntru.add(lupaBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 250, 40, 40));

        limpiarBI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarBI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarBI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBI.setText("Limpiar");
        limpiarBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBIActionPerformed(evt);
            }
        });
        BorrarIntru.add(limpiarBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        BorrarInstrumento.setBackground(new java.awt.Color(103, 0, 0));
        BorrarInstrumento.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        BorrarInstrumento.setForeground(new java.awt.Color(255, 255, 255));
        BorrarInstrumento.setText("Borrar");
        BorrarInstrumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BorrarInstrumentoActionPerformed(evt);
            }
        });
        BorrarIntru.add(BorrarInstrumento, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 500, -1, -1));

        colorBI.setEditable(false);
        colorBI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarIntru.add(colorBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 360, 240, -1));

        serialBI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarIntru.add(serialBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 240, -1));

        nombreBI.setEditable(false);
        nombreBI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        nombreBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreBIActionPerformed(evt);
            }
        });
        BorrarIntru.add(nombreBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 200, 240, -1));

        marcaBI.setEditable(false);
        marcaBI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BorrarIntru.add(marcaBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 280, 240, -1));

        Base.add(BorrarIntru, "card15");

        ListadoEstu.setOpaque(false);
        ListadoEstu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel18.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel18.setText("Estudiantes");
        ListadoEstu.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        TablaEstudiante.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaEstudiante.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        TablaEstudiante.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Apellido", "Cédula", "Dirección", "Número Telefónico"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaEstudiante.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(TablaEstudiante);

        ListadoEstu.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 80, 610, 450));

        Base.add(ListadoEstu, "card17");

        ListadoNombInstru.setOpaque(false);
        ListadoNombInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel19.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel19.setText("Nombre de los Instrumentos");
        ListadoNombInstru.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 20, -1, -1));

        jScrollPane2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        TablaNI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaNI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TablaNI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "     Nombre"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaNI.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane2.setViewportView(TablaNI);

        ListadoNombInstru.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 80, 610, 450));

        Base.add(ListadoNombInstru, "card18");

        ListadoMarcaInstru.setOpaque(false);
        ListadoMarcaInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel20.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel20.setText("Marca de Instrumentos");
        ListadoMarcaInstru.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 20, -1, -1));

        jScrollPane3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));
        jScrollPane3.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        TablaMI.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaMI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TablaMI.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "    Marca"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaMI.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane3.setViewportView(TablaMI);

        ListadoMarcaInstru.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 80, 610, 450));

        Base.add(ListadoMarcaInstru, "card19");

        ListadoInstru.setOpaque(false);
        ListadoInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel21.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel21.setText("Instrumentos");
        ListadoInstru.add(jLabel21, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 20, -1, -1));

        jScrollPane4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        TablaInstrumento.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaInstrumento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TablaInstrumento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Marca", "Color", "Serial"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaInstrumento.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane4.setViewportView(TablaInstrumento);

        ListadoInstru.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 81, 610, 450));

        Base.add(ListadoInstru, "card20");

        ListadoPrestamosAct.setOpaque(false);
        ListadoPrestamosAct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel22.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel22.setText("Préstamos Activos");
        ListadoPrestamosAct.add(jLabel22, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 20, -1, -1));

        jScrollPane5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        TablaPA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TablaPA.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario de Turno", "Cédula del Estudiante", "Serial del Instrumento", "Fecha de Entrega", "Fecha de Devolución"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPA.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane5.setViewportView(TablaPA);

        ListadoPrestamosAct.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 80, 610, 450));

        Base.add(ListadoPrestamosAct, "card21");

        ListaPrestamosRetra.setOpaque(false);
        ListaPrestamosRetra.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel23.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel23.setText("Préstamos Retrasados");
        ListaPrestamosRetra.add(jLabel23, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 20, -1, -1));

        jScrollPane6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        TablaPR.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaPR.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TablaPR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Usuario de Turno", "Cédula del Estudiente", "Serial del Instrumento", "Fecha de Entrega", "Fecha de Devolución"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaPR.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane6.setViewportView(TablaPR);

        ListaPrestamosRetra.add(jScrollPane6, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 80, 610, 450));

        Base.add(ListaPrestamosRetra, "card22");

        ListaUsu.setOpaque(false);
        ListaUsu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel24.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel24.setText("Usuarios");
        ListaUsu.add(jLabel24, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 20, -1, -1));

        jScrollPane7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 3));

        TablaU.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TablaU.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        TablaU.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre", "Administrador"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        TablaU.setGridColor(new java.awt.Color(0, 0, 0));
        jScrollPane7.setViewportView(TablaU);

        ListaUsu.add(jScrollPane7, new org.netbeans.lib.awtextra.AbsoluteConstraints(22, 80, 610, 450));

        Base.add(ListaUsu, "card23");

        BusquedaEstu.setOpaque(false);
        BusquedaEstu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel25.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel25.setText("Estudiante");
        BusquedaEstu.add(jLabel25, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 20, -1, -1));

        jLabel79.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel79.setText("Ingrese la Cédula del");
        BusquedaEstu.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, -1, -1));

        jLabel80.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel80.setText("Estudiante a Buscar");
        BusquedaEstu.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, -1, -1));

        jLabel81.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel81.setText("Instrumento Asignado,");
        BusquedaEstu.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 290, -1, -1));

        jLabel82.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel82.setText("Serial N°");
        BusquedaEstu.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 320, -1, -1));

        jLabel83.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel83.setText("Nombre");
        BusquedaEstu.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));

        jLabel84.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel84.setText("Apellido");
        BusquedaEstu.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, -1, -1));

        jLabel85.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel85.setText("Dirección");
        BusquedaEstu.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, -1, -1));

        jLabel86.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel86.setText("Número Telefónico");
        BusquedaEstu.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 350, -1, -1));

        serialBUE.setEditable(false);
        serialBUE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaEstu.add(serialBUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 360, 250, -1));

        numerotlfBUE.setEditable(false);
        numerotlfBUE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaEstu.add(numerotlfBUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 250, -1));

        cedulaBUE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedulaBUE.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaBUEKeyTyped(evt);
            }
        });
        BusquedaEstu.add(cedulaBUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 250, -1));

        nombreBUE.setEditable(false);
        nombreBUE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaEstu.add(nombreBUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 150, 250, -1));

        apellidoBUE.setEditable(false);
        apellidoBUE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaEstu.add(apellidoBUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, 250, -1));

        direccionBUE.setEditable(false);
        direccionBUE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaEstu.add(direccionBUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 310, 250, -1));

        LupaBE.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/icono_1.png"))); // NOI18N
        LupaBE.setBorderPainted(false);
        LupaBE.setContentAreaFilled(false);
        LupaBE.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/iconoapa.png"))); // NOI18N
        LupaBE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LupaBEActionPerformed(evt);
            }
        });
        BusquedaEstu.add(LupaBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 210, 40, 40));

        limpiarBUE.setBackground(new java.awt.Color(103, 0, 0));
        limpiarBUE.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarBUE.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBUE.setText("Limpiar");
        limpiarBUE.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBUEActionPerformed(evt);
            }
        });
        BusquedaEstu.add(limpiarBUE, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        letra_cedulaBE.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedulaBE.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-", "M-" }));
        letra_cedulaBE.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaBEItemStateChanged(evt);
            }
        });
        BusquedaEstu.add(letra_cedulaBE, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 220, 50, 28));

        Base.add(BusquedaEstu, "card24");

        BusquedaInstru.setOpaque(false);
        BusquedaInstru.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel26.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel26.setText("Instrumento");
        BusquedaInstru.add(jLabel26, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        jLabel87.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel87.setText("Ingrese el Serial del");
        BusquedaInstru.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jLabel88.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel88.setText("Instrumento a Buscar");
        BusquedaInstru.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jLabel89.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel89.setText("Estudiante Asignado,");
        BusquedaInstru.add(jLabel89, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 290, -1, -1));

        jLabel90.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel90.setText("Cédula N°");
        BusquedaInstru.add(jLabel90, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, -1, -1));

        jLabel91.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel91.setText("Nombre");
        BusquedaInstru.add(jLabel91, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 140, -1, -1));

        jLabel92.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel92.setText("Marca");
        BusquedaInstru.add(jLabel92, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 230, -1, -1));

        jLabel93.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel93.setText("Color");
        BusquedaInstru.add(jLabel93, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, -1, -1));

        cedulaBUI.setEditable(false);
        cedulaBUI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaInstru.add(cedulaBUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 370, 260, -1));

        colorBUI.setEditable(false);
        colorBUI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaInstru.add(colorBUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 370, 260, -1));

        serialBUI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaInstru.add(serialBUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, 260, -1));

        nombreBUI.setEditable(false);
        nombreBUI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaInstru.add(nombreBUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 180, 260, -1));

        marcaBUI.setEditable(false);
        marcaBUI.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaInstru.add(marcaBUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 260, -1));

        LupaBI.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/icono_1.png"))); // NOI18N
        LupaBI.setBorderPainted(false);
        LupaBI.setContentAreaFilled(false);
        LupaBI.setDefaultCapable(false);
        LupaBI.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/iconoapa.png"))); // NOI18N
        LupaBI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LupaBIActionPerformed(evt);
            }
        });
        BusquedaInstru.add(LupaBI, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 220, 40, 40));

        limpiarBUI.setBackground(new java.awt.Color(103, 0, 0));
        limpiarBUI.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarBUI.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBUI.setText("Limpiar");
        limpiarBUI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBUIActionPerformed(evt);
            }
        });
        BusquedaInstru.add(limpiarBUI, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, -1, -1));

        Base.add(BusquedaInstru, "card25");

        BusquedaPresAct.setOpaque(false);
        BusquedaPresAct.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel108.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel108.setText("Préstamo Activo");
        BusquedaPresAct.add(jLabel108, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 10, -1, -1));

        jLabel109.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel109.setText("Ingrese la Cédula del");
        BusquedaPresAct.add(jLabel109, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 70, -1, -1));

        jLabel110.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel110.setText("Estudiante a Buscar");
        BusquedaPresAct.add(jLabel110, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, -1, -1));

        jLabel111.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel111.setText("Nombre del Estudiante");
        BusquedaPresAct.add(jLabel111, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, -1, -1));

        jLabel112.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel112.setText("Apellido del Estudiante");
        BusquedaPresAct.add(jLabel112, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, -1, -1));

        jLabel114.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel114.setText("Dirección");
        BusquedaPresAct.add(jLabel114, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 340, -1, -1));

        jLabel115.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel115.setText("Número Telefónico");
        BusquedaPresAct.add(jLabel115, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, -1, -1));

        direccionBPA.setEditable(false);
        direccionBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(direccionBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 370, 250, -1));

        cedulaBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        cedulaBPA.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                cedulaBPAKeyTyped(evt);
            }
        });
        BusquedaPresAct.add(cedulaBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 250, -1));

        nombreEBPA.setEditable(false);
        nombreEBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(nombreEBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 250, -1));

        apellidoBPA.setEditable(false);
        apellidoBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(apellidoBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 250, 250, -1));

        numerotlfBPA.setEditable(false);
        numerotlfBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(numerotlfBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 310, 250, -1));

        jLabel116.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel116.setText("Registrado por");
        BusquedaPresAct.add(jLabel116, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 340, -1, -1));

        jLabel117.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel117.setText("Fecha de Entrega");
        BusquedaPresAct.add(jLabel117, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 400, -1, -1));

        jLabel118.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel118.setText("Fecha de Devolución");
        BusquedaPresAct.add(jLabel118, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 400, -1, -1));

        jLabel120.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel120.setText("Serial del Instrumento");
        BusquedaPresAct.add(jLabel120, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 160, -1, -1));

        jLabel121.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel121.setText("Color del Instrumento");
        BusquedaPresAct.add(jLabel121, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 280, -1, -1));

        jLabel122.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel122.setText("Marca del Instrumento");
        BusquedaPresAct.add(jLabel122, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 220, -1, -1));

        nombreIBPA.setEditable(false);
        nombreIBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(nombreIBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 130, 270, -1));

        serialBPA.setEditable(false);
        serialBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(serialBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 190, 270, -1));

        marcaBPA.setEditable(false);
        marcaBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(marcaBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 250, 270, -1));

        colorBPA.setEditable(false);
        colorBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(colorBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 310, 270, -1));

        fechaDBPA.setEditable(false);
        fechaDBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(fechaDBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 430, 270, -1));

        jLabel104.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jLabel104.setText("Nombre del Instrumento");
        BusquedaPresAct.add(jLabel104, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));

        usuBPA.setEditable(false);
        usuBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(usuBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 370, 270, -1));

        fechaEBPA.setEditable(false);
        fechaEBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        BusquedaPresAct.add(fechaEBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 430, 250, -1));

        limpiarBPA.setBackground(new java.awt.Color(103, 0, 0));
        limpiarBPA.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        limpiarBPA.setForeground(new java.awt.Color(255, 255, 255));
        limpiarBPA.setText("Limpiar");
        limpiarBPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiarBPAActionPerformed(evt);
            }
        });
        BusquedaPresAct.add(limpiarBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 490, -1, -1));

        LupaBPA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/icono_1.png"))); // NOI18N
        LupaBPA.setBorderPainted(false);
        LupaBPA.setContentAreaFilled(false);
        LupaBPA.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/iconoapa.png"))); // NOI18N
        LupaBPA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LupaBPAActionPerformed(evt);
            }
        });
        BusquedaPresAct.add(LupaBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 120, 50, -1));

        letra_cedulaBPA.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        letra_cedulaBPA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "E-", "M-" }));
        letra_cedulaBPA.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                letra_cedulaBPAItemStateChanged(evt);
            }
        });
        BusquedaPresAct.add(letra_cedulaBPA, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 50, 28));

        Base.add(BusquedaPresAct, "card26");

        jLayeredPane1.add(Base, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 60, 660, 560));

        Salir.setBackground(new java.awt.Color(103, 0, 0));
        Salir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        Salir.setForeground(new java.awt.Color(255, 255, 255));
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        jLayeredPane1.add(Salir, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 620, 90, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ri_incret/Imagenes_fondo/1_1.png"))); // NOI18N
        jLayeredPane1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-320, 0, 1020, 700));

        getContentPane().add(jLayeredPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 0, 700, 700));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void PrestamoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PrestamoActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == Prestamo) {
            Linea1.setVisible(true);
            Linea2.setVisible(false);
            Linea3.setVisible(false);
            Linea4.setVisible(false);
            Linea5.setVisible(false);
            Linea6.setVisible(false);

            Desplegable1.removeAllItems();
            Desplegable1.addItem("Préstamo");
            Desplegable1.addItem("Devolución");
            Desplegable1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_PrestamoActionPerformed

    private void RegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == Registrar) {
            Linea1.setVisible(false);
            Linea2.setVisible(true);
            Linea3.setVisible(false);
            Linea4.setVisible(false);
            Linea5.setVisible(false);
            Linea6.setVisible(false);

            Desplegable1.removeAllItems();
            Desplegable1.addItem("Estudiante");
            Desplegable1.addItem("Nombre del Instrumento");
            Desplegable1.addItem("Marca del Instrumento");
            Desplegable1.addItem("Instrumento");
            Desplegable1.addItem("Usuario");
            Desplegable1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_RegistrarActionPerformed

    private void ListadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ListadosActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == Listados) {
            Linea1.setVisible(false);
            Linea2.setVisible(false);
            Linea3.setVisible(false);
            Linea4.setVisible(false);
            Linea5.setVisible(true);
            Linea6.setVisible(false);

            Desplegable1.removeAllItems();
            Desplegable1.addItem("Estudiantes");
            Desplegable1.addItem("Nombre de los Instrumentos");
            Desplegable1.addItem("Marca de los Instrumentos");
            Desplegable1.addItem("Instrumentos");
            Desplegable1.addItem("Préstamos Activos");
            Desplegable1.addItem("Préstamos Retrasados");
            Desplegable1.addItem("Usuarios");
            Desplegable1.setSelectedIndex(0);
            obtenerMatrizEstudiante();
            obtenerMatrizNombreInstru();
            obtenerMatrizMarcaInstru();
            obtenerMatrizInstrumento();
            obtenerMatrizUsuario();
            obtenerMatrizPrestamoActivo();
            obtenerMatrizPrestamoRetardado();
        }
    }//GEN-LAST:event_ListadosActionPerformed

    private void ModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == Modificar) {
            Linea1.setVisible(false);
            Linea2.setVisible(false);
            Linea3.setVisible(true);
            Linea4.setVisible(false);
            Linea5.setVisible(false);
            Linea6.setVisible(false);

            Desplegable1.removeAllItems();
            Desplegable1.addItem("Estudiante");
            Desplegable1.addItem("Instrumento");
            Desplegable1.addItem("Usuario");
            Desplegable1.setSelectedIndex(0);
    }//GEN-LAST:event_ModificarActionPerformed
    }

    private void BorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == Borrar) {
            Linea1.setVisible(false);
            Linea2.setVisible(false);
            Linea3.setVisible(false);
            Linea4.setVisible(true);
            Linea5.setVisible(false);
            Linea6.setVisible(false);

            Desplegable1.removeAllItems();
            Desplegable1.addItem("Estudiante");
            Desplegable1.addItem("Nombre del Instrumento");
            Desplegable1.addItem("Marca del Instrumento");
            Desplegable1.addItem("Instrumento");
            Desplegable1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_BorrarActionPerformed

    private void BusquedaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BusquedaActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == Busqueda) {
            Linea1.setVisible(false);
            Linea2.setVisible(false);
            Linea3.setVisible(false);
            Linea4.setVisible(false);
            Linea5.setVisible(false);
            Linea6.setVisible(true);

            Desplegable1.removeAllItems();
            Desplegable1.addItem("Estudiante");
            Desplegable1.addItem("Instrumento");
            Desplegable1.addItem("Préstamo Activo");
            Desplegable1.setSelectedIndex(0);
        }
    }//GEN-LAST:event_BusquedaActionPerformed

    private void Desplegable1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_Desplegable1ItemStateChanged

        if (evt.getStateChange() == java.awt.event.ItemEvent.SELECTED) {
            JComboBox cb = (JComboBox) evt.getSource();

            if (cb.getSelectedItem().equals("Préstamo") && Linea1.isVisible()) {
                PanelPrestamo.setVisible(true);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Devolución") && Linea1.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(true);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Estudiante") && Linea2.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(true);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Nombre del Instrumento") && Linea2.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(true);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Marca del Instrumento") && Linea2.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(true);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Instrumento") && Linea2.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(true);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
                cargarCBNombres();
                cargarCBMarcas();
            }
            if (cb.getSelectedItem().equals("Usuario") && Linea2.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(true);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Estudiante") && Linea3.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(true);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Instrumento") && Linea3.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(true);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Usuario") && Linea3.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(true);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Estudiante") && Linea4.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(true);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Instrumento") && Linea4.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(true);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Marca del Instrumento") && Linea4.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(true);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Nombre del Instrumento") && Linea4.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(true);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }

            if (cb.getSelectedItem().equals("Estudiantes") && Linea5.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(true);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Nombre de los Instrumentos") && Linea5.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(true);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Marca de los Instrumentos") && Linea5.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(true);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Instrumentos") && Linea5.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(true);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Préstamos Activos") && Linea5.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(true);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Préstamos Retrasados") && Linea5.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(true);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Usuarios") && Linea5.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(true);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Estudiante") && Linea6.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(true);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Instrumento") && Linea6.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(true);
                BusquedaPresAct.setVisible(false);
            }
            if (cb.getSelectedItem().equals("Préstamo Activo") && Linea6.isVisible()) {
                PanelPrestamo.setVisible(false);
                PanelDevo.setVisible(false);
                RegistrarEstu.setVisible(false);
                RegistrarMarcaInstru.setVisible(false);
                RegistrarNombreInstru.setVisible(false);
                RegistrarInstru.setVisible(false);
                RegistrarUsu.setVisible(false);
                ModificarEstu.setVisible(false);
                ModificarInstru.setVisible(false);
                ModificarUsu.setVisible(false);
                BorrarEstu.setVisible(false);
                BorrarIntru.setVisible(false);
                BorrarMarcaInstru.setVisible(false);
                BorrarNomInsrtu.setVisible(false);
                ListadoEstu.setVisible(false);
                ListaPrestamosRetra.setVisible(false);
                ListaUsu.setVisible(false);
                ListadoInstru.setVisible(false);
                ListadoMarcaInstru.setVisible(false);
                ListadoNombInstru.setVisible(false);
                ListadoPrestamosAct.setVisible(false);
                BusquedaEstu.setVisible(false);
                BusquedaInstru.setVisible(false);
                BusquedaPresAct.setVisible(true);
            }
    }//GEN-LAST:event_Desplegable1ItemStateChanged
    }

    private void close() {

        Toolkit.getDefaultToolkit().beep();

        if (JOptionPane.showConfirmDialog(null, "¿Desea salir del sistema?", "SALIDA DEL SISTEMA", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE) == JOptionPane.YES_OPTION) {

            System.exit(0);
        }
    }

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == Salir) {
            if (JOptionPane.showConfirmDialog(null, "Desea Volver a la Pantalla del Login?", "SALIR",
                    JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                VolverLogin = true;
            } else {
                VolverLogin = false;
            }
        }
    }//GEN-LAST:event_SalirActionPerformed

    private void LimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LimpiarActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == Limpiar) {
            nombreestu.setText("");
            nombreinstru.setText("");
            cedula.setText("");
            serial.setText("");
            marcainstru.setText("");
            apellidoestu.setText("");
        }
    }//GEN-LAST:event_LimpiarActionPerformed

    private void limpiarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarDActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarD) {
            cedulaD.setText("");
            nombreD.setText("");
            apellidoD.setText("");
            serialD.setText("");
            nombreinstruD.setText("");
            marcainstruD.setText("");
            fechadevoD.setText("");
        }
    }//GEN-LAST:event_limpiarDActionPerformed

    private void numerotlfEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numerotlfEActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numerotlfEActionPerformed

    private void limpiarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarE) {
            nombreE.setText("");
            apellidoE.setText("");
            cedulaE.setText("");
            numerotlfE.setText("");
            DireccionE.setText("");
        }
    }//GEN-LAST:event_limpiarEActionPerformed

    private void limpiarNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarNIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarNI) {
            nombreI.setText("");
        }
    }//GEN-LAST:event_limpiarNIActionPerformed

    private void marcaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_marcaIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_marcaIActionPerformed

    private void limpiarMMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarMMIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarMMI) {
            marcaI.setText("");
        }
    }//GEN-LAST:event_limpiarMMIActionPerformed

    private void colorRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorRIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_colorRIActionPerformed

    private void limpiarRIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarRIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarRI) {
            serialRI.setText("");
            colorRI.setText("");
        }
    }//GEN-LAST:event_limpiarRIActionPerformed

    private void limpiarRUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarRUActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarRU) {
            nombreRU.setText("");
            contraseñaRU.setText("");
            cuadrito.setSelected(false);
        }
    }//GEN-LAST:event_limpiarRUActionPerformed

    private void limpiarMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarMEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarME) {
            cedulaME.setText("");
            nombreME.setText("");
            apellidoME.setText("");
            direccionME.setText("");
            numerotlfME.setText("");
            lupaME.setEnabled(true);
            cedula_estudiante = "";
        }
    }//GEN-LAST:event_limpiarMEActionPerformed

    private void limpiarMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarMIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarMI) {
            serialMI.setText("");
            nombreMI.setText("");
            marcaMI.setText("");
            colorMI.setText("");
            lupaMI.setEnabled(true);
            serial_i = "";
        }
    }//GEN-LAST:event_limpiarMIActionPerformed

    private void limpiarMUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarMUActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarMU) {
            nombreMU.setText("");
            contraseñaMU.setText("");
            nuevacontraMU.setText("");
        }
    }//GEN-LAST:event_limpiarMUActionPerformed

    private void limpiarBEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarBE) {
            cedulaBE.setText("");
            nombreBE.setText("");
            apellidoBE.setText("");
            direccionBE.setText("");
            numerotlfBE.setText("");
        }
    }//GEN-LAST:event_limpiarBEActionPerformed

    private void limpiarBNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBNIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarBNI) {
            nombreBNI.setText("");
        }
    }//GEN-LAST:event_limpiarBNIActionPerformed

    private void limpiarBMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBMIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarBMI) {
            marcaBMI.setText("");
        }
    }//GEN-LAST:event_limpiarBMIActionPerformed

    private void lupaBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaBIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == lupaBI) {
            
            if(serialBI.getText().equals("")){
                
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Modelo Instrumento = new Modelo();
                Instrumento = null;
                OperarInstrumento OP = new OperarInstrumento();
                Instrumento = OP.BuscarInstrumento(serialBI.getText().toUpperCase());

                if (Instrumento != null) {

                    nombreBI.setText(Instrumento.getNombre_instrumento());
                    marcaBI.setText(Instrumento.getMarca_instrumento());
                    colorBI.setText(Instrumento.getColor());
                }
            }           
        }
    }//GEN-LAST:event_lupaBIActionPerformed

    private void nombreBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreBIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreBIActionPerformed

    private void limpiarBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarBI) {
            serialBI.setText("");
            nombreBI.setText("");
            marcaBI.setText("");
            colorBI.setText("");
        }
    }//GEN-LAST:event_limpiarBIActionPerformed

    private void limpiarBUEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBUEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarBUE) {
            nombreBUE.setText("");
            cedulaBUE.setText("");
            serialBUE.setText("");
            apellidoBUE.setText("");
            direccionBUE.setText("");
            numerotlfBUE.setText("");
        }
    }//GEN-LAST:event_limpiarBUEActionPerformed

    private void limpiarBUIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBUIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarBUI) {
            nombreBUI.setText("");
            cedulaBUI.setText("");
            serialBUI.setText("");
            colorBUI.setText("");
            marcaBUI.setText("");
        }
    }//GEN-LAST:event_limpiarBUIActionPerformed

    private void limpiarBPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiarBPAActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == limpiarBPA) {
            nombreEBPA.setText("");
            apellidoBPA.setText("");
            cedulaBPA.setText("");
            direccionBPA.setText("");
            numerotlfBPA.setText("");
            fechaEBPA.setText("");
            serialBPA.setText("");
            nombreIBPA.setText("");
            marcaBPA.setText("");
            colorBPA.setText("");
            usuBPA.setText("");
            fechaDBPA.setText("");
        }
    }//GEN-LAST:event_limpiarBPAActionPerformed

    private void lupa1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupa1ActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == lupa1) {
            
            if(cedula.getText().equals("")){
                
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                id_estudiante = 0;
                Modelo Estudiante = new Modelo();
                Estudiante = null;
                OperarEstudiante OP = new OperarEstudiante();
                Estudiante = OP.buscar_estudiante(letra_cedulaP.getSelectedItem()+""+cedula.getText());

                if (Estudiante != null) {
                    
                    if(Estudiante.isTiene_instru() == true){
                    
                        JOptionPane.showMessageDialog(null, "Este Estudiante ya tiene un Instrumento Asignado. \n                     Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        id_estudiante = Estudiante.getid_estudiante();
                        nombreestu.setText(Estudiante.getNombre().toUpperCase());
                        apellidoestu.setText(Estudiante.getApellido().toUpperCase());
                    }                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Este Estudiante no se encuentra Registrado. \n                 Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                }
            }           
        }
    }//GEN-LAST:event_lupa1ActionPerformed

    private void lupaMEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaMEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == lupaME) {
            
            if(cedulaME.getText().equals("")){
            
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
            
                id_estudiante = 0;
                Modelo Estudiante = new Modelo();
                Estudiante = null;
                OperarEstudiante OP = new OperarEstudiante();
                Estudiante = OP.BuscarEstudiante(letra_cedulaME.getSelectedItem() +""+ cedulaME.getText());

                if (Estudiante != null) {

                    id_estudiante = Estudiante.getid_estudiante();
                    nombreME.setText(Estudiante.getNombre());
                    apellidoME.setText(Estudiante.getApellido());
                    num_tlfME.setSelectedItem(Estudiante.getNumTlf().substring(0,4));
                    numerotlfME.setText(Estudiante.getNumTlf().substring(4));
                    direccionME.setText(Estudiante.getDirec());
                    cedula_estudiante = letra_cedulaME.getSelectedItem() +""+ cedulaME.getText();
                    lupaME.setEnabled(false);
                }
            }           
        }
    }//GEN-LAST:event_lupaMEActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == jButton10) {
            
            if(cedulaBE.getText().equals("")){
            
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Modelo Estudiante = new Modelo();
                Estudiante = null;
                OperarEstudiante OP = new OperarEstudiante();
                Estudiante = OP.BuscarEstudiante(letra_cedulaB.getSelectedItem() +""+ cedulaBE.getText());

                if (Estudiante != null) {

                    nombreBE.setText(Estudiante.getNombre());
                    apellidoBE.setText(Estudiante.getApellido());
                    numerotlfBE.setText(Estudiante.getNumTlf());
                    direccionBE.setText(Estudiante.getDirec());
                }
            }           
        }
    }//GEN-LAST:event_jButton10ActionPerformed

    private void lupa2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupa2ActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == lupa2) {
            
            if(serial.getText().equals("")){
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                id_instrumento = 0;
                Modelo Instrumento = new Modelo();
                Instrumento = null;
                OperarInstrumento OP = new OperarInstrumento();
                Instrumento = OP.buscar_instrumento(serial.getText().toUpperCase());

                if (Instrumento != null) {
                    
                    if(Instrumento.isDisponible() == false){
                        JOptionPane.showMessageDialog(null, "Este Instrumento ya se encuentra Asignado. \n                   Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                    }
                    else{
                        id_instrumento = Instrumento.getid_instru();
                        nombreinstru.setText(Instrumento.getNombre_instrumento().toUpperCase());
                        marcainstru.setText(Instrumento.getMarca_instrumento().toUpperCase());
                    }                    
                }
                else{
                    JOptionPane.showMessageDialog(null, "Este Instrumento no se encuentra Registrado. \n               Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                }
            }            
        }
    }//GEN-LAST:event_lupa2ActionPerformed

    private void lupaMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaMIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == lupaMI) {
            
            if(serialMI.getText().equals("")){
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                id_instrumento = 0;
                Modelo Instrumento = new Modelo();
                Instrumento = null;
                OperarInstrumento OP = new OperarInstrumento();
                Instrumento = OP.BuscarInstrumento(serialMI.getText().toUpperCase());

                if (Instrumento != null) {

                    id_instrumento = Instrumento.getid_instru();
                    nombreMI.setText(Instrumento.getNombre_instrumento());
                    marcaMI.setText(Instrumento.getMarca_instrumento());
                    colorMI.setText(Instrumento.getColor());
                    lupaMI.setEnabled(false);
                    serial_i = serialMI.getText().toUpperCase();
                }
            }           
        }
    }//GEN-LAST:event_lupaMIActionPerformed

    private void lupaD1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lupaD1ActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == lupaD1) {
            
            if(cedulaD.getText().equals("")){
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                id_estudiante = 0;
                id_instrumento = 0;
                Modelo devolucion = new Modelo();
                devolucion = null;
                OperarDevolucion OP = new OperarDevolucion();
                devolucion = OP.BuscarDevolucion(letra_cedulaD.getSelectedItem() +""+ cedulaD.getText());

                if (devolucion != null) {

                    id_instrumento = devolucion.getid_instru();
                    id_estudiante = devolucion.getid_estudiante();
                    nombreinstruD.setText(devolucion.getNombre_instrumento());
                    marcainstruD.setText(devolucion.getMarca_instrumento());
                    nombreD.setText(devolucion.getNombre());
                    apellidoD.setText(devolucion.getApellido());
                    serialD.setText(devolucion.getSerial());
                    fechadevoD.setText(devolucion.getFecha_devolucion());
                }
            }            
        }
    }//GEN-LAST:event_lupaD1ActionPerformed

    private void LupaBEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LupaBEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == LupaBE) {
            
            if(cedulaBUE.getText().equals("")){
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Modelo Estudiante = new Modelo();
                Estudiante = null;
                OperarEstudiante OP = new OperarEstudiante();
                Estudiante = OP.BuscarEstudiante(letra_cedulaBE.getSelectedItem() +""+ cedulaBUE.getText());

                if (Estudiante != null) {

                    nombreBUE.setText(Estudiante.getNombre());
                    apellidoBUE.setText(Estudiante.getApellido());
                    numerotlfBUE.setText(Estudiante.getNumTlf());
                    direccionBUE.setText(Estudiante.getDirec());
                    Modelo Instrumento = new Modelo();
                    Instrumento = null;
                    OperarInstrumento OP2 = new OperarInstrumento();
                    Instrumento = OP2.BuscarSerial(Estudiante.getid_estudiante());
                    serialBUE.setText(Instrumento.getSerial());
                }
            }            
        }
    }//GEN-LAST:event_LupaBEActionPerformed

    private void LupaBIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LupaBIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == LupaBI) {
            
            if(serialBUI.getText().equals("")){
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Modelo Instrumento = new Modelo();
                Instrumento = null;
                OperarInstrumento OP = new OperarInstrumento();
                Instrumento = OP.BuscarInstrumento(serialBUI.getText().toUpperCase());

                if (Instrumento != null) {

                    nombreBUI.setText(Instrumento.getNombre_instrumento());
                    marcaBUI.setText(Instrumento.getMarca_instrumento());
                    colorBUI.setText(Instrumento.getColor());
                    Modelo Estudiante = new Modelo();
                    Estudiante = null;
                    OperarEstudiante OP2 = new OperarEstudiante();
                    Estudiante = OP2.BuscarCedula(Instrumento.getid_instru());
                    cedulaBUI.setText(Estudiante.getcedula());
                }
            }        
        }
    }//GEN-LAST:event_LupaBIActionPerformed

    private void LupaBPAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LupaBPAActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == LupaBPA) {
            
            if(cedulaBPA.getText().equals("")){
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                Modelo Prestamo = new Modelo();
                Prestamo = null;
                OperarPrestamo OP = new OperarPrestamo();
                Prestamo = OP.BuscarPrestamo(letra_cedulaBPA.getSelectedItem() +""+ cedulaBPA.getText());

                if (Prestamo != null) {

                    nombreEBPA.setText(Prestamo.getNombre());
                    apellidoBPA.setText(Prestamo.getApellido());
                    direccionBPA.setText(Prestamo.getDirec());
                    numerotlfBPA.setText(Prestamo.getNumTlf());
                    serialBPA.setText(Prestamo.getSerial());
                    nombreIBPA.setText(Prestamo.getNombre_instrumento());
                    marcaBPA.setText(Prestamo.getMarca_instrumento());
                    colorBPA.setText(Prestamo.getColor());
                    usuBPA.setText(Prestamo.getusuario());
                    fechaEBPA.setText(Prestamo.getfecha_entrega());
                    fechaDBPA.setText(Prestamo.getFecha_devolucion());
                }
            }           
        }
    }//GEN-LAST:event_LupaBPAActionPerformed

    private void BorrarEstudianteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarEstudianteActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == BorrarEstudiante){
            
            if(cedulaBE.getText().equals("") || nombreBE.getText().equals("") || apellidoBE.getText().equals("") || direccionBE.getText().equals("") || numerotlfBE.getText().equals("")){
                
                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                OperarEstudiante OP = new OperarEstudiante();
                OP.borrar(letra_cedulaB.getSelectedItem() +""+ cedulaBE.getText());
            }            
        }
    }//GEN-LAST:event_BorrarEstudianteActionPerformed

    private void BorrarNomInstruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarNomInstruActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == BorrarNomInstru) {
        
            if(nombreBNI.getText().equals("")){
                
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                OperarNombreInstrumento OP = new OperarNombreInstrumento();
                OP.borrar(nombreBNI.getText().toUpperCase());
            }                   
        }
    }//GEN-LAST:event_BorrarNomInstruActionPerformed

    private void BorrarMarcaIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarMarcaIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == BorrarMarcaI) {
            
            if(marcaBMI.getText().equals("")){
                
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                OperarMarcaInstrumento OP = new OperarMarcaInstrumento();
                OP.borrar(marcaBMI.getText().toUpperCase());
            }            
        }
    }//GEN-LAST:event_BorrarMarcaIActionPerformed

    private void BorrarInstrumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BorrarInstrumentoActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == BorrarInstrumento) {
            
            if(serialBI.getText().equals("") || nombreBI.getText().equals("") || marcaBI.getText().equals("") || colorBI.getText().equals("")){
                
                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                OperarInstrumento OP = new OperarInstrumento();
                OP.borrar(serialBI.getText().toUpperCase());
            }            
        }
    }//GEN-LAST:event_BorrarInstrumentoActionPerformed

    private void registrarDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarDActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == registrarD) {
            
            if(cedulaD.getText().equals("")){
                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                OperarDevolucion OP = new OperarDevolucion();
                OP.RegistrarDevolucion(id_estudiante, id_instrumento);
            }            
        }
    }//GEN-LAST:event_registrarDActionPerformed

    private void ModificarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == ModificarE) {
            
            Modelo Estudiante = new Modelo(); 
            Estudiante = null;
            
            if(nombreME.getText().equals("")|| apellidoME.getText().equals("")|| cedulaME.getText().equals("")|| direccionME.getText().equals("")|| numerotlfME.getText().equals("")){
                
                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else if(cedulaME.getText().length() < 7 || numerotlfME.getText().length() < 7){

               JOptionPane.showMessageDialog(null, "Faltan Dígitos en la Cédula o Teléfono. \n            Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{ 
                if (!cedula_estudiante.equals(letra_cedulaME.getSelectedItem() + "" + cedulaME.getText())){
                    
                    OperarEstudiante OP = new OperarEstudiante();
                    Estudiante = OP.buscar_estudiante(letra_cedulaME.getSelectedItem() + "" + cedulaME.getText()); 
                    
                    if(Estudiante == null){
                        
                        OP = new OperarEstudiante();
                        OP.modificar(nombreME.getText().toUpperCase(), apellidoME.getText().toUpperCase(), letra_cedulaME.getSelectedItem() + "" + cedulaME.getText(), direccionME.getText().toUpperCase(), num_tlfME.getSelectedItem() + "" + numerotlfME.getText(), id_estudiante);                        
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Esta Cédula ya está Registrada \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                    }
                }
                else{
                    OperarEstudiante OP = new OperarEstudiante();
                    OP.modificar(nombreME.getText().toUpperCase(), apellidoME.getText().toUpperCase(), letra_cedulaME.getSelectedItem() +""+ cedulaME.getText(), direccionME.getText().toUpperCase(), num_tlfME.getSelectedItem() +""+ numerotlfME.getText(), id_estudiante);
                }                
            }           
        }
    }//GEN-LAST:event_ModificarEActionPerformed

    private void ModificarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == ModificarI) {
            
            if(serialMI.getText().equals("") || colorMI.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if(!serial_i.equals(serialMI.getText().toUpperCase())){
                    
                    Modelo Instrumento = new Modelo();
                    Instrumento = null;
                    
                    OperarInstrumento OP = new OperarInstrumento();
                    Instrumento = OP.buscar_instrumento(serialMI.getText().toUpperCase());
                    
                    if(Instrumento == null){
                        
                        OP = new OperarInstrumento();
                        OP.modificar(serialMI.getText().toUpperCase(), colorMI.getText().toUpperCase(), id_instrumento);
                    }
                    else{
                        JOptionPane.showMessageDialog(null, "Este Serial ya está Registrado \n        Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                    }                  
                }
                else{                   
                   OperarInstrumento OP = new OperarInstrumento();
                   OP.modificar(serialMI.getText().toUpperCase(), colorMI.getText().toUpperCase(), id_instrumento); 
                }
            }          
        }
    }//GEN-LAST:event_ModificarIActionPerformed

    private void ModificarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModificarUActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == ModificarU) {

            OperarUsuario OP = new OperarUsuario();
            
            if(nombreMU.getText().equals("") || contraseñaMU.getText().equals("") || nuevacontraMU.getText().equals("")){
                
                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else if (administrador == false && !(usuario.equals(nombreMU.getText()))) {
                
                JOptionPane.showMessageDialog(null, "No tiene permisos de Administrador", "¡ERROR!", JOptionPane.ERROR_MESSAGE);          
            }           
            else {

                OP.modificar(nombreMU.getText(), contraseñaMU.getText(), nuevacontraMU.getText());
            }
        }
    }//GEN-LAST:event_ModificarUActionPerformed

    private void RegistrarPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarPActionPerformed

        JButton bt = (JButton) evt.getSource();

        String fecha_devolucion;
        
        if (bt == RegistrarP) {
            
            if(cedula.getText().equals("") || serial.getText().equals("") || calendario.getDate() == null){
                
                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
                fecha_devolucion = sdf.format(calendario.getDate());

                OperarPrestamo OP = new OperarPrestamo();
                OP.RegistrarPrestamo(id_usuario, id_estudiante, id_instrumento, fecha_devolucion);
            }           
        }
    }//GEN-LAST:event_RegistrarPActionPerformed

    private void registrarEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == registrarE) {

            if (nombreE.getText().equals("") || apellidoE.getText().equals("") || cedulaE.getText().equals("") || numerotlfE.getText().equals("") || DireccionE.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else if (cedulaE.getText().length() < 7 || numerotlfE.getText().length() < 7) {

                JOptionPane.showMessageDialog(null, "Faltan Dígitos en la Cédula o Teléfono. \n            Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {

                OperarEstudiante OP = new OperarEstudiante();
                OP.RegistrarEstudiante(nombreE.getText().toUpperCase(), apellidoE.getText().toUpperCase(), letra_cedula.getSelectedItem() + "" + cedulaE.getText(), num_tlf.getSelectedItem() + "" + numerotlfE.getText(), DireccionE.getText().toUpperCase());
            }
        }
    }//GEN-LAST:event_registrarEActionPerformed

    private void RegistrarNIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarNIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == RegistrarNI) {

            if (nombreI.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else {
                OperarNombreInstrumento OP = new OperarNombreInstrumento();
                OP.RegistrarNombreInstrumento(nombreI.getText().toUpperCase());
            }
        }
    }//GEN-LAST:event_RegistrarNIActionPerformed

    private void RegistrarMIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarMIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == RegistrarMI) {
            
            if (marcaI.getText().equals("")) {

                JOptionPane.showMessageDialog(null, "     El Campo está Vacío. \n      Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            } else{
                
                OperarMarcaInstrumento OP = new OperarMarcaInstrumento();
                OP.RegistrarMarcaInstrumento(marcaI.getText().toUpperCase());
            }
        }
    }//GEN-LAST:event_RegistrarMIActionPerformed

    private void registrarUActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == registrarU) {
            
            if(nombreRU.getText().equals("") || contraseñaRU.getText().equals("")){
                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                if (administrador == false) {
                    JOptionPane.showMessageDialog(null, "No tienes permisos de Administrador \n            Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
                } else {

                    int admin = 0;
                    if (cuadrito.isSelected()) {

                        admin = 1;
                    }
                    OperarUsuario OP = new OperarUsuario();
                    OP.RegistrarUsuario(nombreRU.getText(), contraseñaRU.getText(), admin);
                }
            }           
        }
    }//GEN-LAST:event_registrarUActionPerformed

    private void listaRI1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaRI1ItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {

            TextoIDN.setText(listaN.get(listaRI1.getSelectedIndex()).getId_nombre() + "");
        }
    }//GEN-LAST:event_listaRI1ItemStateChanged

    private void listaRI2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_listaRI2ItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {

            TextoIDM.setText(listaM.get(listaRI2.getSelectedIndex()).getId_marca() + "");
        }
    }//GEN-LAST:event_listaRI2ItemStateChanged

    private void RegistrarIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RegistrarIActionPerformed

        JButton bt = (JButton) evt.getSource();

        if (bt == RegistrarI) {
            
            if(serialRI.getText().equals("") || colorRI.getText().equals("")){
                
                JOptionPane.showMessageDialog(null, "Alguno de los Campos está Vacío. \n          Intente Nuevamente...", "¡ERROR!", JOptionPane.ERROR_MESSAGE);
            }
            else{
            
                OperarInstrumento OP = new OperarInstrumento();
                OP.RegistrarInstrumento(Integer.parseInt(TextoIDN.getText()), Integer.parseInt(TextoIDM.getText()), colorRI.getText().toUpperCase(), serialRI.getText().toUpperCase());
            }
        }
    }//GEN-LAST:event_RegistrarIActionPerformed

    private void cedulaEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaEKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedula.getSelectedItem().equals("M-")) {

            if (cedulaE.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedulaE.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaEKeyTyped

    private void letra_cedulaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaItemStateChanged

        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedulaE.setText("");
        }
    }//GEN-LAST:event_letra_cedulaItemStateChanged

    private void numerotlfEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numerotlfEKeyTyped

        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }

        if (numerotlfE.getText().length() > 6) {

            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_numerotlfEKeyTyped

    private void colorRIKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_colorRIKeyTyped
        
       char c = evt.getKeyChar();

        if (!Character.isLetter(c)){

            getToolkit().beep();
            evt.consume();
        }        
    }//GEN-LAST:event_colorRIKeyTyped

    private void cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedulaP.getSelectedItem().equals("M-")) {

            if (cedula.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedula.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaKeyTyped

    private void letra_cedulaPItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaPItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedula.setText("");
        }
    }//GEN-LAST:event_letra_cedulaPItemStateChanged

    private void letra_cedulaDItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaDItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedulaD.setText("");
        }
    }//GEN-LAST:event_letra_cedulaDItemStateChanged

    private void cedulaDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaDKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedulaD.getSelectedItem().equals("M-")) {

            if (cedulaD.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedulaD.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaDKeyTyped

    private void letra_cedulaBEItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaBEItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedulaBUE.setText("");
        }
    }//GEN-LAST:event_letra_cedulaBEItemStateChanged

    private void cedulaBUEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaBUEKeyTyped
       char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedulaBE.getSelectedItem().equals("M-")) {

            if (cedulaBUE.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedulaBUE.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaBUEKeyTyped

    private void letra_cedulaBPAItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaBPAItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedulaBPA.setText("");
        }
    }//GEN-LAST:event_letra_cedulaBPAItemStateChanged

    private void cedulaBPAKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaBPAKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedulaBPA.getSelectedItem().equals("M-")) {

            if (cedulaBPA.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedulaBPA.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaBPAKeyTyped

    private void letra_cedulaMEItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaMEItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedulaME.setText("");
        }
    }//GEN-LAST:event_letra_cedulaMEItemStateChanged

    private void cedulaMEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaMEKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedulaME.getSelectedItem().equals("M-")) {

            if (cedulaME.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedulaME.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaMEKeyTyped

    private void numerotlfMEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_numerotlfMEKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }

        if (numerotlfME.getText().length() > 6) {

            evt.consume();
            Toolkit.getDefaultToolkit().beep();
        }
    }//GEN-LAST:event_numerotlfMEKeyTyped

    private void letra_cedulaBItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_letra_cedulaBItemStateChanged
        if (evt.getStateChange() == ItemEvent.SELECTED) {

            cedulaBE.setText("");
        }
    }//GEN-LAST:event_letra_cedulaBItemStateChanged

    private void cedulaBEKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_cedulaBEKeyTyped
        char c = evt.getKeyChar();

        if (!Character.isDigit(c)) {

            getToolkit().beep();
            evt.consume();
        }
        if (letra_cedulaB.getSelectedItem().equals("M-")) {

            if (cedulaBE.getText().length() > 8) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        } else {
            if (cedulaBE.getText().length() > 7) {

                evt.consume();
                Toolkit.getDefaultToolkit().beep();
            }
        }
    }//GEN-LAST:event_cedulaBEKeyTyped

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana_inicio().setVisible(true);
            }
        });
    }

    public boolean volveraLogin() {
        return VolverLogin;
    }

    public void asignar(boolean VolverLogin2) {
        VolverLogin = VolverLogin2;
    }

    public String DameFecha() {

        String pattern = "dd/MM/yyyy";

        SimpleDateFormat sdf = new SimpleDateFormat(pattern);

        String t = sdf.format(new Date());
        return t;
    }

    public void setid_usuario(int id_usuario) {

        this.id_usuario = id_usuario;
    }

    public void setusuario(String usuario) {

        this.usuario = usuario;
    }

    public void setadministrador(boolean administrador) {

        this.administrador = administrador;
    }

    public Object getComboItem() {

        return listaRI1.getSelectedItem();
    }

    public void cargarCBNombres() {

        listaRI1.removeAllItems();
        DesplegableNombre nombres = new DesplegableNombre();
        listaN = nombres.DesplegableNombre();
        
        if(listaN.size() > 0){
            
            for (int i = 0; i < listaN.size(); i++) {

                listaRI1.addItem(listaN.get(i).getNombre_instrumento());
                TextoIDN.setText(listaN.get(i).getId_nombre() + "");
            }

            TextoIDN.setText(listaN.get(0).getId_nombre() + "");
        }     
    }

    public void cargarCBMarcas() {

        listaRI2.removeAllItems();
        DesplegableMarca marcas = new DesplegableMarca();
        listaM = marcas.DesplegableMarca();
        
        if(listaM.size() > 0){
            for (int i = 0; i < listaM.size(); i++) {

                listaRI2.addItem(listaM.get(i).getMarca_instrumento());
                TextoIDM.setText(listaM.get(i).getId_marca() + "");
            }
            TextoIDM.setText(listaM.get(0).getId_marca() + "");
        }       
    }

    private void obtenerMatrizEstudiante() {

        OperarEstudiante estudiante = new OperarEstudiante();
        ArrayList<Modelo> miLista = estudiante.BuscarconMatriz();
        DefaultTableModel model = (DefaultTableModel) TablaEstudiante.getModel();

        model.setRowCount(0);
        for (int i = 0; i < miLista.size(); i++) {

            model.addRow(new Object[]{miLista.get(i).getNombre(), miLista.get(i).getApellido(), miLista.get(i).getcedula(), miLista.get(i).getDirec(), miLista.get(i).getNumTlf()});
        }
    }

    private void obtenerMatrizNombreInstru() {

        OperarNombreInstrumento nombre_instru = new OperarNombreInstrumento();
        ArrayList<Modelo> miLista = nombre_instru.BuscarconMatriz();
        DefaultTableModel model = (DefaultTableModel) TablaNI.getModel();
        model.setRowCount(0);
        for (int i = 0; i < miLista.size(); i++) {

            model.addRow(new Object[]{miLista.get(i).getNombre_instrumento()});
        }
    }

    private void obtenerMatrizMarcaInstru() {

        OperarMarcaInstrumento marca_instru = new OperarMarcaInstrumento();
        ArrayList<Modelo> miLista = marca_instru.BuscarconMatriz();
        DefaultTableModel model = (DefaultTableModel) TablaMI.getModel();
        model.setRowCount(0);
        for (int i = 0; i < miLista.size(); i++) {

            model.addRow(new Object[]{miLista.get(i).getMarca_instrumento()});
        }
    }

    private void obtenerMatrizInstrumento() {

        OperarInstrumento Instru = new OperarInstrumento();
        ArrayList<Modelo> miLista = Instru.BuscarconMatriz();
        DefaultTableModel model = (DefaultTableModel) TablaInstrumento.getModel();
        model.setRowCount(0);
        for (int i = 0; i < miLista.size(); i++) {

            model.addRow(new Object[]{miLista.get(i).getNombre_instrumento(), miLista.get(i).getMarca_instrumento(), miLista.get(i).getColor(), miLista.get(i).getSerial()});
        }
    }

    private void obtenerMatrizUsuario() {

        OperarUsuario usu = new OperarUsuario();
        ArrayList<Modelo> miLista = usu.BuscarconMatriz();
        DefaultTableModel model = (DefaultTableModel) TablaU.getModel();
        String admin;
        model.setRowCount(0);
        for (int i = 0; i < miLista.size(); i++) {

            if (miLista.get(i).isAdministrador() == true) {

                admin = "Si";
            } else {

                admin = "No";
            }
            model.addRow(new Object[]{miLista.get(i).getusuario(), admin});
        }
    }

    private void obtenerMatrizPrestamoActivo() {

        OperarPrestamo prestamoA = new OperarPrestamo();
        ArrayList<Modelo> miLista = prestamoA.BuscarconMatriz1();
        DefaultTableModel model = (DefaultTableModel) TablaPA.getModel();
        model.setRowCount(0);
        for (int i = 0; i < miLista.size(); i++) {

            model.addRow(new Object[]{miLista.get(i).getusuario(), miLista.get(i).getcedula(), miLista.get(i).getSerial(), miLista.get(i).getfecha_entrega(), miLista.get(i).getFecha_devolucion()});
        }
    }

    private void obtenerMatrizPrestamoRetardado() {

        OperarPrestamo prestamoR = new OperarPrestamo();
        ArrayList<Modelo> miLista = prestamoR.BuscarconMatriz2();
        DefaultTableModel model = (DefaultTableModel) TablaPR.getModel();
        model.setRowCount(0);
        for (int i = 0; i < miLista.size(); i++) {

            model.addRow(new Object[]{miLista.get(i).getusuario(), miLista.get(i).getcedula(), miLista.get(i).getSerial(), miLista.get(i).getfecha_entrega(), miLista.get(i).getFecha_devolucion()});
        }
    }
    
    ArrayList< Modelo> listaN;
    ArrayList< Modelo> listaM;
    private String usuario, cedula_estudiante = "", serial_i = "";
    private boolean VolverLogin = true, administrador = false;
    private int id_estudiante = 0, id_instrumento = 0, id_usuario = 0;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Base;
    private javax.swing.JButton Borrar;
    private javax.swing.JPanel BorrarEstu;
    private javax.swing.JButton BorrarEstudiante;
    private javax.swing.JButton BorrarInstrumento;
    private javax.swing.JPanel BorrarIntru;
    private javax.swing.JButton BorrarMarcaI;
    private javax.swing.JPanel BorrarMarcaInstru;
    private javax.swing.JPanel BorrarNomInsrtu;
    private javax.swing.JButton BorrarNomInstru;
    private javax.swing.JButton Busqueda;
    private javax.swing.JPanel BusquedaEstu;
    private javax.swing.JPanel BusquedaInstru;
    private javax.swing.JPanel BusquedaPresAct;
    private javax.swing.JLabel D1;
    private javax.swing.JLabel D2;
    private javax.swing.JLabel D3;
    private javax.swing.JLabel D4;
    private javax.swing.JLabel D5;
    private javax.swing.JLabel D6;
    private javax.swing.JComboBox<String> Desplegable1;
    private javax.swing.JTextField DireccionE;
    private javax.swing.JButton Limpiar;
    private javax.swing.JLabel Linea1;
    private javax.swing.JLabel Linea2;
    private javax.swing.JLabel Linea3;
    private javax.swing.JLabel Linea4;
    private javax.swing.JLabel Linea5;
    private javax.swing.JLabel Linea6;
    private javax.swing.JPanel ListaPrestamosRetra;
    private javax.swing.JPanel ListaUsu;
    private javax.swing.JPanel ListadoEstu;
    private javax.swing.JPanel ListadoInstru;
    private javax.swing.JPanel ListadoMarcaInstru;
    private javax.swing.JPanel ListadoNombInstru;
    private javax.swing.JPanel ListadoPrestamosAct;
    private javax.swing.JButton Listados;
    private javax.swing.JButton LupaBE;
    private javax.swing.JButton LupaBI;
    private javax.swing.JButton LupaBPA;
    private javax.swing.JButton Modificar;
    private javax.swing.JButton ModificarE;
    private javax.swing.JPanel ModificarEstu;
    private javax.swing.JButton ModificarI;
    private javax.swing.JPanel ModificarInstru;
    private javax.swing.JButton ModificarU;
    private javax.swing.JPanel ModificarUsu;
    private javax.swing.JPanel PanelDevo;
    private javax.swing.JPanel PanelPrestamo;
    private javax.swing.JButton Prestamo;
    private javax.swing.JButton Registrar;
    private javax.swing.JPanel RegistrarEstu;
    private javax.swing.JButton RegistrarI;
    private javax.swing.JPanel RegistrarInstru;
    private javax.swing.JButton RegistrarMI;
    private javax.swing.JPanel RegistrarMarcaInstru;
    private javax.swing.JButton RegistrarNI;
    private javax.swing.JPanel RegistrarNombreInstru;
    private javax.swing.JButton RegistrarP;
    private javax.swing.JPanel RegistrarUsu;
    private javax.swing.JButton Salir;
    private javax.swing.JTable TablaEstudiante;
    private javax.swing.JTable TablaInstrumento;
    private javax.swing.JTable TablaMI;
    private javax.swing.JTable TablaNI;
    private javax.swing.JTable TablaPA;
    private javax.swing.JTable TablaPR;
    private javax.swing.JTable TablaU;
    private javax.swing.JTextField TextoIDM;
    private javax.swing.JTextField TextoIDN;
    private javax.swing.JTextField apellidoBE;
    private javax.swing.JTextField apellidoBPA;
    private javax.swing.JTextField apellidoBUE;
    private javax.swing.JTextField apellidoD;
    private javax.swing.JTextField apellidoE;
    private javax.swing.JTextField apellidoME;
    private javax.swing.JTextField apellidoestu;
    private com.toedter.calendar.JDateChooser calendario;
    private javax.swing.JTextField cedula;
    private javax.swing.JTextField cedulaBE;
    private javax.swing.JTextField cedulaBPA;
    private javax.swing.JTextField cedulaBUE;
    private javax.swing.JTextField cedulaBUI;
    private javax.swing.JTextField cedulaD;
    private javax.swing.JTextField cedulaE;
    private javax.swing.JTextField cedulaME;
    private javax.swing.JTextField colorBI;
    private javax.swing.JTextField colorBPA;
    private javax.swing.JTextField colorBUI;
    private javax.swing.JTextField colorMI;
    private javax.swing.JTextField colorRI;
    private javax.swing.JPasswordField contraseñaMU;
    private javax.swing.JPasswordField contraseñaRU;
    private javax.swing.JCheckBox cuadrito;
    private javax.swing.JTextField direccionBE;
    private javax.swing.JTextField direccionBPA;
    private javax.swing.JTextField direccionBUE;
    private javax.swing.JTextField direccionME;
    private javax.swing.JTextField fechaDBPA;
    private javax.swing.JTextField fechaEBPA;
    private javax.swing.JTextField fechaEP;
    private javax.swing.JTextField fechadevoD;
    private javax.swing.JButton jButton10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JScrollPane jScrollPane7;
    private javax.swing.JComboBox<String> letra_cedula;
    private javax.swing.JComboBox<String> letra_cedulaB;
    private javax.swing.JComboBox<String> letra_cedulaBE;
    private javax.swing.JComboBox<String> letra_cedulaBPA;
    private javax.swing.JComboBox<String> letra_cedulaD;
    private javax.swing.JComboBox<String> letra_cedulaME;
    private javax.swing.JComboBox<String> letra_cedulaP;
    private javax.swing.JButton limpiarBE;
    private javax.swing.JButton limpiarBI;
    private javax.swing.JButton limpiarBMI;
    private javax.swing.JButton limpiarBNI;
    private javax.swing.JButton limpiarBPA;
    private javax.swing.JButton limpiarBUE;
    private javax.swing.JButton limpiarBUI;
    private javax.swing.JButton limpiarD;
    private javax.swing.JButton limpiarE;
    private javax.swing.JButton limpiarME;
    private javax.swing.JButton limpiarMI;
    private javax.swing.JButton limpiarMMI;
    private javax.swing.JButton limpiarMU;
    private javax.swing.JButton limpiarNI;
    private javax.swing.JButton limpiarRI;
    private javax.swing.JButton limpiarRU;
    private javax.swing.JComboBox<String> listaRI1;
    private javax.swing.JComboBox<String> listaRI2;
    private javax.swing.JButton lupa1;
    private javax.swing.JButton lupa2;
    private javax.swing.JButton lupaBI;
    private javax.swing.JButton lupaD1;
    private javax.swing.JButton lupaME;
    private javax.swing.JButton lupaMI;
    private javax.swing.JTextField marcaBI;
    private javax.swing.JTextField marcaBMI;
    private javax.swing.JTextField marcaBPA;
    private javax.swing.JTextField marcaBUI;
    private javax.swing.JTextField marcaI;
    private javax.swing.JTextField marcaMI;
    private javax.swing.JTextField marcainstru;
    private javax.swing.JTextField marcainstruD;
    private javax.swing.JTextField nombreBE;
    private javax.swing.JTextField nombreBI;
    private javax.swing.JTextField nombreBNI;
    private javax.swing.JTextField nombreBUE;
    private javax.swing.JTextField nombreBUI;
    private javax.swing.JTextField nombreD;
    private javax.swing.JTextField nombreE;
    private javax.swing.JTextField nombreEBPA;
    private javax.swing.JTextField nombreI;
    private javax.swing.JTextField nombreIBPA;
    private javax.swing.JTextField nombreME;
    private javax.swing.JTextField nombreMI;
    private javax.swing.JTextField nombreMU;
    private javax.swing.JTextField nombreRU;
    private javax.swing.JTextField nombreestu;
    private javax.swing.JTextField nombreinstru;
    private javax.swing.JTextField nombreinstruD;
    private javax.swing.JPasswordField nuevacontraMU;
    private javax.swing.JComboBox<String> num_tlf;
    private javax.swing.JComboBox<String> num_tlfME;
    private javax.swing.JTextField numerotlfBE;
    private javax.swing.JTextField numerotlfBPA;
    private javax.swing.JTextField numerotlfBUE;
    private javax.swing.JTextField numerotlfE;
    private javax.swing.JTextField numerotlfME;
    private javax.swing.JButton registrarD;
    private javax.swing.JButton registrarE;
    private javax.swing.JButton registrarU;
    private javax.swing.JTextField serial;
    private javax.swing.JTextField serialBI;
    private javax.swing.JTextField serialBPA;
    private javax.swing.JTextField serialBUE;
    private javax.swing.JTextField serialBUI;
    private javax.swing.JTextField serialD;
    private javax.swing.JTextField serialMI;
    private javax.swing.JTextField serialRI;
    private javax.swing.JTextField usuBPA;
    // End of variables declaration//GEN-END:variables
}
