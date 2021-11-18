/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Restaurant;

/**
 *
 * @author An
 */
public class Dish {
    private String dishName;
    private Double price;
    private Double size;

    public Dish(String dishName, Double price, Double size) {
        this.dishName = dishName;
        this.price = price;
        this.size = size;
    }

    public String getDishName() {
        return dishName;
    }

    public void setDishName(String dishName) {
        this.dishName = dishName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSize() {
        return size;
    }

    public void setSize(Double size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return this.dishName;
    }
    
    
}
