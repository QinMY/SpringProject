package cn.qmy.SpringDemo.Demo1;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DogConfig.class)
public class Demo1Test {
@Autowired
 private TaiDiDog tdd;
 @Test
 public void tddNotNullTest() {
	 assertNotNull(tdd);
 }
	
	
}
