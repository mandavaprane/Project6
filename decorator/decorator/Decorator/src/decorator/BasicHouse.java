/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

import java.util.Scanner;

/**
 *
 * @author Praneetha
 */
public class BasicHouse extends HouseDetails {
    
    public BasicHouse(){}
   
    public int cost()
    {
        //System.out.println("The house cost with one living room is ");
       return 5000;
        
    }
    public int area()
    {
        return 256;
    }
    
}
