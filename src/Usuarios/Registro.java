/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Usuarios;

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
public class Registro extends javax.swing.JFrame {
    DefaultTableModel model;
    Connection conn;
    Statement sent;
    Joption icon = new Joption();
    Joptionx save = new Joptionx(); 

    /**
     * Creates new form Registro
     */
    public Registro() {
        initComponents();
         invisible();
         bloquear();
         cajafecha.setText(fechaActual());
        setTitle("Registro de Usuarios");
        setResizable(false);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("USER.png")).getImage());
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
    void limpiar(){
    nombre.setText("");
    contra.setText("");
    apellido.setText("");
    ficha.setText("");
    comboedificio.setSelectedIndex(0);
    combousuario.setSelectedIndex(0);
    combotipo.setSelectedIndex(0);
    
}
    void invisible(){
        ficha.setVisible(false);
        noficha.setVisible(false);
    }
    void bloquear(){
    nombre.setEnabled(false);
    contra.setEnabled(false);
    apellido.setEnabled(false);
    comboedificio.setEnabled(false);
    combousuario.setEnabled(false);
    combotipo.setEnabled(false);   
    cancelar.setEnabled(false);
    admi.setEnabled(false);
    invi.setEnabled(false);
    }
    void desbloquear(){
    nombre.setEnabled(true);
    contra.setEnabled(true);
    apellido.setEnabled(true);
    comboedificio.setEnabled(true);
    combousuario.setEnabled(true);
    combotipo.setEnabled(true);
    cancelar.setEnabled(true);
    }
    void cargar(){           
     String [] titulos ={"Nombre","Apellido","Tipo","No_Ficha","Fecha de Registro","Edificion","Sesion de Accesso"};
 String sql = "SELECT * FROM administrador ";

 model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();

        try {
          Statement   st = cn.createStatement();
          ResultSet rs=st.executeQuery(sql);
          
          String [] fila = new String[15];

  if(rs.next()){
    
            fila[0] = rs.getString("nom_admi");
            fila[1] = rs.getString("ape_admi");
            fila[2] = rs.getString("tipo_invi");
            fila[3] = rs.getString("no_ficha");
            fila[4] = rs.getString("fecha"); 
            fila[5] = rs.getString("edificio");
            fila[6] = rs.getString("tipo_sesion");
            
      model.addRow(fila);

  }

        tabla.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }

      }   
