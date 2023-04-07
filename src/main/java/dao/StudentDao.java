package dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import dto.StudentDto;

public class StudentDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("dev");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction= entityManager.getTransaction();
	
	public void insert(StudentDto dto)
	{
		entityTransaction.begin();
		entityManager.persist(dto);
		entityTransaction.commit();
	}

	public StudentDto fetch(int id) {
		entityTransaction.begin();
		StudentDto dto=entityManager.find(StudentDto.class, id);
		entityTransaction.commit();
		return dto;
	}
	
}
