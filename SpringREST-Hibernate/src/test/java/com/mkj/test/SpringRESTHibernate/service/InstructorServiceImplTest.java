package com.mkj.test.SpringRESTHibernate.service;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import org.springframework.test.context.junit.jupiter.SpringExtension;


import com.mkj.test.SpringRESTHibernate.dto.Instructor;

@SpringBootTest
class InstructorServiceImplTest {

	
	@Autowired
	public InstructorServiceImpl service;
	
	@Test
	void testGetAllInstructors() {
	
		List<Instructor> actual = service.getAllInstructors();
		assertEquals(28, actual.size());
	}
	
	@Test
	void testUpdateInstructor() {
		Instructor actual =service.updateInstructor(105, "test-location-2");
		assertEquals(105, actual.getInstructorcode());
		assertEquals("test-location-2", actual.getTrainerlocation());
		assertEquals("Suresh", actual.getName());
	}
	
	
	
	/*
	@Test
	void testGetAllInstructorsbyExp() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllInstructorsbySalary() {
		fail("Not yet implemented");
	}

	@Test
	void testGetAllInstructorsbyLocation() {
		fail("Not yet implemented");
	}

	@Test
	void testAddInstructor() {
		fail("Not yet implemented");
	}

	
	*/

}
