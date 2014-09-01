package javaapplication1;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.event.KeyEvent;
import java.awt.event.WindowEvent;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Insert extends javax.swing.JFrame {
    
    private final String[] subBodycare = {
        "general","deodorant","hair_cut","medicine"
    };
   
    private final String[] subDrink = {
        "alcohol","coffee","general"
    };

    private final String[] subHome = {
        "general","electricity","general","rent"
    };

    private final String[] subEntertainment = {
        "cinema","games","internet","netflix"
    };

    private final String[] subFood = {
        "burger","dinner","general","lunch","pizza"
    };
    
    private final String[] shopBodycare = {
        "lidl","aldi","tesco","boots","salon"
    };

    private final String[] shopDrink = {
        "tesco","centra","dunnes","lidl",
        "super_value","xerox"
    };

    private final String[] shopHome = {
        "electric_ireland","odessa","tesco","lidl","centra"
    };

    private final String[] shopEntertainment = {
        "blacknight","cineworld","netflix","steam","upc"
    };

    private final String[] shopFood = {
        "aldi","burger_king","centra","dunnes","lidl","super_value","xerox"
    };

    public Insert() {
        super("Insert Mode");
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

        jPanel1 = new javax.swing.JPanel();
        lgroup = new javax.swing.JLabel();
        lAmount = new javax.swing.JLabel();
        lSubGroup = new javax.swing.JLabel();
        customSubGroup = new javax.swing.JTextField();
        lshop = new javax.swing.JLabel();
        customShop = new javax.swing.JTextField();
        ldate = new javax.swing.JLabel();
        customAmount = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        customGroup = new javax.swing.JTextField();
        customDate = new javax.swing.JTextField();
        customSubmit = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        fastSubmit = new javax.swing.JButton();
        datelabel = new javax.swing.JLabel();
        amountLabel = new javax.swing.JLabel();
        fastAmount = new javax.swing.JTextField();
        fastShop = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        subGroupLabel = new javax.swing.JLabel();
        fastGroup = new javax.swing.JComboBox();
        groupLabel = new javax.swing.JLabel();
        fastSubGroup = new javax.swing.JComboBox();
        jToolBar1 = new javax.swing.JToolBar();
        switchMode = new javax.swing.JButton();
        insertClose = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        lgroup.setFont(new java.awt.Font("Broadway", 0, 11)); // NOI18N
        lgroup.setText("Group");

        lAmount.setFont(new java.awt.Font("Broadway", 0, 11)); // NOI18N
        lAmount.setText("Amount");

        lSubGroup.setFont(new java.awt.Font("Broadway", 0, 11)); // NOI18N
        lSubGroup.setText("Sub-Group");

        customSubGroup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customSubGroupFocusGained(evt);
            }
        });

        lshop.setFont(new java.awt.Font("Broadway", 0, 11)); // NOI18N
        lshop.setText("Shop");

        customShop.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customShopFocusGained(evt);
            }
        });

        ldate.setFont(new java.awt.Font("Broadway", 0, 11)); // NOI18N
        ldate.setText("Date");

        customAmount.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customAmountFocusGained(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 153, 153));
        jLabel2.setText("Custom Entry");

        customGroup.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customGroupFocusGained(evt);
            }
        });

        customDate.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                customDateFocusGained(evt);
            }
        });

        customSubmit.setBackground(new java.awt.Color(0, 204, 153));
        customSubmit.setText("Submit");
        customSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                customSubmitActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customDate, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ldate))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lgroup))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(customSubGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lSubGroup))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lAmount)
                            .addComponent(customAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lshop)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(customShop, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(customSubmit)))))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ldate)
                    .addComponent(lgroup)
                    .addComponent(lSubGroup)
                    .addComponent(lAmount)
                    .addComponent(lshop))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(customDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customSubGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customShop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(customSubmit))
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        fastSubmit.setBackground(new java.awt.Color(0, 204, 153));
        fastSubmit.setText("Submit");
        fastSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastSubmitActionPerformed(evt);
            }
        });

        datelabel.setFont(new java.awt.Font("Broadway", 0, 11)); // NOI18N
        datelabel.setText("Group");

        amountLabel.setFont(new java.awt.Font("Broadway", 0, 11)); // NOI18N
        amountLabel.setText("Amount");

        fastAmount.setMinimumSize(new java.awt.Dimension(8, 25));

        fastShop.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));

        jLabel1.setFont(new java.awt.Font("Broadway", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Fast Entry");

        subGroupLabel.setFont(new java.awt.Font("Broadway", 0, 11)); // NOI18N
        subGroupLabel.setText("Shop");
        subGroupLabel.setToolTipText("");

        fastGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select", "bodycare", "drink", "home", "entertainment", "food", "phone", "tech" }));
        fastGroup.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fastGroupActionPerformed(evt);
            }
        });

        groupLabel.setFont(new java.awt.Font("Broadway", 0, 11)); // NOI18N
        groupLabel.setText("Sub-Group");

        fastSubGroup.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "select" }));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fastGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(datelabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fastSubGroup, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(groupLabel))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subGroupLabel)
                            .addComponent(fastShop, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amountLabel)
                            .addComponent(fastAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addComponent(fastSubmit)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(datelabel)
                    .addComponent(groupLabel)
                    .addComponent(subGroupLabel)
                    .addComponent(amountLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fastGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fastSubGroup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fastShop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fastAmount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fastSubmit))
                .addContainerGap())
        );

        jToolBar1.setRollover(true);

        switchMode.setText("Switch Mode");
        switchMode.setToolTipText("");
        switchMode.setFocusable(false);
        switchMode.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        switchMode.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        switchMode.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                switchModeActionPerformed(evt);
            }
        });
        jToolBar1.add(switchMode);

        insertClose.setText("Close");
        insertClose.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertCloseActionPerformed(evt);
            }
        });
        jToolBar1.add(insertClose);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void customSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_customSubmitActionPerformed
        String sql = "INSERT INTO "+DBConnection.table+" VALUES(NULL,?,?,?,?,?)";  
        
        try{
            DBConnection.pst = DBConnection.conn.prepareStatement(sql);
            DBConnection.pst.setString(1,customDate.getText());
            DBConnection.pst.setString(2,customGroup.getText());
            DBConnection.pst.setString(3,customSubGroup.getText());
            DBConnection.pst.setString(4,customAmount.getText());
            DBConnection.pst.setString(5,customShop.getText());
            DBConnection.pst.execute();
            DBConnection.pst.close();
            JOptionPane.showMessageDialog(null, "Line Inserted");
        }catch(HeadlessException | SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_customSubmitActionPerformed

    private void fastSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastSubmitActionPerformed
        String sql2 = "INSERT INTO "+DBConnection.table+" VALUES(NULL,?,?,?,?,?)";
        
        Calendar currentDate = Calendar.getInstance(); //Get the current date
        SimpleDateFormat formatter= new SimpleDateFormat("yyyyMMdd");
        String dateNow = formatter.format(currentDate.getTime());
        
        try{
            DBConnection.pst = DBConnection.conn.prepareStatement(sql2);
            DBConnection.pst.setString(1,dateNow);
            DBConnection.pst.setString(2,fastGroup.getSelectedItem().toString());
            DBConnection.pst.setString(3,fastSubGroup.getSelectedItem().toString());
            DBConnection.pst.setString(4,fastAmount.getText());
            DBConnection.pst.setString(5,fastShop.getSelectedItem().toString());
            DBConnection.pst.execute();
            DBConnection.pst.close();
            JOptionPane.showMessageDialog(null, "Line Inserted");
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_fastSubmitActionPerformed

    private void fastGroupActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fastGroupActionPerformed
          
        switch ((String) fastGroup.getSelectedItem()) {
            case "bodycare":
                fastSubGroup.setModel(new DefaultComboBoxModel(subBodycare));
                fastShop.setModel(new DefaultComboBoxModel(shopBodycare));
                break;
            case "drink":
                fastSubGroup.setModel(new DefaultComboBoxModel(subDrink));
                fastShop.setModel(new DefaultComboBoxModel(shopDrink));
                break;
            case "home":
                fastSubGroup.setModel(new DefaultComboBoxModel(subHome));
                fastShop.setModel(new DefaultComboBoxModel(shopHome));
                break;
            case "entertainment":
                fastSubGroup.setModel(new DefaultComboBoxModel(subEntertainment));
                fastShop.setModel(new DefaultComboBoxModel(shopEntertainment));
                break;
            case "food":
                fastSubGroup.setModel(new DefaultComboBoxModel(subFood));
                fastShop.setModel(new DefaultComboBoxModel(shopFood));
                break; 
          }
    }//GEN-LAST:event_fastGroupActionPerformed

    private void switchModeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_switchModeActionPerformed
        close();
        new Switch();
    }//GEN-LAST:event_switchModeActionPerformed

    private void insertCloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertCloseActionPerformed
        try{
            DBConnection.conn.close();
            this.close();            
        }
        catch(SQLException e){JOptionPane.showMessageDialog(null, e);}
        finally{System.exit(0);}
    }//GEN-LAST:event_insertCloseActionPerformed

    private void customDateFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customDateFocusGained
        customDate.selectAll();
    }//GEN-LAST:event_customDateFocusGained

    private void customGroupFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customGroupFocusGained
        customGroup.selectAll();
    }//GEN-LAST:event_customGroupFocusGained

    private void customSubGroupFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customSubGroupFocusGained
        customSubGroup.selectAll();
    }//GEN-LAST:event_customSubGroupFocusGained

    private void customAmountFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customAmountFocusGained
        customAmount.selectAll();
    }//GEN-LAST:event_customAmountFocusGained

    private void customShopFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_customShopFocusGained
        customShop.selectAll();
    }//GEN-LAST:event_customShopFocusGained

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField customAmount;
    private javax.swing.JTextField customDate;
    private javax.swing.JTextField customGroup;
    private javax.swing.JTextField customShop;
    private javax.swing.JTextField customSubGroup;
    private javax.swing.JButton customSubmit;
    private javax.swing.JLabel datelabel;
    private javax.swing.JTextField fastAmount;
    private javax.swing.JComboBox fastGroup;
    private javax.swing.JComboBox fastShop;
    private javax.swing.JComboBox fastSubGroup;
    private javax.swing.JButton fastSubmit;
    private javax.swing.JLabel groupLabel;
    private javax.swing.JButton insertClose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lAmount;
    private javax.swing.JLabel lSubGroup;
    private javax.swing.JLabel ldate;
    private javax.swing.JLabel lgroup;
    private javax.swing.JLabel lshop;
    private javax.swing.JLabel subGroupLabel;
    private javax.swing.JButton switchMode;
    // End of variables declaration//GEN-END:variables
}
