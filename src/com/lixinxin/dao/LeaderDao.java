package com.lixinxin.dao;

import java.io.Serializable;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lixinxin.model.Leader;
import com.lixinxin.utils.DBUtils;

public class LeaderDao implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	public Leader selectById(Integer id) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			Leader leader = (Leader) session.get(Leader.class, id);			
			tx.commit();
			return leader;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return null;
	}
}