void cargarinvi(){
        String [] titulos ={"Nombre","Apellido","Tipo","No_Ficha","Fecha de Registro","Edificion","Sesion de Accesso"};
         String sql="SELECT * FROM invitado";
         model= new DefaultTableModel(null,titulos);
 Conexion cc= new Conexion();
 Connection cn = cc.getConnection();
 try {
          Statement sts=cn.createStatement();

          ResultSet rs1= sts.executeQuery(sql);
          String [] fila = new String[15];
  if(rs1.next()){

          
            
            fila[0] = rs1.getString("nom_invi");
            fila[1] = rs1.getString("ape_invi");
            fila[2] = rs1.getString("tipo_invi");
            fila[3] = rs1.getString("no_ficha");
            fila[4] = rs1.getString("fecha");
            fila[5] = rs1.getString("lugar_reg");
            fila[6] = rs1.getString("tipo_sesion"); 
        
  
      
      model.addRow(fila);
  }
       tabla1.setModel(model);
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
   
  
    }    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        nombre = new javax.swing.JTextField();
        noficha1 = new javax.swing.JLabel();
        combotipo = new javax.swing.JComboBox();
        ficha = new javax.swing.JTextField();
        noficha = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        apellido = new javax.swing.JTextField();
        comboedificio = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        combousuario = new javax.swing.JComboBox();
        jLabel9 = new javax.swing.JLabel();
        contra = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jScrollPane3 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        cajafecha = new javax.swing.JLabel();
        admi = new javax.swing.JButton();
        nuevo = new javax.swing.JButton();
        cancelar = new javax.swing.JButton();
        invi = new javax.swing.JButton();
        salir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nombre(s)*  : ");

        nombre.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        nombre.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        nombre.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        nombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreActionPerformed(evt);
            }
        });
        nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                nombreKeyTyped(evt);
            }
        });

        noficha1.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        noficha1.setForeground(new java.awt.Color(255, 255, 255));
        noficha1.setText("Tipo de Invitado :");

        combotipo.setBackground(new java.awt.Color(0, 102, 255));
        combotipo.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        combotipo.setForeground(new java.awt.Color(255, 255, 255));
        combotipo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Tipo de Invitado", "Personal Nuevo", "Area de soporte", "Empleado" }));
        combotipo.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        combotipo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combotipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combotipoActionPerformed(evt);
            }
        });

        ficha.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        ficha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        ficha.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        ficha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fichaActionPerformed(evt);
            }
        });
        ficha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                fichaKeyTyped(evt);
            }
        });

        noficha.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        noficha.setForeground(new java.awt.Color(255, 255, 255));
        noficha.setText("No.Ficha :");

        jLabel3.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Apellido(s) : ");

        apellido.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        apellido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        apellido.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoActionPerformed(evt);
            }
        });

        comboedificio.setBackground(new java.awt.Color(0, 102, 255));
        comboedificio.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        comboedificio.setForeground(new java.awt.Color(255, 255, 255));
        comboedificio.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "¿Se registra en?", " ", "Oficina", "Area de soporte", "Area de ingieneria" }));
        comboedificio.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        comboedificio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel7.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Labora en :");

        combousuario.setBackground(new java.awt.Color(0, 102, 255));
        combousuario.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        combousuario.setForeground(new java.awt.Color(255, 255, 255));
        combousuario.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "--Seleccione--", "ADMINISTRADOR", "INVITADO" }));
        combousuario.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        combousuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        combousuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combousuarioActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Tipo de Sesion * : ");

        contra.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        contra.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        contra.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        contra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contraActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Contraseña* :");

        tabla.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Tipo", "No.Ficha", "Dia de  Registro", "Ubicacion", "Tipo de Accesso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla.setSelectionBackground(new java.awt.Color(0, 51, 255));
        jScrollPane1.setViewportView(tabla);

        tabla1.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Apellido", "Tipo", "No.Ficha", "Dia de  Registro", "Ubicacion", "Tipo de Accesso"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabla1.setSelectionBackground(new java.awt.Color(0, 51, 255));
        jScrollPane3.setViewportView(tabla1);

        cajafecha.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cajafecha.setForeground(new java.awt.Color(255, 255, 255));
        cajafecha.setText("DD/MM/YYYY");

        admi.setBackground(new java.awt.Color(0, 0, 0));
        admi.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        admi.setForeground(new java.awt.Color(255, 255, 255));
        admi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuarios/boton-guardar.gif"))); // NOI18N
        admi.setText("GUARDAR");
        admi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        admi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                admiActionPerformed(evt);
            }
        });

        nuevo.setBackground(new java.awt.Color(0, 0, 0));
        nuevo.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        nuevo.setForeground(new java.awt.Color(255, 255, 255));
        nuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuarios/testimonials-ti-ico.png"))); // NOI18N
        nuevo.setText("NUEVO");
        nuevo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nuevoActionPerformed(evt);
            }
        });

        cancelar.setBackground(new java.awt.Color(0, 0, 0));
        cancelar.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        cancelar.setForeground(new java.awt.Color(255, 255, 255));
        cancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuarios/cancelar.png"))); // NOI18N
        cancelar.setText("CANCELAR");
        cancelar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        invi.setBackground(new java.awt.Color(0, 0, 0));
        invi.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        invi.setForeground(new java.awt.Color(255, 255, 255));
        invi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuarios/boton-guardar.gif"))); // NOI18N
        invi.setText("GUARDAR");
        invi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        invi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                inviActionPerformed(evt);
            }
        });

        salir.setBackground(new java.awt.Color(0, 0, 0));
        salir.setFont(new java.awt.Font("Gulim", 1, 12)); // NOI18N
        salir.setForeground(new java.awt.Color(255, 255, 255));
        salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Usuarios/salir.png"))); // NOI18N
        salir.setText("SALIR");
        salir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cajafecha))))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
                            .addComponent(jScrollPane3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(noficha1))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(noficha))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGap(27, 27, 27)
                                        .addComponent(ficha, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(combousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10)
                            .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9)
                            .addComponent(comboedificio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(nuevo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(admi)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(invi, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(comboedificio, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(noficha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(noficha1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(combotipo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ficha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(combousuario, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(apellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cajafecha, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE, false)
                    .addComponent(nuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(admi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(invi, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(salir, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreActionPerformed
        // TODO add your handling code here:
        nombre.transferFocus();
    }//GEN-LAST:event_nombreActionPerformed

    private void nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_nombreKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_nombreKeyTyped

    private void combotipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combotipoActionPerformed
        // TODO add your handling code here:
        int bloqueo = combotipo.getSelectedIndex();
        if(bloqueo==3){
            ficha.setEnabled(true);
            ficha.setVisible(true);
            noficha.setVisible(true);

        }else{
            ficha.setVisible(false);
            noficha.setVisible(false);
        }
    }//GEN-LAST:event_combotipoActionPerformed

    private void fichaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fichaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fichaActionPerformed

    private void fichaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fichaKeyTyped
        // TODO add your handling code here:
        char C = evt.getKeyChar();
        if(C<'0' || C>'9') evt.consume();
        if(ficha.getText().length()>=6){
            evt.consume();
        }
    }//GEN-LAST:event_fichaKeyTyped

    private void apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoActionPerformed
        // TODO add your handling code here:
        apellido.transferFocus();
    }//GEN-LAST:event_apellidoActionPerformed

    private void combousuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combousuarioActionPerformed
        // TODO add your handling code here:
        int bloqueo = combousuario.getSelectedIndex();
        if(bloqueo==1){
            admi.setEnabled(true);
            invi.setEnabled(false);

        }else{
            invi.setEnabled(true);
            admi.setEnabled(false);

        }
    }//GEN-LAST:event_combousuarioActionPerformed

    private void contraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contraActionPerformed
        // TODO add your handling code here:
        contra.transferFocus();
    }//GEN-LAST:event_contraActionPerformed

    private void salirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_salirActionPerformed

    private void nuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nuevoActionPerformed
        // TODO add your handling code here:
        desbloquear();
        nuevo.setEnabled(false);
    }//GEN-LAST:event_nuevoActionPerformed

    private void admiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_admiActionPerformed
        // TODO add your handling code here:
        Conexion cc= new Conexion();
        Connection cn = cc.getConnection();
         if(nombre.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcado (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
             }
             if(apellido.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcado (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }
            if(combousuario.getSelectedItem().toString().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcado (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
             }
        String nom_admi,ape_admi,tipo_invi,no_ficha,fecha,lugar,contra_usu,tipo_sesion;
        String sql="";
        
    nom_admi=nombre.getText();
    ape_admi=apellido.getText();
    tipo_invi=combotipo.getSelectedItem().toString();
    no_ficha=ficha.getText();
    fecha=cajafecha.getText();
    lugar=comboedificio.getSelectedItem().toString();
    contra_usu=contra.getText();
    tipo_sesion=combousuario.getSelectedItem().toString();
   
        sql="INSERT INTO administrador(nom_admi,ape_admi,tipo_invi,no_ficha,fecha,edificio,tipo_sesion,contra_usu) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement psd =cn.prepareStatement(sql);
            psd.setString(1, nom_admi);
            psd.setString(2, ape_admi);
            psd.setString(3, tipo_invi);
            psd.setString(4,no_ficha);
            psd.setString(5,fecha);
            psd.setString(6,lugar);
            psd.setString(7, tipo_sesion);
            psd.setString(8, contra_usu);
       
       
           int n=psd.executeUpdate();
           
           if (n>0){
               JOptionPane.showMessageDialog(null,"Usuario Registrado!","REGISTRO",JOptionPane.PLAIN_MESSAGE,icon);
               limpiar();     
               nuevo.setEnabled(true);
               bloquear();
               cargar();
              
           }
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_admiActionPerformed

    private void inviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_inviActionPerformed
        // TODO add your handling code here:
        Conexion cc= new Conexion();
        Connection cn = cc.getConnection();
            if(nombre.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcado (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
             }
             if(apellido.getText().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcado (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
              }
            if(combousuario.getSelectedItem().toString().equals("")){
             JOptionPane.showMessageDialog(null,"Los Campos Marcado (*) Son Necesarios!","ERROR",JOptionPane.ERROR_MESSAGE,save);
             return;        
             }
       
        String nom_invi,ape_invi,tipo_invi,no_ficha,fecha,lugar_reg,contra_usu,tipo_sesion;
        String sql="";
        
    nom_invi=nombre.getText();
    ape_invi=apellido.getText();
    tipo_invi=combotipo.getSelectedItem().toString();
    no_ficha=ficha.getText();
    fecha=cajafecha.getText();
    lugar_reg=comboedificio.getSelectedItem().toString();
    contra_usu=contra.getText();
    tipo_sesion=combousuario.getSelectedItem().toString();
   
        sql="INSERT INTO invitado(nom_invi,ape_invi,tipo_invi,no_ficha,fecha,lugar_reg,contra_usu,tipo_sesion) VALUES (?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement psd =cn.prepareStatement(sql);
            psd.setString(1, nom_invi);
            psd.setString(2, ape_invi);
            psd.setString(3,tipo_invi);
            psd.setString(4,no_ficha);
            psd.setString(5,fecha);
            psd.setString(6,lugar_reg);
            psd.setString(7,contra_usu);
            psd.setString(8,tipo_sesion); 
            
       
           int n=psd.executeUpdate();
           
           if (n>0){
               JOptionPane.showMessageDialog(null,"Usuario Registrado!","REGISTRO",JOptionPane.PLAIN_MESSAGE,icon);
               limpiar();     
               nuevo.setEnabled(true);
               bloquear();
               cargarinvi();
           }
        } catch (SQLException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }

        
    }//GEN-LAST:event_inviActionPerformed

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
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton admi;
    private javax.swing.JTextField apellido;
    private javax.swing.JLabel cajafecha;
    private javax.swing.JButton cancelar;
    private javax.swing.JComboBox comboedificio;
    private javax.swing.JComboBox combotipo;
    private javax.swing.JComboBox combousuario;
    private javax.swing.JTextField contra;
    private javax.swing.JTextField ficha;
    private javax.swing.JButton invi;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel noficha;
    private javax.swing.JLabel noficha1;
    private javax.swing.JTextField nombre;
    private javax.swing.JButton nuevo;
    private javax.swing.JButton salir;
    private javax.swing.JTable tabla;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
