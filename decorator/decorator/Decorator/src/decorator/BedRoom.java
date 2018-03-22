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
public class BedRoom extends DecoratorHouse{
    HouseDetails house2;
    public  int bed_no;
    public BedRoom(HouseDetails house2)
    {
        this.house2 = house2;
        house2.cost();
       
    }

    
    /**
     *
     */
    public int cost()
    {  
        int cost;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of Bed rooms: ");
        bed_no = sc.nextInt();
        cost = bed_no*5000;
         
        System.out.println("The Cost for "+bed_no+ " bed room House is $"+cost);
        
        
        return cost;
    }
    public int area()
    {
        int area =231;
        int area_bed = bed_no*area;
        System.out.println("The area of "+bed_no+ " Bed rooms is "+area_bed+" Square ft");
        return area_bed;
    }
    
}
