package br.com.schumaker.run;

import br.com.schumaker.run.gfx.FrMain;

/**
 *
 * @author hudsonschumaker
 */
public class Run {
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(FrMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
        /* Create and display the form */
          java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
            new FrMain().setVisible(true);
            }
        });
    }
}
