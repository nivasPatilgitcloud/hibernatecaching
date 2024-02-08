package com.caching;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.caching.entity.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        Session session1 = factory.openSession();
        
       
        
//        Student st = new Student();
//        st.setName("vaiju Patil");
//        st.setEmail("vaijup@gmail.com");
//        st.setCountry("India");
//        st.setCity("Kolhapur, kagal, maharashtra");
//        st.setMobile_number("0987654321");
        
//        Transaction tx = session.beginTransaction();
//        session.save(st);     
        
        Student st = (Student) session1.get(Student.class, 1);
        System.out.println(st.getName());
        session1.close();
        
        Session session2 = factory.openSession();
        Student st1 = (Student) session2.get(Student.class, 1);
        System.out.println(st1.getCountry());
        session2.close();
        
        factory.close();
        System.out.println("Objects fetched");
    }
}
