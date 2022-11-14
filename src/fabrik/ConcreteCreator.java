package fabrik;

public class ConcreteCreator extends Creator{

	@Override
	public Product factoryMethod(String dateityp) {
		if(dateityp.equalsIgnoreCase("csv"))
			return new ConcreteProduct();
		else if(dateityp.equalsIgnoreCase("txt"))
			return new ConcreteTxtProduct();
		else
			return null;
	}

}
