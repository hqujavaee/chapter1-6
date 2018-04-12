package cn.edu.hqu.javaee;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Chapter16Application {
	public static void main(String[] args) throws Exception {
		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("knights.xml");
		Knight knight=context.getBean(Knight.class);
		knight.embarkOnQuest();
		context.close();
	}
}
