package com.lixinxin.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;
import com.lixinxin.model.IC;
import com.lixinxin.utils.DBUtils;

public class ICDao {
	public IC selectByID(Integer id) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			IC card = (IC) session.get(IC.class, id);
			tx.commit();
			return card;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return null;
	}
}
