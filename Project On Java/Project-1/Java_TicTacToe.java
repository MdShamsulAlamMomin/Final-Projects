/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Java_TicTacToe;

import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author md momin
 */
public class Java_TicTacToe extends javax.swing.JFrame {

    private String StartGame="X";
    private int Xcount=0;
    private int Ocount=0;
    boolean check;
    
    public Java_TicTacToe() {
        initComponents();
    }
    
    private void GameScore()
    {
        jlblPlayerX.setText(String.valueOf(Xcount));
        jlblPlayerO.setText(String.valueOf(Ocount));
    }
    
       private void ChoosePlayer()
    {
        if(StartGame.equalsIgnoreCase("X"))
        {
            StartGame="O";
        }
        else
        {
            StartGame="X";
        }
    }
       private void WinningGame()
       {
           String b1=jbtn1.getText();
           String b2=jbtn2.getText();
           String b3=jbtn3.getText();
           String b4=jbtn4.getText();
           String b5=jbtn5.getText();
           String b6=jbtn6.getText();
           String b7=jbtn7.getText();
           String b8=jbtn8.getText();
           String b9=jbtn9.getText();
           
           if(b1.equals("X") && b2.equals("X") && b3.equals("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn1.setBackground(Color.GREEN);
               jbtn2.setBackground(Color.GREEN);
               jbtn3.setBackground(Color.GREEN);
               Xcount++;
               GameScore();
           }
           
           else if(b4.equals("X") && b5.equals("X") && b6.equals("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn4.setBackground(Color.BLUE);
               jbtn5.setBackground(Color.BLUE);
               jbtn6.setBackground(Color.BLUE);
               Xcount++;
               GameScore();
           }
           
           else if(b7.equals("X") && b8.equals("X") && b9.equals("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn7.setBackground(Color.CYAN);
               jbtn8.setBackground(Color.CYAN);
               jbtn9.setBackground(Color.CYAN);
               Xcount++;
               GameScore();
           }
           
           else if(b1.equals("X") && b4.equals("X") && b7.equals("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn1.setBackground(Color.DARK_GRAY);
               jbtn4.setBackground(Color.DARK_GRAY);
               jbtn7.setBackground(Color.DARK_GRAY);
               Xcount++;
               GameScore();
           }
           
           else if(b1.equals("X") && b5.equals("X") && b9.equals("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn1.setBackground(Color.GRAY);
               jbtn5.setBackground(Color.GRAY);
               jbtn9.setBackground(Color.GRAY);
               Xcount++;
               GameScore();
           }
           
           else if(b3.equals("X") && b6.equals("X") && b9.equals("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn3.setBackground(Color.LIGHT_GRAY);
               jbtn6.setBackground(Color.LIGHT_GRAY);
               jbtn9.setBackground(Color.LIGHT_GRAY);
               Xcount++;
               GameScore();
           }
           
           else if(b3.equals("X") && b5.equals("X") && b7.equals("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn3.setBackground(Color.MAGENTA);
               jbtn5.setBackground(Color.MAGENTA);
               jbtn7.setBackground(Color.MAGENTA);
               Xcount++;
               GameScore();
           }
           
           else if(b2.equals("X") && b5.equals("X") && b8.equals("X"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn2.setBackground(Color.ORANGE);
               jbtn5.setBackground(Color.ORANGE);
               jbtn8.setBackground(Color.ORANGE);
               Xcount++;
               GameScore();
           }
           
           
           else if(b1.equals("O") && b2.equals("O") && b3.equals("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn1.setBackground(Color.GREEN);
               jbtn2.setBackground(Color.GREEN);
               jbtn3.setBackground(Color.GREEN);
               Ocount++;
               GameScore();
           }
           
           else if(b4.equals("O") && b5.equals("O") && b6.equals("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn4.setBackground(Color.BLUE);
               jbtn5.setBackground(Color.BLUE);
               jbtn6.setBackground(Color.BLUE);
               Ocount++;
               GameScore();
           }
           
           else if(b7.equals("O") && b8.equals("O") && b9.equals("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn7.setBackground(Color.CYAN);
               jbtn8.setBackground(Color.CYAN);
               jbtn9.setBackground(Color.CYAN);
               Ocount++;
               GameScore();
           }
           
           else if(b1.equals("O") && b4.equals("O") && b7.equals("O"))
           {
               JOptionPane.showMessageDialog(this, "Player X Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn1.setBackground(Color.DARK_GRAY);
               jbtn4.setBackground(Color.DARK_GRAY);
               jbtn7.setBackground(Color.DARK_GRAY);
               Ocount++;
               GameScore();
           }
           
           else if(b1.equals("O") && b5.equals("O") && b9.equals("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn1.setBackground(Color.GRAY);
               jbtn5.setBackground(Color.GRAY);
               jbtn9.setBackground(Color.GRAY);
               Ocount++;
               GameScore();
           }
           
           else if(b3.equals("O") && b6.equals("O") && b9.equals("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn3.setBackground(Color.LIGHT_GRAY);
               jbtn6.setBackground(Color.LIGHT_GRAY);
               jbtn9.setBackground(Color.LIGHT_GRAY);
               Ocount++;
               GameScore();
           }
           
           else if(b3.equals("O") && b5.equals("O") && b7.equals("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn3.setBackground(Color.MAGENTA);
               jbtn5.setBackground(Color.MAGENTA);
               jbtn7.setBackground(Color.MAGENTA);
               Ocount++;
               GameScore();
           }
           
           else if(b2.equals("O") && b5.equals("O") && b8.equals("O"))
           {
               JOptionPane.showMessageDialog(this, "Player O Wins", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
               
               jbtn2.setBackground(Color.ORANGE);
               jbtn5.setBackground(Color.ORANGE);
               jbtn8.setBackground(Color.ORANGE);
               Ocount++;
               GameScore();
           }
           
            // Check for a draw
    if (!jbtn1.getText().isEmpty() &&
        !jbtn2.getText().isEmpty() &&
        !jbtn3.getText().isEmpty() &&
        !jbtn4.getText().isEmpty() &&
        !jbtn5.getText().isEmpty() &&
        !jbtn6.getText().isEmpty() &&
        !jbtn7.getText().isEmpty() &&
        !jbtn8.getText().isEmpty() &&
        !jbtn9.getText().isEmpty()) {
        JOptionPane.showMessageDialog(this, "It's a Draw!", "Tic Tac Toe", JOptionPane.INFORMATION_MESSAGE);
        resetBoard();
    }
    
    
           
           
       }
       
       private void resetBoard() {
    jbtn1.setText("");
    jbtn2.setText("");
    jbtn3.setText("");
    jbtn4.setText("");
    jbtn5.setText("");
    jbtn6.setText("");
    jbtn7.setText("");
    jbtn8.setText("");
    jbtn9.setText("");

    jbtn1.setBackground(Color.LIGHT_GRAY);
    jbtn2.setBackground(Color.LIGHT_GRAY);
    jbtn3.setBackground(Color.LIGHT_GRAY);
    jbtn4.setBackground(Color.LIGHT_GRAY);
    jbtn5.setBackground(Color.LIGHT_GRAY);
    jbtn6.setBackground(Color.LIGHT_GRAY);
    jbtn7.setBackground(Color.LIGHT_GRAY);
    jbtn8.setBackground(Color.LIGHT_GRAY);
    jbtn9.setBackground(Color.LIGHT_GRAY);

    enableButtons(true);
}

private void enableButtons(boolean enable) {
    jbtn1.setEnabled(enable);
    jbtn2.setEnabled(enable);
    jbtn3.setEnabled(enable);
    jbtn4.setEnabled(enable);
    jbtn5.setEnabled(enable);
    jbtn6.setEnabled(enable);
    jbtn7.setEnabled(enable);
    jbtn8.setEnabled(enable);
    jbtn9.setEnabled(enable);
}
       
       

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelLeft = new javax.swing.JPanel();
        jbtn3 = new javax.swing.JButton();
        jbtn6 = new javax.swing.JButton();
        jbtn2 = new javax.swing.JButton();
        jbtn1 = new javax.swing.JButton();
        jbtn5 = new javax.swing.JButton();
        jbtn9 = new javax.swing.JButton();
        jbtn4 = new javax.swing.JButton();
        jbtn7 = new javax.swing.JButton();
        jbtn8 = new javax.swing.JButton();
        jPanelRight = new javax.swing.JPanel();
        jPanelPlayers = new javax.swing.JPanel();
        jLabelPlayerO = new javax.swing.JLabel();
        jLabelPlayerX = new javax.swing.JLabel();
        jlblPlayerO = new javax.swing.JLabel();
        jlblPlayerX = new javax.swing.JLabel();
        jPanelOther = new javax.swing.JPanel();
        jButton11 = new javax.swing.JButton();
        jbtnExit = new javax.swing.JButton();
        jbtnReset = new javax.swing.JButton();
        jbtnNewGame = new javax.swing.JButton();
        jPanelTitle = new javax.swing.JPanel();
        jTitle_Label = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(95, 158, 160));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelLeft.setBackground(new java.awt.Color(95, 158, 160));
        jPanelLeft.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelLeft.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jbtn3.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jbtn3.setMaximumSize(new java.awt.Dimension(200, 150));
        jbtn3.setMinimumSize(new java.awt.Dimension(200, 140));
        jbtn3.setPreferredSize(new java.awt.Dimension(200, 150));
        jbtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn3ActionPerformed(evt);
            }
        });
        jPanelLeft.add(jbtn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 10, 190, -1));

        jbtn6.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jbtn6.setMaximumSize(new java.awt.Dimension(200, 150));
        jbtn6.setMinimumSize(new java.awt.Dimension(200, 140));
        jbtn6.setPreferredSize(new java.awt.Dimension(200, 150));
        jbtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn6ActionPerformed(evt);
            }
        });
        jPanelLeft.add(jbtn6, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 190, -1));

        jbtn2.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jbtn2.setMaximumSize(new java.awt.Dimension(200, 150));
        jbtn2.setMinimumSize(new java.awt.Dimension(200, 140));
        jbtn2.setPreferredSize(new java.awt.Dimension(200, 150));
        jbtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn2ActionPerformed(evt);
            }
        });
        jPanelLeft.add(jbtn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 10, 190, -1));

        jbtn1.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jbtn1.setMaximumSize(new java.awt.Dimension(200, 150));
        jbtn1.setMinimumSize(new java.awt.Dimension(200, 140));
        jbtn1.setPreferredSize(new java.awt.Dimension(200, 150));
        jbtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn1ActionPerformed(evt);
            }
        });
        jPanelLeft.add(jbtn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 190, -1));

        jbtn5.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jbtn5.setMaximumSize(new java.awt.Dimension(200, 150));
        jbtn5.setMinimumSize(new java.awt.Dimension(200, 140));
        jbtn5.setPreferredSize(new java.awt.Dimension(200, 150));
        jbtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn5ActionPerformed(evt);
            }
        });
        jPanelLeft.add(jbtn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 170, 190, -1));

        jbtn9.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jbtn9.setMaximumSize(new java.awt.Dimension(200, 150));
        jbtn9.setMinimumSize(new java.awt.Dimension(200, 140));
        jbtn9.setPreferredSize(new java.awt.Dimension(200, 150));
        jbtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn9ActionPerformed(evt);
            }
        });
        jPanelLeft.add(jbtn9, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 190, -1));

        jbtn4.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jbtn4.setMaximumSize(new java.awt.Dimension(200, 150));
        jbtn4.setMinimumSize(new java.awt.Dimension(200, 140));
        jbtn4.setPreferredSize(new java.awt.Dimension(200, 150));
        jbtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn4ActionPerformed(evt);
            }
        });
        jPanelLeft.add(jbtn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 190, -1));

        jbtn7.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jbtn7.setMaximumSize(new java.awt.Dimension(200, 150));
        jbtn7.setMinimumSize(new java.awt.Dimension(200, 140));
        jbtn7.setPreferredSize(new java.awt.Dimension(200, 150));
        jbtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn7ActionPerformed(evt);
            }
        });
        jPanelLeft.add(jbtn7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 340, 190, -1));

        jbtn8.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jbtn8.setMaximumSize(new java.awt.Dimension(200, 150));
        jbtn8.setMinimumSize(new java.awt.Dimension(200, 140));
        jbtn8.setPreferredSize(new java.awt.Dimension(200, 150));
        jbtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn8ActionPerformed(evt);
            }
        });
        jPanelLeft.add(jbtn8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 340, 190, -1));

        jPanel1.add(jPanelLeft, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 630, 510));

        jPanelRight.setBackground(new java.awt.Color(95, 158, 160));
        jPanelRight.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelRight.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelPlayers.setBackground(new java.awt.Color(95, 158, 160));
        jPanelPlayers.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelPlayers.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelPlayerO.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabelPlayerO.setText("Player O :");
        jPanelPlayers.add(jLabelPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 300, 90));

        jLabelPlayerX.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jLabelPlayerX.setText("Player X :");
        jPanelPlayers.add(jLabelPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 90));

        jlblPlayerO.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jlblPlayerO.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerO.setText("0");
        jlblPlayerO.setOpaque(true);
        jPanelPlayers.add(jlblPlayerO, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 280, 90));

        jlblPlayerX.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jlblPlayerX.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlblPlayerX.setText("0");
        jlblPlayerX.setOpaque(true);
        jPanelPlayers.add(jlblPlayerX, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 10, 280, 90));

        jPanelRight.add(jPanelPlayers, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 600, 240));

        jPanelOther.setBackground(new java.awt.Color(95, 158, 160));
        jPanelOther.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelOther.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton11.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jButton11.setMaximumSize(new java.awt.Dimension(200, 150));
        jButton11.setMinimumSize(new java.awt.Dimension(200, 140));
        jButton11.setPreferredSize(new java.awt.Dimension(200, 150));
        jPanelOther.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 340, 190, -1));

        jbtnExit.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jbtnExit.setText("Exit");
        jbtnExit.setMaximumSize(new java.awt.Dimension(200, 150));
        jbtnExit.setMinimumSize(new java.awt.Dimension(200, 140));
        jbtnExit.setPreferredSize(new java.awt.Dimension(200, 150));
        jbtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnExitActionPerformed(evt);
            }
        });
        jPanelOther.add(jbtnExit, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 300, 100));

        jbtnReset.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jbtnReset.setText("Reset");
        jbtnReset.setMaximumSize(new java.awt.Dimension(200, 150));
        jbtnReset.setMinimumSize(new java.awt.Dimension(200, 140));
        jbtnReset.setPreferredSize(new java.awt.Dimension(200, 150));
        jbtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnResetActionPerformed(evt);
            }
        });
        jPanelOther.add(jbtnReset, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 270, 100));

        jbtnNewGame.setFont(new java.awt.Font("Tahoma", 1, 80)); // NOI18N
        jbtnNewGame.setText("New Game");
        jbtnNewGame.setMaximumSize(new java.awt.Dimension(200, 150));
        jbtnNewGame.setMinimumSize(new java.awt.Dimension(200, 140));
        jbtnNewGame.setPreferredSize(new java.awt.Dimension(200, 150));
        jbtnNewGame.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtnNewGameActionPerformed(evt);
            }
        });
        jPanelOther.add(jbtnNewGame, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 580, 110));

        jPanelRight.add(jPanelOther, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, 600, 240));

        jPanel1.add(jPanelRight, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 120, 630, 510));

        jPanelTitle.setBackground(new java.awt.Color(95, 158, 160));
        jPanelTitle.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jPanelTitle.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTitle_Label.setFont(new java.awt.Font("Tahoma", 1, 60)); // NOI18N
        jTitle_Label.setForeground(new java.awt.Color(255, 255, 255));
        jTitle_Label.setText("Java Advanced Tic Tac Toe Game");
        jPanelTitle.add(jTitle_Label, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 10, 1050, 90));

        jPanel1.add(jPanelTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 1280, 100));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1390, 690));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnResetActionPerformed
        jbtn1.setEnabled(true);
        jbtn2.setEnabled(true);
        jbtn3.setEnabled(true);
        jbtn4.setEnabled(true);
        jbtn5.setEnabled(true);
        jbtn6.setEnabled(true);
        jbtn7.setEnabled(true);
        jbtn8.setEnabled(true);
        jbtn9.setEnabled(true);
        
        jbtn1.setText("");
        jbtn2.setText("");
        jbtn3.setText("");
        jbtn4.setText("");
        jbtn5.setText("");
        jbtn6.setText("");
        jbtn7.setText("");
        jbtn8.setText("");
        jbtn9.setText("");
        
        jbtn1.setBackground(Color.LIGHT_GRAY);
        jbtn2.setBackground(Color.LIGHT_GRAY);
        jbtn3.setBackground(Color.LIGHT_GRAY);
        jbtn4.setBackground(Color.LIGHT_GRAY);
        jbtn5.setBackground(Color.LIGHT_GRAY);
        jbtn6.setBackground(Color.LIGHT_GRAY);
        jbtn7.setBackground(Color.LIGHT_GRAY);
        jbtn8.setBackground(Color.LIGHT_GRAY);
        jbtn9.setBackground(Color.LIGHT_GRAY); 
        
    }//GEN-LAST:event_jbtnResetActionPerformed
