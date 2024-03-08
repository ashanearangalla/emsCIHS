/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashane
 */
public class EmpDBConnection extends DBConnection{
    
    public void deleteData(String uniqueKey,String fileName) {
        String input;
        File inputFile = new File(fileName);
        File tempFile = new File(inputFile.getAbsolutePath()+".tmp");
        boolean found=false;
        String oldString="";
        BufferedReader reader = null;
        try {
            input=uniqueKey;
            reader = new BufferedReader(new FileReader(inputFile));
            String Findline;
            while ((Findline = reader.readLine())!=null){
                String[]words = Findline.split(",");
                for (String word: words) {
                    if(word.equals(input)) {
                        found=true;
                        oldString =Findline;
                        break;
                    }
                }
            }
            reader.close();
            if(!found){
                 JOptionPane.showMessageDialog(null, "Invalid Existing code or Name!", "Error!", JOptionPane.ERROR_MESSAGE);
            }
            else{
                try {    
                    reader = new BufferedReader(new FileReader(inputFile));
                    PrintWriter pw = new PrintWriter(new FileWriter(tempFile));
                    String line;
                    while ((line = reader.readLine())!=null) {
                        if (line.isEmpty()||line.equals(oldString)) {
                        } 
                        else {
                            pw.write(line);
                            pw.write("\n");
                            }
                    }
                    pw.close();
                    reader.close();
                    if (!inputFile.delete()) {
                        System.out.println("Could not delete file");
                        return;
                    }
                    if (!tempFile.renameTo(inputFile))
                        System.out.println("Could not rename file");
                        JOptionPane.showMessageDialog(null, "Details deleted successfully!!", "Edit Item", JOptionPane.INFORMATION_MESSAGE);
                    }
                    catch (FileNotFoundException ex) {
                    System.out.println("File Not Found!");
                    }catch (IOException ex) {
                    ex.printStackTrace();
                    }  
            }
        }catch (IOException ex) {
            ex.printStackTrace();
        }  
          
    }

    
}
