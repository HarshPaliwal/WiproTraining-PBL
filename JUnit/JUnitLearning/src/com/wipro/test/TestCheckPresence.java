package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestCheckPresence {

	@Test
	public void testCheckPresence() {
		DailyTasks dt=new DailyTasks();
		assertTrue(dt.checkPresence("WiproTech","Wipro"));
		assertFalse(dt.checkPresence("John","Doe"));
	}

}
