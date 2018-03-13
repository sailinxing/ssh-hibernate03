package com.lixinxin.dao;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.lixinxin.model.Teacher;
import com.lixinxin.utils.DBUtils;

public class TeacherDao {
	public Teacher selectById(Integer id) {
		Session session = DBUtils.findSession();
		Transaction tx = session.beginTransaction();
		try {
			Teacher teacher = (Teacher) session.get(Teacher.class, id);			
			System.out.println(teacher.getStudents());
			tx.commit();
			return teacher;
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}
		return null;
	}
}
