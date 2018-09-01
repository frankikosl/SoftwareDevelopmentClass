package at.jku.ssw.catcher;

import java.awt.*;

/**
 * Interface for alien which are painted, shrink, then disappear or get
 * captured.
 * 
 * @author Markus
 * @version 1.0
 * @since 1.0
 */
public interface Alien {

	/**
	 * Try hitting the alien. If the alien is hit the alien gets captured.
	 * 
	 * @param x
	 *            the x coordinate for the hit
	 * @param y
	 *            the y coordinate for the hit
	 */
	void hit(int x, int y);

	/**
	 * Tests if the alien is hit by the given corrdinates.
	 * 
	 * @param x
	 *            the x coordinate for testing the hit
	 * @param y
	 *            the y coordinate for testing the hit
	 * @return <code>true</code> if the coordinates are on the alien,
	 *         <code>false</code> otherwise.
	 */
	boolean isHit(int x, int y);

	/**
	 * Progresses the game state of the alien, e.g. shrink the size of the alien.
	 */
	void update();

	/**
	 * Tests if the alien is captured or disappeared.
	 * 
	 * @return <code>true</code> if the alien is no longer in the game (captured or
	 *         gone), <code>false</code> otherwise.
	 */
	default boolean isGoneOrCaptured() {
		return isCaptured() || isGone();
	}

	/**
	 * Tests if the alien is captured.
	 * 
	 * @return <code>true</code> if the alien has been captured (@see hit),
	 *         <code>false</code> otherwise.
	 */
	boolean isCaptured();

	/**
	 * Tests if the alien disappeared.
	 * 
	 * @return <code>true</code> if the alien has gone (e.g. shrunk to its minimal
	 *         size), <code>false</code> otherwise.
	 */
	boolean isGone();

	/**
	 * Paints a representation of the alien to the given graphics object.
	 * 
	 * @param the
	 *            2D graphics context
	 */
	void paint(Graphics2D graphics2D);

}
