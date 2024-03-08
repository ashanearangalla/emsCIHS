/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

import java.awt.HeadlessException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JOptionPane;

/**
 *
 * @author Ashane
 */
public class UserDBConnection extends DBConnection {
    

    
    public User loginValidation(User user) {
        String username=user.getUsername();
        String password=user.getPassword();
        boolean found=false;
        BufferedReader br=null;
        
        try {
            br = new BufferedReader(new FileReader(userFile));
            String Findline;
            String userline=null;
            outerLoop:
            while ((Findline = br.readLine())!=null) {
                String[]words = Findline.split(",");
                for (String word: words) {
                    if(words[3].equals(username)&& words[4].equals(password)) {
                        
                        userline=Findline;
                        found=true;
                        break outerLoop;
                    }
                }
            }
            br.close();
            if(userline!=null){
                String[] line=userline.split(",");
                user.setUserEmpID(line[0]);
                user.setUserEmpName(line[1]);
                user.setUserType(line[2]);
                user.setUsername(line[3]);
                user.setPassword(line[4]);
                
                
            }
            if(found) {
                JOptionPane.showMessageDialog(null, "Successful Login!");
            }    else {
                JOptionPane.showMessageDialog(null, "Wrong username or passsword!");
            }
        }
        catch (HeadlessException | IOException | NumberFormatException e) {
            System.out.println(""+e.toString());
        }
        return user;
    }
}
