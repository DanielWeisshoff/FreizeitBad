package business;

import java.io.IOException;

import fabrik.ConcreteCreator;
import fabrik.Creator;
import fabrik.Product;
import gui.FreizeitBaederControl;
import ownUtil.PlausiException;

public class FreizeitBaederModel {

    private Freizeitbad freizeitbad;
    private FreizeitBaederControl control;
    
    public FreizeitBaederModel(FreizeitBaederControl control) {
    	this.control = control;
    }
    
	public void schreibeFreizeitbaederInTxtDatei() throws IOException{
		Creator creator = new ConcreteCreator();
		Product product = creator.factoryMethod("txt");
		
		product.fuegeDateiHinzu(freizeitbad);
		product.schliesseDatei();
	}
	
	public void schreibeFreizeitbaederInCsvDatei() throws IOException{
		Creator creator = new ConcreteCreator();
		Product product = creator.factoryMethod("csv");
		
		product.fuegeDateiHinzu(freizeitbad);
		product.schliesseDatei();
	}
	
	public void nehmeFreizeitbadAuf(Freizeitbad bad){
	   		freizeitbad = bad;
	   		control.zeigeInformationsfensterAn("Das Freizeitbad wurde aufgenommen!");
	}
	  
	  public Freizeitbad getFreizeitbad() {
		  return freizeitbad;
	  }
}