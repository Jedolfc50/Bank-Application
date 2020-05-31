/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import java.util.ArrayList;

/**
 *
 * @author makaf
 */
public class accountList {
    public ArrayList<account> accountList = new ArrayList<>();
    public int count = 0;
    
    public void addAccount(account a){
        accountList.add(a);
        count++;
    }
    
    public void display(){
        for(int i=0; i<count;i++){
            accountList.get(i).Display();
            System.out.println("-------------------------------");
        }
    }
    
    public static void main(String[]args){
        accountList aList = new accountList();
        account a = new account();
        
        aList.addAccount(new account(45637,9009,"CHK",4000.00));
        aList.addAccount(new account(45637,9009,"SAV",4000.00));
        aList.addAccount(new account(45637,9009,"MMA",4000.00));
        aList.addAccount(new account(45637,9009,"SAV",4000.00));
        
        aList.display();
        
    }
    
    
}


