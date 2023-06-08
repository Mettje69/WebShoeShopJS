

package session;

import entity.Cover;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


@Stateless
public class CoverFacade extends AbstractFacade<Cover> {

    @PersistenceContext(unitName = "WebShoeShopJS")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CoverFacade() {
        super(Cover.class);
    }

}
