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
public class Line {
    Gate A,B,C,D;
    public Line(){}
    
    public int getFare(int distance){
        if(distance <= 6) return 9000;
        else if (distance > 6 && distance % 2 == 0){
            return (9000 + 2000*(distance - 6) / 2);
        }
        else if (distance >6 && distance %2 != 0){
            return (9000 + 2000*(distance - 5) / 2);
        }
        return 0;
    }
}
