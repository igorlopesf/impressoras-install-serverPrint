package pacote_menus;

public class ImpressoraSistemaFiep {
	 public static void main(String[] args) {
	        
	        try {
	            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
	                if ("Nimbus".equals(info.getName())) {
	                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
	                    break;
	                }
	            }
	        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
	            java.util.logging.Logger.getLogger(MenuLocalizacao.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
	        }
	        //</editor-fold>
	        System.out.println("Executando");
	        new MenuLocalizacao().setVisible(true);
	    }

}
