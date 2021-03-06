/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cristofyserver.view;

import cristofyserver.controller.CristofyServerLogInfo;
import cristofyserver.controller.CristofyServerThread;
import java.awt.Color;
import javax.swing.ImageIcon;

/**
 *
 * @author Nacho
 */
public class CristofyServerGUI extends javax.swing.JFrame {
    private boolean on = false;
    private static int port = 0;
    private CristofyServerThread server;

    /**
     * Creates new form CristofyServerGUI
     */
    public CristofyServerGUI() {
        initComponents();
        initIcon();
        setLogAreaColorTransparent();
        this.server = new CristofyServerThread(port);
        CristofyServerLogInfo logInfo = new CristofyServerLogInfo(this.logArea);
        logInfo.start();
    }
    
    public void initIcon(){
        ImageIcon icon = new ImageIcon(getClass().getResource("/assets/logo/cristofyIcon.png"));
        setIconImage(icon.getImage());
    }
    
    public void setLogAreaColorTransparent(){
        jScrollPane1.setOpaque(false);
        jScrollPane1.getViewport().setOpaque(false);
        jScrollPane1.setBorder(null);
        jScrollPane1.setViewportBorder(null);

        logArea.setBorder(null);
        logArea.setBackground(new Color(0, 0, 0, 0));
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSlider1 = new javax.swing.JSlider();
        ServerText = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        logArea = new javax.swing.JTextArea();
        cristofyLogo = new javax.swing.JLabel();
        on_offButton = new javax.swing.JLabel();
        background = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cristofy Server");
        setBackground(new java.awt.Color(51, 51, 51));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ServerText.setFont(new java.awt.Font("Gadugi", 1, 36)); // NOI18N
        ServerText.setForeground(new java.awt.Color(204, 204, 204));
        ServerText.setText("Server Status: ");
        ServerText.setToolTipText("");
        getContentPane().add(ServerText, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 41, -1, 64));

        logArea.setEditable(false);
        logArea.setColumns(20);
        logArea.setFont(new java.awt.Font("Leelawadee UI", 0, 14)); // NOI18N
        logArea.setForeground(new java.awt.Color(204, 204, 204));
        logArea.setRows(5);
        logArea.setToolTipText("");
        logArea.setOpaque(false);
        logArea.setSelectionColor(new java.awt.Color(51, 204, 255));
        jScrollPane1.setViewportView(logArea);
        logArea.getAccessibleContext().setAccessibleName("");

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(46, 146, 790, 441));

        cristofyLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/logo/CristofyLogo.png"))); // NOI18N
        getContentPane().add(cristofyLogo, new org.netbeans.lib.awtextra.AbsoluteConstraints(499, 23, -1, -1));

        on_offButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/buttons/offbutton.png"))); // NOI18N
        on_offButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                on_offButtonMouseClicked(evt);
            }
        });
        getContentPane().add(on_offButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(315, 64, -1, -1));

        background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/backgrounds/3540-blue-curves-1920x1080-abstract-wallpaper.jpg"))); // NOI18N
        getContentPane().add(background, new org.netbeans.lib.awtextra.AbsoluteConstraints(-100, 0, 980, 640));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void on_offButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_on_offButtonMouseClicked
        // TODO add your handling code here:
        if(on){
            on_offButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/buttons/offbutton.png")));
            server.stopServer();
            server.stop();
            on = false;
        }else if(!on){
            on_offButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/assets/buttons/onbutton.png")));
            server.start();
            on = true;
        }
    }//GEN-LAST:event_on_offButtonMouseClicked

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
            java.util.logging.Logger.getLogger(CristofyServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CristofyServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CristofyServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CristofyServerGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CristofyServerGUI().setVisible(true);
            }
        });
        
        if (args.length != 1) {
            System.err.println("Missing port number");
            System.exit(1);
        }
        
        port = Integer.parseInt(args[0]);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ServerText;
    private javax.swing.JLabel background;
    private javax.swing.JLabel cristofyLogo;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSlider jSlider1;
    private javax.swing.JTextArea logArea;
    private javax.swing.JLabel on_offButton;
    // End of variables declaration//GEN-END:variables
}
