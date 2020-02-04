package tl.uta;

import java.awt.Color;
import javax.swing.JColorChooser;
import javax.swing.JOptionPane;
import static javax.swing.UIManager.getSystemLookAndFeelClassName;

/* @author Teemu Löppönen
 * TIEVA31 Project work
 * This class builds UI and works as main class for program
 * Class creates Ui from Generated code and sends commans to Engine and Controller
 */
public class Ui extends javax.swing.JFrame {

    /**
     * Creates new form Ui
     */
    public Ui() {
        initComponents();
    }

    /*
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          buttonGroup1 = new javax.swing.ButtonGroup();
          buttonGroup2 = new javax.swing.ButtonGroup();
          jScrollPane3 = new javax.swing.JScrollPane();
          jTable2 = new javax.swing.JTable();
          jScrollPane2 = new javax.swing.JScrollPane();
          jTextPane1 = new javax.swing.JTextPane();
          jRadioButton1 = new javax.swing.JRadioButton();
          jRadioButton2 = new javax.swing.JRadioButton();
          jLabel1 = new javax.swing.JLabel();
          jLabel2 = new javax.swing.JLabel();
          jLabel3 = new javax.swing.JLabel();
          jMenuBar1 = new javax.swing.JMenuBar();
          jMenu1 = new javax.swing.JMenu();
          jMenuItem2 = new javax.swing.JMenuItem();
          jMenuItem1 = new javax.swing.JMenuItem();
          jMenuItem3 = new javax.swing.JMenuItem();
          jMenuItem4 = new javax.swing.JMenuItem();
          jMenu2 = new javax.swing.JMenu();
          jMenuItem5 = new javax.swing.JMenuItem();
          jMenuItem6 = new javax.swing.JMenuItem();
          jMenu3 = new javax.swing.JMenu();
          jCheckBoxMenuItem1 = new javax.swing.JCheckBoxMenuItem();
          jMenuItem7 = new javax.swing.JMenuItem();
          jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
          jRadioButtonMenuItem2 = new javax.swing.JRadioButtonMenuItem();
          jMenu4 = new javax.swing.JMenu();
          jMenu5 = new javax.swing.JMenu();
          jMenuItem8 = new javax.swing.JMenuItem();
          jMenuItem9 = new javax.swing.JMenuItem();
          jMenuItem10 = new javax.swing.JMenuItem();
          jMenu6 = new javax.swing.JMenu();
          jMenuItem11 = new javax.swing.JMenuItem();
          jMenuItem12 = new javax.swing.JMenuItem();
          jMenuItem13 = new javax.swing.JMenuItem();
          jMenuItem14 = new javax.swing.JMenuItem();
          jMenu7 = new javax.swing.JMenu();
          jMenuItem15 = new javax.swing.JMenuItem();
          jMenuItem16 = new javax.swing.JMenuItem();
          jMenuItem17 = new javax.swing.JMenuItem();
          jMenuItem18 = new javax.swing.JMenuItem();
          jMenuItem19 = new javax.swing.JMenuItem();
          jMenuItem20 = new javax.swing.JMenuItem();
          jMenuItem21 = new javax.swing.JMenuItem();
          jMenu8 = new javax.swing.JMenu();
          jMenuItem22 = new javax.swing.JMenuItem();
          jMenuItem23 = new javax.swing.JMenuItem();
          jMenuItem24 = new javax.swing.JMenuItem();
          jMenuItem25 = new javax.swing.JMenuItem();
          jMenuItem26 = new javax.swing.JMenuItem();
          jMenuItem27 = new javax.swing.JMenuItem();

          setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
          setTitle("TextEditorFrom1999");
          addWindowListener(new java.awt.event.WindowAdapter() {
               public void windowClosing(java.awt.event.WindowEvent evt) {
                    formWindowClosing(evt);
               }
               public void windowOpened(java.awt.event.WindowEvent evt) {
                    formWindowOpened(evt);
               }
          });

          jScrollPane3.setFocusable(false);

          jTable2.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {
                    {"Arian", "Plain",  new Integer(8), "Black"}
               },
               new String [] {
                    "Font", "Style", "Size", "Color"
               }
          ) {
               Class[] types = new Class [] {
                    java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
               };

               public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
               }
          });
          jTable2.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_OFF);
          jTable2.setAutoscrolls(false);
          jTable2.setFocusable(false);
          jTable2.setRequestFocusEnabled(false);
          jTable2.setRowSelectionAllowed(false);
          jTable2.getTableHeader().setResizingAllowed(false);
          jTable2.getTableHeader().setReorderingAllowed(false);
          jScrollPane3.setViewportView(jTable2);

          jScrollPane2.setViewportView(jTextPane1);

          buttonGroup1.add(jRadioButton1);
          jRadioButton1.setSelected(true);
          jRadioButton1.setText(".TXT");
          jRadioButton1.setFocusable(false);

          buttonGroup1.add(jRadioButton2);
          jRadioButton2.setText(".RTF");
          jRadioButton2.setFocusable(false);

          jLabel1.setText("Save file as");
          jLabel1.setFocusable(false);

          jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
          jLabel2.setText("TIEVA31 Project Work");

          jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
          jLabel3.setText("Teemu Löppönen");

          jMenu1.setText("File");

          jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_O, java.awt.event.InputEvent.CTRL_MASK));
          jMenuItem2.setText("Open");
          jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem2ActionPerformed(evt);
               }
          });
          jMenu1.add(jMenuItem2);

          jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
          jMenuItem1.setText("Save");
          jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem1ActionPerformed(evt);
               }
          });
          jMenu1.add(jMenuItem1);

          jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
          jMenuItem3.setText("Print");
          jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem3ActionPerformed(evt);
               }
          });
          jMenu1.add(jMenuItem3);

          jMenuItem4.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F4, java.awt.event.InputEvent.ALT_MASK));
          jMenuItem4.setText("Exit");
          jMenuItem4.setToolTipText("");
          jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem4ActionPerformed(evt);
               }
          });
          jMenu1.add(jMenuItem4);

          jMenuBar1.add(jMenu1);

          jMenu2.setText("Edit");

          jMenuItem5.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Z, java.awt.event.InputEvent.CTRL_MASK));
          jMenuItem5.setText("Undo");
          jMenuItem5.setEnabled(false);
          jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem5ActionPerformed(evt);
               }
          });
          jMenu2.add(jMenuItem5);

          jMenuItem6.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
          jMenuItem6.setText("Redo");
          jMenuItem6.setEnabled(false);
          jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem6ActionPerformed(evt);
               }
          });
          jMenu2.add(jMenuItem6);

          jMenuBar1.add(jMenu2);

          jMenu3.setText("Settings");

          jCheckBoxMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_E, java.awt.event.InputEvent.CTRL_MASK));
          jCheckBoxMenuItem1.setSelected(true);
          jCheckBoxMenuItem1.setText("Edit bar visibility");
          jCheckBoxMenuItem1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jCheckBoxMenuItem1ActionPerformed(evt);
               }
          });
          jMenu3.add(jCheckBoxMenuItem1);

          jMenuItem7.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
          jMenuItem7.setText("Set Background color");
          jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem7ActionPerformed(evt);
               }
          });
          jMenu3.add(jMenuItem7);

          buttonGroup2.add(jRadioButtonMenuItem1);
          jRadioButtonMenuItem1.setSelected(true);
          jRadioButtonMenuItem1.setText("Save as .TXT");
          jMenu3.add(jRadioButtonMenuItem1);

          buttonGroup2.add(jRadioButtonMenuItem2);
          jRadioButtonMenuItem2.setText("Save as .RTF");
          jMenu3.add(jRadioButtonMenuItem2);

          jMenuBar1.add(jMenu3);

          jMenu4.setText("Format");

          jMenu5.setText("Font");

          jMenuItem8.setText("Arian");
          jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem8ActionPerformed(evt);
               }
          });
          jMenu5.add(jMenuItem8);

          jMenuItem9.setText("Century");
          jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem9ActionPerformed(evt);
               }
          });
          jMenu5.add(jMenuItem9);

          jMenuItem10.setText("Lucida Console");
          jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem10ActionPerformed(evt);
               }
          });
          jMenu5.add(jMenuItem10);

          jMenu4.add(jMenu5);

          jMenu6.setText("Style");

          jMenuItem11.setText("Plain");
          jMenuItem11.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem11ActionPerformed(evt);
               }
          });
          jMenu6.add(jMenuItem11);

          jMenuItem12.setText("Bold");
          jMenuItem12.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem12ActionPerformed(evt);
               }
          });
          jMenu6.add(jMenuItem12);

          jMenuItem13.setText("Italic");
          jMenuItem13.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem13ActionPerformed(evt);
               }
          });
          jMenu6.add(jMenuItem13);

          jMenuItem14.setText("Both");
          jMenuItem14.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem14ActionPerformed(evt);
               }
          });
          jMenu6.add(jMenuItem14);

          jMenu4.add(jMenu6);

          jMenu7.setText("Size");

          jMenuItem15.setText("8");
          jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem15ActionPerformed(evt);
               }
          });
          jMenu7.add(jMenuItem15);

          jMenuItem16.setText("10");
          jMenuItem16.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem16ActionPerformed(evt);
               }
          });
          jMenu7.add(jMenuItem16);

          jMenuItem17.setText("14");
          jMenuItem17.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem17ActionPerformed(evt);
               }
          });
          jMenu7.add(jMenuItem17);

          jMenuItem18.setText("16");
          jMenuItem18.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem18ActionPerformed(evt);
               }
          });
          jMenu7.add(jMenuItem18);

          jMenuItem19.setText("20");
          jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem19ActionPerformed(evt);
               }
          });
          jMenu7.add(jMenuItem19);

          jMenuItem20.setText("24");
          jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem20ActionPerformed(evt);
               }
          });
          jMenu7.add(jMenuItem20);

          jMenuItem21.setText("48");
          jMenuItem21.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem21ActionPerformed(evt);
               }
          });
          jMenu7.add(jMenuItem21);

          jMenu4.add(jMenu7);

          jMenu8.setText("Color");

          jMenuItem22.setText("Red");
          jMenuItem22.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem22ActionPerformed(evt);
               }
          });
          jMenu8.add(jMenuItem22);

          jMenuItem23.setText("Green");
          jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem23ActionPerformed(evt);
               }
          });
          jMenu8.add(jMenuItem23);

          jMenuItem24.setText("Blue");
          jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem24ActionPerformed(evt);
               }
          });
          jMenu8.add(jMenuItem24);

          jMenuItem25.setText("Black");
          jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem25ActionPerformed(evt);
               }
          });
          jMenu8.add(jMenuItem25);

          jMenuItem26.setText("White");
          jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem26ActionPerformed(evt);
               }
          });
          jMenu8.add(jMenuItem26);

          jMenuItem27.setText("Yellow");
          jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jMenuItem27ActionPerformed(evt);
               }
          });
          jMenu8.add(jMenuItem27);

          jMenu4.add(jMenu8);

          jMenuBar1.add(jMenu4);

          setJMenuBar(jMenuBar1);

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addComponent(jScrollPane2)
                              .addContainerGap())
                         .addGroup(layout.createSequentialGroup()
                              .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addGroup(layout.createSequentialGroup()
                                        .addComponent(jRadioButton1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jRadioButton2))
                                   .addGroup(layout.createSequentialGroup()
                                        .addGap(16, 16, 16)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 412, Short.MAX_VALUE)
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                   .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE)
                                   .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                         .addGroup(layout.createSequentialGroup()
                              .addContainerGap()
                              .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                   .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                             .addComponent(jRadioButton1)
                                             .addComponent(jRadioButton2)))
                                   .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                         .addGroup(layout.createSequentialGroup()
                              .addComponent(jLabel2)
                              .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                              .addComponent(jLabel3)))
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 472, Short.MAX_VALUE)
                    .addGap(10, 10, 10))
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

     // Exit command from File menu
    private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem4ActionPerformed

      // EXIT from elsewhere eg. red 'X' in right top corner
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        if (JOptionPane.showConfirmDialog(this, "Really quit?", "Confirm", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
             this.dispose();
    }//GEN-LAST:event_formWindowClosing

    // -!-
    // Most important method in UI class
    // Sends commands to initialize and create programs main actionlisteners
    // -!-
    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        machine.initialize(jTable2, machine, jTextPane1, jMenuItem5, jMenuItem6);
        machine.initializeRadio(jRadioButton1, jRadioButton2, jRadioButtonMenuItem1, jRadioButtonMenuItem2);
    }//GEN-LAST:event_formWindowOpened

    // Open command from File menu
    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        machine.loadCommand(jTextPane1);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    // Save command from File menu
    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        machine.saveCommand(jTextPane1, jRadioButton1, jRadioButton2);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    // Print command from File menu
    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        machine.printCommand(jTextPane1);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    // Undo command from Edit menu
     private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
          machine.undo();
     }//GEN-LAST:event_jMenuItem5ActionPerformed

     // Redo command from Edit menu
     private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
          machine.redo();
     }//GEN-LAST:event_jMenuItem6ActionPerformed

     // Change jPanel bavkground color command from Setting menu
     private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
          Color c = JColorChooser.showDialog(this, "Set the background color", jTextPane1.getBackground());
          if (c != null) {
              jTextPane1.setBackground(c);
          }
     }//GEN-LAST:event_jMenuItem7ActionPerformed

     //Change Edit bar visibility command from Setting menu
     private void jCheckBoxMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCheckBoxMenuItem1ActionPerformed
          machine.setVisibility(jScrollPane3);
     }//GEN-LAST:event_jCheckBoxMenuItem1ActionPerformed

     // Format style 4 command
     private void jMenuItem14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem14ActionPerformed
           machine.topSyle(jTextPane1, 3);
     }//GEN-LAST:event_jMenuItem14ActionPerformed

     // Format font 1 command
     private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
          machine.topFont(jTextPane1, "Arian");
     }//GEN-LAST:event_jMenuItem8ActionPerformed

     // Format font 2 command
     private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
          machine.topFont(jTextPane1, "Century");
     }//GEN-LAST:event_jMenuItem9ActionPerformed

     // Format font 3 command
     private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
          machine.topFont(jTextPane1, "Lucida Console");
     }//GEN-LAST:event_jMenuItem10ActionPerformed

     // Format style 1 command
     private void jMenuItem11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem11ActionPerformed
          machine.topSyle(jTextPane1, 0);
     }//GEN-LAST:event_jMenuItem11ActionPerformed

     // Format style 2 command
     private void jMenuItem12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem12ActionPerformed
          machine.topSyle(jTextPane1, 1);
     }//GEN-LAST:event_jMenuItem12ActionPerformed

     // Format style 3 command
     private void jMenuItem13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem13ActionPerformed
          machine.topSyle(jTextPane1, 2);
     }//GEN-LAST:event_jMenuItem13ActionPerformed

     // Format size 8 command
     private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
          machine.topSize(jTextPane1, 8);
     }//GEN-LAST:event_jMenuItem15ActionPerformed

     // Format size 10 command
     private void jMenuItem16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem16ActionPerformed
          machine.topSize(jTextPane1, 10);
     }//GEN-LAST:event_jMenuItem16ActionPerformed

     // Format size 14 command
     private void jMenuItem17ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem17ActionPerformed
          machine.topSize(jTextPane1, 14);
     }//GEN-LAST:event_jMenuItem17ActionPerformed

     // Format size 16 command
     private void jMenuItem18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem18ActionPerformed
          machine.topSize(jTextPane1, 16);
     }//GEN-LAST:event_jMenuItem18ActionPerformed

     // Format size 20 command
     private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
         machine.topSize(jTextPane1, 20);
     }//GEN-LAST:event_jMenuItem19ActionPerformed

     // Format size 24 command
     private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
          machine.topSize(jTextPane1, 24);
     }//GEN-LAST:event_jMenuItem20ActionPerformed

     // Format size 48 command
     private void jMenuItem21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem21ActionPerformed
          machine.topSize(jTextPane1, 48);
     }//GEN-LAST:event_jMenuItem21ActionPerformed

     // Format color red command
     private void jMenuItem22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem22ActionPerformed
          machine.topTextColor(jTextPane1, "RED");
     }//GEN-LAST:event_jMenuItem22ActionPerformed

     // Format color green command
     private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
          machine.topTextColor(jTextPane1, "GREEN");
     }//GEN-LAST:event_jMenuItem23ActionPerformed

     // Format color blue command
     private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
          machine.topTextColor(jTextPane1, "BLUE");
     }//GEN-LAST:event_jMenuItem24ActionPerformed

     // Format color black command
     private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
          machine.topTextColor(jTextPane1, "BLACK");
     }//GEN-LAST:event_jMenuItem25ActionPerformed

     // Format color white command
     private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
          machine.topTextColor(jTextPane1, "WHITE");
     }//GEN-LAST:event_jMenuItem26ActionPerformed

     // Format color yellow command
     private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
         machine.topTextColor(jTextPane1, "YELLOW");
     }//GEN-LAST:event_jMenuItem27ActionPerformed

    
     //generated Nimbus code customised for "windows" program look
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
             //next line customised for "windows" look
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(getSystemLookAndFeelClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ui.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ui().setVisible(true);
            }
        });
    }

     // Variables declaration - do not modify//GEN-BEGIN:variables
     private javax.swing.ButtonGroup buttonGroup1;
     private javax.swing.ButtonGroup buttonGroup2;
     private javax.swing.JCheckBoxMenuItem jCheckBoxMenuItem1;
     private javax.swing.JLabel jLabel1;
     private javax.swing.JLabel jLabel2;
     private javax.swing.JLabel jLabel3;
     private javax.swing.JMenu jMenu1;
     private javax.swing.JMenu jMenu2;
     private javax.swing.JMenu jMenu3;
     private javax.swing.JMenu jMenu4;
     private javax.swing.JMenu jMenu5;
     private javax.swing.JMenu jMenu6;
     private javax.swing.JMenu jMenu7;
     private javax.swing.JMenu jMenu8;
     private javax.swing.JMenuBar jMenuBar1;
     private javax.swing.JMenuItem jMenuItem1;
     private javax.swing.JMenuItem jMenuItem10;
     private javax.swing.JMenuItem jMenuItem11;
     private javax.swing.JMenuItem jMenuItem12;
     private javax.swing.JMenuItem jMenuItem13;
     private javax.swing.JMenuItem jMenuItem14;
     private javax.swing.JMenuItem jMenuItem15;
     private javax.swing.JMenuItem jMenuItem16;
     private javax.swing.JMenuItem jMenuItem17;
     private javax.swing.JMenuItem jMenuItem18;
     private javax.swing.JMenuItem jMenuItem19;
     private javax.swing.JMenuItem jMenuItem2;
     private javax.swing.JMenuItem jMenuItem20;
     private javax.swing.JMenuItem jMenuItem21;
     private javax.swing.JMenuItem jMenuItem22;
     private javax.swing.JMenuItem jMenuItem23;
     private javax.swing.JMenuItem jMenuItem24;
     private javax.swing.JMenuItem jMenuItem25;
     private javax.swing.JMenuItem jMenuItem26;
     private javax.swing.JMenuItem jMenuItem27;
     private javax.swing.JMenuItem jMenuItem3;
     private javax.swing.JMenuItem jMenuItem4;
     private javax.swing.JMenuItem jMenuItem5;
     private javax.swing.JMenuItem jMenuItem6;
     private javax.swing.JMenuItem jMenuItem7;
     private javax.swing.JMenuItem jMenuItem8;
     private javax.swing.JMenuItem jMenuItem9;
     private javax.swing.JRadioButton jRadioButton1;
     private javax.swing.JRadioButton jRadioButton2;
     private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
     private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem2;
     private javax.swing.JScrollPane jScrollPane2;
     private javax.swing.JScrollPane jScrollPane3;
     private javax.swing.JTable jTable2;
     private javax.swing.JTextPane jTextPane1;
     // End of variables declaration//GEN-END:variables
    
    private Engine machine = new Engine();
}