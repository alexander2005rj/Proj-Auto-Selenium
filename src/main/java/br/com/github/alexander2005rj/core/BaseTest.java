package br.com.github.alexander2005rj.core;

import static br.com.github.alexander2005rj.core.DriverFactory.*;

import org.junit.After;
import org.junit.Before;

import br.com.github.alexander2005rj.pages.LoginPage;

public class BaseTest {
	
	private LoginPage loginPage = new LoginPage();
	
	@Before
	public void setUp() {
		loginPage.logar( "fulano@detal.com", "abc123" );
	}
	
	@After
	public void tearDown() {
		destroyDriver();
	}
}
