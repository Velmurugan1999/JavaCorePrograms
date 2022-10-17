package com.sz.logger;

import java.util.Scanner;
import java.util.logging.Logger;

public class OperationClass {
	private Logger log=Logger.getLogger("Example 3");
	public OperationClass() {
		log.info("Operation Object is Created-----------");
	}
	public void doSomething() {
		log.info("In DO Something Method");
		log.warning("Enter the name within 10 Charecter: ");
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(s.length()<=10)
		{
			log.info("Your Name===="+s);
		}
		else
		{
			log.severe("Wrong Input Length of Name is "+s.length()+">10");
		}
	}
}
