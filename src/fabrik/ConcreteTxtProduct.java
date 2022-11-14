package fabrik;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Freizeitbad;

public class ConcreteTxtProduct extends Product{

	BufferedWriter writer;
	
	public ConcreteTxtProduct() {
		try {			
		writer = new BufferedWriter(new FileWriter("datei.txt",true));
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	@Override
	public void fuegeDateiHinzu(Freizeitbad obj) throws IOException {
		writer.write("Daten des Freizeitbades\n");
		writer.write("Name des Freizeitbads:\t\t\t"+obj.getName()+"\n");
		writer.write("Öffnungszeit des Freizeitbads:\t\t"+obj.getGeoeffnetVon()+" - "+obj.getGeoeffnetBis()+"\n");
		writer.write("Beckenlänge des Freizeitbads:\t\t"+obj.getBeckenlaenge()+"\n");
		writer.write("Wassertemperatur des Freizeitbads:\t"+obj.getTemperatur()+"\n");
	}

	@Override
	public void schliesseDatei() throws IOException {
		writer.close();
	}
}
