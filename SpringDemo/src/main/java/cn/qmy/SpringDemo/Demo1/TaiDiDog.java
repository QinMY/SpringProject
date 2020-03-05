package cn.qmy.SpringDemo.Demo1;

import org.springframework.stereotype.Component;

@Component
public class TaiDiDog implements Dog {

	private String name="taidi";
	public void say() {
		System.out.println("i am  a "+ name);
	}
	
}
