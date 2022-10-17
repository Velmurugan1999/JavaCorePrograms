package com.sz.logger;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Example2 {
	public static Logger logger=Logger.getLogger("Example2");
	public static void main(String[] args) {
		PropertyConfigurator.configure("C:\\Users\\hai\\SiemensTraining\\TrainingPrograms\\src\\com\\sz\\logger\\application.properties");
		logger.debug("Debug Message===========");
		logger.info("Application Started...........");
		logger.warn("Warn Message=============");
		logger.error("Error Message===========");
		logger.fatal("Fatal message===========");
	}

}
