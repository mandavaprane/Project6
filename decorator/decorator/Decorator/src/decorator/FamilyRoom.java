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
public class FamilyRoom extends DecoratorHouse{
    HouseDetails house;
    public int familyroom_no;
    public FamilyRoom(HouseDetails house)
    {
        this.house = house;
       house.cost();
    }
    public int cost()
    {   
        int cost;
       
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the number of family rooms: ");
        familyroom_no = sc.nextInt();
        cost = familyroom_no*10000;
        
        System.out.println("The Cost for"+familyroom_no+ "bed room House is $"+cost);
       
        return cost;
    }
    public int area(){
         int area=311;
         int area_family = familyroom_no*area;
          System.out.println("The area of "+familyroom_no+" family room house is "+area_family+" Square ft");
          return area_family;
    }
    
}
