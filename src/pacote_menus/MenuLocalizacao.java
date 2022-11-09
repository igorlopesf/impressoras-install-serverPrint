package pacote_menus;


import java.awt.event.ActionEvent;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class MenuLocalizacao extends javax.swing.JFrame {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String[] ipFaixa;
    private String ipServer;
    private JLabel logo;

    /**
     * Creates new form MenuInicial
     */
    public MenuLocalizacao() {
        initComponents();
        setTitle("Impressoras - Sistema Fiep");
        ImageIcon logoFiep = new ImageIcon(getClass().getClassLoader().getResource("logo.png"));
        logo.setIcon(logoFiep);
        setIconBar();
    }

 

	@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jButton1 = new javax.swing.JButton();
        metropolitana1 = new javax.swing.JButton();
        Metropolitana2 = new javax.swing.JButton();
        noroeste = new javax.swing.JButton();
        norte = new javax.swing.JButton();
        sede = new javax.swing.JButton();
        sudoeste = new javax.swing.JButton();
        sair = new javax.swing.JButton();
        oeste = new javax.swing.JButton();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        seuLogin = new javax.swing.JLabel();
        nomeDispositivo = new javax.swing.JLabel();
        seuIP = new javax.swing.JLabel();
        login = new javax.swing.JLabel();
        host = new javax.swing.JLabel();
        ip = new javax.swing.JLabel();
        String ipToString = "";
        cidadeAtual = new javax.swing.JLabel();
        btnCidade = new javax.swing.JButton();
        logo = new javax.swing.JLabel();
        
        try {
            ip.setText(InetAddress.getLocalHost().getHostAddress());
            ipToString = InetAddress.getLocalHost().getHostAddress();
            ipFaixa = ipToString.split("\\.");
            
            host.setText(InetAddress.getLocalHost().getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
        }
        
        login.setText(System.getProperty("user.name"));
        
        switch(ipFaixa[2]){
            case "143" -> {
                btnCidade.setText("Maringá CTM");
                ipServer = "explorer \\\\servermgasn04";
                break;
            }
            case "126" -> {
                btnCidade.setText("Cianorte");
                ipServer = "explorer \\\\servercia04";
                break;
            }
            case "129" -> {
                btnCidade.setText("Umuarama");
                ipServer = "explorer \\\\serverumusn04";
                break;
            }
            case "122" -> {
                btnCidade.setText("Maringá Z5");
                ipServer = "explorer \\\\servermga04";
                break;
            }
            case "141" -> {
                btnCidade.setText("Loanda");
                ipServer = "explorer \\\\serverloa04";
                break;
            }
            case "130" -> {
                btnCidade.setText("Campo Mourao");
                ipServer = "explorer \\\\servercpm04";
                break;
            }
            case "131" -> {
                btnCidade.setText("Paranavai");
                ipServer = "explorer \\\\serverpvi04";
                break;
            }
//            CAMPOS GERAIS 
            case "118" -> {
                btnCidade.setText("Guarapuava");
                ipServer = "explorer \\\\servergpv04";
                break;
            }
            case "114" -> {
                btnCidade.setText("Irati");
                ipServer = "explorer \\\\serverirtss04";
                break;
            }
            case "117" -> {
                btnCidade.setText("Jaguariaiva");
                ipServer = "explorer \\\\serverjgvsn04";
                break;
            }
            case "112" -> {
                btnCidade.setText("Ponta Grossa Senai");
                ipServer = "explorer \\\\serverpgrsn04";
                break;
            }
            case "113" -> {
                btnCidade.setText("Ponta Grossa Sesi");
                ipServer = "explorer \\\\serverpgrss04";
                break;
            }
            case "136" -> {
                btnCidade.setText("São Mateus");
                ipServer = "explorer \\\\serversmsss04";
                break;
            }
            case "116" -> {
                btnCidade.setText("Telemaco Borba SN");
                ipServer = "explorer \\\\servertmbsn04";
                break;
            }
            case "115" -> {
                btnCidade.setText("Telemaco Borba SS");
                ipServer = "explorer \\\\servertmbss04";
                break;
            }
            case "139" -> {
                btnCidade.setText("União da Vitória");
                ipServer = "explorer \\\\serveruvt04";
                break;
            }
            
        //  Regiao Metropolitana 1
           
            case "101" -> {
                btnCidade.setText("Boqueirão");
                ipServer = "explorer \\\\serverboqss04";
                break;
            }
            case "151" -> {
                btnCidade.setText("CA");
                ipServer = "explorer \\\\serverca04";
                break;
            }
            
            case "68" -> {
                btnCidade.setText("CIC");
                ipServer = "explorer \\\\servercic04";
                break;
            }
            
            case "69" -> {
                btnCidade.setText("CIC");
                ipServer = "explorer \\\\servercic04";
                break;
            }
            
            case "70" -> {
                btnCidade.setText("CIC");
                ipServer = "explorer \\\\servercic04";
                break;
            }
            
            case "71" -> {
                btnCidade.setText("CIC");
                ipServer = "explorer \\\\servercic04";
                break;
            }
            
            case "100" -> {
                btnCidade.setText("Portão");
                ipServer = "explorer \\\\serverprtss04";
                break;
            }
            
            case "177" -> {
                btnCidade.setText("Rio Negro Senai");
                ipServer = "explorer \\\\serverrno04";
                break;
            }
            
            case "110" -> {
                btnCidade.setText("Rio Negro Sesi");
                ipServer = "explorer \\\\serverrnoss04";
                break;
            }
            
//            Regiao Metropolitana 2
            case "154" -> {
                btnCidade.setText("Afonso Pena");
                ipServer = "explorer \\\\serversjpap04";
                break;
            }case "155" -> {
                btnCidade.setText("Afonso Pena");
                ipServer = "explorer \\\\serversjpap04";
                break;
            }
            case "48" -> {
                btnCidade.setText("Campus da Ind.");
                ipServer = "explorer \\\\serverctp04";
                break;
            }
            case "49" -> {
                btnCidade.setText("Campus da Ind.");
                ipServer = "explorer \\\\serverctp04";
                break;
            }
            case "50" -> {
                btnCidade.setText("Campus da Ind.");
                ipServer = "explorer \\\\serverctp04";
                break;
            }
            case "51" -> {
                btnCidade.setText("Campus da Ind.");
                ipServer = "explorer \\\\serverctp04";
                break;
            }
            case "111" -> {
                btnCidade.setText("Paranaguá");
                ipServer = "explorer \\\\serverpng04";
                break;
            }
            case "104" -> {
                btnCidade.setText("Paranaguá");
                ipServer = "explorer \\\\servercci04";
                break;
            }
            case "158" -> {
                btnCidade.setText("Pinhais");
                ipServer = "explorer \\\\serverpin04";
                break;
            }
            case "109" -> {
                btnCidade.setText("Quatro Barras");
                ipServer = "explorer \\\\serverqtbss04";
                break;
            }
            case "107" -> {
                btnCidade.setText("Senai Costeira");
                ipServer = "explorer \\\\serversjpsn04";
                break;
            }
            
//            Região Norte 
            
            case "123" -> {
                btnCidade.setText("Apucarana");
                ipServer = "explorer \\\\serverapuss04";
                break;
            }
            case "125" -> {
                btnCidade.setText("Arapongas Senai");
                ipServer = "explorer \\\\serverarpsn04";
                break;
            }
            case "124" -> {
                btnCidade.setText("Arapongas Sesi");
                ipServer = "explorer \\\\serverarpss04";
                break;
            }
            case "80" -> {
                btnCidade.setText("Londrina");
                ipServer = "explorer \\\\serverldnsn04";
                break;
            }
            case "81" -> {
                btnCidade.setText("Londrina");
                ipServer = "explorer \\\\serverldnsn04";
                break;
            }
            case "127" -> {
                btnCidade.setText("Santo Ant. Plat.");
                ipServer = "explorer \\\\serversap04";
                break;
            }
            
//            Oeste
            case "132" -> {
                btnCidade.setText("Cascavel");
                ipServer = "explorer \\\\servercsc04";
                break;
            }
            case "133" -> {
                btnCidade.setText("Foz do Iguaçu");
                ipServer = "explorer \\\\serverfoz04";
                break;
            }
            case "140" -> {
                btnCidade.setText("Marechal C. R.");
                ipServer = "explorer \\\\servermcrss04";
                break;
            }
            case "138" -> {
                btnCidade.setText("Toledo");
                ipServer = "explorer \\\\servertolsn04";
                break;
            }
            
//            Regiao da Sede
            case "153" -> {
                btnCidade.setText("Campo Largo");
                ipServer = "explorer \\\\servercplsn04";
                break;
            }
            case "196" -> {
                btnCidade.setText("Celso Charuri");
                ipServer = "explorer \\\\serverplg04";
                break;
            }
            case "171" -> {
                btnCidade.setText("Colombo");
                ipServer = "explorer \\\\servercbo04";
                break;
            }
            
            case "24" -> {
                btnCidade.setText("Sede");
                ipServer = "explorer \\\\srvdrv12";
                break;
            }
            
            case "25" -> {
                btnCidade.setText("Sede");
                ipServer = "explorer \\\\srvdrv12";
                break;
            }
            
            case "26" -> {
                btnCidade.setText("Sede");
                ipServer = "explorer \\\\srvdrv12";
                break;
            }
            
            case "27" -> {
                btnCidade.setText("Sede");
                ipServer = "explorer \\\\srvdrv12";
                break;
            }
            
            case "28" -> {
                btnCidade.setText("Sede");
                ipServer = "explorer \\\\srvdrv12";
                break;
            }
            
            case "29" -> {
                btnCidade.setText("Sede");
                ipServer = "explorer \\\\srvdrv12";
                break;
            }
            
            case "30" -> {
                btnCidade.setText("Sede");
                ipServer = "explorer \\\\srvdrv12";
                break;
            }
            
            case "31" -> {
                btnCidade.setText("Sede");
                ipServer = "explorer \\\\srvdrv12";
                break;
            }
            
//            Sudoeste
            case "144" -> {
                btnCidade.setText("Ampere");
                ipServer = "explorer \\\\servers2amp04";
                break;
            }
            case "169" -> {
                btnCidade.setText("Capanema");
                ipServer = "explorer \\\\servercap04";
                break;
            }
            case "173" -> {
                btnCidade.setText("Dois Vizinhos");
                ipServer = "explorer \\\\serverdvz04";
                break;
            }
            case "134" -> {
                btnCidade.setText("Francisco Beltrão");
                ipServer = "explorer \\\\serverfco04";
                break;
            }
            case "156" -> {
                btnCidade.setText("Palmas");
                ipServer = "explorer \\\\serverplm04";
                break;
            }
            case "135" -> {
                btnCidade.setText("Pato Branco");
                ipServer = "explorer \\\\serverpbc04";
                break;
            }  
        }
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jLabel2.setText("Escolha a  Região");

        jButton1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jButton1.setText("Campos Gerais");
        jButton1.setFocusPainted(false);
        jButton1.addActionListener((java.awt.event.ActionEvent evt) -> {
            jButton1ActionPerformed(evt);
        });

        metropolitana1.setText("<html>Curitiba e Reg<br>Metropolitana 1</html>");
        metropolitana1.setDefaultCapable(false);
        metropolitana1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        metropolitana1.addActionListener((java.awt.event.ActionEvent evt) -> {
            metropolitana1ActionPerformed(evt);
        });

        Metropolitana2.setText("<html>Curitiba e Reg<br>Metropolitana 2</html>");
        Metropolitana2.addActionListener((java.awt.event.ActionEvent evt) -> {
            Metropolitana2ActionPerformed(evt);
        });

        noroeste.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        noroeste.setText("Noroeste");
        noroeste.addActionListener((java.awt.event.ActionEvent evt) -> {
            noroesteActionPerformed(evt);
        });

        norte.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        norte.setText("Norte");
        norte.setPreferredSize(new java.awt.Dimension(200, 80));
        norte.addActionListener((java.awt.event.ActionEvent evt) -> {
            norteActionPerformed(evt);
        });

        sede.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sede.setText("Sede");
        sede.addActionListener((java.awt.event.ActionEvent evt) -> {
            sedeActionPerformed(evt);
        });

        sudoeste.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sudoeste.setText("Sudoeste");
        sudoeste.addActionListener((java.awt.event.ActionEvent evt) -> {
            sudoesteActionPerformed(evt);
        });

        sair.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        sair.setText("Sair");
        sair.setBackground(new java.awt.Color(152, 143, 143));
        sair.addActionListener((java.awt.event.ActionEvent evt) -> {
            sairActionPerformed(evt);
        });

        oeste.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        oeste.setText("Oeste");
        oeste.setMaximumSize(new java.awt.Dimension(201, 80));
        oeste.setOpaque(true);
        oeste.setPreferredSize(new java.awt.Dimension(200, 80));
        oeste.addActionListener((java.awt.event.ActionEvent evt) -> {
            oesteActionPerformed(evt);
        });

        seuLogin.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        seuLogin.setText("Seu Login:");

        nomeDispositivo.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        nomeDispositivo.setText("Nome do Dispositivo:");

        seuIP.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        seuIP.setText("Seu IP: ");


        cidadeAtual.setText("Você está em:");
        btnCidade.setBackground(new java.awt.Color(0, 64,  128));
        btnCidade.setForeground(new java.awt.Color(255, 255, 255));
        
        btnCidade.addActionListener((java.awt.event.ActionEvent evt) -> {
            btnCidadeActionPerformed(evt);
        });
        
        if("10".equals(ipFaixa[0]) == false || "150".equals(ipFaixa[1]) == false) {
        	
        	btnCidade.setEnabled(false);
        	btnCidade.setText("Fora da rede Corp");
        	btnCidade.setForeground(java.awt.Color.red);
        	
        	metropolitana1.setEnabled(false);
        	Metropolitana2.setEnabled(false);
        	noroeste.setEnabled(false);
        	norte.setEnabled(false);
        	oeste.setEnabled(false);
        	sudoeste.setEnabled(false);
        	sede.setEnabled(false);
        	jButton1.setEnabled(false);
        	
        }
        
        
         javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparator2))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jSeparator1))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seuLogin)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(login))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(seuIP)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ip))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(nomeDispositivo)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(host)))
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cidadeAtual)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(187, 187, 187)
                        .addComponent(jLabel2)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(Metropolitana2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(metropolitana1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(noroeste, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(norte, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(sede, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sudoeste, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(oeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(logo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(metropolitana1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Metropolitana2, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(noroeste, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(norte, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(oeste, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sede, javax.swing.GroupLayout.DEFAULT_SIZE, 68, Short.MAX_VALUE)
                    .addComponent(sudoeste, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(seuLogin)
                    .addComponent(login)
                    .addComponent(cidadeAtual))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(nomeDispositivo)
                            .addComponent(host))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(seuIP)
                            .addComponent(ip))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(btnCidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(sair, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>                                    

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new MenuCamposGerais().setVisible(true);
        dispose();
    }                                        

    private void metropolitana1ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        new MenuMetropolitana1().setVisible(true);
        dispose();
    }                                              

    private void sairActionPerformed(java.awt.event.ActionEvent evt) {                                     
        dispose();
    }                                    

    private void noroesteActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new MenuNoroeste().setVisible(true);
        dispose();
    }                                        

    private void Metropolitana2ActionPerformed(java.awt.event.ActionEvent evt) {                                               
        new MenuMetropolitana2().setVisible(true);
        dispose();
    }                                              

    private void norteActionPerformed(java.awt.event.ActionEvent evt) {                                      
        new MenuNorte().setVisible(true);
        dispose();
    }                                     

    private void oesteActionPerformed(java.awt.event.ActionEvent evt) {                                      
        new MenuOeste().setVisible(true);
        dispose();
    }                                     

    private void sedeActionPerformed(java.awt.event.ActionEvent evt) {                                     
        new MenuSede().setVisible(true);
        dispose();
    }                                    

    private void sudoesteActionPerformed(java.awt.event.ActionEvent evt) {                                         
        new MenuSudoeste().setVisible(true);
        dispose();
    }    
    
    private void btnCidadeActionPerformed(ActionEvent evt) { 
        try {      
            Runtime.getRuntime().exec(ipServer);
        } catch (IOException ex) {
            Logger.getLogger(MenuCamposGerais.class.getName()).log(Level.SEVERE, null, ex);
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
            java.util.logging.Logger.getLogger(MenuLocalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuLocalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuLocalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuLocalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new MenuLocalizacao().setVisible(true);
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton Metropolitana2;
    private javax.swing.JButton btnCidade;
    private javax.swing.JLabel host;
    private javax.swing.JLabel ip;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel login;
    private javax.swing.JButton metropolitana1;
    private javax.swing.JLabel nomeDispositivo;
    private javax.swing.JButton noroeste;
    private javax.swing.JButton norte;
    private javax.swing.JButton oeste;
    private javax.swing.JButton sair;
    private javax.swing.JButton sede;
    private javax.swing.JLabel seuIP;
    private javax.swing.JLabel seuLogin;
    private javax.swing.JButton sudoeste;
    private javax.swing.JLabel cidadeAtual;
    // End of variables declaration                  

    private void setIconBar() {
    	
        // setIconImage(Toolkit.getDefaultToolkit().getImage("images/printer.png"));
    	
    	ImageIcon icon = new ImageIcon(getClass().getClassLoader().getResource("printer.png"));
    	
    	setIconImage(icon.getImage());
    }
}