
package br.com.sampaiolyrio.suport;

import br.com.sampaiolyrio.model.dao.HibernateDAO;
import br.com.sampaiolyrio.model.dao.InterfaceDAO;
import br.com.sampaiolyrio.model.entities.Cidade;
import br.com.sampaiolyrio.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name="bbCidade")
@RequestScoped
public class BbCidade  implements Serializable {
    
    private static final long serialVersionUID = 1L;
    private List<Cidade> cidades;

    public List<Cidade> getCidades() {
        InterfaceDAO<Cidade> cidadeDAO = new HibernateDAO<Cidade>(Cidade.class, FacesContextUtil.getRequestSession());
        return cidadeDAO.getEntities();
    }
}
