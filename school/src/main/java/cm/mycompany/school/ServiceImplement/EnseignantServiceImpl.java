/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.school.ServiceImplement;

import cm.mycompany.school.DaoInterface.IEnseignantDao;
import cm.mycompany.school.ServiceInterface.IEnseignantService;
import cm.mycompany.school.data.Enseignant;
import com.douwe.generic.dao.DataAccessException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author doumtsop
 */
@Transactional
public class EnseignantServiceImpl implements IEnseignantService{
    IEnseignantDao iEnseignantDao;

    public IEnseignantDao getiEnseignantDao() {
        return iEnseignantDao;
    }

    public void setiEnseignantDao(IEnseignantDao iEnseignantDao) {
        this.iEnseignantDao = iEnseignantDao;
    }

    public Enseignant createEnseignant(Enseignant enseignant) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEnseignantDao.create(enseignant);
        } catch (DataAccessException ex) {
            Logger.getLogger(EnseignantServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur lors de la creation de l'enseignant");
        }
    }

    public Enseignant updateEnseignant(Enseignant enseignant) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEnseignantDao.update(enseignant);
        } catch (DataAccessException ex) {
            Logger.getLogger(EnseignantServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
           throw new ServiceException("erreur lors de la mise a jour de l'enseignant");
        }
    }

    public void deleteEnseignant(Enseignant enseignant) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            iEnseignantDao.delete(enseignant);
        } catch (DataAccessException ex) {
            Logger.getLogger(EnseignantServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Enseignant findEnseignantById(Long id) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEnseignantDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(EnseignantServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur lors de la recherche par id");
        }
    }

    public List<Enseignant> findAllEnseignant() throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iEnseignantDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(EnseignantServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur lors du findAll");
        }
    }
    
    
}
