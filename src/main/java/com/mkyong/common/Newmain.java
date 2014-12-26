package com.mkyong.common;



import org.hibernate.Session;
import com.mkyong.persistence.HibernateUtil;
/**
 * Created by saurav on 12/26/14.
 */
public class Newmain {
    public static  void main(String args[]){
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Address add1=new Address();
        add1.setId(4);
        add1.setCity("noida");
        add1.setState("up");
        Person person=new Person();
        person.setName("raj");
        person.setAddress(add1);

        Person person2=new Person();
        person2.setName("jar");
        person2.setAddress(add1);

        session.save(person);
        session.save(person2);
        session.getTransaction().commit();
    }
}
