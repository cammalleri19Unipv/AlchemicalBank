package it.unipv.ingsw.alchemicalbank.wizards;

import it.unipv.ingsw.alchemicalbank.Decision;
import it.unipv.ingsw.alchemicalbank.Wizard;
//alessio cammalleri 470753
public class Cammalleri470753Wizard extends Wizard {

	@Override
	public Decision askKeepOrLiquidate(int fundValue, int timespan) {
		if (timespan>7) { return Decision.LIQUIDATE_FUND;}
		else { return Decision.KEEP_FUND;}
		
	}

}
