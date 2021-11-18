/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;


import Business.Customer.Customer;
import Business.Customer.CustomerDirectory;
import Business.DeliveryMan.DeliveryMan;
import Business.DeliveryMan.DeliveryManDirectory;
import Business.Restaurant.Restaurant;
import Business.Restaurant.RestaurantDirectory;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.WorkQueue.WorkRequest;
import java.util.ArrayList;

/**
 *
 * @author MyPC1
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    private RestaurantDirectory restaurantDirectory ;
    private CustomerDirectory customerDirectory ;
    private DeliveryManDirectory deliveryManDirectory ;

    

    public EcoSystem(RestaurantDirectory restaurantDirectory, CustomerDirectory customerDirectory, DeliveryManDirectory deliveryManDirectory) {

        this.restaurantDirectory = restaurantDirectory;
        this.customerDirectory = customerDirectory;
        this.deliveryManDirectory = deliveryManDirectory;
    }
    
    public static EcoSystem getInstance(){
        if(business==null){
            business=new EcoSystem();
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        return roleList;
    }
    private EcoSystem(){
        super(null);
        this.restaurantDirectory = new RestaurantDirectory();
        this.customerDirectory = new CustomerDirectory();
        this.deliveryManDirectory = new DeliveryManDirectory();
       // networkList=new ArrayList<Network>();
    }

    
    public boolean checkIfUserIsUnique(String userName){
       //
       return false;
    }
    public RestaurantDirectory getRestaurantDirectory() {
        return restaurantDirectory;
    }

    public void setRestaurantDirectory(RestaurantDirectory restaurantDirectory) {
        this.restaurantDirectory = restaurantDirectory;
    }

    public CustomerDirectory getCustomerDirectory() {
        return customerDirectory;
    }

    public void setCustomerDirectory(CustomerDirectory customerDirectory) {
        this.customerDirectory = customerDirectory;
    }

    public DeliveryManDirectory getDeliveryManDirectory() {
        return deliveryManDirectory;
    }

    public void setDeliveryManDirectory(DeliveryManDirectory deliveryManDirectory) {
        this.deliveryManDirectory = deliveryManDirectory;
    }

    public boolean  addCustomer(Customer customer) {
        if(customer==null)  return false;
        this.customerDirectory.getCustomer().add(customer);
        return true;
    }

    public void deleteCustomer(Customer customer) {
        this.customerDirectory.getCustomer().remove(customer);
    }

    public boolean addRestaurant(Restaurant restaurant) {
         if(restaurant==null)  return false;
        this.restaurantDirectory.getRestaurants().add(restaurant);
        return true;
    }
    
     public void deleteRestaurant(Restaurant restaurant) {
        this.restaurantDirectory.getRestaurants().remove(restaurant);
    }

    public boolean addDeliveryMan(DeliveryMan dm) {
        if(dm==null)  return false;
        this.deliveryManDirectory.getDeliveryMans().add(dm);
        return true;
    }
    
     public void DeleteDeliveryMan(DeliveryMan dm) {
        this.deliveryManDirectory.getDeliveryMans().remove(dm);
    }
     public void DeleteWR(WorkRequest request){
         for(Customer c:this.getCustomerDirectory().getCustomer()){
             ArrayList<WorkRequest> workRequestList = c.getWorkQueue().getWorkRequestList();
             if(workRequestList.contains(request)){
                 workRequestList.remove(request);
             }
         }
     }
}
