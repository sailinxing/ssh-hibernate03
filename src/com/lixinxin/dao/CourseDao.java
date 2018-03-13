package com.lixinxin.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lixinxin.model.Course;
import com.lixinxin.utils.DBUtils;

public class CourseDao {
	public Course selectById(Integer id) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			Course course = (Course) session.get(Course.class, id);			
			tx.commit();
			return course;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return null;
	}
	public void insert(Course course) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(course);			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	public void delete(Course course) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			session.delete(course);			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	public void update(Course course) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			session.update(course);			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}
