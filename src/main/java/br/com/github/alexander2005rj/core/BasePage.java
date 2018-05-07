package br.com.github.alexander2005rj.core;

import static br.com.github.alexander2005rj.core.DriverFactory.*;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

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
	
	public void inserirTextoComTabulacao( By by, String texto ) {
		getDriver().findElement( by ).click();
		getDriver().findElement( by ).sendKeys( texto );
		getDriver().findElement( by ).sendKeys( Keys.TAB );
	}
	
	/******** Botões ********/
	
	public void clicarNoBotao( By by ) {
		getDriver().findElement( by ).click();
	}
	
	public void clicarNoBotao( String id ) {
		clicarNoBotao( By.id( id ) );
	}
	
	
	/******** Links ********/
	
	public void clicarNoLink( By by ) {
		getDriver().findElement( by ).click();
	}
	
}
