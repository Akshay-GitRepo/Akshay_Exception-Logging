package Interest;
import java.util.*;
import java.io.*;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import constructioncost.HouseConstructionCost;

public class SimpleInterest {
	private static final Logger LOGGER=LogManager.getLogger(SimpleInterest.class);
public SimpleInterest()
{
	double principle,rate, timeperiod, SimpleInterest;
    Scanner sc=new Scanner (System.in);
    LOGGER.info("Enter amount: \n");
    principle=sc.nextDouble();
    LOGGER.info("Enter number Of Years \n");
    timeperiod=sc.nextDouble();
    LOGGER.info("Enter Rate Of Interest: \n");
    rate=sc.nextDouble();
    SimpleInterest=(principle * timeperiod * rate)/100;
    LOGGER.info("The Simple Interest is:  \n Rs"+SimpleInterest+"\n");
}
}
