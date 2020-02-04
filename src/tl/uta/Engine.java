package tl.uta;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JMenuItem;
import javax.swing.JRadioButton;
import javax.swing.JRadioButtonMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.TableColumn;
import javax.swing.text.DefaultStyledDocument;
import javax.swing.text.Document;
import javax.swing.undo.UndoManager;

/* @author Teemu Löppönen
 * TIEVA31 Project work
 * This class creates and controls changes user makes to current document
 * eg. font change, style change, size change and color change
 */
public class Engine {
     //UndoManager to follow text changes made to document
     private UndoManager tracker = new UndoManager();
     
     private Controller captain = new Controller();
     
    //method to change font size in jtextarea according edit bar drop box
    private void changeSize(JTextPane area, JComboBox box) {
        int newValue = box.getSelectedIndex();
        if(newValue == -1)
            newValue = 8;
        else
            newValue = (int) box.getItemAt(newValue);
                    
        Font before = area.getFont();
        //keeps old font style and font. Only changes size
        Font after = new Font(before.getFontName(), before.getStyle(), newValue);
        
        area.setFont(after);
    }
    
    //method to change jtextfield style (plain, bold, italic, both)
    private void changeStyle(JTextPane area, JComboBox box, JComboBox box2) {
        int newValue = (int) box.getSelectedIndex();
        Font before = area.getFont();
        String oldFont = (String) box2.getItemAt(box.getSelectedIndex());
        //keeps old font font and size. Only changes style
        Font after = new Font(oldFont, newValue, before.getSize());
        area.setFont(after);
    }
    
    //method to change jtextfield font ("Arian...->)
    private void changeFont(JTextPane area, JComboBox box) {
        String newValue = (String) box.getItemAt(box.getSelectedIndex());
        Font before = area.getFont();
        //keeps old font style and size. Only changes font
        Font after = new Font(newValue, before.getStyle(), before.getSize());
        area.setFont(after);
    }

