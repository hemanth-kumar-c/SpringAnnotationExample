package com.uttara.SpringAnnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Unit test for simple App.
 */
public class AppTest {
	public static void main(String[] args) {

		System.out.println("main()-> starting");

		System.out.println("main()-> starting.. Spring Container");

		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("Spring.xml");

		System.out.println("main()-> started.... Spring Container");
		Person p1 = (Person) ctx.getBean("person");
		//Person p2 = (Person) ctx.getBean("person");
		//System.out.println("p1==p2? " + (p1 == p2));// True coz beans are instantiated and managed as singleton
		System.out.println(p1);
		p1.dance();

		ctx.close();

		System.out.println("main()-> ended ");
	}

}
