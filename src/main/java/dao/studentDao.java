package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.student;

public class studentDao 
{
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
	EntityManager em=emf.createEntityManager();
	EntityTransaction et=em.getTransaction();
	public void save(student s)
	{
		et.begin();
		em.persist(s);
		et.commit();
	}
	public student fetch(String email)
	{
		List<student> list=em.createQuery("select x from student where email=?1").setParameter(1, email).getResultList();
		if(list.isEmpty())
		{
			return null;
		}else{
			return list.get(0);
		}
	} 
	public List<student> fetch()
	{
		List<student> list=em.createQuery("select x from student x").getResultList();
		return list;
		
	}
	public dto.student fetch(long mobile1) {
		// TODO Auto-generated method stub
		return null;
	}
	public void delete() {
		// TODO Auto-generated method stub
		
	}
}