/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thaibaviet;

/**
 *
 * @author VIETTO
 */
public class Gate{
    private String name;
    private int distance;
    public Gate(String n, int d){
        this.name = n;
        this.distance = d;
    }
    public void enter(Ticket t){
        System.out.println("##PROCESS ENTER##");
        if(t.isValid() == false){
            System.out.println("the ticket is not valid!");
            close();
        }
        else {
            System.out.println("the ticket is valid");
            open();
            
            t.setOrigin(new Gate(name,distance)); 
        }
    }
    public void exit(Ticket t){
        
        if(t.isValid() == true){
            System.out.println("##EXIT PROCESS!##");
            int d = new Line().getFare(distance);
            if(t.getValue() < d){
                System.out.println("value of ticket is not enough!");
                close();
            }
            else {
                open();
            }
        }
        
    }
    public void open(){
        System.out.println("Open the door");
    } 
    public void close(){
        System.out.println("Close the door");
    }
    public int getDistance(){
        return distance;
    }
}
