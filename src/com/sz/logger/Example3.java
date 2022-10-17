package com.sz.logger;

import java.sql.Time;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Example3 {
	public static Logger logger=Logger.getLogger("Example 3");
	public static void main(String[] args) {
		LogManager.getLogManager().reset();
		ConsoleHandler ch=new ConsoleHandler();
		FileHandler fh;
		ch.setLevel(Level.ALL);
		ch.setFormatter(new SimpleFormatter());
		logger.addHandler(ch);
		try {
			fh=new FileHandler("alldetails.log",true);
			fh.setLevel(Level.ALL);
			fh.setFormatter(new SimpleFormatter() {
				@Override
				public String format(LogRecord rec)
				{
					return rec.getLoggerName()+" || "+rec.getLevel()+">>>>>>>>>  "+rec.getMessage()+"\n";
				}
			});
			logger.addHandler(fh);
			
		}catch (Exception e) {
			logger.severe(">>Exception in File handler");
		}
		logger.info("Application Started...................");
		logger.fine("Logger Name="+logger.getName());
		logger.warning("Please enter yes/no to enter Operation Class");
		Scanner sc=new Scanner(System.in);
		String s=sc.next().toLowerCase();
		
		if(s.equals("yes"))
		{
			OperationClass obj=new OperationClass();
			obj.doSomething();
		}
		else
			logger.info("You Entered No ===");
		logger.severe("Exiting the Application====>");
	}
	
}
