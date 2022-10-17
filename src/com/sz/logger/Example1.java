package com.sz.logger;

import java.util.Scanner;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Level;
import java.util.logging.LogRecord;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

public class Example1 {
	public static Logger logger=Logger.getLogger("Example1");
	public static void main(String[] args) {
		logger.setLevel(Level.ALL);
		FileHandler fh = null;
		logger.info("Aplication Started..................");
		logger.info("Enter the two number to Division");
		Scanner sc=new Scanner(System.in);
		int m=0;
		try {
			fh=new FileHandler("example1.log",true);
			fh.setFormatter(new SimpleFormatter());
			fh.setLevel(Level.ALL);
			logger.addHandler(fh);
			int a=Integer.parseInt(sc.nextLine());
			int b=Integer.parseInt(sc.nextLine());
			m=a/b;
			System.out.println(m);
		}catch(NumberFormatException n)
		{
			logger.severe("Entered Input is not a number!!!!!!!!!!!!!!!!");
		}
		catch (ArithmeticException e) {
			logger.severe("Entered wrong Input~~~~~~~~~~~~~~~~~~~~ "+"ArithmeticException");
		}
		catch(Exception e)
		{
			logger.severe("Exeption in File handler");
		}
		logger.info("Out put==>"+m);
		logger.warning("Exit Application...................");
		sc.close();
		fh.close();
		
		
	}

}
