
package javaapplication1;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Edit extends javax.swing.JFrame {

    public Edit() {
        super("Edit Mode");
        initComponents();
        setVisible(true);
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("euro.PNG")).getImage());
    }

    public void close(){
        WindowEvent closeWin = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWin);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        editTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        egroup = new javax.swing.JTextField();
        esubgroup = new javax.swing.JTextField();
        editSubGroup = new javax.swing.JLabel();
        editDate = new javax.swing.JLabel();
        edate = new javax.swing.JTextField();
        editGroup = new javax.swing.JLabel();
        eamount = new javax.swing.JTextField();
        editShop = new javax.swing.JLabel();
        eshop = new javax.swing.JTextField();
        editAmount = new javax.swing.JLabel();
        editID = new javax.swing.JLabel();
        eID = new javax.swing.JTextField();
        getData = new javax.swing.JButton();
        editSave = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        switchMode = new javax.swing.JButton();
        editClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        editTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        editTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                editTableMouseClicked(evt);
            }
        });
        editTable.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                editTableKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(editTable);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        editSubGroup.setText("Sub-Group");

        editDate.setText("Date");

        editGroup.setText("Group");

        editShop.setText("Shop");

        editAmount.setText("Amount");

        editID.setText("ID");

        eID.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(editDate)
                    .addComponent(editGroup)
                    .addComponent(editSubGroup)
                    .addComponent(editAmount)
                    .addComponent(editID)
                    .addComponent(editShop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(eshop, javax.swing.GroupLayout.DEFAULT_SIZE, 95, Short.MAX_VALUE)
                    .addComponent(esubgroup)
                    .addComponent(egroup)
                    .addComponent(edate)
                    .addComponent(eID)
                    .addComponent(eamount, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(editID)
                    .addComponent(eID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(edate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(egroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editGroup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(esubgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editSubGroup))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eamount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editAmount))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eshop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(editShop))
                .addContainerGap())
        );

        getData.setBackground(new java.awt.Color(0, 204, 153));
        getData.setText("Get Data");
        getData.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getDataActionPerformed(evt);
            }
        });

        editSave.setBackground(new java.awt.Color(0, 204, 153));
        editSave.setText("Update Line");
        editSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editSaveActionPerformed(evt);
            }
        });

        jToolBar1.setRollover(true);

        switchMode.setText("Switch Mode");
        switchMode.setFocusable(false);
        switchMode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        switchMode.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        switchMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchModeActionPerformed(evt);
            }
        });
        jToolBar1.add(switchMode);

        editClose.setText("Close");
        editClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCloseActionPerformed(evt);
            }
        });
        jToolBar1.add(editClose);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addComponent(editSave))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(getData))
                    .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 416, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(getData)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(editSave)
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    public void getData(){
        String sql = "select * from " + DBConnection.table + " ORDER BY date";
        
        try{
                    DBConnection.pst = DBConnection.conn.prepareStatement(sql);
                    DBConnection.rs = DBConnection.pst.executeQuery(sql);
                    editTable.setModel(DbUtils.resultSetToTableModel(DBConnection.rs));
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    
    private void getDataActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getDataActionPerformed
        getData();
    }//GEN-LAST:event_getDataActionPerformed

    private void editSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editSaveActionPerformed
        try{
            String field0 = eID.getText();
            String field1 = edate.getText();
            String field2 = egroup.getText();
            String field3 = esubgroup.getText();
            String field4 = eamount.getText();
            String field5 = eshop.getText();
            String sql = "UPDATE "+DBConnection.table+" SET date='"+field1+"',groups='"+field2+"'"
                    + ",subgroups='"+field3+"',amount='"+field4+"',shop='"+field5+"' WHERE rowid='"+field0+"'";
            DBConnection.pst = DBConnection.conn.prepareStatement(sql);
            DBConnection.pst.execute();
            DBConnection.pst.close();
            JOptionPane.showMessageDialog(null, "Line Updated");
            getData();
        }
        catch(SQLException | HeadlessException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_editSaveActionPerformed

    private void editTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_editTableMouseClicked
        try{
            int row = editTable.getSelectedRow();
            String tableClick = (editTable.getModel().getValueAt(row, 0).toString());
            String sql = "select * from "+DBConnection.table+" where rowid ='"+tableClick+"'";
            DBConnection.pst = DBConnection.conn.prepareStatement(sql);
            DBConnection.rs = DBConnection.pst.executeQuery();
            if (DBConnection.rs.next()){                
                eID.setText(DBConnection.rs.getString("rowid"));            
                edate.setText(DBConnection.rs.getString("date"));
                egroup.setText(DBConnection.rs.getString("groups"));
                esubgroup.setText(DBConnection.rs.getString("subgroups"));
                eamount.setText(DBConnection.rs.getString("amount"));
                eshop.setText(DBConnection.rs.getString("shop"));             
            }        
        }
        catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }        
    }//GEN-LAST:event_editTableMouseClicked

    private void editTableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_editTableKeyPressed
        if (evt.getKeyCode()==KeyEvent.VK_DOWN || evt.getKeyCode()==KeyEvent.VK_UP){
            try{
                int row = editTable.getSelectedRow();
                String tableClick = (editTable.getModel().getValueAt(row, 0).toString());
                String sql = "select * from "+DBConnection.table+" where rowid ='"+tableClick+"'";
                DBConnection.pst = DBConnection.conn.prepareStatement(sql);
                DBConnection.rs = DBConnection.pst.executeQuery();
                if (DBConnection.rs.next()){
                    String data0 = DBConnection.rs.getString("rowid");
                    eID.setText(data0);               
                    String data1 = DBConnection.rs.getString("date");
                    edate.setText(data1);
                    String data2 = DBConnection.rs.getString("groups");
                    egroup.setText(data2);
                    String data3 = DBConnection.rs.getString("subgroups");
                    esubgroup.setText(data3);
                    String data4 = DBConnection.rs.getString("amount");
                    eamount.setText(data4);
                    String data5 = DBConnection.rs.getString("shop");
                    eshop.setText(data5);             
                }        
            }
            catch(SQLException e){
                JOptionPane.showMessageDialog(null, e);
            }           
        }
    }//GEN-LAST:event_editTableKeyPressed

    private void switchModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchModeActionPerformed
        close();
        new Switch();
    }//GEN-LAST:event_switchModeActionPerformed

    private void editCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCloseActionPerformed
        try{
            DBConnection.conn.close();
            this.close();            
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
        finally{System.exit(0);}
    }//GEN-LAST:event_editCloseActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField eID;
    private javax.swing.JTextField eamount;
    private javax.swing.JTextField edate;
    private javax.swing.JLabel editAmount;
    private javax.swing.JButton editClose;
    private javax.swing.JLabel editDate;
    private javax.swing.JLabel editGroup;
    private javax.swing.JLabel editID;
    private javax.swing.JButton editSave;
    private javax.swing.JLabel editShop;
    private javax.swing.JLabel editSubGroup;
    private javax.swing.JTable editTable;
    private javax.swing.JTextField egroup;
    private javax.swing.JTextField eshop;
    private javax.swing.JTextField esubgroup;
    private javax.swing.JButton getData;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton switchMode;
    // End of variables declaration//GEN-END:variables
}
