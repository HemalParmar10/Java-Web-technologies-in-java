package Assignment;

// Question 14: Create a web application listener that logs application start and stop events.

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

@WebListener
public class Que_014 implements ServletContextListener {

	// Called when application starts
	@Override
	public void contextInitialized(ServletContextEvent sce) {
		System.out.println("Application Started...");
	}

	// Called when application stops
	@Override
	public void contextDestroyed(ServletContextEvent sce) {
		System.out.println("Application Stopped...");
	}
}
