/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package big.belly.burgers;

import java.util.ArrayList;

/**
 *
 * @author DianaAlessa
 */
public class BasicHamburger {
    
    private String breadroll;
    private String meat;
    private double price;
    private ArrayList <Ingredient> additions = new ArrayList <Ingredient>();
    protected int limAdditions;
    private String type;
    
    
    public BasicHamburger(String breadroll, String meat, double price) {
        this.breadroll = breadroll;
        this.meat = meat;
        this.price = price;
        this.limAdditions = 4;
        this.type = "Basic Burger";
    }
    
    public boolean setAddition (Ingredient addition){
        if (this.additions.size() < this.limAdditions){
            return this.additions.add(addition);
        } else {
            System.out.println("Limit exceded");
            return false;
        }
    }
    
    public boolean setAddition (String name, double price){
        if (this.additions.size() < this.limAdditions){
            return this.additions.add(new Ingredient (name, price));
        } else {
            System.out.println("Limit exceded");
            return false;
        }
    }
    
    public void getTotal(){
        double total = 0;
            System.out.println("This is a " + this.type +", with" + this.meat +"meat in " +this.breadroll+"bread. With a base price of " +this.price);
        total += this.price;
            for (Ingredient tempIngredient : this.additions){
                System.out.println("plus " +tempIngredient.getName() + " at " +tempIngredient.getPrice());
            }
    }

    
}
