package com.fdmgroup.mockito;

import static org.junit.Assert.*;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class TestLoginManager {

	// the oner real object
	LoginManager loginManager;

	// all other objects are mocks
	@Mock
	UserManager mockUserManager;

	@Mock
	User mockUser1, mockUser2;

	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this); // Always do this first
		loginManager = new LoginManager(mockUserManager); // dependency
															// injection - need
															// to create the
															// constructor also
		when(mockUser1.getUsername()).thenReturn("Dom");
		when(mockUser1.getPassword()).thenReturn("abc");
		when(mockUser2.getUsername()).thenReturn("Jose");
		when(mockUser2.getPassword()).thenReturn("xyz");
		when(mockUserManager.getUserFromDatabase("Dom")).thenReturn(mockUser1);
		when(mockUserManager.getUserFromDatabase("Jose")).thenReturn(mockUser2);
		//when(mockUserManager.getUserFromDatabase("Jose")).th
	}

	@Test
	public void test_domAndAbcReturnTrue() {
		boolean result = loginManager.login("Dom", "abc"); // Act
		assertTrue(result);
	}

	@Test
	public void test_domAndXyzReturnFalse() {
		boolean result = loginManager.login("Dom", "xyz"); // Act
		assertFalse(result);
	}

	@Test
	public void test_joseAndXyzReturnTrue() {
		boolean result = loginManager.login("Jose", "xyz"); // Act
		assertTrue(result);
	}

	@Test
	public void test_joseAndAbcReturnFalse() {
		boolean result = loginManager.login("Jose", "abc"); // Act
		assertFalse(result);
	}
	
	@Test
	public void test_loginCallsGetUserFromDatabaseWhenDomPassedIn(){
		loginManager.login("Dom", "abc");//Don't care about return type
		//passes if getUserFromDatabase was called with arg "Dom"
		verify(mockUserManager).getUserFromDatabase("Dom");
		//verify(mockUserManager).getUserFromDatabase("Sudheep");
		
	}
	
	@Test
	public void test_nickAndXyzReturnFalse() {
		boolean result = loginManager.login("Nick", "xyz"); // Act
		assertFalse(result);
	}

}
