package pacote_menus;

import java.awt.Toolkit;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

import javax.swing.ImageIcon;

public class MenuNoroeste extends javax.swing.JFrame {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * Creates new form MenuInicial
     */
    public MenuNoroeste() {
        initComponents();
        setTitle("Região Noroeste");
        setIconBar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        campoMourao = new javax.swing.JButton();
        cianorte = new javax.swing.JButton();
        loanda = new javax.swing.JButton();
        maringaCtm = new javax.swing.JButton();
        maringaZ5 = new javax.swing.JButton();
        umuarama = new javax.swing.JButton();
        paranavai = new javax.swing.JButton();
        retornar = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();

        jLabel2.setText("Escolha a  Região");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel1.setText("Região Noroeste");

        campoMourao.setText("Campo M.");
        campoMourao.setFocusPainted(false);
        campoMourao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoMouraoActionPerformed(evt);
            }
        });

        cianorte.setText("Cianorte");
        cianorte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cianorteActionPerformed(evt);
            }
        });

        loanda.setText("Loanda");
        loanda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loandaActionPerformed(evt);
            }
        });

        maringaCtm.setText("Maringá CTM ");
        maringaCtm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maringaCtmActionPerformed(evt);
            }
        });

        maringaZ5.setText("Maringá Z5");
        maringaZ5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maringaZ5ActionPerformed(evt);
            }
        });

        umuarama.setText("Umuarama");
        umuarama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                umuaramaActionPerformed(evt);
            }
        });

        paranavai.setText("Paranavaí");
        paranavai.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paranavaiActionPerformed(evt);
            }
        });

        retornar.setBackground(new java.awt.Color(152, 143, 143));
        retornar.setText("Retornar");
        retornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maringaCtm, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(umuarama, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(maringaZ5, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(retornar, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoMourao, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cianorte, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(paranavai, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loanda, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(121, 121, 121)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoMourao, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cianorte, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(loanda, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(maringaCtm, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maringaZ5, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(paranavai, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(umuarama, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(retornar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void campoMouraoActionPerformed(java.awt.event.ActionEvent evt) {                                            
        try {      
            Runtime.getRuntime().exec("explorer \\\\servercpm04");
        } catch (IOException ex) {
            Logger.getLogger(MenuNoroeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                           

    private void cianorteActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {      
            Runtime.getRuntime().exec("explorer \\\\servercia04");
        } catch (IOException ex) {
            Logger.getLogger(MenuNoroeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                        

    private void retornarActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new MenuLocalizacao().setVisible(true);
        dispose();
    }                                        

    private void loandaActionPerformed(java.awt.event.ActionEvent evt) {                                       
        try {      
            Runtime.getRuntime().exec("explorer \\\\serverloa04");
        } catch (IOException ex) {
            Logger.getLogger(MenuNoroeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                      

    private void maringaCtmActionPerformed(java.awt.event.ActionEvent evt) {                                           
        try {      
            Runtime.getRuntime().exec("explorer \\\\servermgasn04");
        } catch (IOException ex) {
            Logger.getLogger(MenuNoroeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                          

    private void maringaZ5ActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {      
            Runtime.getRuntime().exec("explorer \\\\servermga04");
        } catch (IOException ex) {
            Logger.getLogger(MenuNoroeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                         

    private void paranavaiActionPerformed(java.awt.event.ActionEvent evt) {                                          
        try {      
            Runtime.getRuntime().exec("explorer \\\\serverpvi04");
        } catch (IOException ex) {
            Logger.getLogger(MenuNoroeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                         

    private void umuaramaActionPerformed(java.awt.event.ActionEvent evt) {                                         
        try {      
            Runtime.getRuntime().exec("explorer \\\\serverumusn04");
        } catch (IOException ex) {
            Logger.getLogger(MenuNoroeste.class.getName()).log(Level.SEVERE, null, ex);
        }
    }                                        

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
            java.util.logging.Logger.getLogger(MenuNoroeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuNoroeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuNoroeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuNoroeste.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuNoroeste().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton campoMourao;
    private javax.swing.JButton cianorte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JButton loanda;
    private javax.swing.JButton maringaCtm;
    private javax.swing.JButton maringaZ5;
    private javax.swing.JButton paranavai;
    private javax.swing.JButton retornar;
    private javax.swing.JButton umuarama;
    // End of variables declaration                   

    private void setIconBar() {
    	ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("printer.png"));
    	
    	setIconImage(icon.getImage());
    }
}
