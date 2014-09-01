
package javaapplication1;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class Read extends javax.swing.JFrame {
    
    private String[] subBodycare = {
        "select","deodorant","hair_cut","medicine","general"
    };
   
    private String[] subDrink = {
        "select","alcohol","coffee","general"
    };

    private String[] subHome = {
        "select","electricity","general","rent"
    };

    private String[] subEntertainment = {
        "select","cinema","games","internet","netflix"
    };

    private String[] subFood = {
        "select","burger","dinner","general","lunch","pizza"
    };
    
    private String[] shopBodycare = {
        "lidl","aldi","tesco","boots","salon"
    };

    private String[] shopDrink = {
        "centra","dunnes","lidl","super_value","xerox"
    };

    private String[] shopHome = {
        "electric_ireland","odessa"
    };

    private String[] shopEntertainment = {
        "blacknight","cineworld","netflix","steam","upc"
    };

    private String[] shopFood = {
        "aldi","burger_king","centra","dunnes","lidl","super_value","xerox"
    };
    
    public Read() {
        super("Read Mode");
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        dataTable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        readGroup = new javax.swing.JComboBox();
        readFastSubgroup = new javax.swing.JComboBox();
        readSubSubmit = new javax.swing.JButton();
        readShop = new javax.swing.JComboBox();
        startDate = new javax.swing.JComboBox();
        endDate = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        searchGroup = new javax.swing.JRadioButton();
        searchSub = new javax.swing.JRadioButton();
        searchShop = new javax.swing.JRadioButton();
        customSearch = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        jToolBar1 = new javax.swing.JToolBar();
        switchMode = new javax.swing.JButton();
        readClose = new javax.swing.JButton();
        totaldescr = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        total = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        dataTable.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        dataTable.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(dataTable);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        readGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "bodycare", "drink", "home", "food", "entertainment" }));
        readGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readGroupActionPerformed(evt);
            }
        });

        readFastSubgroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));

        readSubSubmit.setBackground(new java.awt.Color(0, 204, 153));
        readSubSubmit.setText("Submit");
        readSubSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readSubSubmitActionPerformed(evt);
            }
        });

        readShop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select shop", "tesco", "lidl", "aldi", "centra", "xerox" }));

        startDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "All", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" }));
        startDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startDateActionPerformed(evt);
            }
        });

        endDate.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "End", "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sept", "Oct", "Nov", "Dec" }));
        endDate.setEnabled(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addComponent(readSubSubmit))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(readShop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(readGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(readFastSubgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(readGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(readFastSubgroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(readShop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(startDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(readSubSubmit)
                    .addComponent(endDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        buttonGroup1.add(searchGroup);
        searchGroup.setText("Group");

        buttonGroup1.add(searchSub);
        searchSub.setText("Sub-Group");

        buttonGroup1.add(searchShop);
        searchShop.setText("Shop");

        customSearch.setText("Custom Search");

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(searchGroup)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(searchSub)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(searchShop))
                        .addComponent(customSearch)
                        .addComponent(searchField))
                    .addComponent(searchButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(customSearch)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchGroup)
                    .addComponent(searchSub)
                    .addComponent(searchShop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(searchButton)
                .addContainerGap())
        );

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

        readClose.setText("Close");
        readClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                readCloseActionPerformed(evt);
            }
        });
        jToolBar1.add(readClose);

        totaldescr.setText("Total for selection:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 357, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(totaldescr)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(total, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(57, 57, 57))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(total, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(totaldescr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("empty-statement")
    private void readSubSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readSubSubmitActionPerformed
        if (startDate.getSelectedIndex() <= endDate.getSelectedIndex()){
            try{
                StringBuilder sql2 = new StringBuilder("SELECT * FROM "+DBConnection.table);
                if (readGroup.getSelectedItem().toString().equals("select")){
                    sql2.append(" WHERE groups LIKE '%'");
                }else if (readFastSubgroup.getSelectedItem().toString().equals("select")){
                    String option = readGroup.getSelectedItem().toString();
                    sql2.append(" WHERE groups = \"").append(option).append("\"");                        
                }else{
                    String option2 = readFastSubgroup.getSelectedItem().toString();
                    sql2.append(" WHERE subgroups = \"").append(option2).append("\"");  
                }
                if (readShop.getSelectedIndex() > 0){
                    String option3 = readShop.getSelectedItem().toString();
                    sql2.append(" AND shop = \"").append(option3).append("\"");                         
                }
                if(startDate.getSelectedIndex() > 0){
                    if (startDate.getSelectedIndex() <= endDate.getSelectedIndex()){
                        switch(startDate.getSelectedIndex()){
                            case 1:
                                sql2.append(" AND date >= 20140101");
                                break;
                            case 2:
                                sql2.append(" AND date >= 20140201");
                                break;
                            case 3:
                                sql2.append(" AND date >= 20140301");
                                break;
                            case 4:
                                sql2.append(" AND date >= 20140401");
                                break;
                            case 5:
                                sql2.append(" AND date >= 20140501");
                                break;
                            case 6:
                                sql2.append(" AND date >= 20140601");
                                break;
                            case 7:
                                sql2.append(" AND date >= 20140701");
                                break;
                            case 8:
                                sql2.append(" AND date >= 20140801");
                                break;
                            case 9:
                                sql2.append(" AND date >= 20140901");
                                break;
                            case 10:
                                sql2.append(" AND date >= 20141001");
                                break;
                            case 11:
                                sql2.append(" AND date >= 20141101");
                                break;
                            case 12:
                                sql2.append(" AND date >= 20141201");
                                break;                               
                        }
                        switch(endDate.getSelectedIndex()){
                            case 1:
                                sql2.append(" AND date <= 20140131");
                                break;
                            case 2:
                                sql2.append(" AND date <= 20140231");
                                break;
                            case 3:
                                sql2.append(" AND date <= 20140331");
                                break;
                            case 4:
                                sql2.append(" AND date <= 20140431");
                                break;
                            case 5:
                                sql2.append(" AND date <= 20140531");
                                break;
                            case 6:
                                sql2.append(" AND date <= 20140631");
                                break;
                            case 7:
                                sql2.append(" AND date <= 20140731");
                                break;
                            case 8:
                                sql2.append(" AND date < 20140831");
                                break;
                            case 9:
                                sql2.append(" AND date <= 20140931");
                                break;
                            case 10:
                                sql2.append(" AND date <= 20141031");
                                break;
                            case 11:
                                sql2.append(" AND date <= 20141131");
                                break;
                            case 12:
                                sql2.append(" AND date <= 20141231");
                                break;                            
                        }
                    }else{
                        JOptionPane.showMessageDialog(null,"End Date must be higher than Start");
                    }
                }   
                //JOptionPane.showMessageDialog(null,sql2);
                sql2.append(" ORDER BY date");    
                DBConnection.pst = DBConnection.conn.prepareStatement(sql2.toString());
                DBConnection.rs = DBConnection.pst.executeQuery(sql2.toString());
                dataTable.setModel(DbUtils.resultSetToTableModel(DBConnection.rs)); 
                DBConnection.pst.close();
                    
                sql2.replace(7, 8, "sum(amount) as total"); 
                DBConnection.pst = DBConnection.conn.prepareStatement(sql2.toString());
                DBConnection.rs = DBConnection.pst.executeQuery(sql2.toString());
                if (DBConnection.rs.next());
                    total.setText(DBConnection.rs.getString("total"));                 
                
            }catch (HeadlessException | SQLException e){
                JOptionPane.showMessageDialog(null,e);
            }
        }else{
            JOptionPane.showMessageDialog(null,"End Date cant be lower than Start");
        }
    }//GEN-LAST:event_readSubSubmitActionPerformed

    private void readGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readGroupActionPerformed
        switch ((String) readGroup.getSelectedItem()) {
            case "bodycare":
                readFastSubgroup.setModel(new DefaultComboBoxModel(subBodycare));
                break;
            case "drink":
                readFastSubgroup.setModel(new DefaultComboBoxModel(subDrink));
                break;
            case "home":
                readFastSubgroup.setModel(new DefaultComboBoxModel(subHome));
                break;
            case "entertainment":
                readFastSubgroup.setModel(new DefaultComboBoxModel(subEntertainment));
                break;
            case "food":
                readFastSubgroup.setModel(new DefaultComboBoxModel(subFood));
                break;  
          }
    }//GEN-LAST:event_readGroupActionPerformed

    private void startDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startDateActionPerformed
        if(startDate.getSelectedItem().toString().equals("All"))
            endDate.setEnabled(false);
        else
            endDate.setEnabled(true);
    }//GEN-LAST:event_startDateActionPerformed

    private void switchModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchModeActionPerformed
        close();
        new Switch();
    }//GEN-LAST:event_switchModeActionPerformed

    private void readCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_readCloseActionPerformed
        try{
            DBConnection.conn.close();
            this.close();            
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
        finally{System.exit(0);}
    }//GEN-LAST:event_readCloseActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        try{
        StringBuilder sql = new StringBuilder("SELECT * FROM "+DBConnection.table);
        if (searchGroup.isSelected())
            sql.append(" WHERE groups = \"").append(searchField.getText()+"\"");
        else if (searchSub.isSelected())
            sql.append(" WHERE subgroups = \"").append(searchField.getText()+"\"");
        else 
            sql.append(" WHERE shop = \"").append(searchField.getText()+"\"");
        
        //JOptionPane.showMessageDialog(null, sql);
        sql.append(" ORDER BY date");
        DBConnection.pst = DBConnection.conn.prepareStatement(sql.toString());
        DBConnection.rs = DBConnection.pst.executeQuery(sql.toString());
        dataTable.setModel(DbUtils.resultSetToTableModel(DBConnection.rs)); 
        DBConnection.pst.close(); 
        
        sql.replace(7, 8, "sum(amount) as total"); 
        DBConnection.pst = DBConnection.conn.prepareStatement(sql.toString());
        DBConnection.rs = DBConnection.pst.executeQuery(sql.toString());
        if (DBConnection.rs.next());
            total.setText(DBConnection.rs.getString("total"));         
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }       
    }//GEN-LAST:event_searchButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel customSearch;
    private javax.swing.JTable dataTable;
    private javax.swing.JComboBox endDate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JButton readClose;
    private javax.swing.JComboBox readFastSubgroup;
    private javax.swing.JComboBox readGroup;
    private javax.swing.JComboBox readShop;
    private javax.swing.JButton readSubSubmit;
    private javax.swing.JButton searchButton;
    private javax.swing.JTextField searchField;
    private javax.swing.JRadioButton searchGroup;
    private javax.swing.JRadioButton searchShop;
    private javax.swing.JRadioButton searchSub;
    private javax.swing.JComboBox startDate;
    private javax.swing.JButton switchMode;
    private javax.swing.JLabel total;
    private javax.swing.JLabel totaldescr;
    // End of variables declaration//GEN-END:variables
}
