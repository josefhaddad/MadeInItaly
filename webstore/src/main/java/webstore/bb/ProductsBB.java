
package webstore.bb;

import webstore.core.Product;
import java.io.Serializable;
import java.util.List;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import webstore.core.JPAStore;

/**
 * Backing Bean for Product Page
 * 
 * @author Jonas Ha
 */
@Named("products")
@RequestScoped 
public class ProductsBB implements Serializable{


    @Inject
    private JPAStore jpa;
    
    public List<Product> getAll(){
        return jpa.getProductCatalogue().getAll();
    }
    public String navigate(String target) {
        return target;
    }
}
