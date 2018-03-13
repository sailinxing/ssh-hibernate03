package com.lixinxin.test;

import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.lixinxin.dao.DeptDao;
import com.lixinxin.model.Dept;
import com.lixinxin.model.Stuff;

public class DeptDaoTest {
	private DeptDao ddao;
	@Before
	public void init(){
		ddao=new DeptDao();
	}
	@Test
	public void testSelectByID() {
		Dept dept = ddao.selectByID(1);
		System.out.println(dept);
		System.out.println(dept.getStuffSet());
	}
	@Test
	public void testInsert(){
		Dept dept=new Dept();
		dept.setName("Boss");
		Stuff stuff1=new Stuff();
		stuff1.setName("’‘’‘");
		stuff1.setAge(19);
		dept.setName("Boss");
		Stuff stuff2=new Stuff();
		stuff2.setName("«Æ«Æ");
		stuff2.setAge(38);
		dept.setName("Boss");
		Stuff stuff3=new Stuff();
		stuff3.setName("ÀÔÀÔ");
		stuff3.setAge(29);
		Set<Stuff> set=new HashSet<>();
		set.add(stuff1);
		set.add(stuff2);
		set.add(stuff3);
		dept.setStuffSet(set);
		ddao.insert(dept);
	}
	@Test
	public void testUpdate(){
		Dept dept = ddao.selectByID(5);
		dept.setName("–°√€");
		ddao.update(dept);
	}
	@Test
	public void testDeleteById(){
		Dept dept=new Dept();
		dept.setId(5);
		Stuff stuff1=new Stuff();
		stuff1.setId(8);
		Stuff stuff2=new Stuff();
		stuff2.setId(9);
		Stuff stuff3=new Stuff();
		stuff3.setId(10);
		Set<Stuff> set=new HashSet<>();
		set.add(stuff1);
		set.add(stuff2);
		set.add(stuff3);
		dept.setStuffSet(set);
		ddao.delete(dept);
	}
	@Test
	public void testDelete(){
		Dept dept=new Dept();
		dept.setId(5);
		ddao.delete(dept);
	}

}
