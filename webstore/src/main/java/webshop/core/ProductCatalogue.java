package webshop.core;

import webshop.utils.AbstractDAO;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;

/**
 *
 * @author hajo
 */
@Named
@SessionScoped
public final class ProductCatalogue extends AbstractDAO<Product, Long>
        implements IProductCatalogue {
    
    private ProductCatalogue(String puName) {
        super(Product.class, puName);
    }

    // Factory method
    public static IProductCatalogue newInstance(String puName) {
        return new ProductCatalogue(puName);
    }

    @Override
    public List<Product> getByName(String name) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction();
        List<Product> found = em.createQuery("SELECT m FROM Product m WHERE m.name =" + name).getResultList();
        em.close();
        return found;

    }

    public Product getById(Long id) {
        EntityManager em = emf.createEntityManager();
        em.getTransaction();
        List<Product> found = em.createQuery("SELECT m FROM Product m WHERE m.id =" + id).getResultList();
        em.close();
        return found.get(0);
    }
}