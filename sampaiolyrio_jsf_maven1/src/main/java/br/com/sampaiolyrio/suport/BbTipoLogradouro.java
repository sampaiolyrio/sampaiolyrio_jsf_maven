/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.sampaiolyrio.suport;

import br.com.sampaiolyrio.model.dao.HibernateDAO;
import br.com.sampaiolyrio.model.dao.InterfaceDAO;
import br.com.sampaiolyrio.model.entities.TipoLogradouro;
import br.com.sampaiolyrio.util.FacesContextUtil;
import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.hibernate.Session;

@ManagedBean(name="bbTipoLogradouro")
@RequestScoped
public class BbTipoLogradouro  implements Serializable {
    
    private static final long serialVersionUID = 1L;

    public List<TipoLogradouro> getTipoLogradouros() {
        Session session = FacesContextUtil.getRequestSession();
        InterfaceDAO<TipoLogradouro> tipoLogradouroDAO = new HibernateDAO<TipoLogradouro>(TipoLogradouro.class, session);
        return tipoLogradouroDAO.getEntities();
    }
}