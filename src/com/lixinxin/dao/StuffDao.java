package com.lixinxin.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.lixinxin.model.Stuff;
import com.lixinxin.utils.DBUtils;

public class StuffDao {
	public Stuff selectByID(Integer id) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			Stuff stuff = (Stuff) session.load(Stuff.class, id);
//			System.out.println(stuff);
			tx.commit();
			return stuff;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return null;
	}
	public void insert(Stuff stuff) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			session.save(stuff);			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	public void update(Stuff stuff) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			session.update(stuff);			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
	public void delete(Stuff stuff) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			session.delete(stuff);			
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
	}
}
