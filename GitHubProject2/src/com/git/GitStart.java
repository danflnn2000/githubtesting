package com.git;

import java.util.Iterator;

public class GitStart {
	// this is just a simple comment
	public static void main(String[] args) {

		String [] mylist = {"boys", "girls", "men", "women"};
		
		for (int i = 0; i < mylist.length; i++) {
			System.out.println(mylist[i]);
		}

		ScheduledExecutorService executor = Executors.newScheduledThreadPool(1);

		Runnable task = () -> System.out.println("Scheduling: " + System.nanoTime());

		int initialDelay = 0;
		int period = 1;
		executor.scheduleAtFixedRate(task, initialDelay, period, TimeUnit.SECONDS);


		//This is my git comment
		//This is my git comment 2
		
		//This is my workspace comment 3
		
		//This is my workspace comment 4
		
		//This is my workspace comment 5

	}

}
