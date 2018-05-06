package br.com.github.alexander2005rj.core;

import static br.com.github.alexander2005rj.core.DriverFactory.*;

import org.openqa.selenium.By;

public class BasePage {
	
	/******** Acessar URLs ********/
	
	public void acessarURL( String url ) {
		getDriver().get( url );
	}
	
	
	/******** Inputs ********/
	
	public void inserirTexto( By by, String texto ) {
		getDriver().findElement( by ).clear();
		getDriver().findElement( by ).sendKeys( texto );
	}
	
	public void inserirTexto( String id, String texto ) {
		inserirTexto( By.id( id ) , texto);
	}
	
	/******** Botões ********/
	
	public void clicarNoBotao( By by ) {
		getDriver().findElement( by ).click();
	}
	
	public void clicarNoBotao( String id ) {
		clicarNoBotao( By.id( id ) );
	}
	
	
	/******** Links ********/
	
	public void clicarNoLink() {
		
	}
	
}
