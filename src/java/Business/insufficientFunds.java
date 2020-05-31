/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author makaf
 */
public class insufficientFunds extends Exception {
    private final String msg = "Sorry you have insuficient funds to complete this transaction";
    
    @Override
    public String toString(){
        return msg;
    }
    
    public void Display(){
        System.out.println(msg);
    }
}


