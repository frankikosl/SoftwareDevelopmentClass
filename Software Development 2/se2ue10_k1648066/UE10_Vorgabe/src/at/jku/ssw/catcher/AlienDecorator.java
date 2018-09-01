package at.jku.ssw.catcher;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;

/**
* This class is the Decorator for the Alien class. It has an alien object and 
* will simply call the methods defined in alien of the instance of the object.
* @variable next the alien object to be decorated
* @author Francisco Litvay
*/
public abstract class AlienDecorator implements Alien {

	private final Alien next;
	
	public AlienDecorator(Alien next) {
		this.next = next;
	}
	/**
	 * The next alien tries hitting the alien. If the alien is hit the alien gets captured.
	 * 
	 * @param x
	 *            the x coordinate for the hit
	 * @param y
	 *            the y coordinate for the hit
	 */
	@Override
	public void hit(int x, int y) {
		next.hit(x, y);
	}
	/**
	 * The next alien tests if the alien is hit by the given corrdinates.
	 * 
	 * @param x
	 *            the x coordinate for testing the hit
	 * @param y
	 *            the y coordinate for testing the hit
	 * @return <code>true</code> if the coordinates are on the alien,
	 *         <code>false</code> otherwise.
	 */
	@Override
	public boolean isHit(int x, int y) {
		return next.isHit(x, y);
	}

	/**
	 * The next alien progresses the game state of the alien, e.g. shrink the size of the alien.
	 */
	@Override
	public void update() {
		next.update();
	}
	/**
	 * The next alien tests if the alien is captured.
	 * 
	 * @return <code>true</code> if the alien has been captured (@see hit),
	 *         <code>false</code> otherwise.
	 */
	@Override
	public boolean isCaptured() {
		return next.isCaptured();
	}

	/**
	 * The next alien tests if the alien disappeared.
	 * 
	 * @return <code>true</code> if the alien has gone (e.g. shrunk to its minimal
	 *         size), <code>false</code> otherwise.
	 */
	@Override
	public boolean isGone() {
		return next.isGone();
	}
	/**
	 * The next alien paints a representation of the alien to the given graphics object.
	 * 
	 * @param the
	 *            2D graphics context
	 */
	@Override
	public void paint(Graphics2D graphics2d) {
		  next.paint(graphics2d);
	}
}
