package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestStringConcat {

	@Test
	public void testDoStringConcat() {
		DailyTasks dt=new DailyTasks();
		assertEquals("Wipro Tech",dt.doStringConcat("Wipro","Tech"));
	}

}
