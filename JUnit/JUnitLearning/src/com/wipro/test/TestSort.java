package com.wipro.test;

import static org.junit.Assert.*;

import org.junit.Test;

import com.wipro.task.DailyTasks;

public class TestSort {

	@Test
	public void testSortValues() {
		DailyTasks dt=new DailyTasks();
		int[] unsorted= {4,3,5,2,1,7};
		int[] sorted= {1,2,3,4,5,7};
		assertArrayEquals(sorted,dt.sortValues(unsorted));
	}

}
