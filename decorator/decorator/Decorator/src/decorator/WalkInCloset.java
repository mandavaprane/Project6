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
public class WalkInCloset extends DecoratorHouse {
     HouseDetails house;
     public int walkincloset_no;
    public WalkInCloset(HouseDetails house)
    {
        this.house = house;
        house.cost();
    }
    public int cost()
    {   
        int cost;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of Closets: ");
        walkincloset_no = sc.nextInt();
        cost = walkincloset_no*20000;
        
        System.out.println("The Cost for "+walkincloset_no+ " closet House is $"+cost);
        
        return cost;
    }
    
    public int area(){
        int area = 106;
        int area_closet = walkincloset_no*area;
        System.out.println("The area of "+walkincloset_no+ " Closet house is "+area_closet+" Square ft");
        return area_closet;
    }
    
}
