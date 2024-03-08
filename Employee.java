/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package employeemanagementsystem;

/**
 *
 * @author Ashane
 */
public class Employee extends Designation{

    private String empID;
    private String empName;
    private String epfNo;
    private String empPhoneNo;
    private String empEmail;
    
    public String getEmpID() {
        return empID;
    }

    /**
     * @param empID the empID to set
     */
    public void setEmpID(String empID) {
        this.empID = empID;
    }

    /**
     * @return the empName
     */
    public String getEmpName() {
        return empName;
    }

    /**
     * @param empName the empName to set
     */
    public void setEmpName(String empName) {
        this.empName = empName;
    }

    
    public String getEpfNo() {
        return epfNo;
    }

    /**
     * @param epfNo the epfNo to set
     */
    public void setEpfNo(String epfNo) {
        this.epfNo = epfNo;
    }

    /**
     * @return the empPhoneNo
     */
    public String getEmpPhoneNo() {
        return empPhoneNo;
    }

    /**
     * @param empPhoneNo the empPhoneNo to set
     */
    public void setEmpPhoneNo(String empPhoneNo) {
        this.empPhoneNo = empPhoneNo;
    }

    /**
     * @return the empEmail
     */
    public String getEmpEmail() {
        return empEmail;
    }

    /**
     * @param empEmail the empEmail to set
     */
    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }
    public void addEmployee(Employee emp)
    {
        String empString = emp.getEmpID()+","+ emp.getEmpName()+","+emp.getDeptName()+","+
        emp.getDes()+","+ emp.getEpfNo()+","+ emp.getEmpPhoneNo()+","+ emp.getEmpEmail();
    
        DBConnection db = new EmpDBConnection();
        db.writeToDB(empString,"Employee.txt");
    
    
    }
    
}
