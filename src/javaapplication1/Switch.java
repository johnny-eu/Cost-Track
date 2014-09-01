
package javaapplication1;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;

public class Switch extends javax.swing.JFrame {

    public Switch() {        
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("euro.png")).getImage());
    }
    
    public void close(){
        WindowEvent closeWin = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWin);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        chooseMode = new javax.swing.JLabel();
        chooseInsert = new javax.swing.JButton();
        chooseRead = new javax.swing.JButton();
        chooseEdit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        chooseMode.setFont(new java.awt.Font("Broadway", 0, 18)); // NOI18N
        chooseMode.setForeground(new java.awt.Color(0, 153, 153));
        chooseMode.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        chooseMode.setText("Choose Mode");

        chooseInsert.setBackground(new java.awt.Color(0, 204, 153));
        chooseInsert.setText("Insert");
        chooseInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseInsertActionPerformed(evt);
            }
        });

        chooseRead.setBackground(new java.awt.Color(0, 204, 153));
        chooseRead.setText("Read");
        chooseRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseReadActionPerformed(evt);
            }
        });

        chooseEdit.setBackground(new java.awt.Color(0, 204, 153));
        chooseEdit.setText("Edit");
        chooseEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addComponent(chooseInsert)
                .addGap(62, 62, 62)
                .addComponent(chooseRead)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addComponent(chooseEdit)
                .addGap(49, 49, 49))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(chooseMode)
                .addGap(132, 132, 132))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(chooseMode)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(chooseInsert)
                    .addComponent(chooseRead)
                    .addComponent(chooseEdit))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void chooseInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseInsertActionPerformed
        close();
        new Insert();        
    }//GEN-LAST:event_chooseInsertActionPerformed

    private void chooseReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseReadActionPerformed
        close();
        new Read(); 
    }//GEN-LAST:event_chooseReadActionPerformed

    private void chooseEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseEditActionPerformed
        close();
        new Edit(); 
    }//GEN-LAST:event_chooseEditActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton chooseEdit;
    private javax.swing.JButton chooseInsert;
    private javax.swing.JLabel chooseMode;
    private javax.swing.JButton chooseRead;
    // End of variables declaration//GEN-END:variables
}
