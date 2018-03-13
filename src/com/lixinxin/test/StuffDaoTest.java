package com.lixinxin.test;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.lixinxin.dao.StuffDao;
import com.lixinxin.model.Dept;
import com.lixinxin.model.Leader;
import com.lixinxin.model.Stuff;

public class StuffDaoTest {
	private StuffDao sdao;
	@Before
	public void init(){
		sdao=new StuffDao();
	}
	@Test
	public void testSelectByID() {
		Stuff stuff = sdao.selectByID(9);
		
		System.out.println(stuff.getDept());
//		System.out.println(stuff.getCard1());
//		System.out.println(stuff.getLeaders());
	}
	@Test
	public void testInsert(){
		Stuff stuff=new Stuff();
		stuff.setName("’‘’‘");
		stuff.setAge(25);
//		Dept dept=new Dept();
//		dept.setName("–°√€");
//		stuff.setDept(dept);
//		sdao.insert(stuff);
		Leader leader1=new Leader();
		leader1.setName("’‘◊È≥§");
		Leader leader2=new Leader();
		leader2.setName("«Æ∞‡≥§");
		Set<Leader> set=new HashSet<>();
		set.add(leader1);
		set.add(leader2);
		stuff.setLeaders(set);
		sdao.insert(stuff);
	}
	@Test
	public void testUpdate(){
		Stuff stuff = sdao.selectByID(9);
		stuff.setName("¿ˆ¿ˆ");
		Dept dept=new Dept();
		dept.setName("±£Ω‡");
		stuff.setDept(dept);
		sdao.update(stuff);
	}
	@Test
	public void testDelete(){
		Stuff stuff=new Stuff();
		stuff.setId(9);
		sdao.delete(stuff);
	}

}
