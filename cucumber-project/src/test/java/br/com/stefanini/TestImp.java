package br.com.stefanini;

import java.io.IOException;

import br.com.stefanini.pages.HomePage;
import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class TestImp{

	private HomePage home;
	
	@Before
	public void init() throws IOException {
		home = new HomePage();
		home.startService();
		home.getPage("http://www.google.com.br");
	}
	
	@After
	public void close() {
		home.stopService();
	}
	
	@Given("^Isso$")
	public void isso() throws Exception {

	}


	@Given("^Aquilo$")
	public void aquilo() throws Exception {

	}

	@When("^faco$")
	public void faco() throws Exception {

	}

	@Then("^Aconte isso$")
	public void aconte_isso() throws Exception {

	}

	@Given("^Isso_$")
	public void isso_() throws Exception {

	}
	
}
