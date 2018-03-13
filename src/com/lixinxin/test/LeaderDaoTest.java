package com.lixinxin.test;

import org.junit.Before;
import org.junit.Test;

import com.lixinxin.dao.LeaderDao;
import com.lixinxin.model.Leader;

public class LeaderDaoTest {
	private LeaderDao ldao;
	@Before
	public void init(){
		ldao=new LeaderDao();
	}
	@Test
	public void testSelectById() {
		Leader leader = ldao.selectById(1);
		System.out.println(leader);
		System.out.println(leader.getStuffs());
	}

}
