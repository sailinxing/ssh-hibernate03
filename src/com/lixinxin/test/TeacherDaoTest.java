package com.lixinxin.test;


import org.junit.Before;
import org.junit.Test;

import com.lixinxin.dao.TeacherDao;
import com.lixinxin.model.Teacher;

public class TeacherDaoTest {
	private TeacherDao tdao;
	@Before
	public void init(){
		tdao=new TeacherDao();
	}
	@Test
	public void testSelectById() {
		Teacher teacher = tdao.selectById(5);
		System.out.println(teacher);
	}

}
