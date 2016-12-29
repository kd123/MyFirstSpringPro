package org.kd.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("processing bean instance after initialiaztion(i.e just after init life cycle event) of : " +arg1);
		return arg0;
	}

	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("processing bean instance before initialiaztion(i.e after spring instantiates bean and before init life cycle event) of : " +arg1);
		return arg0;
	}

}
