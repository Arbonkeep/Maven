package com.atguigu.maven;	
		import org.junit.Test;
		import static junit.framework.Assert.*;//静态导入，该类中的静态方法可以直接调用
		public class HelloTest {
			@Test
			public void testHello(){
				Hello hello = new Hello();
				String results = hello.sayHello("litingwei");
				assertEquals("Hello litingwei!",results);	
			}
		}