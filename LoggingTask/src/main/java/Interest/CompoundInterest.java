package Interest;

import java.util.*;
import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import EpamT.LoggingTask.App;
public class CompoundInterest {
	private static final Logger LOGGER=LogManager.getLogger(CompoundInterest.class);
public CompoundInterest()
{
	double principle,rate, timeperiod, CompoundInterest;
    Scanner sc=new Scanner (System.in);
    LOGGER.info("Enter amount: \n");
    principle=sc.nextDouble();
    LOGGER.info("Enter number Of Years \n");
    timeperiod=sc.nextDouble();
    LOGGER.info("Enter Rate Of Interest: \n");
    rate=sc.nextDouble();
    CompoundInterest=principle * Math.pow(1.0+rate/100.0,timeperiod) - principle;
    LOGGER.info("The Compound Interest is:  \n Rs"+CompoundInterest+"\n");
}
}
