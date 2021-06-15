package teste;

import elementos.Elements;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import metodos.Metodos;

public class Steps {
	
	Metodos metodos = new Metodos();
	Elements elementos = new Elements();
	
	
	
	@Given("dado que eu esteja no site {string}")
	public void dado_que_eu_esteja_no_site(String url) {
	   
		metodos.abrirBrowser(url, "CHROME");
		
	}

	@When("quando filtro por facilidade")
	public void quando_filtro_por_facilidade() throws InterruptedException {
	
		metodos.pausa(4000);
		
	metodos.clicar(elementos.getUnidade());
	//inclui pausas para o avaliador acompanhar os passos
	metodos.pausa(4000);   
	metodos.clicar(elementos.getFacilidades());
	metodos.pausa(4000);
	metodos.clicar(elementos.getAcessibilidade());
	metodos.pausa(4000);
	metodos.clicar(elementos.getDetalhes());
	
		  
	
	}

	
	@Then("valido o nome da unidade {string}")
	public void valido_o_nome_da_unidade(String textoEsperado) {
		
		metodos.validarTexto("Vila Mariana", elementos.getText());
		metodos.fechar();
	    
	}


}
