package br.com.github.alexander2005rj.tests;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import br.com.github.alexander2005rj.core.BaseTest;
import br.com.github.alexander2005rj.pages.NavBarPage;
import br.com.github.alexander2005rj.pages.TasksPage;

public class TasksTest extends BaseTest {
	
	private NavBarPage navBar = new NavBarPage();
	private TasksPage task = new TasksPage();
	
	@Test
	public void criarTasks() throws InterruptedException {
		Thread.sleep( 1000 );	
		task.criarNovaTarefa();
		
		Thread.sleep( 1000 );
		task.setNomeTarefa( "Macambuzio" );
		task.setDataEntrega( "31/05/2018" );
		
		Thread.sleep( 1000 );
		ArrayList<String> tags = new ArrayList<String>();
		tags.add( "aaa" );
		tags.add( "bbb" );
		tags.add( "ccc" );
		
		System.out.println( tags );
		
		task.informarTags( tags );
		
		task.btnCadastrar();
	}

}
