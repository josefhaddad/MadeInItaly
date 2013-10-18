package webstore.core;

import java.util.List;
import webstore.utils.AbstractEntity;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;


/**
 * A Product
 * @author 
 */
@Entity
public class Product extends AbstractEntity {
    
    private String name;
    private int quantity;
    private double price;
    
    public Product() {
    }
    
    public Product(String name, int quantity, double price) {
        this.name = name;
        this.quantity = quantity;
        this.price = price;
     
    }

    public Product(Long id, String name, int quantity, double price) {
        super(id);
        this.name = name;
        this.quantity = quantity;
        this.price = price;
       
    }

    public String getName() {
        return name;
    }

    public int getQuantity() {
        return quantity;
    }
    
    public double getPrice() {
        return price;
    }   
}