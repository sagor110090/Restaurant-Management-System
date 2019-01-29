package Reastaurent_s;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.awt.Color;
import java.math.BigDecimal;
import java.util.Random;

public class OrderPage_frame extends javax.swing.JFrame {

    double [] i= new double[5];
    public OrderPage_frame() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        CChickenBurger = new javax.swing.JCheckBox();
        CVegetableBurger = new javax.swing.JCheckBox();
        CSandwitch = new javax.swing.JCheckBox();
        CChickenRole = new javax.swing.JCheckBox();
        CVegetableRole = new javax.swing.JCheckBox();
        jComboBoxSelectDrink = new javax.swing.JComboBox<>();
        jTfChknBurger = new javax.swing.JTextField();
        jTfVgtblBurger = new javax.swing.JTextField();
        jTfSandwitch = new javax.swing.JTextField();
        jTfVgtblRole = new javax.swing.JTextField();
        jTfCostofDrink = new javax.swing.JTextField();
        Costofmeal = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jlblCostOfMeal = new javax.swing.JTextField();
        jTfChknRole = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPanel3 = new javax.swing.JPanel();
        jButtonTotal = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jButtonReset = new javax.swing.JButton();
        jTfTotal = new javax.swing.JTextField();
        jButtonReceipt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(1370, 700));

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        CChickenBurger.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CChickenBurger.setText("Chicken  Burger");
        CChickenBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CChickenBurgerMouseClicked(evt);
            }
        });
        CChickenBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CChickenBurgerActionPerformed(evt);
            }
        });

        CVegetableBurger.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CVegetableBurger.setText("Vegetable  Burger");
        CVegetableBurger.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CVegetableBurgerMouseClicked(evt);
            }
        });
        CVegetableBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVegetableBurgerActionPerformed(evt);
            }
        });

        CSandwitch.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CSandwitch.setText("Sandwitch");
        CSandwitch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CSandwitchMouseClicked(evt);
            }
        });
        CSandwitch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CSandwitchActionPerformed(evt);
            }
        });

        CChickenRole.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CChickenRole.setText("Chicken Role");
        CChickenRole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CChickenRoleMouseClicked(evt);
            }
        });

        CVegetableRole.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        CVegetableRole.setText("Vegetable Role");
        CVegetableRole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CVegetableRoleMouseClicked(evt);
            }
        });
        CVegetableRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CVegetableRoleActionPerformed(evt);
            }
        });

        jComboBoxSelectDrink.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select Drink", "Coke", "Sevenup", "Fanta", "Coffee", "" }));
        jComboBoxSelectDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBoxSelectDrinkActionPerformed(evt);
            }
        });

        jTfChknBurger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTfChknBurger.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfChknBurgerActionPerformed(evt);
            }
        });

        jTfVgtblBurger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTfSandwitch.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jTfVgtblRole.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTfVgtblRole.setPreferredSize(new java.awt.Dimension(3, 16));
        jTfVgtblRole.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfVgtblRoleActionPerformed(evt);
            }
        });

        jTfCostofDrink.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jTfCostofDrink.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTfCostofDrinkActionPerformed(evt);
            }
        });

        Costofmeal.setBackground(new java.awt.Color(204, 204, 255));
        Costofmeal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        Costofmeal.setText("      Cost");
        Costofmeal.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jTextField6.setBackground(new java.awt.Color(204, 204, 255));
        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField6.setText("  Drinks");
        jTextField6.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));

        jlblCostOfMeal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jlblCostOfMeal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlblCostOfMealActionPerformed(evt);
            }
        });

        jTfChknRole.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CVegetableRole, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(CChickenRole, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(CVegetableBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CSandwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(CChickenBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Costofmeal, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jlblCostOfMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jTfVgtblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jTfSandwitch, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                                .addComponent(jTfChknBurger, javax.swing.GroupLayout.DEFAULT_SIZE, 59, Short.MAX_VALUE)
                                                .addComponent(jTfVgtblBurger)
                                                .addComponent(jTfChknRole)))
                                        .addGap(0, 0, Short.MAX_VALUE))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(jComboBoxSelectDrink, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 73, Short.MAX_VALUE)
                                .addComponent(jTfCostofDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(38, 38, 38))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CChickenBurger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTfChknBurger))
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(CVegetableBurger, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTfVgtblBurger))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CSandwitch, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTfSandwitch, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CChickenRole)
                    .addComponent(jTfChknRole, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CVegetableRole)
                    .addComponent(jTfVgtblRole, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Costofmeal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlblCostOfMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBoxSelectDrink)
                    .addComponent(jTfCostofDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 313, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Receipt", jPanel4);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 511, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButtonTotal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonTotal.setText("Total");
        jButtonTotal.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonTotalMouseClicked(evt);
            }
        });
        jButtonTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTotalActionPerformed(evt);
            }
        });

        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jButtonReset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonReset.setText("Reset");
        jButtonReset.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonResetMouseClicked(evt);
            }
        });
        jButtonReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonResetActionPerformed(evt);
            }
        });

        jTfTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jButtonReceipt.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButtonReceipt.setText("Receipt");
        jButtonReceipt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButtonReceiptMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(jButtonTotal)
                .addGap(64, 64, 64)
                .addComponent(jTfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButtonReceipt, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(jButtonReset)
                .addGap(53, 53, 53)
                .addComponent(jButtonExit)
                .addGap(31, 31, 31))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButtonReceipt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButtonExit)
                        .addComponent(jButtonReset))
                    .addComponent(jTfTotal)
                    .addComponent(jButtonTotal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(139, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(28, 28, 28)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(90, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CVegetableRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVegetableRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CVegetableRoleActionPerformed

    private void jTfVgtblRoleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfVgtblRoleActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfVgtblRoleActionPerformed

    private void jComboBoxSelectDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBoxSelectDrinkActionPerformed
        double Coke= 33;
        double Sevenup= 30;
        double Fanta= 32;
        double Coffee= 40;
        
        if(jComboBoxSelectDrink.getSelectedItem().equals("Coke")){
            String coke= String.format("%.2f", Coke);
            jTfCostofDrink.setText(coke);
        }
        if(jComboBoxSelectDrink.getSelectedItem().equals("Sevenup")){
            String sevenup= String.format("%.2f", Sevenup);
            jTfCostofDrink.setText(sevenup);
        }
        if(jComboBoxSelectDrink.getSelectedItem().equals("Fanta")){
            String fanta= String.format("%.2f", Fanta);
            jTfCostofDrink.setText(fanta);
        }
        if(jComboBoxSelectDrink.getSelectedItem().equals("Coffee")){
            String coffee= String.format("%.2f", Coffee);
            jTfCostofDrink.setText(coffee);
        }
    }//GEN-LAST:event_jComboBoxSelectDrinkActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonResetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonResetActionPerformed

    private void jButtonResetMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonResetMouseClicked
       jTfCostofDrink.setText(null);
       jTfChknBurger.setText(null);
       jTfChknRole.setText(null);
       jTfSandwitch.setText(null);
       jTfTotal.setText(null);
       jTfVgtblBurger.setText(null);
       jTfVgtblRole.setText(null);
       jTextArea1.setText(null);
       jlblCostOfMeal.setText(null);
    }//GEN-LAST:event_jButtonResetMouseClicked

    private void jTfChknBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfChknBurgerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfChknBurgerActionPerformed

    private void CChickenBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CChickenBurgerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CChickenBurgerActionPerformed

    private void CChickenBurgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CChickenBurgerMouseClicked
        //double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double aChickenBurger = Double.parseDouble(jTfChknBurger.getText());
        double CostCknburger = 140.00;
        
        if(CChickenBurger.isSelected()){
            
            i[0]=((aChickenBurger * CostCknburger));
            String pMeal = String.format("%.2f", i[0]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_CChickenBurgerMouseClicked

    private void jTfCostofDrinkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTfCostofDrinkActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTfCostofDrinkActionPerformed

    private void jlblCostOfMealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlblCostOfMealActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jlblCostOfMealActionPerformed

    private void CVegetableBurgerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CVegetableBurgerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CVegetableBurgerActionPerformed

    private void CVegetableBurgerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CVegetableBurgerMouseClicked
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double aVegetableBurger = Double.parseDouble(jTfVgtblBurger.getText());
        double Costvgtblburger = 100.00;
        if(CVegetableBurger.isSelected()){
            
            i[1]=((aVegetableBurger * Costvgtblburger)+cMeal);
            String pMeal = String.format("%.2f", i[1]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_CVegetableBurgerMouseClicked

    private void jButtonTotalMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonTotalMouseClicked
        double ctotal1 = Double.parseDouble(jlblCostOfMeal.getText());
        double ctotal2 = Double.parseDouble(jTfCostofDrink.getText());
        
        double alltotal = (ctotal1 + ctotal2);
        String itotal = String.format("%.2f ", alltotal);
        jTfTotal.setText(itotal);
    }//GEN-LAST:event_jButtonTotalMouseClicked

    private void CVegetableRoleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CVegetableRoleMouseClicked
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double aVegetableRole = Double.parseDouble(jTfVgtblRole.getText());
        double Costvgtblrole = 60.00;
        if(CVegetableRole.isSelected()){
            
            i[2]=((aVegetableRole * Costvgtblrole)+cMeal);
            String pMeal = String.format("%.2f", i[2]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_CVegetableRoleMouseClicked

    private void CSandwitchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CSandwitchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CSandwitchActionPerformed

    private void CSandwitchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CSandwitchMouseClicked
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double aSandwitch = Double.parseDouble(jTfSandwitch.getText());
        double CostaSandwitch = 120.00;
        if(CSandwitch.isSelected()){
            
            i[3]=((aSandwitch * CostaSandwitch)+cMeal);
            String pMeal = String.format("%.2f", i[3]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_CSandwitchMouseClicked

    private void CChickenRoleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CChickenRoleMouseClicked
        double cMeal = Double.parseDouble(jlblCostOfMeal.getText());
        double aCknRole = Double.parseDouble(jTfChknRole.getText());
        double CostaCknRole = 90.00;
        if(CChickenRole.isSelected()){
            
            i[4]=((aCknRole * CostaCknRole)+cMeal);
            String pMeal = String.format("%.2f", i[4]);
            jlblCostOfMeal.setText(pMeal );
        }
    }//GEN-LAST:event_CChickenRoleMouseClicked

    private void jButtonReceiptMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButtonReceiptMouseClicked
        double item1 = Double.parseDouble(jTfChknBurger.getText());
        double item2 = Double.parseDouble(jTfVgtblBurger.getText());
        double item3 = Double.parseDouble(jTfSandwitch.getText());
        double item4 = Double.parseDouble(jTfChknRole.getText());
        double item5 = Double.parseDouble(jTfVgtblRole.getText());
        double costofmeal= Double.parseDouble(jlblCostOfMeal.getText());
        double costofdrink= Double.parseDouble(jTfCostofDrink.getText());
        double totalcost= Double.parseDouble(jTfTotal.getText());
        
        jTextArea1.append("\tRestaurent Management System\t"+"\n\nChicken Burger :\t\t"+item1+
                "\nVegetable Burger :\t\t"+item2+
                "\nSandwitch :\t\t\t"+item3+
                "\nChicken Role :\t\t\t"+item4+
                "\nVegetable Role :\t\t"+item5+
                "\n\nCost of Food Items :\t\t"+costofmeal+" tk"+
                "\n\nCost of Drink :\t\t\t"+costofdrink+" tk"+
                "\n\nTotal Cost :\t\t\t"+totalcost+" tk"+
                "\n\n\tThanks for being with us :)");
    }//GEN-LAST:event_jButtonReceiptMouseClicked

    private void jButtonTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonTotalActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new OrderPage_frame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox CChickenBurger;
    private javax.swing.JCheckBox CChickenRole;
    private javax.swing.JCheckBox CSandwitch;
    private javax.swing.JCheckBox CVegetableBurger;
    private javax.swing.JCheckBox CVegetableRole;
    private javax.swing.JTextField Costofmeal;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonReceipt;
    private javax.swing.JButton jButtonReset;
    private javax.swing.JButton jButtonTotal;
    private javax.swing.JComboBox<String> jComboBoxSelectDrink;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTfChknBurger;
    private javax.swing.JTextField jTfChknRole;
    private javax.swing.JTextField jTfCostofDrink;
    private javax.swing.JTextField jTfSandwitch;
    private javax.swing.JTextField jTfTotal;
    private javax.swing.JTextField jTfVgtblBurger;
    private javax.swing.JTextField jTfVgtblRole;
    private javax.swing.JTextField jlblCostOfMeal;
    // End of variables declaration//GEN-END:variables
}
