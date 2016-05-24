/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testDao;


import cm.mycompany.school.DaoImplement.EnseignantDaoImpl;
import cm.mycompany.school.DaoInterface.IEnseignantDao;
import cm.mycompany.school.data.Enseignant;
import com.douwe.generic.dao.DataAccessException;
import com.douwe.generic.dao.impl.GenericDao;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author doumtsop
 */
public class Test {
    public static void main(String[] args) throws DataAccessException {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("schoolPU");
        EntityManager em = emf.createEntityManager();
        IEnseignantDao iEnseignantDao = new EnseignantDaoImpl();
        ((GenericDao) iEnseignantDao).setManager(em);
        System.out.println("hello");
        
        EntityTransaction tx = em.getTransaction();
        
        tx.begin();
        
        Enseignant enseignant = new Enseignant();
        enseignant.setNom("mokai");
        enseignant.setPrenom("zozo");
        enseignant.setMatricule("12X6757S");

        iEnseignantDao.create(enseignant);
        tx.commit();
            
       
    }
}
