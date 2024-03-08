/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package employeemanagementsystem;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;




public class ManageDepartments extends javax.swing.JFrame {

    String deptFile= "Department.txt";
    DefaultTableModel model = null;
    
    public ManageDepartments() {
        initComponents();
        DBConnection con = new EmpDBConnection();
        con.displayTable(jTableManageDepartment, deptFile);
    }

    public void clear(){
        jTextFieldDeptID.setText("");
        jTextFieldDeptName.setText("");
        jTextFieldDeptPhoneNo.setText("");
        jTextFieldDeptEmail.setText("");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabelUsernameManageDep = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextFieldDeptName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextFieldDeptPhoneNo = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableManageDepartment = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();
        jTextFieldDeptID = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldDeptEmail = new javax.swing.JTextField();
        jLabelHome = new javax.swing.JLabel();
        jLabelManageDept = new javax.swing.JLabel();
        jLabelManageDes = new javax.swing.JLabel();
        jLabelManageUser = new javax.swing.JLabel();
        jLabelLogout = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 0, 102));

        jPanel2.setBackground(new java.awt.Color(153, 153, 255));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 30)); // NOI18N
        jLabel3.setText("Manage Departments");

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/baseline_account_circle_white_36dp.png"))); // NOI18N

        jLabelUsernameManageDep.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabelUsernameManageDep.setText("User");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel4.setText("Department Name");

        jTextFieldDeptName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel5.setText("Phone No");

        jTextFieldDeptPhoneNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setText("ADD");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setText("DELETE");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setText("CLEAR");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setText("UPDATE");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jTableManageDepartment.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Department ID", "Department Name", "Phone No", "Email"
            }
        ));
        jTableManageDepartment.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableManageDepartmentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTableManageDepartment);

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel6.setText("Department ID");

        jTextFieldDeptID.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jLabel7.setText("Email");

        jTextFieldDeptEmail.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabelUsernameManageDep)
                        .addGap(25, 25, 25))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 646, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(84, 84, 84)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5)
                                .addComponent(jLabel6)
                                .addComponent(jLabel7))
                            .addGap(36, 36, 36)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(jTextFieldDeptName, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                                .addComponent(jTextFieldDeptID)
                                .addComponent(jTextFieldDeptPhoneNo)
                                .addComponent(jTextFieldDeptEmail))
                            .addGap(83, 83, 83)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2)
                                .addComponent(jButton1)
                                .addComponent(jButton4)
                                .addComponent(jButton3))
                            .addGap(53, 53, 53))))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextFieldDeptID, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2))))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabelUsernameManageDep)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldDeptName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel4))
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton4)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel5)
                        .addComponent(jTextFieldDeptPhoneNo, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton3))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextFieldDeptEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabelHome.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelHome.setForeground(new java.awt.Color(255, 255, 255));
        jLabelHome.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/baseline_home_white_18.png"))); // NOI18N
        jLabelHome.setText("Home");
        jLabelHome.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelHomeMouseClicked(evt);
            }
        });

        jLabelManageDept.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelManageDept.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManageDept.setText("Manage Employeee");
        jLabelManageDept.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelManageDeptMouseClicked(evt);
            }
        });

        jLabelManageDes.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelManageDes.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManageDes.setText("Manage Designation");
        jLabelManageDes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelManageDesMouseClicked(evt);
            }
        });

        jLabelManageUser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabelManageUser.setForeground(new java.awt.Color(255, 255, 255));
        jLabelManageUser.setText("Search Employee");
        jLabelManageUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelManageUserMouseClicked(evt);
            }
        });

        jLabelLogout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabelLogout.setForeground(new java.awt.Color(255, 255, 255));
        jLabelLogout.setText("Logout");
        jLabelLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelLogoutMouseClicked(evt);
            }
        });

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Studies");

        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("Colombo Institute of Higher");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 18, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabelManageDept, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jLabelManageDes, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(37, 37, 37)
                                    .addComponent(jLabelLogout))
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGap(10, 10, 10)
                                    .addComponent(jLabelManageUser))))
                        .addGap(24, 24, 24))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jLabelHome, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelManageDept)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelManageDes)
                .addGap(18, 18, 18)
                .addComponent(jLabelManageUser)
                .addGap(18, 18, 18)
                .addComponent(jLabelLogout)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if(jTextFieldDeptID.getText().equals("")||jTextFieldDeptName.getText().equals("")||
        jTextFieldDeptPhoneNo.getText().equals("")||jTextFieldDeptEmail.getText().equals(""))
        {
            JOptionPane.showMessageDialog(this,"Enter All Details!!!");
            clear();
        }
        else
        {   
            Department obj = new Department();
            
            obj.setDeptID(jTextFieldDeptID.getText().toString());
            obj.setDeptName(jTextFieldDeptName.getText());
            obj.setPhoneNo(jTextFieldDeptPhoneNo.getText());
            obj.setEmail(jTextFieldDeptEmail.getText());

            obj.addDepartment(obj);
            DBConnection myobj = new EmpDBConnection();
            myobj.displayTable(jTableManageDepartment, "Department.txt");
            clear();
            
        
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTableManageDepartmentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableManageDepartmentMouseClicked
        model = (DefaultTableModel) jTableManageDepartment.getModel();

        
        int i= jTableManageDepartment.getSelectedRow();
        
        
            jTextFieldDeptID.setText(jTableManageDepartment.getValueAt(i, 0).toString());
            jTextFieldDeptName.setText(jTableManageDepartment.getValueAt(i, 1).toString());
            jTextFieldDeptPhoneNo.setText(jTableManageDepartment.getValueAt(i, 2).toString());
            jTextFieldDeptEmail.setText(jTableManageDepartment.getValueAt(i, 3).toString());

    }//GEN-LAST:event_jTableManageDepartmentMouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        if("".equals(jTextFieldDeptID.getText().toString())|| "".equals(jTextFieldDeptName.getText().toString())) {
            
            JOptionPane.showMessageDialog(null, "Select Item from the table to Update!", "Error!", JOptionPane.ERROR_MESSAGE);
            clear();
            
        }
        else {
            model =(DefaultTableModel) jTableManageDepartment.getModel();
            int i= jTableManageDepartment.getSelectedRow();
            
            
            String oldItemCode= model.getValueAt(i, 0).toString();
            String oldItemName=model.getValueAt(i, 1).toString();
        
            if(oldItemCode==null || oldItemName==null) {
                
                 JOptionPane.showMessageDialog(null, "Select Item to Update!", "Error!", JOptionPane.ERROR_MESSAGE);
            
            }else {
               DBConnection obj = new EmpDBConnection();

            
                String newLine= jTextFieldDeptID.getText().toString()+","+jTextFieldDeptName.getText().toString()+
                ","+jTextFieldDeptPhoneNo.getText().toString()+","+jTextFieldDeptEmail.getText().toString();
        
                
                obj.editData(oldItemCode, newLine,deptFile);
                
                obj.displayTable(jTableManageDepartment,deptFile);
                clear();
            }
            
            
        }
        
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if("".equals(jTextFieldDeptID.getText().toString())&& "".equals(jTextFieldDeptName.getText().toString())) {

            JOptionPane.showMessageDialog(null, "Enter Item Code or Item Name to Delete Item!", "Error!", JOptionPane.ERROR_MESSAGE);
            clear();
        }
        else{
            EmpDBConnection obj = new EmpDBConnection();

            obj.deleteData(jTextFieldDeptID.getText().toString(),deptFile);

            clear();
            obj.displayTable(jTableManageDepartment,deptFile);

        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        clear();
        jTableManageDepartment.setRowSorter(null);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabelManageDesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelManageDesMouseClicked
        ManageDesignations des= new ManageDesignations();
        des.jLabelUsernameDes.setText(jLabelUsernameManageDep.getText().toString());
        des.show();
        dispose();
    }//GEN-LAST:event_jLabelManageDesMouseClicked

    private void jLabelManageDeptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelManageDeptMouseClicked
        ManageEmployee manageEmp = new ManageEmployee();
        manageEmp.jLabelUsernameEmp.setText(jLabelUsernameManageDep.getText().toString());
        manageEmp.show();
        dispose();
    }//GEN-LAST:event_jLabelManageDeptMouseClicked

    private void jLabelHomeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelHomeMouseClicked
        ManagerHomePage home = new ManagerHomePage();
        home.jLabelUsername.setText(jLabelUsernameManageDep.getText().toString());
        home.show();
        dispose();
    }//GEN-LAST:event_jLabelHomeMouseClicked

    private void jLabelManageUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelManageUserMouseClicked
        SearchEmployee searchemp = new SearchEmployee();
        searchemp.jLabelUsernameAssist.setText(jLabelUsernameManageDep.getText().toString());
        searchemp.show();
        dispose();
    }//GEN-LAST:event_jLabelManageUserMouseClicked

    private void jLabelLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelLogoutMouseClicked
        UserLogin login = new UserLogin();
        login.show();
        dispose();
    }//GEN-LAST:event_jLabelLogoutMouseClicked

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
            java.util.logging.Logger.getLogger(ManageDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageDepartments.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageDepartments().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabelHome;
    private javax.swing.JLabel jLabelLogout;
    private javax.swing.JLabel jLabelManageDept;
    private javax.swing.JLabel jLabelManageDes;
    private javax.swing.JLabel jLabelManageUser;
    public javax.swing.JLabel jLabelUsernameManageDep;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableManageDepartment;
    private javax.swing.JTextField jTextFieldDeptEmail;
    private javax.swing.JTextField jTextFieldDeptID;
    private javax.swing.JTextField jTextFieldDeptName;
    private javax.swing.JTextField jTextFieldDeptPhoneNo;
    // End of variables declaration//GEN-END:variables
}
