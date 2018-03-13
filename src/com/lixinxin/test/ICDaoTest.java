package com.lixinxin.test;


import org.junit.Before;
import org.junit.Test;

import com.lixinxin.dao.ICDao;
import com.lixinxin.model.IC;

public class ICDaoTest {
	private ICDao idao;
	@Before
	public void init(){
		idao=new ICDao();
	}
	@Test
	public void testSelectById() {
		IC ic = idao.selectByID(1);
		System.out.println(ic);
		System.out.println(ic.getStuff1());
	}

}
