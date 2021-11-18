/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DeliveryMan;

import Business.Restaurant.Restaurant;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class DeliveryManDirectory {
    private ArrayList<DeliveryMan> deliveryMans;

    public DeliveryManDirectory() {
        this.deliveryMans = new ArrayList<DeliveryMan>();
    }

    public ArrayList<DeliveryMan> getDeliveryMans() {
        return deliveryMans;
    }

    public void setDeliveryMans(ArrayList<DeliveryMan> deliveryMans) {
        this.deliveryMans = deliveryMans;
    }


}
