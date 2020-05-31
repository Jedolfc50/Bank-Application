/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;
import java.sql.*;

/**
 *
 * @author Jed Donkoh
 */
public class customers {
   private int custId;
    private String custPass;
    private String custFirstName;
    private String custLastName;
    private String custAddress;
    private String custEmail;
    private String phoneNo;
    public accountList aList = new accountList();
    
    
    public customers(){
        this.custId = 000;
        this.custPass = "";
        this.custFirstName = "";
        this.custLastName = "";
        this.custAddress = "";
        this.custEmail = "";
        this.phoneNo = "";
    }
    public customers(int Id,String pw,String fn,String ln,String add, String em,String ph){
        this.custId = Id;
        this.custPass = pw;
        this.custFirstName = fn;
        this.custLastName = ln;
        this.custAddress = add;
        this.custEmail = em;
        this.phoneNo = ph;
    }
    
    public void setCustomerId(int Id){custId = Id;}
    public int getCustomerId(){return custId;}
    
    public void setCustPass(String pw){custPass = pw;}
    public String getCustPass(){return custPass;}
    
    public void setCustFirstName(String fn){custFirstName = fn;}
    public String getCustFirstName(){return custFirstName;}
    
    public void setCustLastName(String ln){custLastName = ln;}
    public String getCustLastName(){return custLastName;}
    
    public void setCustAddress(String add){custAddress = add;}
    public String getCustAddress(){return custAddress;}
    
    public void setCustEmail(String em){custEmail = em;}
    public String getCustEmail(){return custEmail;}
    
    public void setPhoneNumber(String ph){phoneNo = ph;}
    public String getPhoneNumber(){return phoneNo; }
    
    public void Display(){
        System.out.println("******************************************************");
        System.out.println("Customer ID: "+custId);
        System.out.println("Customer Password: "+custPass);
        System.out.println("Customer First Name: "+custFirstName);
        System.out.println("Customer Last Name: "+custLastName);
        System.out.println("Customer Address: "+custAddress);
        System.out.println("Customer Email "+custEmail);
        System.out.println("Customer Phone "+phoneNo);
        aList.display();
        System.out.println("******************************************************");   
    }
    
