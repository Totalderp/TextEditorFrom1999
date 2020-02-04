package tl.uta;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.nio.file.Files;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;
import javax.swing.text.Document;
import javax.swing.text.rtf.RTFEditorKit;

/* @author Teemu Löppönen
 * TIEVA31 Project work
 * This class controls system operations, for example saving and loading a file and printing current file
 */
public class Controller {

     //gives an option to save the currently worked document as .TXT or .RTF file
    protected void saveFile(JTextPane jTextPane1, JRadioButton jRadioButton1, JRadioButton jRadioButton2) {
         //choosing file location and filename
        JFileChooser save = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        
        int returnValue = save.showSaveDialog(null);
        
        if (returnValue == JFileChooser.APPROVE_OPTION)  {
            File selectedFile = save.getSelectedFile();
            //saving file as chosen file type
            try {
                Document doc = jTextPane1.getDocument();
                
                if(jRadioButton1.isSelected()) {
                    OutputStream fw = new FileOutputStream(selectedFile +".txt"); 
                     jTextPane1.getEditorKit().write(fw,doc,0,doc.getLength());
                    
                } else if(jRadioButton2.isSelected()){
                    RTFEditorKit rtf = new RTFEditorKit();
                    OutputStream fw = new FileOutputStream(selectedFile +".rtf");
                    rtf.write(fw,doc,0,doc.getLength());
                }
                    
            }catch (Exception e){
                System.out.println(e);
            }
        }
    }

    //gives an option to open a new document to edit in program
    protected void loadFile(JTextPane jTextPane1) {
         //choosing the file and loading it. Files are filtered for .txt and .rtf files
        JFileChooser load = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
        FileNameExtensionFilter filter = new FileNameExtensionFilter("TEXT FILES", "txt", "text", "*.txt", "RTF", "*.rtf");
        load.setFileFilter(filter);

        int returnValue = load.showOpenDialog(null);

        if (returnValue == JFileChooser.APPROVE_OPTION)  {
            File selectedFile = load.getSelectedFile();
            
            //iimports the data from file
            try {
                //reads the chosen file in ANSI==Cp1252 encoding, to understand letters like "ä" and "ö"
                String fileType = Files.probeContentType(selectedFile.toPath());
                BufferedReader in = new BufferedReader(new InputStreamReader(new FileInputStream(selectedFile.getAbsolutePath()), "Cp1252"));
                //delete old text from document
                jTextPane1.setText("");
                
                //.TXT ->
                if(fileType.equals("text/plain")){
                    Document doc = jTextPane1.getDocument();
                    jTextPane1.getEditorKit().read(in, doc, 0);
                   
                //.RTF ->
                }else{
                    RTFEditorKit rtf = new RTFEditorKit();
                    Document doc = jTextPane1.getDocument();
                    rtf.read(in, doc, 0);
                }
            }catch (Exception e){
                System.out.println(e);
            }
           }
      }

      //prints the curretly worked document
      protected void printFile(JTextPane printMe) {
          try {
               //the printing itself is just one line of code
               boolean done = printMe.print();
               
               //After printing displays a dialog box of success
               if (done) {
                    JOptionPane.showMessageDialog(null, "Printing is done");
               } else {
                          JOptionPane.showMessageDialog(null, "Error while printing","Error", JOptionPane.ERROR_MESSAGE);
               }
          }
          catch (Exception e) {
                    JOptionPane.showMessageDialog(null, "Error while printing","Error", JOptionPane.ERROR_MESSAGE);
                    System.out.println(e);
          }
     }
}
