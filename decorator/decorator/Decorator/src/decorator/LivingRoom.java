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
public class LivingRoom extends DecoratorHouse {
     HouseDetails house;
     public int livingroom_no;
    public LivingRoom(HouseDetails house)
    {
        this.house = house;
        house.cost();
    }
    public int cost()
    {   
        int cost;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of living rooms: ");
        livingroom_no = sc.nextInt();
        cost = livingroom_no*5000;
        
        System.out.println("The Cost for "+livingroom_no+ " bed room House is $"+cost);
        
        return cost;
    }
    
    public int area(){
       int area = 256;
       int area_living = livingroom_no*area;
       System.out.println("The area of "+livingroom_no+ " living room House is "+area_living+" Square ft");
        
       return area_living;
    }
    
}
