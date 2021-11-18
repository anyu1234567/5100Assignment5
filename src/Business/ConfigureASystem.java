package Business;

import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.Employee.Employee;
import Business.Restaurant.Restaurant;
import Business.Role.AdminRole;
import Business.Role.CustomerRole;
import Business.Role.DeliverManRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.CustomerWork;
import Business.WorkQueue.WorkQueue;
import Business.WorkQueue.WorkRequest;
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
        //add useraccount;
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("admin", "admin", employee, new SystemAdminRole());
        Customer  customer = new Customer("customer", "customer", employee, new CustomerRole());
        system.addCustomer(customer);
        //add restaurant
        Restaurant restaurant = new Restaurant("rest", "rest", employee, new AdminRole());
        system.addRestaurant(restaurant);
        //add deliverlman
        DeliveryMan deliveryMan = new DeliveryMan("dm", "dm", employee, new DeliverManRole());
        system.addDeliveryMan(deliveryMan);
        //add to ua
        UserAccount createUserAccount = system.getUserAccountDirectory().createUserAccount(customer);
        UserAccount createUserAccount1 = system.getUserAccountDirectory().createUserAccount(restaurant);
        UserAccount createUserAccount2 = system.getUserAccountDirectory().createUserAccount(deliveryMan);
        
        //add workqueue
        WorkRequest wr = new CustomerWork();
        wr.setMessage("test message");
        wr.setReceiver(customer);
        wr.setSender(deliveryMan);
        wr.setStatus("complete");
        customer.getWorkQueue().getWorkRequestList().add(wr);
        
        return system;
    }
    
}
