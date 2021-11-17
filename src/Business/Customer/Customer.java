/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Customer;
import Business.Employee.Employee;
import Business.Role.Role;
import Business.UserAccount.*;
import Business.WorkQueue.WorkQueue;

/**
 *
 * @author harold
 */
public class Customer extends UserAccount{


    public Customer(String username, String password, Employee employee, Role role) {
        super();
        super.setUsername(username);
        super.setPassword(password);
        super.setEmployee(employee);
        super.setRole(role);
                
    }

    @Override
    public String toString() {
        return super.getUsername();
    }
    
  
}
