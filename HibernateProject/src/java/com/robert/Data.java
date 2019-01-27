package com.robert;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.hibernate.Session;

/**
 *
 * @author palmerfam
 */

@ManagedBean
@SessionScoped
public class Data {
    
    private User u;
    private HibernateUtil helper;
    private Session session;
    
    public void addUser(){
        u = new User("Robert");
        session = helper.getSessionFactory().openSession();
        session.beginTransaction();
        session.save(u);
        session.getTransaction().commit();
        session.close();
    }
    
}
