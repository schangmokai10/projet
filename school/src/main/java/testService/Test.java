/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testService;

import cm.mycompany.school.ServiceInterface.IEnseignantService;
import cm.mycompany.school.data.Enseignant;
import org.hibernate.service.spi.ServiceException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author doumtsop
 */
public class Test {
    public static void main(String[] args) throws ServiceException {
        System.out.println( "Hello World!" );
        
        ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath:Spring-Config.xml");    
       // IAdministrateurService iAdministrateurService =  ctx.getBean("IAdministrateurService", IAdministrateurService.class);
        IEnseignantService iEnseignantService = ctx.getBean("IEnseignantService", IEnseignantService.class);
        Enseignant enseignant = new Enseignant();
        enseignant.setNom("Djamdoudou");
        enseignant.setPrenom("Fadimatou");
        enseignant.setMatricule("12XUUUZ");
        iEnseignantService.createEnseignant(enseignant);

        
    }
}
