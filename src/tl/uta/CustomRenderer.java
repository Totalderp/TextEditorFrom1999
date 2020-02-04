package tl.uta;

import java.awt.Color;
import java.awt.Component;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

/* @author Teemu Löppönen
 * TIEVA31 Project work
 * This class produces custom render for JTables fourth colum "color"
 * It paints each options background to resemble each option
 * eg. option "red"s background is colored red  
 */
public class CustomRenderer extends JLabel implements ListCellRenderer {
     public CustomRenderer() {
         super.setOpaque(true);
     }

    @Override
     public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
          String [] colors = {"Red", "Green", "Blue", "Black", "White", "Yellow"};
        
          //creates new renderer for jLabels in fourth colum
          DefaultListCellRenderer defaultRenderer = new DefaultListCellRenderer();
          JLabel renderer = (JLabel) defaultRenderer.getListCellRendererComponent(list, value, index,isSelected, cellHasFocus);
           
          //chooses a color for each label
           if(value.equals(colors[0]))  {
               list.setBackground(Color.RED);
            }
           else if(value.equals(colors[1])) {
               renderer.setBackground(Color.GREEN);
           }
           else if(value.equals(colors[2])) {
               renderer.setBackground(Color.BLUE);
           }
           else if(value.equals(colors[3])) {
               renderer.setBackground(Color.BLACK);
           }
           else if(value.equals(colors[4])) {
               renderer.setBackground(Color.WHITE);
           }
           else if(value.equals(colors[5])) {
               renderer.setBackground(Color.YELLOW);
           }
     return renderer;
     }
}