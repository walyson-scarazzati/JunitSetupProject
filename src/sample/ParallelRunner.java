package sample;

import org.junit.experimental.ParallelComputer;
import org.junit.runner.Computer;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class ParallelRunner {

	public static void main(String[] args) {
		Computer c =new ParallelComputer(true,  true);
		Result result = JUnitCore.runClasses(c, ParallelFor.class,ParallelWhile.class);
		System.out.println("Ran "+ result.getRunCount());
		System.out.println("Ignore "+ result.getIgnoreCount());
		System.out.println("Ignored "+result.getRunTime());
		System.out.println("Failures "+ result.getFailureCount());
		
		for(Failure failure : result.getFailures()){
			System.out.println(failure.toString());
		}
	}

}
