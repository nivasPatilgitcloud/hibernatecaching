package com.caching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.caching.xml.Employee;

public class XMLMain {

	public static void main(String[] args) {
		
        Configuration cfg = new Configuration();
        cfg.configure();
        SessionFactory factory = cfg.buildSessionFactory();
        
		// below data is persisted using XML mapping
        Employee emp = new Employee();  // 1,"Nivas Patil","IT dept",1001
        emp.setEmp_id(22);
        emp.setName("Nivas Patil");
        emp.setDepartmentname("IT dept");       
        emp.setEmployeecode("1001");
        
        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        
        session.save(emp);
        tx.commit();
        session.close();
        factory.close();
        

	}

}
