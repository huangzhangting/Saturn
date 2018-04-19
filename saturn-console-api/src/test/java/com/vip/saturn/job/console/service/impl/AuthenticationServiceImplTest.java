package com.vip.saturn.job.console.service.impl;

import com.vip.saturn.job.console.exception.SaturnJobConsoleException;
import com.vip.saturn.job.console.mybatis.entity.User;
import com.vip.saturn.job.console.mybatis.repository.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class AuthenticationServiceImplTest {

	@Mock
	private UserRepository userRepository;

	@InjectMocks
	private AuthenticationServiceImpl authnService;

	@Test
	public void testAuthenticateSuccessfully() throws SaturnJobConsoleException {
		authnService.setHashMethod("plaintext");
		User user = createUser("jeff", "password");
		when(userRepository.select("jeff")).thenReturn(user);

		assertEquals(user, authnService.authenticate("jeff", "password"));
	}

	@Test
	public void testAuthenticationFailWhenUserIsNotFound() throws SaturnJobConsoleException {
		authnService.setHashMethod("plaintext");
		when(userRepository.select("john")).thenReturn(null);

		assertNull(authnService.authenticate("john", "password"));
	}

	@Test
	public void testAuthenticationFailWhenPasswordInputIsEmpty() throws SaturnJobConsoleException {
		authnService.setHashMethod("plaintext");
		assertNull(authnService.authenticate("john", ""));
	}

	private User createUser(String username, String password) {
		User user = new User();
		user.setUserName(username);
		user.setPassword(password);

		return user;
	}
}