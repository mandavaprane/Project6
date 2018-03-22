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
public class BathRoom extends DecoratorHouse{
     HouseDetails house2;
     public int bathroom_no; 
     
    public BathRoom(HouseDetails house2)
    {
        this.house2 = house2;
        house2.cost();
    }
    public int cost()
    {   
        int cost;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of Bath rooms: ");
        bathroom_no = sc.nextInt();
        cost = bathroom_no*10000;
        
        System.out.println("The Cost for "+bathroom_no+ " bath room House is $"+cost);
        
        return cost;
        //return area_bath;
    }

    @Override
    public int area() {
        int area = 115;
       int area_bath= bathroom_no*area;
       System.out.println("The area of "+bathroom_no+ " Bathroom House is "+area_bath+" Square ft");
       return area_bath; 
    }
    
    
}
