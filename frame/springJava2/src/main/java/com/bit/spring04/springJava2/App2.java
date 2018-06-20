package com.bit.spring04.springJava2;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class App2 {

	public static void main(String[] args) {
		//스프링
		
		Resource resource=new ClassPathResource("applicationContext.xml");
		BeanFactory beans=new XmlBeanFactory(resource);
		Module03 module=(Module03) beans.getBean("md03");
		module.func1();
	}

}
