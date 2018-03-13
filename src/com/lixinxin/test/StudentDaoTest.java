package com.lixinxin.test;

import org.junit.Before;
import org.junit.Test;

import com.lixinxin.dao.StudentDao;
import com.lixinxin.model.Course;
import com.lixinxin.model.Student;

public class StudentDaoTest {
	private StudentDao sdao;
	@Before
	public void init(){
		sdao=new StudentDao();
	}
	@Test
	public void testInsert() {
		Student stu1=new Student();
		stu1.setName("¿Ó–°Àƒ");
		stu1.setAge(25);
		Course course=new Course();
		course.setName("sax");
		stu1.setCourse(course);
		sdao.insert(stu1);
	}
	@Test
	public void testSelectById(){
		 Student student = sdao.selectById(1);
		System.out.println(student.getName());
	
	}

}
