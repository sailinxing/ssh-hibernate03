package com.lixinxin.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lixinxin.model.Student;
import com.lixinxin.utils.DBUtils;

public class StudentDao {
	public Student selectById(Integer id) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			Student student = (Student) session.load(Student.class, id);			
//			System.out.println(student.getTeachers());
			tx.commit();
			return student;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return null;
	}
	public void insert(Student student) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(student);			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}
