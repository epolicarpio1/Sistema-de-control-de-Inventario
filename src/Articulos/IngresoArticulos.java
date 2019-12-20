/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Articulos;

import Conexion.Conexion;
import Joption.Joption;
import Joption.Joptionx;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author JaviieR
 */
public class IngresoArticulos extends javax.swing.JFrame {
      DefaultTableModel model;
    Connection conn;
    Statement sent;
    Joption icon = new Joption();
   Joptionx save = new Joptionx(); 

    /**
     * Creates new form IngresoArticulos
     */
    public IngresoArticulos() {
        initComponents();
         invisible();
         explicaion.setVisible(false);
         cajafecha.setText(fechaActual());
         bloqueo();
         setTitle("Registro de Equipos");
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("computer.png")).getImage());
        ((JPanel)getContentPane()).setOpaque(false);
        ImageIcon uno = new ImageIcon(this.getClass().getResource("wall.jpg"));
        JLabel fondo = new JLabel();
        fondo.setIcon(uno);
        getLayeredPane().add(fondo,JLayeredPane.FRAME_CONTENT_LAYER);
        fondo.setBounds(0, 0, uno.getIconWidth(), uno.getIconHeight());
    }
      public static String fechaActual(){
        Date fecha=new Date();
        SimpleDateFormat formatoFecha=new SimpleDateFormat("dd/MM/YYYY");
        return formatoFecha.format(fecha);
    }
    void cargar(){           
   String [] titulos ={"Equipo","Marca","Modelo","Serie","Ubicacion","Estado","Pertenece","Se Registro"};
 String sql = "SELECT * FROM articulos";

 model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
        try {
          
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
          String [] fila = new String[16];
  while(rs.next()){
        
            fila[0] = rs.getString("equip");
            fila[1] = rs.getString("marc");
            fila[2] = rs.getString("model"); 
            fila[3] = rs.getString("seri"); 
            fila[4] = rs.getString("ubi");
            fila[5] = rs.getString("acti"); 
            fila[6] = rs.getString("nom_pertenece"); 
            fila[7] = rs.getString("fecha");
            
       
           
      model.addRow(fila);
       
  }
        t_evento2.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(IngresoArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }

      }
    void invisible(){
        
        resolucion.setVisible(false);
        cajaresolucion.setVisible(false);
        ram.setVisible(false);
        cajaram.setVisible(false);
        dd.setVisible(false);
        cajadd.setVisible(false);
        pulgadas.setVisible(false);
        cajapulgadas.setVisible(false);
        lector.setVisible(false);
        combolector.setVisible(false);
        ip.setVisible(false);
        cajaip.setVisible(false);
        impresora.setVisible(false);
        cajaimpresora.setVisible(false);
        hdmi.setVisible(false);
        combohdmi.setVisible(false);
        usb.setVisible(false);
        combousb.setVisible(false);
        
        
    }
    void limpiar(){
        //caracteristicas
    equipo.setSelectedIndex(0);
    cajaresolucion.setText("");
    cajaram.setText("");
    cajadd.setText("");
    cajapulgadas.setText("");
    combolector.setSelectedIndex(0);
    cajaip.setText("");
    cajaimpresora.setText("");
    cajamarca.setText("");
    cajamodelo.setText("");
    cajaserie.setText("");
    combohdmi.setSelectedIndex(0);
    combousb.setSelectedIndex(0);
    //gral
    combocompañia.setSelectedIndex(0);
     pertenece.setText("");
     ubicacion.setSelectedIndex(0);
     activo.setSelectedIndex(0);
     sala.setText("");
     observa.setText("");
    nombre.setText("");
     cajainmo.setText("");
    
        
    }
    void bloqueo(){
        equipo.setEnabled(false);
        combocompañia.setEnabled(false);
        pertenece.setEnabled(false);
        ubicacion.setEnabled(false);
        activo.setEnabled(false);
        sala.setEnabled(false);
        guardar.setEnabled(false);
        cancelar.setEnabled(false);
        observa.setEnabled(false);
        nombre.setEnabled(false);
       cajainmo.setEnabled(false);
       cajamodelo.setEnabled(false);
       cajamarca.setEnabled(false);
       cajaserie.setEnabled(false);

    }
        void desbloqueo(){
        equipo.setEnabled(true);
        combocompañia.setEnabled(true);
        pertenece.setEnabled(true);
        ubicacion.setEnabled(true);
        activo.setEnabled(true);
        sala.setEnabled(true);
        guardar.setEnabled(true);
        cancelar.setEnabled(true);
        observa.setEnabled(true);
        nombre.setEnabled(true);
        cajainmo.setEnabled(true);
         cajamodelo.setEnabled(true);
       cajamarca.setEnabled(true);
       cajaserie.setEnabled(true);

    }


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        equipo = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        resolucion = new javax.swing.JLabel();
        cajaresolucion = new javax.swing.JTextField();
        cajaram = new javax.swing.JTextField();
        ram = new javax.swing.JLabel();
        cajadd = new javax.swing.JTextField();
        dd = new javax.swing.JLabel();
        pulgadas = new javax.swing.JLabel();
        lector = new javax.swing.JLabel();
        combolector = new javax.swing.JComboBox();
        cajapulgadas = new javax.swing.JTextField();
        ip = new javax.swing.JLabel();
        impresora = new javax.swing.JLabel();
        marca = new javax.swing.JLabel();
        modeloddd = new javax.swing.JLabel();
        serie = new javax.swing.JLabel();
        cajaserie = new javax.swing.JTextField();
        cajamodelo = new javax.swing.JTextField();
        cajamarca = new javax.swing.JTextField();
        cajaimpresora = new javax.swing.JTextField();
        cajaip = new javax.swing.JTextField();
        hdmi = new javax.swing.JLabel();
        usb = new javax.swing.JLabel();
        combousb = new javax.swing.JComboBox();
        combohdmi = new javax.swing.JComboBox();
        explicaion = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        combocompañia = new javax.swing.JComboBox();
        pertenece = new javax.swing.JTextField();
        compañia = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ubicacion = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        activo = new javax.swing.JComboBox();
        jLabel18 = new javax.swing.JLabel();
        sala = new javax.swing.JTextField();
        jLabel19 = new javax.swing.JLabel();
        cajainmo = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        observa = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        t_evento2 = new javax.swing.JTable();
        cajafecha = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        guardar = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        equipo.setBackground(new java.awt.Color(0, 102, 255));
        equipo.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        equipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "Impresora", "PC", "Laptop", "EQ.Video Conferencia", "Scanner", "Proyector" }));
        equipo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equipoActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Tipo de Equipo* :");

        resolucion.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        resolucion.setForeground(new java.awt.Color(255, 255, 255));
        resolucion.setText("Resolucion :");

        cajaresolucion.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cajaresolucion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajaresolucion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaresolucion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaresolucionActionPerformed(evt);
            }
        });

        cajaram.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cajaram.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajaram.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaram.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaramActionPerformed(evt);
            }
        });

        ram.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        ram.setForeground(new java.awt.Color(255, 255, 255));
        ram.setText("Tamaño de RAM : ");

        cajadd.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cajadd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajadd.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajadd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaddActionPerformed(evt);
            }
        });

        dd.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        dd.setForeground(new java.awt.Color(255, 255, 255));
        dd.setText("Tamaño de Disco Duro :");

        pulgadas.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        pulgadas.setForeground(new java.awt.Color(255, 255, 255));
        pulgadas.setText("Pulgadas : ");

        lector.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        lector.setForeground(new java.awt.Color(255, 255, 255));
        lector.setText("Cuenta Con Lector DVD :");

        combolector.setBackground(new java.awt.Color(0, 102, 255));
        combolector.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        combolector.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "SI", "NO" }));
        combolector.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        combolector.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combolector.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combolectorActionPerformed(evt);
            }
        });

        cajapulgadas.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cajapulgadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajapulgadas.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajapulgadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajapulgadasActionPerformed(evt);
            }
        });

        ip.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        ip.setForeground(new java.awt.Color(255, 255, 255));
        ip.setText("Direccion ip :");

        impresora.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        impresora.setForeground(new java.awt.Color(255, 255, 255));
        impresora.setText("Tipo de Impresora:");

        marca.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        marca.setForeground(new java.awt.Color(255, 255, 255));
        marca.setText("Marca*  :");

        modeloddd.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        modeloddd.setForeground(new java.awt.Color(255, 255, 255));
        modeloddd.setText("Modelo* :");

        serie.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        serie.setForeground(new java.awt.Color(255, 255, 255));
        serie.setText("No.Serie* :");

        cajaserie.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajaserie.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajaserie.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaserie.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaserieActionPerformed(evt);
            }
        });

        cajamodelo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajamodelo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajamodelo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajamodelo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajamodeloActionPerformed(evt);
            }
        });

        cajamarca.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajamarca.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajamarca.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajamarca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajamarcaActionPerformed(evt);
            }
        });

        cajaimpresora.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajaimpresora.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajaimpresora.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaimpresora.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaimpresoraActionPerformed(evt);
            }
        });

        cajaip.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajaip.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajaip.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajaip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajaipActionPerformed(evt);
            }
        });

        hdmi.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        hdmi.setForeground(new java.awt.Color(255, 255, 255));
        hdmi.setText("Puerto HMDI :");

        usb.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        usb.setForeground(new java.awt.Color(255, 255, 255));
        usb.setText("Puertos USB :");

        combousb.setBackground(new java.awt.Color(0, 102, 255));
        combousb.setFont(new java.awt.Font("Gulim", 1, 10)); // NOI18N
        combousb.setForeground(new java.awt.Color(255, 255, 255));
        combousb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "SI", "NO" }));
        combousb.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        combousb.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combousb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combousbActionPerformed(evt);
            }
        });

        combohdmi.setBackground(new java.awt.Color(0, 102, 255));
        combohdmi.setFont(new java.awt.Font("Gulim", 1, 10)); // NOI18N
        combohdmi.setForeground(new java.awt.Color(255, 255, 255));
        combohdmi.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "", "SI", "NO" }));
        combohdmi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        combohdmi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combohdmi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combohdmiActionPerformed(evt);
            }
        });

        explicaion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        explicaion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        explicaion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        explicaion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                explicaionActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Usuario* :");

        nombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Pertenece* : ");

        combocompañia.setBackground(new java.awt.Color(0, 102, 255));
        combocompañia.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        combocompañia.setForeground(new java.awt.Color(255, 255, 255));
        combocompañia.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Area de soporte", "Recursos Humanos", "Almacen", "Oficina del personal" }));
        combocompañia.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        combocompañia.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combocompañia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combocompañiaActionPerformed(evt);
            }
        });

        pertenece.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        pertenece.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        pertenece.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        pertenece.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perteneceActionPerformed(evt);
            }
        });

        compañia.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        compañia.setForeground(new java.awt.Color(255, 255, 255));
        compañia.setText("Compañia:");

        jLabel7.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Se registra en* :");

        ubicacion.setBackground(new java.awt.Color(0, 102, 255));
        ubicacion.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        ubicacion.setForeground(new java.awt.Color(255, 255, 255));
        ubicacion.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ubicacion de Equipo", " ", "Area de soporte", "Almacen", "Oficina del usuario" }));
        ubicacion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        ubicacion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ubicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubicacionActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Estado* :");

        activo.setBackground(new java.awt.Color(0, 102, 255));
        activo.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        activo.setForeground(new java.awt.Color(255, 255, 255));
        activo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Status", "ACTIVO" }));
        activo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        activo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        activo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                activoActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("Nombre de sala:");

        sala.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        sala.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        sala.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        sala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salaActionPerformed(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setText("Inmovilizado :");

        cajainmo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cajainmo.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        cajainmo.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        cajainmo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cajainmoActionPerformed(evt);
            }
        });

        jPanel5.setBackground(new java.awt.Color(204, 204, 204));
        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED), "Observaciones", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Gulim", 2, 12), java.awt.Color.white)); // NOI18N

        observa.setColumns(20);
        observa.setFont(new java.awt.Font("Century Gothic", 2, 12)); // NOI18N
        observa.setForeground(new java.awt.Color(0, 51, 102));
        observa.setRows(5);
        observa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 102)));
        observa.setSelectionColor(new java.awt.Color(204, 204, 255));
        jScrollPane1.setViewportView(observa);

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 418, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addContainerGap())
        );

        t_evento2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        t_evento2.setSelectionBackground(new java.awt.Color(0, 102, 255));
        jScrollPane2.setViewportView(t_evento2);

        cajafecha.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        cajafecha.setForeground(new java.awt.Color(255, 255, 255));
        cajafecha.setText("DD/MM/AÑOS");

        jButton4.setBackground(new java.awt.Color(0, 0, 0));
        jButton4.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Articulos/salir.png"))); // NOI18N
        jButton4.setText("SALIR");
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        guardar.setBackground(new java.awt.Color(0, 0, 0));
        guardar.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        guardar.setForeground(new java.awt.Color(255, 255, 255));
        guardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Articulos/boton-guardar.gif"))); // NOI18N
        guardar.setText("GUARDAR");
        guardar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                guardarActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(0, 0, 0));
        cancelar.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Articulos/cancelar.png"))); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelarActionPerformed(evt);
            }
        });

        nuevo.setBackground(new java.awt.Color(0, 0, 0));
        nuevo.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        nuevo.setForeground(new java.awt.Color(255, 255, 255));
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Articulos/testimonials-ti-ico.png"))); // NOI18N
        nuevo.setText("NUEVO");
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 849, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serie)
                            .addComponent(marca)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lector)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(combolector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(impresora)
                                    .addComponent(ip)
                                    .addComponent(modeloddd))
                                .addGap(29, 29, 29)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cajamodelo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaip, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaimpresora, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajamarca, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajaserie, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(explicaion, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cajafecha, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(hdmi)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combohdmi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(usb)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(combousb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGap(136, 136, 136)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dd)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(ram)
                            .addComponent(resolucion)
                            .addComponent(pulgadas))
                        .addGap(50, 50, 50)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(cajadd, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cajaram, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(cajaresolucion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cajapulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(guardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel9)
                            .addComponent(jLabel18)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(compañia)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(177, 177, 177)
                                .addComponent(combocompañia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(107, 107, 107)
                                .addComponent(activo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(pertenece, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(61, 61, 61)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(cajainmo)
                                        .addGap(12, 12, 12))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(sala, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(ubicacion, javax.swing.GroupLayout.Alignment.TRAILING, 0, 216, Short.MAX_VALUE))
                                        .addGap(0, 0, Short.MAX_VALUE))))))
                    .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(equipo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(resolucion, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(cajaresolucion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(combocompañia, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajaram, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ram, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(compañia, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajadd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dd, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(pertenece, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ubicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(activo, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(sala, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajainmo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajapulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pulgadas, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lector, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(combolector, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ip, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajaip, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(impresora)
                            .addComponent(cajaimpresora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cajamarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(marca))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(modeloddd)
                            .addComponent(cajamodelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(serie)
                            .addComponent(cajaserie, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(explicaion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cajafecha, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(combohdmi, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(hdmi))))
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combousb, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(usb, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(guardar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void equipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equipoActionPerformed
        // TODO add your handling code here:
        int bloqueo = equipo.getSelectedIndex();
        if(bloqueo == 1){
            
            impresora.setVisible(true);
            cajaimpresora.setVisible(true);
            ip.setVisible(false);
            cajaip.setVisible(false);
            resolucion.setVisible(false);
            cajaresolucion.setVisible(false);
            ram.setVisible(false);
            cajaram.setVisible(false);
            dd.setVisible(false);
            cajadd.setVisible(false);
            pulgadas.setVisible(false);
            cajapulgadas.setVisible(false);
            lector.setVisible(false);
            combolector.setVisible(false);
            hdmi.setVisible(false);
            combohdmi.setVisible(false);
            usb.setVisible(false);
            combousb.setVisible(false);
        }
        if(bloqueo == 2){
            
            resolucion.setVisible(true);
            cajaresolucion.setVisible(true);
            ram.setVisible(true);
            cajaram.setVisible(true);
            dd.setVisible(true);
            cajadd.setVisible(true);
            pulgadas.setVisible(true);
            cajapulgadas.setVisible(true);
            lector.setVisible(true);
            combolector.setVisible(true);
            hdmi.setVisible(true);
            combohdmi.setVisible(true);
            usb.setVisible(true);
            combousb.setVisible(true);
            ip.setVisible(false);
            cajaip.setVisible(false);
            impresora.setVisible(false);
            cajaimpresora.setVisible(false);

        }
        if(bloqueo == 3){
            
            resolucion.setVisible(true);
            cajaresolucion.setVisible(true);
            ram.setVisible(true);
            cajaram.setVisible(true);
            dd.setVisible(true);
            cajadd.setVisible(true);
            pulgadas.setVisible(true);
            cajapulgadas.setVisible(true);
            lector.setVisible(true);
            combolector.setVisible(true);
            hdmi.setVisible(true);
            combohdmi.setVisible(true);
            usb.setVisible(true);
            combousb.setVisible(true);
            ip.setVisible(false);
            cajaip.setVisible(false);
            impresora.setVisible(false);
            cajaimpresora.setVisible(false);
        }
        if(bloqueo==4){
            impresora.setVisible(false);
            cajaimpresora.setVisible(false);
            ip.setVisible(true);
            cajaip.setVisible(true);
            resolucion.setVisible(false);
            cajaresolucion.setVisible(false);
            ram.setVisible(false);
            cajaram.setVisible(false);
            dd.setVisible(false);
            cajadd.setVisible(false);
            pulgadas.setVisible(false);
            cajapulgadas.setVisible(false);
            lector.setVisible(false);
            combolector.setVisible(false);
            hdmi.setVisible(false);
            combohdmi.setVisible(false);
            usb.setVisible(false);
            combousb.setVisible(false);

        }
        if(bloqueo == 5){
            
            resolucion.setVisible(true);
            cajaresolucion.setVisible(true);
            hdmi.setVisible(true);
            combohdmi.setVisible(true);
            usb.setVisible(true);
            combousb.setVisible(true);
            ram.setVisible(false);
            cajaram.setVisible(false);
            dd.setVisible(false);
            cajadd.setVisible(false);
            pulgadas.setVisible(false);
            cajapulgadas.setVisible(false);
            lector.setVisible(false);
            combolector.setVisible(false);
            impresora.setVisible(false);
            cajaimpresora.setVisible(false);
            ip.setVisible(false);
            cajaip.setVisible(false);

        }
        if(bloqueo == 6){
       
            resolucion.setVisible(true);
            cajaresolucion.setVisible(true);
            hdmi.setVisible(true);
            combohdmi.setVisible(true);
            usb.setVisible(true);
            combousb.setVisible(true);
            ram.setVisible(false);
            cajaram.setVisible(false);
            dd.setVisible(false);
            cajadd.setVisible(false);
            pulgadas.setVisible(false);
            cajapulgadas.setVisible(false);
            lector.setVisible(false);
            combolector.setVisible(false);
            impresora.setVisible(false);
            cajaimpresora.setVisible(false);
            ip.setVisible(false);
            cajaip.setVisible(false);

        }
    }//GEN-LAST:event_equipoActionPerformed

    private void cajaresolucionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaresolucionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaresolucionActionPerformed

    private void cajaramActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaramActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaramActionPerformed

    private void cajaddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaddActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaddActionPerformed

    private void combolectorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combolectorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combolectorActionPerformed

    private void cajapulgadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajapulgadasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajapulgadasActionPerformed

    private void cajaserieActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaserieActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaserieActionPerformed

    private void cajamodeloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajamodeloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajamodeloActionPerformed

    private void cajamarcaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajamarcaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajamarcaActionPerformed

    private void cajaimpresoraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaimpresoraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaimpresoraActionPerformed

    private void cajaipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajaipActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajaipActionPerformed

    private void combousbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combousbActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combousbActionPerformed

    private void combohdmiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combohdmiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combohdmiActionPerformed

    private void explicaionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_explicaionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_explicaionActionPerformed

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreActionPerformed

    private void combocompañiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combocompañiaActionPerformed
        // TODO add your handling code here:
        int bloqueo = combocompañia.getSelectedIndex();
        if(bloqueo==2){
            compañia.setVisible(true);
            pertenece.setVisible(true);
            pertenece.setEnabled(true);
            pertenece.setText("");
        }
        if(bloqueo==1){
            pertenece.setText("PEMEX");
            pertenece.setVisible(false);
            compañia.setVisible(false);

        }else {

        }
    }//GEN-LAST:event_combocompañiaActionPerformed

    private void perteneceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perteneceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_perteneceActionPerformed

    private void ubicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubicacionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ubicacionActionPerformed

    private void activoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_activoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_activoActionPerformed

    private void salaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salaActionPerformed
        // TODO add your handling code here:
        sala.transferFocus();
    }//GEN-LAST:event_salaActionPerformed

    private void cajainmoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cajainmoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cajainmoActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        nuevo.setEnabled(false);
        desbloqueo();
    }//GEN-LAST:event_nuevoActionPerformed

    private void guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_guardarActionPerformed
        // TODO add your handling code here:
        Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
        
        String e , nom,equi,marc,modelo,seri,inmo,ubi,obser,acti,nomsala,cajapertenece,compania,fech,resol,raam,discod,pulga,dvd,direcip,impre,puerto1,puerto2;
        String sql="";
        
    nom=nombre.getText();
    equi=equipo.getSelectedItem().toString();
    marc=cajamarca.getText();
    modelo=cajamodelo.getText();
    seri=cajaserie.getText();
    inmo=cajainmo.getText();
    ubi=ubicacion.getSelectedItem().toString();
    obser=observa.getText();
    acti=activo.getSelectedItem().toString();
    nomsala=sala.getText();
    compania=combocompañia.getSelectedItem().toString();
    cajapertenece=pertenece.getText();
    fech=cajafecha.getText();
    resol=cajaresolucion.getText();
    raam=cajaram.getText();
    discod=cajadd.getText();
    pulga=cajapulgadas.getText();
    dvd=combolector.getSelectedItem().toString();
    direcip=cajaip.getText();
    impre=cajaimpresora.getText();
    puerto1=combohdmi.getSelectedItem().toString();
    puerto2=combousb.getSelectedItem().toString();
    e = explicaion.getText();
    
    //campos obligatorios
        if(nombre.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcados (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }

        if(cajamarca.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcados (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }
        if(cajamodelo.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcados (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }
  
       if(cajaserie.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcados (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }
       if(combocompañia.getSelectedItem().toString().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcados (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              } 
        if(ubicacion.getSelectedItem().toString().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcados (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              } 
        if(equipo.getSelectedItem().toString().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcados (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              } 
        if(activo.getSelectedItem().toString().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcados (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              } 
   
        
        sql="INSERT INTO articulos(nom_cli,equip,marc,model,seri,inmo,ubi,obser,acti,nom_sala,pertenece,nom_pertenece,fecha,resolucion,ram,dd,pulgadas,lector,ip,impresora,hdmi,usb,explic) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement psd =cn.prepareStatement(sql);
            psd.setString(1, nom);
            psd.setString(2, equi);
            psd.setString(3,marc);
            psd.setString(4,modelo);
            psd.setString(5, seri);
            psd.setString(6,inmo);
            psd.setString(7,ubi);
            psd.setString(8,obser);
            psd.setString(9,acti);
            psd.setString(10,nomsala);
            psd.setString(11,compania);
            psd.setString(12, cajapertenece);
            psd.setString(13,fech);
            psd.setString(14,resol);
            psd.setString(15,raam);
            psd.setString(16, discod);
            psd.setString(17, pulga);
            psd.setString(18, dvd);
            psd.setString(19, direcip);
            psd.setString(20, impre);
            psd.setString(21, puerto1);
            psd.setString(22, puerto2);
            psd.setString(23, e);
            
           int n=psd.executeUpdate();
           
           if (n>0){
               JOptionPane.showMessageDialog(null,"Nuevo Equipo Registrado!","CORRECTO",JOptionPane.PLAIN_MESSAGE,icon);
               cargar();
               limpiar();   
               bloqueo();
               nuevo.setEnabled(true);
               invisible();    
               

           }else{
               JOptionPane.showMessageDialog(this,"Su Equipo No Se Guardo ","ERROR",JOptionPane.ERROR_MESSAGE,save);
               
     
               } 
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,"Este No.Serie Ya Existe!","ERROR",JOptionPane.ERROR_MESSAGE,save);
           // Logger.getLogger(IngresoArticulos.class.getName()).log(Level.SEVERE, null, ex);
        }

        
        
        
        
        
    }//GEN-LAST:event_guardarActionPerformed

    private void cancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelarActionPerformed
        // TODO add your handling code here:
         bloqueo();
        nuevo.setEnabled(true);
        invisible();
    }//GEN-LAST:event_cancelarActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton4ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(IngresoArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IngresoArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IngresoArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IngresoArticulos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IngresoArticulos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox activo;
    private javax.swing.JTextField cajadd;
    private javax.swing.JLabel cajafecha;
    private javax.swing.JTextField cajaimpresora;
    private javax.swing.JTextField cajainmo;
    private javax.swing.JTextField cajaip;
    private javax.swing.JTextField cajamarca;
    private javax.swing.JTextField cajamodelo;
    private javax.swing.JTextField cajapulgadas;
    private javax.swing.JTextField cajaram;
    private javax.swing.JTextField cajaresolucion;
    private javax.swing.JTextField cajaserie;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox combocompañia;
    private javax.swing.JComboBox combohdmi;
    private javax.swing.JComboBox combolector;
    private javax.swing.JComboBox combousb;
    private javax.swing.JLabel compañia;
    private javax.swing.JLabel dd;
    private javax.swing.JComboBox equipo;
    private javax.swing.JTextField explicaion;
    private javax.swing.JButton guardar;
    private javax.swing.JLabel hdmi;
    private javax.swing.JLabel impresora;
    private javax.swing.JLabel ip;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lector;
    private javax.swing.JLabel marca;
    private javax.swing.JLabel modeloddd;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JTextArea observa;
    private javax.swing.JTextField pertenece;
    private javax.swing.JLabel pulgadas;
    private javax.swing.JLabel ram;
    private javax.swing.JLabel resolucion;
    private javax.swing.JTextField sala;
    private javax.swing.JLabel serie;
    private javax.swing.JTable t_evento2;
    private javax.swing.JComboBox ubicacion;
    private javax.swing.JLabel usb;
    // End of variables declaration//GEN-END:variables
}
