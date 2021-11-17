package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.Employee.Employee;
import Business.Role.CustomerRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.WorkQueue;
import java.util.ArrayList;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        
        
        Employee employee = system.getEmployeeDirectory().createEmployee("RRH");
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        Customer  customer = new Customer("customer", "customer", employee, new CustomerRole());
        system.addCustomer(customer);
        
        
        return system;
    }
    
}
