/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tp1;

import java.util.List;

/**
 *
 * @author lemoine
 */
public class Service {

    public void affecterLicenceMachine(Machine m, Licence lic){
        m.getLicenceMachine().add(lic);
    }
    
    public void affecterLicenceLogiciel(Logiciel log, Licence lic){
        log.getListLicence().add(lic);
    }
    
    public void enleverLicenceMachine(Machine m, Licence lic){
        m.getLicenceMachine().remove(lic);
    }
    
    public void enleverLicenceLogiciel(Logiciel log, Licence lic){
        log.getListLicence().remove(lic);
    }
    
    public void associerSecretaireMachine(){
    
    }
}
