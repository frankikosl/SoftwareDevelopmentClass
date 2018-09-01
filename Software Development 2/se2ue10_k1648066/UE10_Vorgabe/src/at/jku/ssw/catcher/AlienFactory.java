package at.jku.ssw.catcher;

/**
 * Interface for factories of aliens. Defines a method to create aliens of given
 * size.
 * 
 * @author Markus
 * @version 1.0
 * @since 1.0
 */
public interface AlienFactory {

	/**
	 * Creates an alien at a random position between 0 and <code>maxX</code> and
	 * <code>maxY</code>.
	 * 
	 * @param maxX
	 *            the maximum x-position
	 * @param maxY
	 *            the maximum y-position
	 * @return a new alien, where the position of the alien is between
	 *         <code>0</code> and <code>maxX</code> and <code>maxY</code>,
	 *         respectively.
	 */
	Alien create(int maxX, int maxY);

}
