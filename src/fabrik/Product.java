package fabrik;

import java.io.IOException;

import business.Freizeitbad;

public abstract class Product {

	
	public abstract void fuegeDateiHinzu(Freizeitbad obj) throws IOException;
	public abstract void schliesseDatei() throws IOException;
}
