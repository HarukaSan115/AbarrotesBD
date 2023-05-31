package Interfaces;

import Utilidades.FechayHora;

public class ConsultasBasicas extends javax.swing.JFrame {

    String[] Titulos = {"ID Venta", "Codigo Articulo", "Cantidad"};
    FechayHora NuevaFecha;

    public ConsultasBasicas() {
        this.setLocationRelativeTo(null);
        initComponents();
        NuevaFecha = new FechayHora();
        lblCampoFecha.setText(NuevaFecha.ObtenerFecha());
        cmbOp5.setVisible(false);
        cmbPry6.setVisible(false);
        chkExcl6.setVisible(false);
        chk6.setVisible(false);
        txtAtr6.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rbgOrden = new javax.swing.ButtonGroup();
        pTitulo = new javax.swing.JPanel();
        lblMiniSuper = new javax.swing.JLabel();
        lblVentaArti = new javax.swing.JLabel();
        lblCampoFecha = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblLogoTienda = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        cmbColeccion = new javax.swing.JComboBox<>();
        lblConstructor = new javax.swing.JLabel();
        panQuerry = new javax.swing.JPanel();
        cmbOp1 = new javax.swing.JComboBox<>();
        chk2 = new javax.swing.JCheckBox();
        chk4 = new javax.swing.JCheckBox();
        txtAtr3 = new javax.swing.JTextField();
        cmbOp4 = new javax.swing.JComboBox<>();
        cmbPry1 = new javax.swing.JComboBox<>();
        cmbPry4 = new javax.swing.JComboBox<>();
        cmbPry5 = new javax.swing.JComboBox<>();
        cmbOp2 = new javax.swing.JComboBox<>();
        cmbPry2 = new javax.swing.JComboBox<>();
        chk1 = new javax.swing.JCheckBox();
        txtAtr5 = new javax.swing.JTextField();
        chk5 = new javax.swing.JCheckBox();
        txtAtr1 = new javax.swing.JTextField();
        txtAtr2 = new javax.swing.JTextField();
        chk3 = new javax.swing.JCheckBox();
        txtAtr4 = new javax.swing.JTextField();
        cmbPry3 = new javax.swing.JComboBox<>();
        cmbOp3 = new javax.swing.JComboBox<>();
        lblProy = new javax.swing.JLabel();
        chk6 = new javax.swing.JCheckBox();
        cmbPry6 = new javax.swing.JComboBox<>();
        txtAtr6 = new javax.swing.JTextField();
        cmbOp5 = new javax.swing.JComboBox<>();
        panOrder = new javax.swing.JPanel();
        lblOrder = new javax.swing.JLabel();
        cmbOrder = new javax.swing.JComboBox<>();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        panExcluir = new javax.swing.JPanel();
        lblExcluir = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        chkExcl1 = new javax.swing.JCheckBox();
        chkExcl2 = new javax.swing.JCheckBox();
        chkExcl3 = new javax.swing.JCheckBox();
        chkExcl4 = new javax.swing.JCheckBox();
        chkExcl5 = new javax.swing.JCheckBox();
        chkExcl6 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(786, 680));
        setPreferredSize(new java.awt.Dimension(786, 680));
        setResizable(false);
        getContentPane().setLayout(null);

        pTitulo.setBackground(new java.awt.Color(255, 255, 153));
        pTitulo.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        pTitulo.setLayout(null);

        lblMiniSuper.setFont(new java.awt.Font("Tw Cen MT", 3, 32)); // NOI18N
        lblMiniSuper.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblMiniSuper.setText("Mini Super Flores");
        pTitulo.add(lblMiniSuper);
        lblMiniSuper.setBounds(260, 0, 260, 40);

        lblVentaArti.setFont(new java.awt.Font("Tw Cen MT", 3, 24)); // NOI18N
        lblVentaArti.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVentaArti.setText("Consultas basicas");
        pTitulo.add(lblVentaArti);
        lblVentaArti.setBounds(260, 40, 260, 30);

        lblCampoFecha.setFont(new java.awt.Font("Tw Cen MT", 1, 18)); // NOI18N
        lblCampoFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        pTitulo.add(lblCampoFecha);
        lblCampoFecha.setBounds(640, 40, 110, 20);

        lblFecha.setFont(new java.awt.Font("Tw Cen MT", 3, 18)); // NOI18N
        lblFecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblFecha.setText("Fecha Actual");
        lblFecha.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFecha.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pTitulo.add(lblFecha);
        lblFecha.setBounds(640, 20, 110, 40);

