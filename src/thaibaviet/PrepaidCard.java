/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thaibaviet;

import java.util.Date;

/**
 *
 * @author VIETTO
 */
public class PrepaidCard extends Ticket implements Icard{
    public PrepaidCard(int v, Date d){
        super(v, d);
    }
    public void add(int m){
        value += m;
        System.out.println("money added to card");
    }
    public boolean deduct(int m){
        if(value < m){
            
            return false;
        }
        else if(value >= m) {
            value -= m;
            return true;
        }
        return false;
    }
    public boolean isValid(){
       if(value < 9000){
           return false;
       }
       return true;
    }
}
