package com.lixinxin.test;


import java.util.HashSet;
import java.util.Set;

import org.junit.Before;
import org.junit.Test;

import com.lixinxin.dao.CourseDao;
import com.lixinxin.model.Course;
import com.lixinxin.model.Student;


public class CourseDaoTest {
	private CourseDao cdao;
	@Before
	public void init(){
		cdao=new CourseDao();
	}
	@Test
	public void testSelectById(){
		Course course = cdao.selectById(2);
		System.out.println(course);
	}
	@Test
	public void testInsert() {
		Course course=new Course();
		course.setName("dom");
		Set<Student> set=new HashSet<>();
		Student stu1=new Student();
		stu1.setName("张张三");
		Student stu2=new Student();
		stu2.setName("李李四");
		Student stu3=new Student();
		stu3.setName("王妈");
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		course.setStudentSet(set);
		cdao.insert(course);
	}
	@Test
	public void testDelete() {
		Course course=new Course();
		course.setCid(5);		
		cdao.delete(course);
	}
	@Test
	public void testDeleteById() {
		Course course=new Course();
		Set<Student> set=new HashSet<>();
		Student stu1=new Student();
		stu1.setSid(9);
		Student stu2=new Student();
		stu2.setSid(10);
		Student stu3=new Student();
		stu3.setSid(11);
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		course.setStudentSet(set);
		course.setCid(5);		
		cdao.delete(course);
	}
	@Test
	public void testUpdate() {
		Course course=new Course();
		Set<Student> set=new HashSet<>();
		Student stu1=new Student();
		stu1.setSid(9);
		stu1.setAge(18);
		stu1.setName("张三三");
		Student stu2=new Student();
		stu2.setAge(20);
		stu2.setSid(10);
		stu2.setName("李思思");
		Student stu3=new Student();
		stu3.setAge(24);
		stu3.setSid(11);
		stu3.setName("王五五");
		set.add(stu1);
		set.add(stu2);
		set.add(stu3);
		course.setStudentSet(set);
		course.setCid(5);
		course.setName("html5");
		cdao.update(course);
	}


}