        lblLogoTienda.setIcon(new javax.swing.ImageIcon("../Imagenes/LogoTienda.jpg"));
        lblLogoTienda.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        pTitulo.add(lblLogoTienda);
        lblLogoTienda.setBounds(20, 15, 156, 50);

        getContentPane().add(pTitulo);
        pTitulo.setBounds(0, 0, 770, 80);

        jLabel1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        jLabel1.setText("Coleccion a consultar:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(48, 107, 220, 27);

        cmbColeccion.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        cmbColeccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Empleados", "Proveedores", "Compras", "Compras - Articulos", "Inventario", "Articulos", "Articulos - Ventas", "Ventas", "Clientes", "Tiendas" }));
        getContentPane().add(cmbColeccion);
        cmbColeccion.setBounds(286, 107, 446, 27);

        lblConstructor.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblConstructor.setText("Constructor de consultas");
        getContentPane().add(lblConstructor);
        lblConstructor.setBounds(262, 152, 245, 27);

        panQuerry.setBackground(new java.awt.Color(153, 153, 255));
        panQuerry.setLayout(null);

        cmbOp1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbOp1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "And (&)", "Or (o)", "Nor (Not Or)" }));
        cmbOp1.setEnabled(false);
        cmbOp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOp1ActionPerformed(evt);
            }
        });
        panQuerry.add(cmbOp1);
        cmbOp1.setBounds(60, 80, 228, 22);

        chk2.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        chk2.setText("Nombre");
        chk2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk2ActionPerformed(evt);
            }
        });
        panQuerry.add(chk2);
        chk2.setBounds(20, 110, 75, 22);

        chk4.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        chk4.setText("Telefono");
        chk4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk4ActionPerformed(evt);
            }
        });
        panQuerry.add(chk4);
        chk4.setBounds(20, 230, 77, 22);

        txtAtr3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtAtr3.setEnabled(false);
        txtAtr3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtr3ActionPerformed(evt);
            }
        });
        panQuerry.add(txtAtr3);
        txtAtr3.setBounds(290, 170, 64, 22);

        cmbOp4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbOp4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "And (&)", "Or (o)", "Nor (Not Or)" }));
        cmbOp4.setEnabled(false);
        cmbOp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOp4ActionPerformed(evt);
            }
        });
        panQuerry.add(cmbOp4);
        cmbOp4.setBounds(60, 260, 228, 22);

        cmbPry1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbPry1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equivale a", "No Equivale a", "Mayor a", "Mayor o igual a", "Menor a", "Menor o igual a", "Contiene ", "No contiene ", "Empieza con", "No empieza con", "Termina con", "No termina con", "Es nulo", "No es nulo", " " }));
        cmbPry1.setEnabled(false);
        cmbPry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPry1ActionPerformed(evt);
            }
        });
        panQuerry.add(cmbPry1);
        cmbPry1.setBounds(140, 50, 127, 22);

        cmbPry4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbPry4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equivale a", "No Equivale a", "Mayor a", "Mayor o igual a", "Menor a", "Menor o igual a", "Contiene ", "No contiene ", "Empieza con", "No empieza con", "Termina con", "No termina con", "Es nulo", "No es nulo", " " }));
        cmbPry4.setEnabled(false);
        cmbPry4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPry4ActionPerformed(evt);
            }
        });
        panQuerry.add(cmbPry4);
        cmbPry4.setBounds(140, 230, 127, 22);

        cmbPry5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbPry5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equivale a", "No Equivale a", "Mayor a", "Mayor o igual a", "Menor a", "Menor o igual a", "Contiene ", "No contiene ", "Empieza con", "No empieza con", "Termina con", "No termina con", "Es nulo", "No es nulo", " " }));
        cmbPry5.setEnabled(false);
        cmbPry5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPry5ActionPerformed(evt);
            }
        });
        panQuerry.add(cmbPry5);
        cmbPry5.setBounds(140, 290, 127, 22);

        cmbOp2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbOp2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "And (&)", "Or (o)", "Nor (Not Or)" }));
        cmbOp2.setEnabled(false);
        panQuerry.add(cmbOp2);
        cmbOp2.setBounds(60, 140, 228, 22);

        cmbPry2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbPry2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equivale a", "No Equivale a", "Mayor a", "Mayor o igual a", "Menor a", "Menor o igual a", "Contiene ", "No contiene ", "Empieza con", "No empieza con", "Termina con", "No termina con", "Es nulo", "No es nulo", " " }));
        cmbPry2.setEnabled(false);
        cmbPry2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPry2ActionPerformed(evt);
            }
        });
        panQuerry.add(cmbPry2);
        cmbPry2.setBounds(140, 110, 127, 22);

        chk1.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        chk1.setText("No. Empleados");
        chk1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk1ActionPerformed(evt);
            }
        });
        panQuerry.add(chk1);
        chk1.setBounds(20, 50, 119, 22);

        txtAtr5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtAtr5.setEnabled(false);
        txtAtr5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtr5ActionPerformed(evt);
            }
        });
        panQuerry.add(txtAtr5);
        txtAtr5.setBounds(290, 290, 64, 22);

        chk5.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        chk5.setText("ID Tienda");
        chk5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk5ActionPerformed(evt);
            }
        });
        panQuerry.add(chk5);
        chk5.setBounds(20, 290, 84, 22);

        txtAtr1.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtAtr1.setEnabled(false);
        txtAtr1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtr1ActionPerformed(evt);
            }
        });
        panQuerry.add(txtAtr1);
        txtAtr1.setBounds(290, 50, 64, 22);

        txtAtr2.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtAtr2.setEnabled(false);
        txtAtr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtr2ActionPerformed(evt);
            }
        });
        panQuerry.add(txtAtr2);
        txtAtr2.setBounds(290, 110, 64, 22);

        chk3.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        chk3.setText("Direccion");
        chk3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk3ActionPerformed(evt);
            }
        });
        panQuerry.add(chk3);
        chk3.setBounds(20, 170, 79, 22);

        txtAtr4.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtAtr4.setEnabled(false);
        txtAtr4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtr4ActionPerformed(evt);
            }
        });
        panQuerry.add(txtAtr4);
        txtAtr4.setBounds(290, 230, 64, 22);

        cmbPry3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbPry3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equivale a", "No Equivale a", "Mayor a", "Mayor o igual a", "Menor a", "Menor o igual a", "Contiene ", "No contiene ", "Empieza con", "No empieza con", "Termina con", "No termina con", "Es nulo", "No es nulo", " " }));
        cmbPry3.setEnabled(false);
        cmbPry3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPry3ActionPerformed(evt);
            }
        });
        panQuerry.add(cmbPry3);
        cmbPry3.setBounds(140, 170, 127, 22);

        cmbOp3.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbOp3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "And (&)", "Or (o)", "Nor (Not Or)" }));
        cmbOp3.setEnabled(false);
        panQuerry.add(cmbOp3);
        cmbOp3.setBounds(60, 200, 228, 22);

        lblProy.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblProy.setText("Proyecciones - Querry");
        panQuerry.add(lblProy);
        lblProy.setBounds(70, 10, 225, 27);

        chk6.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        chk6.setText("ID Tienda");
        chk6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chk6ActionPerformed(evt);
            }
        });
        panQuerry.add(chk6);
        chk6.setBounds(20, 350, 84, 22);

        cmbPry6.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbPry6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Equivale a", "No Equivale a", "Mayor a", "Mayor o igual a", "Menor a", "Menor o igual a", "Contiene ", "No contiene ", "Empieza con", "No empieza con", "Termina con", "No termina con", "Es nulo", "No es nulo", " " }));
        cmbPry6.setEnabled(false);
        cmbPry6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPry6ActionPerformed(evt);
            }
        });
        panQuerry.add(cmbPry6);
        cmbPry6.setBounds(140, 350, 127, 22);

        txtAtr6.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        txtAtr6.setEnabled(false);
        txtAtr6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAtr6ActionPerformed(evt);
            }
        });
        panQuerry.add(txtAtr6);
        txtAtr6.setBounds(290, 350, 64, 22);

        cmbOp5.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        cmbOp5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "And (&)", "Or (o)", "Nor (Not Or)" }));
        cmbOp5.setEnabled(false);
        cmbOp5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOp5ActionPerformed(evt);
            }
        });
        panQuerry.add(cmbOp5);
        cmbOp5.setBounds(60, 320, 228, 22);

        getContentPane().add(panQuerry);
        panQuerry.setBounds(30, 190, 380, 390);

        panOrder.setBackground(new java.awt.Color(255, 153, 153));
        panOrder.setLayout(null);

        lblOrder.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblOrder.setText("Ordenar por");
        panOrder.add(lblOrder);
        lblOrder.setBounds(100, 10, 125, 27);

        cmbOrder.setFont(new java.awt.Font("Tw Cen MT", 0, 18)); // NOI18N
        cmbOrder.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "No. Empleados", "Nombre", "Direccion", "Telefono", "ID Tienda" }));
        cmbOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbOrderActionPerformed(evt);
            }
        });
        panOrder.add(cmbOrder);
        cmbOrder.setBounds(30, 40, 260, 30);

        rbgOrden.add(jRadioButton1);
        jRadioButton1.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jRadioButton1.setText("Ascendente");
        panOrder.add(jRadioButton1);
        jRadioButton1.setBounds(50, 80, 91, 21);

        rbgOrden.add(jRadioButton2);
        jRadioButton2.setFont(new java.awt.Font("Tw Cen MT", 1, 14)); // NOI18N
        jRadioButton2.setText("Descendente");
        panOrder.add(jRadioButton2);
        jRadioButton2.setBounds(160, 80, 97, 21);

        getContentPane().add(panOrder);
        panOrder.setBounds(440, 190, 310, 110);

        panExcluir.setBackground(new java.awt.Color(153, 255, 153));
        panExcluir.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblExcluir.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        lblExcluir.setText("Incluir Atributos");
        panExcluir.add(lblExcluir, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 10, 170, -1));

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new java.awt.GridLayout(6, 1, 10, 6));

        chkExcl1.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        chkExcl1.setText("No. Empleados");
        jPanel1.add(chkExcl1);

        chkExcl2.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        chkExcl2.setText("Nombre");
        jPanel1.add(chkExcl2);

        chkExcl3.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        chkExcl3.setText("Direccion");
        jPanel1.add(chkExcl3);

        chkExcl4.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        chkExcl4.setText("Telefono");
        jPanel1.add(chkExcl4);

        chkExcl5.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        chkExcl5.setText("ID Tienda");
        jPanel1.add(chkExcl5);

        chkExcl6.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        chkExcl6.setText("ID Tienda");
        jPanel1.add(chkExcl6);

        panExcluir.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 50, 160, 200));

        getContentPane().add(panExcluir);
        panExcluir.setBounds(440, 320, 310, 260);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chk2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk2ActionPerformed
        if (chk2.isSelected()) {
            txtAtr2.setEnabled(true);
            cmbPry2.setEnabled(true);
            if(chk1.isSelected()){
                    cmbOp1.setEnabled(true);
                } 
            else{
                cmbOp1.setEnabled(false);
            }
            if(chk3.isSelected() || chk4.isSelected() || chk5.isSelected() || chk6.isSelected()){
                cmbOp2.setEnabled(true);
            }
            else{
                cmbOp2.setEnabled(false);
            }
        }
        else {
            cmbOp2.setEnabled(false);
            txtAtr2.setEnabled(false);
            cmbPry2.setEnabled(false);
            if(!chk6.isSelected() && !chk5.isSelected() && !chk4.isSelected() && !chk3.isSelected()){
                cmbOp1.setEnabled(false);
            }
        }
    }//GEN-LAST:event_chk2ActionPerformed

    private void chk3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk3ActionPerformed
        if (chk3.isSelected()) {
            txtAtr3.setEnabled(true);
            cmbPry3.setEnabled(true);
            if(chk1.isSelected()){
                    cmbOp1.setEnabled(true);
                } 
            else{
                cmbOp1.setEnabled(false);
            }
            if(chk2.isSelected()){
                    cmbOp2.setEnabled(true);
                } 
            else{
                cmbOp2.setEnabled(false);
            }
            if(chk4.isSelected() || chk5.isSelected() || chk6.isSelected()){
                cmbOp3.setEnabled(true);
            }
            else{
                cmbOp3.setEnabled(false);
            }
        }
        else {
            cmbOp3.setEnabled(false);
            txtAtr3.setEnabled(false);
            cmbPry3.setEnabled(false);
            if(!chk6.isSelected() && !chk5.isSelected() && !chk4.isSelected()){
                cmbOp2.setEnabled(false);
            }
            if(cmbOp1.isEnabled() && (!chk2.isSelected()&&!chk4.isSelected()&&!chk5.isSelected()&&!chk6.isSelected())){
                cmbOp1.setEnabled(false);
            }
        }
    }//GEN-LAST:event_chk3ActionPerformed

    private void chk4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk4ActionPerformed
       if (chk4.isSelected()) {
            txtAtr4.setEnabled(true);
            cmbPry4.setEnabled(true);
            if(chk1.isSelected()){
                    cmbOp1.setEnabled(true);
                } 
            else{
                cmbOp1.setEnabled(false);
            }
            if(chk2.isSelected()){
                    cmbOp2.setEnabled(true);
                } 
            else{
                cmbOp2.setEnabled(false);
            }
            if(chk3.isSelected()){
                    cmbOp3.setEnabled(true);
                } 
            else{
                cmbOp3.setEnabled(false);
            }
            if(chk5.isSelected() || chk6.isSelected()){
                cmbOp4.setEnabled(true);
            }
            else{
                cmbOp4.setEnabled(false);
            }
        }
        else {
            cmbOp4.setEnabled(false);
            txtAtr4.setEnabled(false);
            cmbPry4.setEnabled(false);
            if(!chk6.isSelected() && !chk5.isSelected()){
                cmbOp3.setEnabled(false);
            }
            if(cmbOp1.isEnabled() && (!chk2.isSelected()&&!chk3.isSelected()&&!chk5.isSelected()&&!chk6.isSelected())){
                cmbOp1.setEnabled(false);
            }
            if(cmbOp2.isEnabled() && (!chk3.isSelected()&&!chk5.isSelected()&&!chk6.isSelected())){
                cmbOp2.setEnabled(false);
            }
        }
    }//GEN-LAST:event_chk4ActionPerformed

    private void chk5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk5ActionPerformed
    if (chk5.isSelected()) {
            txtAtr5.setEnabled(true);
            cmbPry5.setEnabled(true);
            if(chk1.isSelected()){
                    cmbOp1.setEnabled(true);
                } 
            else{
                cmbOp1.setEnabled(false);
            }
            if(chk2.isSelected()){
                    cmbOp2.setEnabled(true);
                } 
            else{
                cmbOp2.setEnabled(false);
            }
            if(chk3.isSelected()){
                    cmbOp3.setEnabled(true);
                } 
            else{
                cmbOp3.setEnabled(false);
            }
            if(chk4.isSelected()){
                    cmbOp4.setEnabled(true);
                } 
            else{
                cmbOp4.setEnabled(false);
            }
            if(chk6.isSelected()){
                cmbOp5.setEnabled(true);
            }
            else{
                cmbOp5.setEnabled(false);
            }
        }
        else {
            cmbOp5.setEnabled(false);
            txtAtr5.setEnabled(false);
            cmbPry5.setEnabled(false);
            
            if(!chk6.isSelected()){
                cmbOp4.setEnabled(false);
            }
            if(cmbOp1.isEnabled() && (!chk2.isSelected()&&!chk3.isSelected()&&!chk4.isSelected()&&!chk6.isSelected())){
                cmbOp1.setEnabled(false);
            }
            if(cmbOp2.isEnabled() && (!chk3.isSelected()&&!chk4.isSelected()&&!chk6.isSelected())){
                cmbOp2.setEnabled(false);
            }
             if(cmbOp3.isEnabled() && (!chk4.isSelected()&&!chk6.isSelected())){
                cmbOp3.setEnabled(false);
            }
        }
    }//GEN-LAST:event_chk5ActionPerformed

    private void txtAtr1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtr1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtr1ActionPerformed

    private void cmbPry1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPry1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPry1ActionPerformed

    private void cmbPry2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPry2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPry2ActionPerformed

    private void txtAtr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtr2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtr2ActionPerformed

    private void cmbPry3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPry3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPry3ActionPerformed

    private void txtAtr3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtr3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtr3ActionPerformed

    private void cmbPry4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPry4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPry4ActionPerformed

    private void txtAtr4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtr4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtr4ActionPerformed

    private void cmbPry5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPry5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPry5ActionPerformed

    private void txtAtr5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtr5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtr5ActionPerformed

    private void cmbOp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOp1ActionPerformed

    private void cmbOp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOp4ActionPerformed

    private void cmbOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOrderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOrderActionPerformed

    private void chk6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk6ActionPerformed
        if (chk6.isSelected()) {
            txtAtr6.setEnabled(true);
            cmbPry6.setEnabled(true);
            if(chk1.isSelected()){
                    cmbOp1.setEnabled(true);
            } 
            else{
                cmbOp1.setEnabled(false);
            }
            if(chk2.isSelected()){
                    cmbOp2.setEnabled(true);
            } 
            else{
                cmbOp2.setEnabled(false);
            }
            if(chk3.isSelected()){
                    cmbOp3.setEnabled(true);
            } 
            else{
                cmbOp3.setEnabled(false);
            }
            if(chk4.isSelected()){
                    cmbOp4.setEnabled(true);
            } 
            else{
                cmbOp4.setEnabled(false);
            }
            if(chk5.isSelected()){
                    cmbOp5.setEnabled(true);
            } 
            else{
                cmbOp5.setEnabled(false);
            }
        }
        else {
            cmbOp5.setEnabled(false);
            txtAtr6.setEnabled(false);
            cmbPry6.setEnabled(false);
            if(cmbOp1.isEnabled() && (!chk2.isSelected()&&!chk3.isSelected()&&!chk4.isSelected()&&!chk5.isSelected())){
                cmbOp1.setEnabled(false);
            }
            if(cmbOp2.isEnabled() && (!chk3.isSelected()&&!chk4.isSelected()&&!chk5.isSelected())){
                cmbOp2.setEnabled(false);
            }
             if(cmbOp3.isEnabled() && (!chk4.isSelected()&&!chk5.isSelected())){
                cmbOp3.setEnabled(false);
            }
             if(cmbOp4.isEnabled() && !chk5.isSelected()){
                cmbOp4.setEnabled(false);
            }
        }
    }//GEN-LAST:event_chk6ActionPerformed

    private void cmbPry6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPry6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbPry6ActionPerformed

    private void txtAtr6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAtr6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAtr6ActionPerformed

    private void cmbOp5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbOp5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbOp5ActionPerformed

    private void chk1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chk1ActionPerformed
        if (chk1.isSelected()) {
            txtAtr1.setEnabled(true);
            cmbPry1.setEnabled(true);
            if(chk2.isSelected() || chk3.isSelected() || chk4.isSelected() || chk5.isSelected() || chk6.isSelected()){
                    cmbOp1.setEnabled(true);
                } 
            else{
                cmbOp1.setEnabled(false);
            }
        }
        else {
            cmbOp1.setEnabled(false);
            txtAtr1.setEnabled(false);
            cmbPry1.setEnabled(false);
        }
    }//GEN-LAST:event_chk1ActionPerformed

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
            java.util.logging.Logger.getLogger(ConsultasBasicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultasBasicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultasBasicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultasBasicas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultasBasicas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox chk1;
    private javax.swing.JCheckBox chk2;
    private javax.swing.JCheckBox chk3;
    private javax.swing.JCheckBox chk4;
    private javax.swing.JCheckBox chk5;
    private javax.swing.JCheckBox chk6;
    private javax.swing.JCheckBox chkExcl1;
    private javax.swing.JCheckBox chkExcl2;
    private javax.swing.JCheckBox chkExcl3;
    private javax.swing.JCheckBox chkExcl4;
    private javax.swing.JCheckBox chkExcl5;
    private javax.swing.JCheckBox chkExcl6;
    private javax.swing.JComboBox<String> cmbColeccion;
    private javax.swing.JComboBox<String> cmbOp1;
    private javax.swing.JComboBox<String> cmbOp2;
    private javax.swing.JComboBox<String> cmbOp3;
    private javax.swing.JComboBox<String> cmbOp4;
    private javax.swing.JComboBox<String> cmbOp5;
    private javax.swing.JComboBox<String> cmbOrder;
    private javax.swing.JComboBox<String> cmbPry1;
    private javax.swing.JComboBox<String> cmbPry2;
    private javax.swing.JComboBox<String> cmbPry3;
    private javax.swing.JComboBox<String> cmbPry4;
    private javax.swing.JComboBox<String> cmbPry5;
    private javax.swing.JComboBox<String> cmbPry6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JLabel lblCampoFecha;
    private javax.swing.JLabel lblConstructor;
    private javax.swing.JLabel lblExcluir;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblLogoTienda;
    private javax.swing.JLabel lblMiniSuper;
    private javax.swing.JLabel lblOrder;
    private javax.swing.JLabel lblProy;
    private javax.swing.JLabel lblVentaArti;
    private javax.swing.JPanel pTitulo;
    private javax.swing.JPanel panExcluir;
    private javax.swing.JPanel panOrder;
    private javax.swing.JPanel panQuerry;
    private javax.swing.ButtonGroup rbgOrden;
    private javax.swing.JTextField txtAtr1;
    private javax.swing.JTextField txtAtr2;
    private javax.swing.JTextField txtAtr3;
    private javax.swing.JTextField txtAtr4;
    private javax.swing.JTextField txtAtr5;
    private javax.swing.JTextField txtAtr6;
    // End of variables declaration//GEN-END:variables
}
