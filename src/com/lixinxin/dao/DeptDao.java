package com.lixinxin.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lixinxin.model.Dept;
import com.lixinxin.utils.DBUtils;

public class DeptDao {
	public Dept selectByID(Integer id) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			Dept dept = (Dept) session.get(Dept.class, id);
			tx.commit();
			return dept;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return null;
	}
	public void  insert(Dept dept){
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			Serializable i = session.save(dept);
			System.out.println(i);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	public void  delete(Dept dept){
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			 session.delete(dept);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	public void  update(Dept dept){
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			session.update(dept);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}
