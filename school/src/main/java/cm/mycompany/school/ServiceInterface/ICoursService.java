/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.school.ServiceInterface;

import cm.mycompany.school.data.Cours;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author doumtsop
 */
@Transactional
public interface ICoursService {
   public Cours createCours(Cours cours) throws ServiceException;
   public Cours updateEnseignant(Cours cours) throws ServiceException;
   public void deleteCours(Cours cours) throws ServiceException;
   public Cours findCoursById(Long id) throws ServiceException;
   public List<Cours> findAllCours() throws ServiceException;
}