    //initializes the program by adding drop-down combo boxes to edit bar and adding actionlisteners to it
    //activating undomanager and document listener to enable undo/redo functionality
    public void initialize(JTable jTable2, Engine machine, JTextPane jTextPane1, JMenuItem UndoButton, JMenuItem RedoButton) {
        //breaks JTable to smaller parts
        JTable addToMe = jTable2;
        TableColumn font = addToMe.getColumnModel().getColumn(0);
        TableColumn style = addToMe.getColumnModel().getColumn(1);
        TableColumn size = addToMe.getColumnModel().getColumn(2);
        TableColumn color = addToMe.getColumnModel().getColumn(3);
        
        //setting custom width to the toolbar table
        font.setPreferredWidth(120);
        style.setPreferredWidth(60);
        size.setPreferredWidth(50);
        color.setPreferredWidth(50);
        
        //Creating Combo boxes and action listeners + method callers
        //fonts + actionlistener
        JComboBox comboBox1 = new JComboBox(new String [] {"Arian", "Century", "Lucida Console"});
        comboBox1.setSelectedIndex(0);
        comboBox1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                machine.changeFont(jTextPane1, comboBox1);
            }
        });
        
        //styles + actionlistener
        JComboBox comboBox2 = new JComboBox(new String []{"Plain", "Bold", "Italic", "Both"});
        comboBox2.setSelectedIndex(0);
        comboBox2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                machine.changeStyle(jTextPane1, comboBox2, comboBox1);
            }
        });
        
        //sizes + actionlistener
        JComboBox comboBox3 = new JComboBox(new Integer [] {8, 10, 14, 16, 20, 24, 48});
       comboBox3.setSelectedIndex(0);
       comboBox3.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                machine.changeSize(jTextPane1, comboBox3);
            }
        });
       
       //colors + actionlistener
        JComboBox comboBox4 = new JComboBox(new String [] {"Red", "Green", "Blue", "Black", "White", "Yellow",});
       comboBox4.setSelectedIndex(3);
       comboBox4.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                machine.changeColor(jTextPane1, comboBox4);
            }
        });
       
       //adding custom renderer to color selector to fourth colum
       //read more at CustomRendeder.java
       CustomRenderer renderer = new CustomRenderer();
       comboBox4.setRenderer(renderer);
       
        //adding droptables to jtable
        font.setCellEditor(new DefaultCellEditor(comboBox1));
        style.setCellEditor(new DefaultCellEditor(comboBox2));
        size.setCellEditor(new DefaultCellEditor(comboBox3));
        color.setCellEditor(new DefaultCellEditor(comboBox4));
        
        //setting current doc to defaultstyledoc
        Document doc = new DefaultStyledDocument();
        jTextPane1.setDocument(doc);
        
        //attaching undoManager to JTextPane1
        doc.addUndoableEditListener(tracker);
        
        //adding document listener for doc to enable/disable undo/redo buttons
        //documentlistener activates from changes in doc and calls Undo/redo checker for menu bar buttons
        doc.addDocumentListener(new DocumentListener(){
             @Override
             public void insertUpdate(DocumentEvent e) {
                  //add
                  CheckUndoRedo(tracker, UndoButton, RedoButton);
             }

             @Override
             public void removeUpdate(DocumentEvent e) {
                  //delete
                  CheckUndoRedo(tracker, UndoButton, RedoButton);
             }

             @Override
             public void changedUpdate(DocumentEvent e) {
                  //new doc
                  CheckUndoRedo(tracker, UndoButton, RedoButton);
             }
        });
    }

    //method to change font color in jtextarea according edit bar drop box
    private void changeColor(JTextPane area, JComboBox box) {
         //new value
        String newValue = (String) box.getItemAt(box.getSelectedIndex());
        String [] colors = {"Red", "Green", "Blue", "Black", "White", "Yellow"};
        Color color = Color.BLACK;
        //search color to match vewValue
        if(newValue.equals((String) colors[0]))
            color = Color.RED;
        else if(newValue.equals((String) colors[1]))
            color = Color.GREEN;
        else if(newValue.equals((String) colors[2]))
            color = Color.BLUE;
        else if(newValue.equals((String) colors[3]))
            color = Color.BLACK;
        else if(newValue.equals((String) colors[4]))
            color = Color.WHITE;
        else if(newValue.equals((String) colors[5]))
            color = Color.YELLOW;
        
        area.setForeground(color);
      }
    
      //Enables or disables(greys out) undo/redo buttons according canRedo/Undo function
      private void CheckUndoRedo(UndoManager tracker, JMenuItem UndoButton, JMenuItem RedoButton) {
          if(tracker.canRedo())
              RedoButton.setEnabled(true);
          else
                RedoButton.setEnabled(false);
          
          if(tracker.canUndo())
              UndoButton.setEnabled(true);
          else
             UndoButton.setEnabled(false);
      }

     //Undo'es last command using undomanager. Doesnt track changes in font,size,style or color.
     protected void undo() {
          tracker.undo();
     }

     //Redo'es last command using undomanager. Doesnt track changes in font,size,style or color.
     protected void redo() {
          tracker.redo();
     }

     //Initializes actionlisteners for all radiobuttons to work together synchronised
     //so that they will show identical information
     //eg. set1: a = selected  b = not selected -> set2: a = selected  b = not selected
     protected void initializeRadio(JRadioButton jRadioButton1, JRadioButton jRadioButton2, JRadioButtonMenuItem jRadioButtonMenuItem1, JRadioButtonMenuItem jRadioButtonMenuItem2) {
           ActionListener sliceActionListener = new ActionListener() {
               public void actionPerformed(ActionEvent actionEvent) {
                    if(jRadioButton1.isSelected()){
                         jRadioButtonMenuItem1.setSelected(true);
                         jRadioButtonMenuItem2.setSelected(false);
                    }else if(jRadioButton2.isSelected()){
                         jRadioButtonMenuItem1.setSelected(false);
                         jRadioButtonMenuItem2.setSelected(true);
                    }
               }
          };
          jRadioButton1.addActionListener(sliceActionListener);
          jRadioButton2.addActionListener(sliceActionListener);
          
          ActionListener actionListener = new ActionListener() {
          public void actionPerformed(ActionEvent actionEvent) {
                if(jRadioButtonMenuItem1.isSelected()){
                         jRadioButton1.setSelected(true);
                         jRadioButton2.setSelected(false);
                    }else if(jRadioButtonMenuItem2.isSelected()){
                         jRadioButton1.setSelected(false);
                         jRadioButton2.setSelected(true);
                    }
               }
          };
          jRadioButtonMenuItem1.addActionListener(actionListener);
          jRadioButtonMenuItem2.addActionListener(actionListener);
     }

     //method to change visibility of edit bar
     protected void setVisibility(JScrollPane hideMe) {
          if(hideMe.isVisible()){
               hideMe.setVisible(false);
          }else{
               hideMe.setVisible(true);
          }
     }

     //method to change font using only main bar (for keyboard usage)
      protected void topFont(JTextPane area, String newFont) {
          Font before = area.getFont();
          Font after = new Font(newFont, before.getStyle(), before.getSize());
          area.setFont(after);
     }
      
      //method to change size using only main bar (for keyboard usage)
      protected void topSize(JTextPane area, int size) {
          Font before = area.getFont();
          Font after = new Font(before.getFontName(), before.getStyle(), size);
          area.setFont(after);
      }
      
      //method to change style using only main bar (for keyboard usage)
      protected void topSyle(JTextPane area, int size){
          Font before = area.getFont();
           Font after = new Font(before.getFamily(), size, before.getSize());
          area.setFont(after);
      }
      
      //method to change color using only main bar (for keyboard usage)
      protected void topTextColor(JTextPane area, String newColor) {
           String [] colors = {"RED", "GREEN", "BLUE", "BLACK", "WHITE", "YELLOW"};
               Color color = Color.BLACK;
               if(newColor.equals((String) colors[0]))
                   color = Color.RED;
               else if(newColor.equals((String) colors[1]))
                   color = Color.GREEN;
               else if(newColor.equals((String) colors[2]))
                   color = Color.BLUE;
               else if(newColor.equals((String) colors[3]))
                   color = Color.BLACK;
               else if(newColor.equals((String) colors[4]))
                   color = Color.WHITE;
               else if(newColor.equals((String) colors[5]))
                   color = Color.YELLOW;
          area.setForeground(color);
      }

      //forwards load-command to Controller
     protected void loadCommand(JTextPane jTextPane1) {
          captain.loadFile(jTextPane1);
     }

     //forwards save-command to Controller
     protected void saveCommand(JTextPane jTextPane1, JRadioButton jRadioButton1, JRadioButton jRadioButton2) {
          captain.saveFile(jTextPane1, jRadioButton1, jRadioButton2);
     }

     //forwards print-command to Controller
     protected void printCommand(JTextPane jTextPane1) {
          captain.printFile(jTextPane1);
     }
}