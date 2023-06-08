

package session;

import entity.Book;
import entity.History;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class BookFacade extends AbstractFacade<Book> {

    @PersistenceContext(unitName = "WebShoeShopJS")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public BookFacade() {
        super(Book.class);
    }

    

}
