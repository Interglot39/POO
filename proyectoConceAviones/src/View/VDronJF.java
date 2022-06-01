
package View;

/**
 *
 * @author Ismael Boautman
 */
public class VDronJF extends javax.swing.JFrame {

    /**
     * Creates new form VDronJF
     */
    public VDronJF() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCreate = new javax.swing.JButton();
        botonRead = new javax.swing.JButton();
        botonUpdate = new javax.swing.JButton();
        botonDelete = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        botonCreate.setText("create");

        botonRead.setText("Read");

        botonUpdate.setText("Update");

        botonDelete.setText("Delete");
        botonDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(144, 144, 144)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botonDelete)
                    .addComponent(botonUpdate)
                    .addComponent(botonRead)
                    .addComponent(botonCreate))
                .addContainerGap(183, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(botonCreate)
                .addGap(45, 45, 45)
                .addComponent(botonRead)
                .addGap(56, 56, 56)
                .addComponent(botonUpdate)
                .addGap(38, 38, 38)
                .addComponent(botonDelete)
                .addContainerGap(44, Short.MAX_VALUE))
        );

        pack();
    }

    private void botonDeleteActionPerformed(java.awt.event.ActionEvent evt) {
    }

    /**
     * @param args 
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(VDronJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VDronJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VDronJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VDronJF.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
       

        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VDronJF().setVisible(true);
            }
        });
    }

    // Declaracion variabales
    private javax.swing.JButton botonCreate;
    private javax.swing.JButton botonDelete;
    private javax.swing.JButton botonRead;
    private javax.swing.JButton botonUpdate;
    // Fin Declaracion

}
