package org.wipro;

import java.util.List;

import org.junit.runner.JUnitCore;
import org.junit.runner.Result;  
import org.junit.runner.notification.Failure;

public class JraFamily {
	
	
	
	public static void main(String[] args) {
		
		Result classes = JUnitCore.runClasses(JeyJra.class,RajJra.class);
		
		System.out.println("Fail Count"+classes.getFailureCount());
		System.out.println("Ingore Count"+classes.getIgnoreCount());
		System.out.println("Run Count"+classes.getRunCount());
		
		int passcount = classes.getRunCount()-classes.getFailureCount();
		
		System.out.println("passCount"+passcount);
        System.out.println("Run Time"+ classes.getRunTime());

		List<Failure> fail = classes.getFailures();
		
		for (Failure x : fail) {
			
			System.out.println(x);
		}
	
	}

}
