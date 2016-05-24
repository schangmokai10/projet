/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.school.ServiceImplement;

import cm.mycompany.school.DaoInterface.ICoursDao;
import cm.mycompany.school.ServiceInterface.ICoursService;
import cm.mycompany.school.data.Cours;
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
public class CoursServiceImpl implements ICoursService{
    ICoursDao iCoursDao;

    public ICoursDao getiCoursDao() {
        return iCoursDao;
    }

    public void setiCoursDao(ICoursDao iCoursDao) {
        this.iCoursDao = iCoursDao;
    }

    public Cours createCours(Cours cours) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iCoursDao.create(cours);
        } catch (DataAccessException ex) {
            Logger.getLogger(CoursServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur lors de la creation du cours");
        }
    }

    public Cours updateEnseignant(Cours cours) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iCoursDao.update(cours);
        } catch (DataAccessException ex) {
            Logger.getLogger(CoursServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur lors de la creation de mise a jour du cours");
        }
    }

    public void deleteCours(Cours cours) throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            iCoursDao.delete(cours);
        } catch (DataAccessException ex) {
            Logger.getLogger(CoursServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur lors de la supression du cours");
        }
    }

    public Cours findCoursById(Long id) throws ServiceException {
        try {
            //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iCoursDao.findById(id);
        } catch (DataAccessException ex) {
            Logger.getLogger(CoursServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur lors de la recherche par id du cours");
        }
    }

    public List<Cours> findAllCours() throws ServiceException {
        try {
            // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            return iCoursDao.findAll();
        } catch (DataAccessException ex) {
            Logger.getLogger(CoursServiceImpl.class.getName()).log(Level.SEVERE, null, ex);
            throw new ServiceException("erreur lors de la findAll");
        }
    }
    
    
}
