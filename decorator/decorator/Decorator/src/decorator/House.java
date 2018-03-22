package decorator;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author Praneetha
 */
public class House {
    public static void main(String args[])
    {   
        HouseDetails house = new BasicHouse();
         house = new Basic(house);
        HouseDetails house1 = new BasicHouse();
         house1 = new BedRoom(house1);
         HouseDetails house2 = new BasicHouse();
        house2 = new BathRoom(house2);
        HouseDetails house3 = new BasicHouse();
        house3 = new LivingRoom(house3);
        HouseDetails house4 = new BasicHouse();
        house4 = new FamilyRoom(house4);
        HouseDetails house5 = new BasicHouse();
        house5 = new Kitchen(house5);
        HouseDetails house6 = new BasicHouse();
        house6 = new WalkInCloset(house6);
        
        int bed_room = house1.cost();
        int a_bd = house1.area();
        int bath_room =house2.cost();
        int a_br = house2.area();
        int Living_room =house3.cost();
        int a_lr = house3.area();
        int family_room = house4.cost();
        int a_fr = house4.area();
        int kitchen_room = house5.cost();
        int a_kr = house5.area();
        int walkincloset = house6.cost();
        int a_wc = house6.area();
        int total = bed_room+bath_room+Living_room+family_room+kitchen_room+walkincloset;
        int a_total=a_bd+a_lr+a_br+a_fr+a_wc+a_kr;
        System.out.println("\n\nTotal cost for house is: $"+total);
        System.out.println("Total area of the house is: "+a_total+ " Square ft");
    }
    
}
