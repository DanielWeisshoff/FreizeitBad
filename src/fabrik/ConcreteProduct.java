package fabrik;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

import business.Freizeitbad;

public class ConcreteProduct extends Product{

	BufferedWriter writer;
	
	public ConcreteProduct() {
		try {			
		writer = new BufferedWriter(new FileWriter("datei.csv",true));
		}catch(Exception e) {
			System.out.println(e.getLocalizedMessage());
		}
	}
	
	@Override
	public void fuegeDateiHinzu(Freizeitbad obj) throws IOException {
		writer.write(obj.gibFreizeitbadZurueck(';'));
	}

	@Override
	public void schliesseDatei() throws IOException {
		writer.close();
	}
}
