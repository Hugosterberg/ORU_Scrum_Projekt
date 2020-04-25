
package oru_scrum_projekt;

import javax.swing.JOptionPane;

/**
 *
 * @author khali
 */
public class SkickaMejl extends javax.swing.JFrame {

    /**
     * Creates new form SkickaMejl
     */
    public SkickaMejl() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtMejladress = new javax.swing.JTextField();
        txtAmne = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtMeddelande = new javax.swing.JTextArea();
        btnSkickaMejl = new javax.swing.JButton();
        btnRensa = new javax.swing.JButton();
        btnAvbryt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Skicka Mejl");

        jLabel2.setText("Till:");

        jLabel3.setText("Ämne:");

        jLabel4.setText("Meddelande:");

        txtMejladress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMejladressActionPerformed(evt);
            }
        });

        txtMeddelande.setColumns(20);
        txtMeddelande.setRows(5);
        jScrollPane1.setViewportView(txtMeddelande);

        btnSkickaMejl.setText("Skicka");
        btnSkickaMejl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSkickaMejlActionPerformed(evt);
            }
        });

        btnRensa.setText("Rensa");

        btnAvbryt.setText("Avbryt");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(btnSkickaMejl)
                        .addGap(44, 44, 44)
                        .addComponent(btnRensa)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 121, Short.MAX_VALUE)
                        .addComponent(btnAvbryt))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(jLabel2))
                                    .addComponent(jLabel3))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtAmne, javax.swing.GroupLayout.DEFAULT_SIZE, 242, Short.MAX_VALUE)
                                    .addComponent(txtMejladress)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane1))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtMejladress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAmne, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSkickaMejl)
                    .addComponent(btnRensa)
                    .addComponent(btnAvbryt))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtMejladressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMejladressActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMejladressActionPerformed

    private void btnSkickaMejlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSkickaMejlActionPerformed
        //Skapat strings och variabler för att hämta texten som användaren skriver in och lagra den
               String till = txtMejladress.getText();
               String amne = txtAmne.getText(); 
               String meddelande = txtMeddelande.getText();
               
               //Vi har skapat en egen mejl för detta projekt, så alla mejl som kan skickas i projektet skickas ifrån mejladressen nedan. 
               String losen = "Javagrupp2"; 
               String fran = "oruscrum@gmail.com";
               
               //Kallar på klassen "Mejl" och metoden i klassen "SkickaMejlet" som används för att skicka mejlet
               //Om det genomförs framgångsrikt utan några problem kommer mejlet att skickas iväg och ett meddelande poppar upp och bekräftar detta
               Mejl.SkickaMejlet(till, amne, meddelande);
               JOptionPane.showMessageDialog(this,"Ditt mejl har skickats!");
               
               //Efter att mejlet skickas rensas fälten så att de blir tomma
               txtMejladress.setText("");
               txtAmne.setText("");
               txtMeddelande.setText("");
               
    }//GEN-LAST:event_btnSkickaMejlActionPerformed

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
            java.util.logging.Logger.getLogger(SkickaMejl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SkickaMejl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SkickaMejl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SkickaMejl.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SkickaMejl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAvbryt;
    private javax.swing.JButton btnRensa;
    private javax.swing.JButton btnSkickaMejl;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtAmne;
    private javax.swing.JTextArea txtMeddelande;
    private javax.swing.JTextField txtMejladress;
    // End of variables declaration//GEN-END:variables
}
