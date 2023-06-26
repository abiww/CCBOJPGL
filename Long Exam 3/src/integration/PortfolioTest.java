package integration;
import org.junit.Test;

import portfolio.abigail.AbiPortfolio;
import portfolio.charles.HomePage;
import portfolio.kat.MyPortfolio;

public class PortfolioTest {
	
	PortfolioTest portfoliotest;
	
	@Test
	public void testAbigailPortfolio() {
		AbiPortfolio abi =  new AbiPortfolio();
		assert abi.abiPortfolioRun() : "working";
		
	}
	
	@Test
	public void testCharlesPortfolio() {
		HomePage charles = new HomePage();
		assert charles.charlesPortfolioRun() : "working";
	}
	
	@Test
	public void testKatPortfolio() {
		MyPortfolio kat = new MyPortfolio();
		assert kat.katPortfolioRun() : "working";
	}
	
	@Test
	public void testPortfolioIntegration() {
		PortfolioIntegration wonderPets = new PortfolioIntegration("");
		assert wonderPets.portfolioIntegrationRun() : "working";
	}
}
