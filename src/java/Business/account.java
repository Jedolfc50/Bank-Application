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
public class account {
     private int accNo;
   private int id;
   private String atype;
   private double abal;
   /*********************************************
    * This is an empty constructor that helps
    * load an object by the program to pull data 
    * out of the database
    *********************************************/
   public account(){
       this.accNo = 000;
       this.id = 000;
       this.atype = "";
       this.abal = 0.00;
   }
   /***************************************
    * This constructor takes in parameters 
    * which helps initialize an object to 
    * insert data into the database. 
    * @param acc
    * @param Id
    * @param Atype
    * @param bal 
    ***************************************/
   public account(int acc,int Id,String Atype,double bal ){
       this.accNo = acc;
       this.id = Id;
       this.atype = Atype;
       this.abal = bal;
   }
   public void setAccountNo(int acc){accNo =acc;}
   public int getAccountNo(){return accNo;}
   
   public void setAccountId(int Id){id = Id;}
   public int getAccountId(){return id;}
   
   public void setAccountType(String aType){atype = aType;}
   public String getAccountType(){return atype;}
   
   public void setAccountBal(double bal){abal = bal;}
   public double getAccountBal(){return abal;}
   
   /*******************************************
    * This method helps the customer initiate
    * a deposit to their account.
    * @param ammount 
    ******************************************/
   public void Deposit(double ammount){
       abal = ammount + abal;
       UpdateDB();
   }
   /**************************************************
    * This method is responsible for withdrawing
    * a balance the customer or owner of the account 
    * wishes to withdraw
    * @param ammount
    * @throws insufficientFunds 
    **************************************************/
   public void withdraw(double ammount) throws insufficientFunds{
       if(ammount > abal)
           throw new insufficientFunds();
       else{
           ammount = abal - ammount;
           UpdateDB();
       }
   }
   
   /*********************************************
    * This method allows the user to view all
    * the information pulled out from the backend 
    * to the front end
    ********************************************/
   public void Display(){
       System.out.println("************************************************************");
       System.out.println("Customer Account Number: "+getAccountNo());
       System.out.println("Customer Account Id: "+getAccountId());
       System.out.println("Customer Type: "+getAccountType());
       System.out.println("Customer Balance: $"+getAccountBal());
       System.out.println("Thank you for banking with us!");
       System.out.println("************************************************************");
   }
   
   /*************************************************
    * This method SlectDB by using the account
    * number which serves as the primary key
    * pulls data from the database.
    * @param anum 
    ***********************************************/
   public void SelectDB(int anum){
       accNo = anum;
       try{
           try{
               System.out.println("Starting DB Tester................");
               System.out.println("Loading Drivers....................");
               Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");// Loads the drivers needed to execute all SQL commands
           }catch(ClassNotFoundException e){
               System.out.println("There is a Class Not Found Exception!");
               System.out.println(e);
           }
           System.out.println("DB Application Started!");
           System.out.println("Drivers Loaded!");
           
           Connection con;// This is used to make a connnection with the database 
           con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//makaf//Desktop//Database//ChattBankMDB.mdb");
           System.out.println("Database successfully connected!");
                
           
           Statement stmt = con.createStatement();
           System.out.println("Compiling SQL compiling..........");
           
           String sql;
           sql = "Select * from Accounts where AcctNo='"+accNo+"'";// SQL statement 
          
           System.out.println("SQL Statement Compiled!");            
           System.out.println(sql);
           
           ResultSet rs = stmt.executeQuery(sql);
           rs.next();
           //accNo = rs.getInt(1);
           id = rs.getInt(2);
           atype = rs.getString(3);
           abal = rs.getDouble(4);
           
           con.close();
           System.out.println("Database connection terminated!");
       }catch(SQLException ex){
           System.out.println("There is a SQL Exception!");
           System.out.println(ex);
       }
   }//ending SelectDB()
   
   public void InsertDB(int acc,int Id,String Atype,double bal){
       this.accNo = acc;
       this.id = Id;
       this.atype = Atype;
       this.abal = bal;
       
       try{
           try{
               System.out.println("Starting DB Tester..............");
               System.out.println("Loading Drivers.................");
               Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
           }catch(ClassNotFoundException e){
               System.out.println("There is a Class Not Found Exception!");
               System.err.println(e);
           }
           
           System.out.println("DB Application Started!");
           System.out.println("Drivers Loaded!");
           
           Connection con;
           con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//makaf//Desktop//Database//ChattBankMDB.mdb");
           System.out.println("Database successfully connected!");
                
           
           Statement stmt = con.createStatement();
           System.out.println("Compiling SQL compiling..........");
           
           String sql;
           sql ="Insert into Accounts values("+getAccountNo()+","+
					 "'" +getAccountId() +"',"+
					"'" +getAccountType() +"',"+
					" " +getAccountBal()+")";
                      
           System.out.println("SQL Statement Compiled!");
           System.out.println(sql);
           
           int n = stmt.executeUpdate(sql);
           if(n==1){
             System.out.println("Processing request.......");
             System.out.println("Insert successfully completed!");
           }else{
               System.out.println("ERROR!");
               System.out.println("Request Failed!");
           }
           
           con.close();
           System.out.println("Database connection terminated!");
           
           
       }catch(SQLException ex){
           System.out.println("There is an SQL Exception!");
           System.err.println(ex);
       }
   }//ending InsertDB()
   
   public void UpdateDB(){
       try{
           try{
               System.out.println("Starting DB Tester..............");
               System.out.println("Loading Drivers.................");
               Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
           }catch(ClassNotFoundException e){
               System.out.println("There is a Class Not Found Exception");
               System.err.println(e);
           }
           
           System.out.println("DB Application Started!");
           System.out.println("Drivers Loaded!");
           
           Connection con;
           con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//makaf//Desktop//Database//ChattBankMDB.mdb");
           System.out.println("Database successfully connected!");
           
           Statement stmt = con.createStatement();
           System.out.println("Compiling SQL Statement........");
           
            String sql;
            sql = "Update Accounts set Cid = '"+id+
                  "', Type = '"+atype+
                   "', Balance = '"+abal+
                   "' Where AcctNo = '"+accNo+"'";
            System.out.println("SQL Statement Compiled!");
            System.out.println(sql);
            
            int n = stmt.executeUpdate(sql);
            if(n==1){
                System.out.println("Processing Request.........");
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
              System.out.println("Loading Drivers................");
              Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
          }catch(ClassNotFoundException e){
              System.out.println("There is a Class Not Found Exception!");
              System.err.println(e);
          }
          
           System.out.println("DB Application Started!");
           System.out.println("Drivers Loaded!");
           
           Connection con;
           con = DriverManager.getConnection("jdbc:ucanaccess://C://Users//makaf//Desktop//Database//ChattBankMDB.mdb");
           System.out.println("Database successfully connected!");
           
           Statement stmt = con.createStatement();
           System.out.println("Compiling SQL Statement......");
           
           String sql;
           sql = "Delete * from Accounts Where AcctNo= '"+accNo+"'";
           System.out.println("SQL Statement Compilied!");
           System.out.println(sql);
           
           int n = stmt.executeUpdate(sql);
           if(n==1){
               System.out.println("Processing Request.........");
               System.out.println("Delete successfully completed!");
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
   }
 
   public static void main(String[]args){
       account a1;
       a1 = new account();
       a1.SelectDB(90000);
      //a1.Deposit(600.00);
        //a1.DeleteDB();
       //a1.UpdateDB();
       //a1.InsertDB(90014, 3009, "MMA", 5000.00);
       a1.Display();
   }
}
