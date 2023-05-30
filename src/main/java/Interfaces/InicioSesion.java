package Interfaces;

import javax.swing.JOptionPane;
import Utilidades.Conexion;

public class InicioSesion extends javax.swing.JFrame {

    public InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pBase = new javax.swing.JPanel();
        lblContraseña = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        lblUsuario = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JTextField();
        lblBienvenida = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        btnIngresar = new javax.swing.JButton();
        lblInicioSesion = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pBase.setBackground(new java.awt.Color(232, 231, 228));
        pBase.setLayout(null);

        lblContraseña.setFont(new java.awt.Font("Tw Cen MT", 0, 22)); // NOI18N
        lblContraseña.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblContraseña.setText("Contraseña:");
        pBase.add(lblContraseña);
        lblContraseña.setBounds(10, 140, 120, 30);

        txtUsuario.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        pBase.add(txtUsuario);
        txtUsuario.setBounds(140, 90, 160, 30);

        lblUsuario.setFont(new java.awt.Font("Tw Cen MT", 0, 22)); // NOI18N
        lblUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblUsuario.setText("Usuario:");
        pBase.add(lblUsuario);
        lblUsuario.setBounds(20, 90, 100, 30);

        txtContraseña.setFont(new java.awt.Font("Tw Cen MT", 0, 16)); // NOI18N
        pBase.add(txtContraseña);
        txtContraseña.setBounds(140, 140, 160, 30);

        lblBienvenida.setFont(new java.awt.Font("Tw Cen MT", 0, 14)); // NOI18N
        lblBienvenida.setText("<HTML>Bienvenido/a, por favor ingrese usuario y contraseña para ingresar al sistema.<HTML>");
        pBase.add(lblBienvenida);
        lblBienvenida.setBounds(10, 40, 290, 30);

        btnSalir.setFont(new java.awt.Font("Tw Cen MT", 0, 22)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        pBase.add(btnSalir);
        btnSalir.setBounds(170, 200, 120, 32);

        btnIngresar.setFont(new java.awt.Font("Tw Cen MT", 0, 22)); // NOI18N
        btnIngresar.setText("Ingresar");
        btnIngresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarActionPerformed(evt);
            }
        });
        pBase.add(btnIngresar);
        btnIngresar.setBounds(20, 200, 120, 32);

        lblInicioSesion.setFont(new java.awt.Font("Tw Cen MT", 3, 28)); // NOI18N
        lblInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblInicioSesion.setText("Inicio de sesion");
        pBase.add(lblInicioSesion);
        lblInicioSesion.setBounds(30, 0, 260, 40);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pBase, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pBase, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        int x = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea salir?", "Saliendo del programa", 0, 2);
        if (x == 0) {
            System.exit(0);
        }
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnIngresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarActionPerformed
        String Usuario = txtUsuario.getText();
        String Contraseña = txtContraseña.getText();
        Conexion Connect = new Conexion();
        Connect.CrearConexion(Usuario, Contraseña);

        if (Connect.Mongo != null) {
            MenuPrincipal frmMenu = new MenuPrincipal();
            frmMenu.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_btnIngresarActionPerformed

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnIngresar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JLabel lblBienvenida;
    private javax.swing.JLabel lblContraseña;
    private javax.swing.JLabel lblInicioSesion;
    private javax.swing.JLabel lblUsuario;
    private javax.swing.JPanel pBase;
    private javax.swing.JTextField txtContraseña;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
