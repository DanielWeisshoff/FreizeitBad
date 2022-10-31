package business;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import gui.FreizeitBaederControl;
import ownUtil.PlausiException;

public class FreizeitBaederModel {

	 // speichert temporaer ein Objekt vom Typ Freizeitbad
    private Freizeitbad freizeitbad;
    private FreizeitBaederControl control;
    
    public FreizeitBaederModel(FreizeitBaederControl control) {
    	this.control = control;
    }
    
    
	public void schreibeFreizeitbaederInDatei(String typ) throws IOException{
	
		String name = "Freizeitbaeder." + typ;
		BufferedWriter aus = new BufferedWriter(new FileWriter(name,true));
		aus.write(getFreizeitbad().gibFreizeitbadZurueck(';'));
		aus.close();
	}
	
	  public void nehmeFreizeitbadAuf(String name, String von, String bis, String Beckenlaenge,String temperatur){
	    	try{
	    		freizeitbad = new Freizeitbad(name,von,bis,Beckenlaenge,temperatur);
	    		control.zeigeInformationsfensterAn("Das Freizeitbad wurde aufgenommen!");
	       	}
	       	catch(PlausiException exc){
	       		control.zeigeFehlermeldungsfensterAn(exc.getPlausiTyp() + "er ", exc.getMessage());
	     	}
	    }
	  
	  public Freizeitbad getFreizeitbad() {
		  return freizeitbad;
	  }
}
// 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