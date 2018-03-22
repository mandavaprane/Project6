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
public class Kitchen extends DecoratorHouse{
    HouseDetails house;
    public int kitchen_no;
    public Kitchen(HouseDetails house)
    {
        this.house = house;
        house.cost();
    }
    public int cost()
    {   
        int cost;
        
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of kitchen rooms: ");
        kitchen_no = sc.nextInt();
        cost = kitchen_no*20000;
        
        System.out.println("The Cost for "+kitchen_no+ " Kitchen House is $"+cost);
        
        return cost;
    }
    
    public int area()
    {
        int area = 193;
        int area_kitchen = kitchen_no*area;
        System.out.println("The area of "+kitchen_no+ " kitchen house is "+area_kitchen+" Square ft");
        return area_kitchen;
    }
    
    
}
