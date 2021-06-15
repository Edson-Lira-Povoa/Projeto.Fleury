package elementos;

import org.openqa.selenium.By;

public class Elements {
	
private By unidade = By.cssSelector("#gatsby-focus-wrapper > div.client-doctor-headercomponentstyle__DesktopBottomHeaderStyled-owoxoj-2.FjEqa > div > div > div > div > div:nth-child(16)");

private By facilidades = By.id("checkoox-select-facilities");

private By acessibilidade = By.cssSelector("#gatsby-focus-wrapper > div.sc-bdVaJa.gridcomponent__GridStyled-sc-8zg10d-0.fHFDYJ > div.sc-bwzfXH.gridcomponent__RowStyled-sc-8zg10d-1.fqDNCQ > div:nth-child(3) > div.checkbox-selectcomponentstyle__CheckboxSelectWrapperStyled-sc-7ktrvg-0.ijWekg > div.animationcomponentstyle__ForcedFade-sc-7lsrx1-1.ebkWHA > div > div:nth-child(3) > svg.svg-inline--fa.fa-check-square.fa-w-14.checkbox-fieldcomponentstyle__CheckboxCheckedStyled-sc-1mdajsk-2.elhyct > path");

private By detalhes = By.id("button-see-on-map-2-vila-mariana");

private By Text = By.cssSelector("#gatsby-focus-wrapper > div.sc-bdVaJa.gridcomponent__GridStyled-sc-8zg10d-0.fHFDYJ > div.sc-bwzfXH.gridcomponent__RowStyled-sc-8zg10d-1.efEBCe > div > h1");


public By getUnidade() {
	return unidade;
}

public By getFacilidades() {
	return facilidades;
}

public By getAcessibilidade() {
	return acessibilidade;
}

public By getDetalhes() {
	return detalhes;

}

public By getText() {
	return Text;
}
}