    public void SelectDB(int Id){
        custId = Id;
        try{
                System.out.println("Starting Database Application..........\n"
                        + "Loading Drivers................");
            try{
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            }catch(ClassNotFoundException e){
                System.out.println("There is a Driver Error");
                e.printStackTrace();
            }
            System.out.println("Database Application started\n"
                    + "Drivers Loaded!");
            String url = "jdbc:ucanaccess://C://Users//makaf//Desktop//Database//ChattBankMDB.mdb";
            try(Connection con = DriverManager.getConnection(url)){
                System.out.println("Database successfully connected!");
                Statement stmt = con.createStatement();
                String sql = "Select * from Customers where custId ='"+Id+"'";
                System.out.println(sql);
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    custId = rs.getInt("CUSTID");
                    custPass = rs.getString("CustPassword");
                    custFirstName = rs.getString("CustFirstName");
                    custLastName = rs.getString("CustLastName");
                    custAddress = rs.getString("custAddress");
                    custEmail = rs.getString("custEmail");
                    phoneNo = rs.getString("CustPhoneNumber");
                }
                
            }
        }catch(SQLException ex){
            System.out.println("There is a SQL Exception");
            ex.printStackTrace();
        }
        makeAccountList();
    }
    
    public void makeAccountList(){
        try{
            try{
               Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            }catch(ClassNotFoundException e){
                System.out.println("There is a Class Not found exception!");
                System.err.println(e);
            }
            
            Connection con;
            con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//makaf//Desktop//Database//ChattBankMDB.mdb");
            System.out.println("Database connection successfully");
            
            Statement stmt = con.createStatement();
            System.out.println("Compiling SQL Statement.........");
            
            String sql;
            sql = "Select acctNo from Accounts Where Cid= '"+custId+"'";
            System.out.println("SQL Statement compiled!");
            System.out.println(sql);
            
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println("Customer's Account List");
                int accNo = rs.getInt(1);
                account a = new account();
                a.SelectDB(accNo);
                aList.addAccount(a);
            }
            /***********************************************************************
             * 
             *  Select StudentID from studentClass where InstructorID='"+id+'"
             * 
             ********************************************************************/
        }catch(SQLException ex){
            System.out.println("There is a SQL Exception!");
            System.err.println(ex);
        }
    }
    
    public void InsertDB(int Id,String pw,String fn,String ln,String add, String em,String ph){
        this.custId = Id;
        this.custPass = pw;
        this.custFirstName = fn;
        this.custLastName = ln;
        this.custAddress = add;
        this.custEmail = em;
        this.phoneNo = ph;
        
        try{
            try{
                System.out.println("Starting DB Application.......\n"
                        + "Loading Drivers..........");
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            }catch(ClassNotFoundException e){
                System.out.println("There is a Driver error!");
                e.printStackTrace();
            }
            System.out.println("DB Application Started!\n"
                    + "Drivers Loaded!");
             String url = "jdbc:ucanaccess://C://Users//makaf//Desktop//Database//ChattBankMDB.mdb";
             try(Connection con = DriverManager.getConnection(url)){
                 System.out.println("Database successfully connected! ");
                 Statement stmt = con.createStatement();
                 String sql;
                sql ="Insert into Customers(CustID,CustPassword,CustFirstName,CustLastName,CustAddress,CustEmail,CustPhoneNumber) values("+getCustomerId()+","+
					"'" +getCustPass() +"',"+
                                        "'" +getCustFirstName() +"',"+
                                        "'" +getCustLastName() +"',"+
					"'" +getCustAddress() +"',"+
                                        "'" +getCustEmail()+"',"+
					"'" +getPhoneNumber()+"')";
               System.out.println("SQL Statement Compiled!");
               System.out.println(sql);
               int n = stmt.executeUpdate(sql);
               if (n == 1){
                   System.out.println("Processing request........... ");
                   System.out.println("Request successfully completed!");
               }else{
                   System.out.println("Request failed!");
                   System.out.println("Error!");
               }
             }
            
        }catch(SQLException ex){
            System.out.println("There is an SQL Exception error");
            ex.printStackTrace();
        }
    }
    
    public void UpdateDB(){
        try{
            try{
                System.out.println("Starting DB Tester........");
                System.out.println("Loading Drivers...........");
                Class.forName("net.ucanaccess.jdbc.UcanacessDriver");
            }catch(ClassNotFoundException e){
                System.out.println("There is a Class Not Found Exception!");
                System.err.println(e);
            }
             Connection con;
             con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//makaf//Desktop//Database//ChattBankMDB.mdb");
             System.out.println("Database connection successful!");
             
             Statement stmt = con.createStatement();
             System.out.println("Compiling Statement..........");
             
             String sql;
             sql  = "Update Customers set CustPassword = '"+custPass+
                       "', CustFirstName = '"+custFirstName+
                       "', CustLastName = '"+custLastName+
                       "', CustAddress = '"+custAddress+
                       "', CustEmail = '"+custEmail+
                       "' Where CustID = '"+custId+"'";
             
            System.out.println("SQL Statement Compiled!");   
            System.out.println(sql);
            
            int n = stmt.executeUpdate(sql);
            if(n==1){
                System.out.println("Processing request.......");
                System.out.println("Update successfully completed!");
            }else{
                System.out.println("ERROR!");
                System.out.println("Request Failed!");
            }
            
            con.close();
            System.out.println("Database connection terminated!");
            
        }catch(SQLException ex){
            System.out.println("There is a SQL Exception!");
            System.err.println(ex);
        }
    }//ending UpdateDB()
    
    public void DeleteDB(){
        try{
            try{
                System.out.println("Starting DB Tester............");
                System.out.println("Loading Drivers...............");
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            }catch(ClassNotFoundException e){
                System.out.println("There is a Class Not Found Exception!");
                System.err.println(e);
            }
            
            System.out.println("DB Tester Started!");
            System.out.println("Drivers Loaded!");
            
            Connection con;
            con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//makaf//Desktop//Database//ChattBankMDB.mdb");
            System.out.println("Database successfully connected!");
            
            Statement stmt = con.createStatement();
            System.out.println("Compiling SQL Statement.........");
            
            String sql;
            sql = "Delete * from Customers Where CustID= '"+custId+"'";
            System.out.println("SQL Statement compiled!");
            System.out.println(sql);
            
            int n = stmt.executeUpdate(sql);
            if(n==1){
                System.out.println("Processing Request.........");
                System.out.println("Delete successfully completed");
            }else{
                System.out.println("ERROR!");
                System.out.println("Request Failed!");
            }
            
            con.close();
            System.out.println("Database connection terminated");
                    
        }catch(SQLException ex){
            System.out.println("There is a SQL Exception!");
            System.err.println(ex);
        }
    }
    
    
    
    public static void main(String[]args){
       // customers c1 = new customers(2910,"fish","Jed","Donkoh","123 Main Street","jed@yahoo.com","5675675677");
       customers c1 = new customers();
       c1.SelectDB(3090);
        c1.Display();
    }
}
