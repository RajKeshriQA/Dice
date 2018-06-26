/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dice;
import java.util.*;
/**
 *
 * @author rajkeshri
 */
public class Dice {

    public static int rollDice(int noofdiceface){
        int two[]={0,1};
        int four[]={1,2,3,4};
        int six[]={1,2,3,4,5,6};
        double n=Math.random();
        int result=0;
        double m=0.0;
        switch(noofdiceface){
            case 2: m=n*2; 
            result=two[(int)Math.floor(m)];
            break;
            case 4:
              m=n*4; 
            result=four[(int)Math.floor(m)];
            break; 
            case 6:
                m=n*6; 
            result=six[(int)Math.floor(m)];
            break;
        }
      return result;  
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the no of face of dice for rolling");
        int k=sc.nextInt();
        int n=rollDice(k);
        System.out.print(n);
    }
    
}
