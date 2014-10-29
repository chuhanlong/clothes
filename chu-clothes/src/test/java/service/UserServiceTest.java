package service;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;

import com.chu.clothes.dao.domain.User;
import com.chu.clothes.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@Transactional
@TransactionConfiguration(transactionManager = "chuTransactionManager", defaultRollback = false)
@ContextConfiguration(locations="classpath:spring.xml")
public class UserServiceTest {

	@Autowired
	private UserService userService;
	
	@Test
	public final void testFindById() {
		Integer id = 1;
		User user = userService.findById(id);
		Assert.assertTrue(user != null);
	}
}
