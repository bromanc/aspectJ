package com.gui;

import javax.swing.JOptionPane;

@SuppressWarnings("serial")

public class Frame extends javax.swing.JFrame {
	
	String usr;
	String passw;	
	
    public Frame() {
        initComponents();
    }
    
    public boolean validateUser() {
    	usr = jTextField1.getText();
    	passw = jPasswordField1.getText();
    	if(usr.equalsIgnoreCase("admin") && passw.equalsIgnoreCase("1234")) {
	    	return true;
	    }else{
	    	return false;
	    } 
    }
    
    
    public void jButton1Pressed(java.awt.event.ActionEvent evt) {
    	validateUser();
    }
    
    
    public static void main(String args[]) {
    	Frame frame = new Frame();
    	frame.setVisible(true);
    }
    
 
   private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setMinimumSize(new java.awt.Dimension(477, 155));
        getContentPane().setLayout(new java.awt.BorderLayout(15, 15));

        jPanel1.setLayout(new java.awt.GridLayout(2, 0, 10, 10));

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("User:");
        jPanel1.add(jLabel2);

        jTextField1.setToolTipText("Username");
        jPanel1.add(jTextField1);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Password:");
        jPanel1.add(jLabel3);

        jPasswordField1.setToolTipText("Password");
        jPanel1.add(jPasswordField1);

        getContentPane().add(jPanel1, java.awt.BorderLayout.CENTER);

        jPanel2.setLayout(new java.awt.BorderLayout());

        jLabel1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Login System");
        jPanel2.add(jLabel1, java.awt.BorderLayout.CENTER);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        jPanel3.setLayout(new java.awt.GridLayout());

        jButton1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jButton1.setText("Log In");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	jButton1Pressed(evt);
            }
        });
        
        jPanel3.add(jButton1);

        getContentPane().add(jPanel3, java.awt.BorderLayout.PAGE_END);

        pack();
    }

   private javax.swing.JButton jButton1;
   private javax.swing.JLabel jLabel1;
   private javax.swing.JLabel jLabel2;
   private javax.swing.JLabel jLabel3;
   private javax.swing.JPanel jPanel1;
   private javax.swing.JPanel jPanel2;
   private javax.swing.JPanel jPanel3;
   private javax.swing.JPasswordField jPasswordField1;
   private javax.swing.JTextField jTextField1;

   
}
