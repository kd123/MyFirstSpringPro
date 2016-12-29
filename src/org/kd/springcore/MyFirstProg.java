package org.kd.springcore;

import java.util.List;



public class MyFirstProg{
	/////////////////////////////////////////////////////////////////////////////
	       // this is calling by property value in SpringConfig.xml 
	/*String welcomeNote;

	public String getWelcomeNote() {
		return welcomeNote;
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void welcome() {
		System.out.println(welcomeNote);
	}*/
	
	//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	       //this is Dependency Injection by constructor for this Interface HotDrinks and class Tea used
	/* HotDrinks hotDrinks;

	public MyFirstProg(HotDrinks hotDrinks) {
		
		this.hotDrinks = hotDrinks;
	}
	
	public void hotDrinks(){
		hotDrinks.preparedDrinks();
	}
	*/
   //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
       //this is Dependency Injection by setter method for this Interface HotDrinks and class Tea used

	  /* HotDrinks hotDrinks;

	public void setHotDrinks(HotDrinks hotDrinks) {
		this.hotDrinks = hotDrinks;
	}
	public void hotDrinks(){
		hotDrinks.preparedDrinks();
	}
	*/
  //////////////////////////////////////////////////////////////////////////////////////////////////////////////////
          //this is Dependency Injection by java collection
	/*private List programList;

	public void setProgramList(List programList) {
		this.programList = programList;
	}
	public void displayList() {
		System.out.println("We can use only three collection for DI that are: "+programList);
	}*/
	
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////
               //this is Bean Factory
	/*private String programList;

	public void setProgramList(String programList) {
		this.programList = programList;
	}
	public void displayList() {
		//System.out.println("this programList is called by bean factory by providing scope as prototype :"+programList);
		System.out.println("this programList is called by bean factory by providing scope as singleton :"+programList);
	}*/

	//////////////////////////////////////life cycle of bean////////////////////////////////////////////////////
	/*public void displayLifeCycle() {
		
		System.out.println("bean life cycle");
	}
    public void init() {
		
		System.out.println("myprogram bean is going to initialize");
	}
    public void destroy() {
		
		System.out.println("myprogram bean is going to destroy");
	}*/
    
//////////////////////////////////////life cycle of bean by Annotation////////////////////////////////////////////////////
	
/*	public void displayLifeCycle() {

		System.out.println("bean life cycle");
	}
	
	@PostConstruct
	public void init() {

		System.out.println("myprogram bean is going to initialize");
	}

	@PreDestroy
	public void destroy() {

		System.out.println("myprogram bean is going to destroy");
	}*/
	
	//////////////////////life cycle of bean by InitializingBean,DisposableBean interface////////////////////////
	//////for this we need to implements two interface InitializingBean,DisposableBean//////
	/*public void displayLifeCycle() {

		System.out.println("bean life cycle");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("myprogram bean is going to initialize after propertiesSet");
	}
	
	@Override
	public void destroy() throws Exception {
		// TODO Auto-generated method stub
		System.out.println("myprogram bean is going to destroy");
	}*/

	////////////////////////////////////Bean Post Processor Concept///////////////////////////////////
	/*public void displayLifeCycle() {

		System.out.println("bean life cycle");
	}

	public void init() {
		
		System.out.println("myprogram bean is going to initialize");
	}	
	
	public void destroy() {
		
		System.out.println("myprogram bean is going to destroy");
	}*/
	//////////// this is BeanFactoryPostProcessor method that is used to modify bean property by changing/////////
	//////////the configuration in java class instead of changing in SpringConfig.xml file/////////////////////
	/*String welcomeNote;

	public String getWelcomeNote() {
		return welcomeNote;
	}

	public void setWelcomeNote(String welcomeNote) {
		this.welcomeNote = welcomeNote;
	}

	public void welcome() {
		System.out.println(welcomeNote);
	}*/
//////////// PropertyPlaceHolderConfigurer concept/////////

String welcomeNote;

public String getWelcomeNote() {
return welcomeNote;
}

public void setWelcomeNote(String welcomeNote) {
this.welcomeNote = welcomeNote;
}

public void welcome() {
System.out.println(welcomeNote);
}
}
