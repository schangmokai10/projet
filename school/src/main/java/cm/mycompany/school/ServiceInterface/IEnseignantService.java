/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cm.mycompany.school.ServiceInterface;

import cm.mycompany.school.data.Enseignant;
import java.util.List;
import org.hibernate.service.spi.ServiceException;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author doumtsop
 */
@Transactional
public interface IEnseignantService {
    
   public Enseignant createEnseignant(Enseignant enseignant) throws ServiceException;
   public Enseignant updateEnseignant(Enseignant enseignant) throws ServiceException;
   public void deleteEnseignant(Enseignant enseignant) throws ServiceException;
   public Enseignant findEnseignantById(Long id) throws ServiceException;
   public List<Enseignant> findAllEnseignant() throws ServiceException;
}
