package service;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.chu.clothes.dao.mapper.TestMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration(transactionManager = "chuTransactionManager", defaultRollback = false)
@ContextConfiguration(locations="classpath:spring.xml")
public class TestServiceTest {

	@Autowired
	private TestMapper testMapper;
	
	@Test
	public final void test() {
		com.chu.clothes.dao.domain.Test t = new com.chu.clothes.dao.domain.Test();
		t.setId(1);
		t.setName("1");
		int i = testMapper.insert(t);
		System.out.println(i);
	}
}
