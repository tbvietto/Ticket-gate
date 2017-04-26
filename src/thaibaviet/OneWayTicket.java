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
public class OneWayTicket extends Ticket{
    private boolean valid = true;
    public OneWayTicket(int v, Date d){
        super(v,d);
    }
    public void setOrigin(Gate g){
        this.gate = g;
    }
    public void setValid(boolean b){
        this.valid = b;
    }
    public boolean isValid(){
        return valid;
    }
}
