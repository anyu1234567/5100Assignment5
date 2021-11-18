/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

import Business.Employee.Employee;
import Business.Role.Role;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class Restaurant extends UserAccount{
    public ArrayList<Dish> menu = new ArrayList<Dish>();
    public Restaurant(String username, String password, Employee employee, Role role) {
        super();
        super.setUsername(username);
        super.setPassword(password);
        super.setEmployee(employee);
        super.setRole(role);
    }

    @Override
    public String toString() {
        return  super.getUsername();
    }
    public void addDish(Dish dish){
        if(dish!=null) this.menu.add(dish);
    }
    public void deleteDish(Dish dish){
          if(dish!=null) this.menu.remove(dish);
    }

    public ArrayList<Dish> getMenu() {
        return menu;
    }

    public void setMenu(ArrayList<Dish> menu) {
        this.menu = menu;
    }
    
}
