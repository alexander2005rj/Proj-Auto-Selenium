package br.com.github.alexander2005rj.pages;

import br.com.github.alexander2005rj.core.BasePage;

public class LoginPage extends BasePage {
	
	public void acessarPaginaLogin() {
		acessarURL( "http://marktasks.herokuapp.com/login" );
	}
	
	public void setEmail( String email ) {
		inserirTexto( "login_email", email );
	}
	
	public void setSenha( String senha ) {
		inserirTexto( "login_password", senha );
	}
	
	public void btnLogin() {
		clicarNoBotao( "btLogin" );
	}
	
	public void logar( String email, String senha ) {
		acessarPaginaLogin();
		setEmail( email );
		setSenha( senha );
		btnLogin();
	}
}
