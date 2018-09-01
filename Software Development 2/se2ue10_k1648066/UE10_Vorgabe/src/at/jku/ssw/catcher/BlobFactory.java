package at.jku.ssw.catcher;

import java.util.Random;
/**
 * Concrete implementation of factories of blobs. Defines a method to create blobs of given
 * size.
 * 
 * @author Francisco Litvay
 */
public class BlobFactory implements AlienFactory {
	/**
	 * Creates a blob at a random position between 0 and <code>maxX</code> and
	 * <code>maxY</code>.
	 * 
	 * @param maxX
	 *            the maximum x-position
	 * @param maxY
	 *            the maximum y-position
	 * @return a new blob, where the position of the blob is between
	 *         <code>0</code> and <code>maxX</code> and <code>maxY</code>,
	 *         respectively.
	 */
	@Override
	public Alien create(int maxX, int maxY) {
		Random rand = new Random();
		int radius = 50 + rand.nextInt((150 - 50) + 1);
		int x = radius + rand.nextInt(((maxX - radius) - radius) + 1);
		
		int y = radius +  rand.nextInt(((maxY - radius) - radius) + 1);
		return new Blob(x, y, radius);
	}

}
