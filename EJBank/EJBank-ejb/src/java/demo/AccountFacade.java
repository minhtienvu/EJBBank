/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package demo;

import java.math.BigInteger;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

/**
 *
 * @author THHN
 */
@Stateless
public class AccountFacade extends AbstractFacade<Account> implements AccountFacadeLocal {

    @PersistenceContext(unitName = "EJBank-ejbPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public AccountFacade() {
        super(Account.class);
    }
    
    @Override
    public Account CheckAcount(int id){
        Query query = em.createNamedQuery("Account.findById");
        query.setParameter("id", id);
        try {
            return (Account)query.getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }
    
    @Override
    public String Payment(int id, double total){
        if(CheckAcount(id) != null){
            Account acc = CheckAcount(id);
            int pay = (int)(acc.getBalance().intValue() - total);
            
            acc.setBalance(BigInteger.valueOf(pay));
            return "Customer" + acc.getName()+"pay successful: Your balance now is: "
                    + acc.getBalance().toString();
        }
        return "payment fail";
    }
    
}
