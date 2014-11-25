package service;


import java.util.List;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.chu.clothes.service.TestService;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration(transactionManager = "chuTransactionManager", defaultRollback = false)
@ContextConfiguration(locations="classpath:spring.xml")
public class TestServiceTest1 {

	@Autowired
	private TestService testService;
	
	@Test
	public final void test() {
		com.chu.clothes.dao.domain.Test t = new com.chu.clothes.dao.domain.Test();
		List<com.chu.clothes.dao.domain.Test> list = testService.findById(1);
		t = list.get(0);
		Assert.assertTrue(t.getName().equals("1"));
	}
	
	@Test
	public final void test1() {
		testService.test("123");
	}
}
