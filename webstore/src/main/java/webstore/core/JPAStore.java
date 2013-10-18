package webstore.core;

import java.io.Serializable;

/**
 *
 * Shop is a container for other containers NOTE: Uses Java 1.7
 *
 * @author hajo
 */

public class JPAStore implements IStore, Serializable {

    private String persistenceUnitName = "store";
    private IProductCatalogue productCatalogue;
    private IReservationRegistry reservationRegistry;

    

    public JPAStore() {
            productCatalogue = ProductCatalogue.newInstance(persistenceUnitName);   
            reservationRegistry = ReservationRegistry.newInstance(persistenceUnitName);   
    
    }

    @Override
    public IProductCatalogue getProductCatalogue() {
        return productCatalogue;
    }
    
    @Override
    public IReservationRegistry getReservationRegistry() {
        return reservationRegistry;
    }
}