private JFrame frame; 
    private void jbtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnExitActionPerformed
    frame=new JFrame("Exit");
    if(JOptionPane.showConfirmDialog(frame, "Confirm if you want to exit", "Tic Tac Toe", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION)
    {
        System.exit(0);
    }
    }//GEN-LAST:event_jbtnExitActionPerformed

    private void jbtnNewGameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtnNewGameActionPerformed
        
        jbtn1.setText("");
        jbtn2.setText("");
        jbtn3.setText("");
        jbtn4.setText("");
        jbtn5.setText("");
        jbtn6.setText("");
        jbtn7.setText("");
        jbtn8.setText("");
        jbtn9.setText("");
        
        jlblPlayerX.setText("X");
        jlblPlayerO.setText("O");
        
        
        jbtn1.setBackground(Color.LIGHT_GRAY);
        jbtn2.setBackground(Color.LIGHT_GRAY);
        jbtn3.setBackground(Color.LIGHT_GRAY);
        jbtn4.setBackground(Color.LIGHT_GRAY);
        jbtn5.setBackground(Color.LIGHT_GRAY);
        jbtn6.setBackground(Color.LIGHT_GRAY);
        jbtn7.setBackground(Color.LIGHT_GRAY);
        jbtn8.setBackground(Color.LIGHT_GRAY);
        jbtn9.setBackground(Color.LIGHT_GRAY); 
        
    }//GEN-LAST:event_jbtnNewGameActionPerformed

    private void jbtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn1ActionPerformed
        jbtn1.setText(StartGame);
        
        if(StartGame.equalsIgnoreCase("X"))
        {
            check=false;
        }
        
        else
        {
            check=true;
        }
        ChoosePlayer();
        WinningGame();
    }//GEN-LAST:event_jbtn1ActionPerformed

    private void jbtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn2ActionPerformed
        
        jbtn2.setText(StartGame);
        
        if(StartGame.equalsIgnoreCase("X"))
        {
            check=false;
        }
        
        else
        {
            check=true;
        }
        ChoosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_jbtn2ActionPerformed

    private void jbtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn3ActionPerformed
        
        jbtn3.setText(StartGame);
        
        if(StartGame.equalsIgnoreCase("X"))
        {
            check=false;
        }
        
        else
        {
            check=true;
        }
        ChoosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_jbtn3ActionPerformed

    private void jbtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn4ActionPerformed
        
        jbtn4.setText(StartGame);
        
        if(StartGame.equalsIgnoreCase("X"))
        {
            check=false;
        }
        
        else
        {
            check=true;
        }
        ChoosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_jbtn4ActionPerformed

    private void jbtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn5ActionPerformed
        
        jbtn5.setText(StartGame);
        
        if(StartGame.equalsIgnoreCase("X"))
        {
            check=false;
        }
        
        else
        {
            check=true;
        }
        ChoosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_jbtn5ActionPerformed

    private void jbtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn6ActionPerformed
        
        jbtn6.setText(StartGame);
        
        if(StartGame.equalsIgnoreCase("X"))
        {
            check=false;
        }
        
        else
        {
            check=true;
        }
        ChoosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_jbtn6ActionPerformed

    private void jbtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn7ActionPerformed
        
        jbtn7.setText(StartGame);
        
        if(StartGame.equalsIgnoreCase("X"))
        {
            check=false;
        }
        
        else
        {
            check=true;
        }
        ChoosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_jbtn7ActionPerformed

    private void jbtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn8ActionPerformed
       
        jbtn8.setText(StartGame);
        
        if(StartGame.equalsIgnoreCase("X"))
        {
            check=false;
        }
        
        else
        {
            check=true;
        }
        ChoosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_jbtn8ActionPerformed

    private void jbtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn9ActionPerformed
        
        jbtn9.setText(StartGame);
        
        if(StartGame.equalsIgnoreCase("X"))
        {
            check=false;
        }
        
        else
        {
            check=true;
        }
        ChoosePlayer();
        WinningGame();
        
    }//GEN-LAST:event_jbtn9ActionPerformed
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
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Java_TicTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Java_TicTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton11;
    private javax.swing.JLabel jLabelPlayerO;
    private javax.swing.JLabel jLabelPlayerX;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLeft;
    private javax.swing.JPanel jPanelOther;
    private javax.swing.JPanel jPanelPlayers;
    private javax.swing.JPanel jPanelRight;
    private javax.swing.JPanel jPanelTitle;
    private javax.swing.JLabel jTitle_Label;
    private javax.swing.JButton jbtn1;
    private javax.swing.JButton jbtn2;
    private javax.swing.JButton jbtn3;
    private javax.swing.JButton jbtn4;
    private javax.swing.JButton jbtn5;
    private javax.swing.JButton jbtn6;
    private javax.swing.JButton jbtn7;
    private javax.swing.JButton jbtn8;
    private javax.swing.JButton jbtn9;
    private javax.swing.JButton jbtnExit;
    private javax.swing.JButton jbtnNewGame;
    private javax.swing.JButton jbtnReset;
    private javax.swing.JLabel jlblPlayerO;
    private javax.swing.JLabel jlblPlayerX;
    // End of variables declaration//GEN-END:variables
}
