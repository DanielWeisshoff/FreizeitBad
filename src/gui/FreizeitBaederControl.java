package gui;

import java.io.IOException;

import com.sun.glass.ui.View;

import business.FreizeitBaederModel;
import business.Freizeitbad;
import javafx.stage.Stage;
import ownUtil.PlausiException;

public class FreizeitBaederControl {

	FreizeitBaederView view;
	FreizeitBaederModel model;
	
	public FreizeitBaederControl(Stage stage) {
		 view = new FreizeitBaederView(this, stage);
		 model = new FreizeitBaederModel(this);
	}
	
	
	public void schreibeFreizeitbaederInDatei(String typ) {
		try {
			if("csv".equals(typ)) {
				model.schreibeFreizeitbaederInDatei(typ);
			}
			else if("txt".equals(typ)) {
				model.schreibeFreizeitbaederInDatei(typ);
			}
			else {
				view.zeigeInformationsfensterAn("Noch nicht implementiert!");
			}
		}
		catch(IOException exc) {
			view.zeigeFehlermeldungsfensterAn("IOException","IOException beim Speichern!");
		}
		catch(Exception exc) {
			view.zeigeFehlermeldungsfensterAn("Unbekannt","Unbekannter Fehler beim Speichern!");
		}
	}
	
	public void zeigeInformationsfensterAn(String msg){
		view.zeigeInformationsfensterAn(msg);
	}
	public void zeigeFehlermeldungsfensterAn(String typ,String msg){
		view.zeigeFehlermeldungsfensterAn(typ, msg);
	}


	public void nehmeFreizeitbadAuf(String name, String von, String bis, String Beckenlaenge,String temperatur) {
		model.nehmeFreizeitbadAuf(name,von,bis,Beckenlaenge,temperatur);
		
	}
	
	public Freizeitbad getFreizeitbad() {
		return model.getFreizeitbad();
	}
	
}
