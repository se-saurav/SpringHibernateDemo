package com.mkyong.common;


import java.util.List;
import org.hibernate.Session;
import org.hibernate.Query;
import com.mkyong.persistence.HibernateUtil;

/**
 * Created by saurav on 12/26/14.
 */
public class HQLTest {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();


        String hql = "FROM Person E WHERE E.id > 1 ORDER BY E.name DESC";
        Query query = session.createQuery(hql);
        List<Person> results = query.list();

        for(Person p:results){
            System.out.println(p.getName());
        }

        session.getTransaction().commit();


    }
}
