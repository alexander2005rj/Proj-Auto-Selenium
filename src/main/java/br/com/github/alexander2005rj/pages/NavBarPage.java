package br.com.github.alexander2005rj.pages;

import org.openqa.selenium.By;

import br.com.github.alexander2005rj.core.BasePage;

public class NavBarPage extends BasePage {
	
	public void acessarTasks() {
		clicarNoLink( By.linkText( "Tasks" ) );
	}
	
	public void acessarPerfil() {
		clicarNoLink( By.linkText( "Perfil" ) );
	}
	
	public void acessarSenha() {
		clicarNoLink( By.linkText( "Senha" ) );
	}
	
}
