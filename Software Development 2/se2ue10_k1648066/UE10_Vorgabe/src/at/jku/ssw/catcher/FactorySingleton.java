package at.jku.ssw.catcher;
/**
* This class is the Singleton that creates our aliens. To make it so
* there is only one instance of this class at a time, we use an enum
* with only one value - therefore all FactorySingleton is ALIEN.
* @author Francisco Litvay
*/
public enum FactorySingleton implements AlienFactory{
	ALIEN;
	/**
	 * Will create a new alien
	 * 
	 * @param x
	 *            the maximum value x can be
	 * @param y
	 *            the maximum value y can be
	 * @return
	 */
	@Override
	public Alien create(int maxX, int maxY) {
		BlobFactory factory = new BlobFactory();
		return new Shield(factory.create(maxX, maxY));
	}

}
