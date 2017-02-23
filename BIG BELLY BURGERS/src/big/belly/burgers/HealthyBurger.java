/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package big.belly.burgers;

/**
 *
 * @author DianaAlessa
 */
public class HealthyBurger extends BasicHamburger {
    
    public HealthyBurger (String meat, double price){
        super("Brown Rye", meat, price);
        limAdditions = 6;
    }
        
        @Override
        public void getTotal(){
            System.out.println("This is a Healthy Burger");
            super.getTotal();
        }
    
}
