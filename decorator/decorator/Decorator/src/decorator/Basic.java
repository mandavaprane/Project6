/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Praneetha
 */
public class Basic extends DecoratorHouse{
    
    HouseDetails house;
    public Basic(HouseDetails house)
    {
        this.house = house;
        house.cost();
        house.area();
    }
  
    public int cost()
    {   int cost=5000;
        System.out.println("The house cost with one living room is ");
        return cost;
    }
    
    /**
     *
     * @return
     */
    
    public int area()
    {
        int area=256;
        System.out.println("The area of one living room is ");
        return area;
    }
    
}
