package EpamT.LoggingTask;
import Interest.*;
import constructioncost.*;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
public class App {
private static final Logger LOGGER=LogManager.getLogger(App.class);
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		LOGGER.info("Enter choice: \n"
	    		+ "1)Simple Interest \n"
	    		+ "2)Compund Interest \n"
	    		+ "3)House Construction Cost \n");
	    int choice=sc.nextInt();
	    switch(choice) {
	    	case 1:
	    		SimpleInterest si=new SimpleInterest();
	    		break;
	    	case 2:
	    		CompoundInterest ci=new CompoundInterest();
	    		break;
	    	case 3:
	    		HouseConstructionCost hcc=new HouseConstructionCost();
	        	break;
		

	}
	}

}
