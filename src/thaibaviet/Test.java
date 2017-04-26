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
public class Test {
    public static void processTicket(Gate g, OneWayTicket t){
        g.enter(t);
        g.exit(t);
    }
    public static void processCard(Gate g, PrepaidCard c){
        g.enter(c);
        
        if(c.isValid() == true){
            int m = new Line().getFare(g.getDistance());
           if(c.deduct(m)==true){
               
               System.out.println("money deducted from your card: " + m );
           }
           else 
               System.out.println("money deduct fail!");
        }
        g.exit(c);
    }
    public static void main(String args[]){
        Date date = new Date();
        System.out.println("TICKET");
        System.out.println("***Ticket is not valid!***");
        OneWayTicket t1 = new OneWayTicket(21000, date);
        t1.setValid(false);
        Gate gate1 = new Gate("B", 0);
        processTicket(gate1, t1);
        
        
        System.out.println("***Money of Ticket is not enough!***");
        OneWayTicket t2 = new OneWayTicket(3000, date);
        Gate gate2 = new Gate("B", 5);
        processTicket(gate2, t2);
        
        
        System.out.println("***Money of Ticket is enough!***");
        OneWayTicket t3 = new OneWayTicket(21000, date);
        Gate gate3 = new Gate("B", 5);
        processTicket(gate3, t3);
        
        
        System.out.println("\n\nCARD:");
        System.out.println("***Money of the card is not valid!");
        PrepaidCard p1 = new PrepaidCard(3000, date);
        Gate gate4 = new Gate("B", 5);
        processCard(gate4, p1);
        
        System.out.println("***Money of the card is not enough!");
        PrepaidCard p2 = new PrepaidCard(10000, date);
        Gate gate5 = new Gate("A", 17);
        processCard(gate5, p2);
        
        System.out.println("***Money of the card is enough!");
        PrepaidCard p3 = new PrepaidCard(30000, date);
        Gate gate6 = new Gate("A", 17);
        processCard(gate6, p3);
        
    }
    
}
