package br.com.github.alexander2005rj.pages;

import java.util.List;

import org.openqa.selenium.By;

import br.com.github.alexander2005rj.core.BasePage;

public class TasksPage extends BasePage {
	
	public void criarNovaTarefa() {
		clicarNoBotao( By.xpath( ".//button[@id='insert-button']" ) );
	}
	
	public void setNomeTarefa( String nomeTarefa ) {
		inserirTexto( "title",  nomeTarefa );
	}
	
	public void setDataEntrega( String dataEntrega ) {
		inserirTexto( "dueDate" , dataEntrega );
	}
	
	public void informarTags( List<String> listaTags ) {
		for ( String tag : listaTags ) {
			inserirTextoComTabulacao( By.name( "tags" )  , tag );
		}
		
	}
	
	public void btnCadastrar() {
		clicarNoBotao( "form-submit-button" );
	}
	
	public void finalizarTarefa() {
		
	}
	
	public void editarTarefa() {
		
	}
	
	public void apagarTarefa() {
		
	}

	
}
