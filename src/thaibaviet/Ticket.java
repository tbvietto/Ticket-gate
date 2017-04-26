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
abstract class Ticket {
    static Date issuedDate;
    static int value;
    Gate gate;
    public Ticket(int v, Date d){
        this.issuedDate = d;
        this.value = v;
    }
    public int getValue(){
        return this.value;
    }
    public void setOrigin(Gate g){
     
    }
    public Gate getOrigin(){
        return this.gate;
    }
    public void adjustValue(int v){
       
    }
  public boolean isValid(){
      return false;
      
  }
  
}
