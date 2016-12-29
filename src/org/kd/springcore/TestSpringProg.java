package org.kd.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class TestSpringProg {
	public static void main(String args[]){
		ApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		MyFirstProg obj = (MyFirstProg) context.getBean("myfirstprogBean");
		//obj.welcome();
		//obj.hotDrinks();
		//obj.displayList();
		/*obj.setProgramList("If we use bean scope as prototype then new bean instance is created by spring every time when getBean is called");
		obj.displayList();
		MyFirstProg obj1 = (MyFirstProg) context.getBean("myfirstprogBean");
		obj1.displayList();*/
		/*obj.setProgramList("If we use bean scope as singleton then only one bean instance is created by spring and provides same instance to all getBean");
		obj.displayList();*/
		//MyFirstProg obj1 = (MyFirstProg) context.getBean("myfirstprogBean");
		// life Cycle of Bean
		//((AbstractApplicationContext)context).registerShutdownHook();
		obj.welcome();
		
	}

}
