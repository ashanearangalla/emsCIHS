/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;



public class Designation extends Department{
    private String des;
    
    
     
    public String getDes() {
        return des;
    }

    
    public void setDes(String des) {
        this.des = des;
    }
    
    public void addDesignation(Designation des)
    {
        String desString = des.getDeptName() +","+des.getDes();
    
        DBConnection db = new EmpDBConnection();
        db.writeToDB(desString,"Designation.txt");
    
    
    }
    
}
